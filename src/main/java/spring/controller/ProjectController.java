package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

	@GetMapping("")
	public String index() {
		return "project.index";
	}
	
	@GetMapping("detail")
	public String detail() {
		return "project.detail";
	}
	
	@GetMapping("contact")
	public String contact() {
		return "project.contact";
	}
	
}
