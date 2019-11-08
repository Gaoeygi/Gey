package cn.edu.xcu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootController {
	@RequestMapping("/main")
		public String main() {
			return "main";
		}

}
