package com.company.base.endpoint.rest.controller.rest;


import com.company.base.PojaGenerated;
import com.company.base.repository.ReportRepository;
import com.company.base.repository.model.Report;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@PojaGenerated
@RestController
@AllArgsConstructor
public class ReportController {
    ReportRepository reportRepository;


    @GetMapping("/report")
    public List<Report> getReport(){
        return reportRepository.findAll();
    }
}
