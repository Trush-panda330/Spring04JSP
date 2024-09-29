package uetak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShainController {

	// URL /test にアクセスがあったら test.jspに転送するよということ
	@GetMapping("/test")
	public String test() {
		return "test";
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
	public String update() {
		return "update";
	}

}
