package com.anandproject.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class sayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayhello() {
		return "Hello! How are you?";
	}
	
	@RequestMapping("say-hello-HTML")
	@ResponseBody
	public String sayhelloHTML() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML page in Spring</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body");
		sb.append("</body");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	//@ResponseBody -> there is no need to add response body when we are sending the jsp page
	public String sayhelloJsp() {
		return "sayHello";
	}
}
