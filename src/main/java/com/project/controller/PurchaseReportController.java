package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.PurchaseReport;
import com.project.service.PurchaseReportService;

@RestController
public class PurchaseReportController  {

	@Autowired
	PurchaseReportService service;
	
	@PostMapping("/report")
	public PurchaseReport addPurchaseReport(PurchaseReport report) {
		return service.addPurchaseReport(report);
	}

	@GetMapping("/reports")
	public List<PurchaseReport> getAllReports() {
		return service.getAllReports();
	}

	@GetMapping("/reports/{category}")
	public List<PurchaseReport> getByCategory(String category) {
		return service.getByCategory(category);
	}
	

}
