package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.service.DashboardService;

@Controller
public class ThymeleafController {
	
	@Autowired
	private DashboardService dashboardService;
	
	@GetMapping("/")
	public String getDashDetail(Model model) {
		
		// Populate revenue data
		model.addAttribute("cr", dashboardService.getTodayRevenueDash());
		
		// Populate Employees Info
		model.addAttribute("ei", dashboardService.getAllEmployee());
		
		return "/index";
	}

}
