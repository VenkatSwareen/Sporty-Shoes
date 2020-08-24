package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.PurchaseReport;

@Repository
public interface PurchaseReportsRepository  extends JpaRepository<PurchaseReport,Integer> {
  
	public List<PurchaseReport> findByCategory(String category);
}
