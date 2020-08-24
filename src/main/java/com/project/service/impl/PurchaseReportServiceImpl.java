package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.PurchaseReportsRepository;
import com.project.model.PurchaseReport;
import com.project.service.PurchaseReportService;

@Service
public class PurchaseReportServiceImpl implements PurchaseReportService {

	@Autowired
	PurchaseReportsRepository dao;
	
	@Override
	public PurchaseReport addPurchaseReport(PurchaseReport report) {
		return dao.save(report);
	}

	@Override
	public List<PurchaseReport> getAllReports() {
		return dao.findAll();
	}

	@Override
	public List<PurchaseReport> getByCategory(String category) {
		return dao.findByCategory(category);
	}

}
