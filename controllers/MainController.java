package es.dw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {

	@GetMapping(value= {"/TicketingSystem","/TicketingSystem/index"})
	public String idx() {
		
		return "index";
	}
	
	@GetMapping(value= {"/TicketingSystem/step1"})
	public String step1() {
		
		return "/views/step1";
	}
	@GetMapping(value= {"/TicketingSystem/step2"})
	public String step2() {
		
		return "/views/step2";
	}
	@GetMapping(value= {"/TicketingSystem/step3"})
	public String step3() {
		
		return "/views/step3";
	}
	@GetMapping(value= {"/TicketingSystem/step4"})
	public String step4() {
		
		return "/views/step4";
	}
	@GetMapping(value= {"/TicketingSystem/end"})
	public String end() {
		
		return "/views/end";
	}
	
}
