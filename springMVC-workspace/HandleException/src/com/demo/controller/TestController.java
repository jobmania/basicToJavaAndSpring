package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(Model model) {
		//일부러 자바 에러 발생 array1의 길이는 3
		int [] array1 = {10, 20, 30};
		model.addAttribute("array1", array1[10]);
		return "test1";
	}
	
	//현재 클래스내에서 발생하는 에러에 매핑
//	@ExceptionHandler(Exception.class)
//	public String exception1() {
//		return "error/error";
//	}

}
