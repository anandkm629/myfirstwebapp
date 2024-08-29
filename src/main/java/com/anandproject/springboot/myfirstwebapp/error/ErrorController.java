package com.anandproject.springboot.myfirstwebapp.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController {

	@RequestMapping("error")
	@ResponseBody
	public String throwError() {
		return "error";
	}

}
