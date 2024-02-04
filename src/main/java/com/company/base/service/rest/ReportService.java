package com.company.base.service.rest;


import com.company.base.PojaGenerated;
import com.company.base.repository.ReportRepository;
import com.company.base.repository.model.Report;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class ReportService {
    private final ReportRepository reportRepository;
    public List<Report> generateReport (String id){
        return reportRepository.findAll();
    }
}
