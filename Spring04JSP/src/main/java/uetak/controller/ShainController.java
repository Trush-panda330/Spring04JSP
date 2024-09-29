package uetak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/update")
	public String update(@RequestParam("id") int id) {
		System.out.println("id:" + id);
		return "update";
	}

}
