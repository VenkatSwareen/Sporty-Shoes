package com.project.service;

import java.util.List;

import com.project.model.PurchaseReport;

public interface PurchaseReportService {

	public PurchaseReport addPurchaseReport(PurchaseReport report);
	public List<PurchaseReport> getAllReports();
	public List<PurchaseReport> getByCategory(String category);
}
