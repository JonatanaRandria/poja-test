package com.company.base.repository;

import com.company.base.repository.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report,String> {
}
