package uetak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uetak.entity.Shain;

@Controller
public class ShainController {

	// URL /test にアクセスがあったら test.jspに転送するよということ
	@GetMapping("/test")
	public String test() {
		return "test";
		// 本来はreturn "/WEB-INF/test.jsp"だが
		//application.propertiesで仕様を変えている(他も同じ）
	}

	@GetMapping("/insert")
	public String insert() {
		return "insert";
	}
	
	@PostMapping("/insert")//JSPファイルのactionと紐づく　PostなのでURLに値が表示されない
	public String insert(@ModelAttribute Shain request) {
		System.out.println("id:" +request.getId());
		System.out.println("name:" +request.getName());
		System.out.println("Gender:" +request.getGender());
		System.out.println("nen:" +request.getNen());
		System.out.println("address:" +request.getAddress());
		return "redirect:index";  //リダイレクトされる
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/update") // "/update"というURLへのGETリクエストを処理するメソッド
	public String update(@RequestParam("id") int id, Model model) {
		// @RequestParamでURLクエリパラメータの"id"を取得し、int型のidにマッピング
		// Modelはビューにデータを渡すためのオブジェクト

		System.out.println("id:" + id); // 取得したidをコンソールに出力(確認用）

		// Shainオブジェクトを作成してデータをセット
		Shain shain = new Shain();
		shain.setId(101); 
		shain.setName("鈴木義信");
		shain.setGender("男");
		shain.setNen(2003);
		shain.setAddress("宮城県仙台市"); 

		// Modelオブジェクトに"shain"というキーでShainオブジェクトを追加
		// これにより、ビュー（update.jspなど）で${shain}としてShainオブジェクトにアクセス可能
		model.addAttribute("shain", shain);

		return "update";
		// "update"という名前のビュー（通常はupdate.jsp）を返す
		// 返したビューで、Modelに格納したデータが利用できる
	}

}
