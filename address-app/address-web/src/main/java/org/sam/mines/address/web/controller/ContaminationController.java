package org.sam.mines.address.web.controller;

import org.sam.mines.address.api.controller.ContaminationApi;
import org.sam.mines.address.api.controller.TownApi;
import org.sam.mines.address.api.model.Contamination;
import org.sam.mines.address.service.ContaminationService;
import org.sam.mines.address.service.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ContaminationController implements ContaminationApi {
    private ContaminationService contaminationService;

    @Autowired
    public ContaminationController(ContaminationService _contaminationService) {
        this.contaminationService = _contaminationService;
    }

    @Override
    public ResponseEntity<List<Contamination>> getAllContamination() {
        return ContaminationApi.super.getAllContamination();
    }

    @Override
    public ResponseEntity<Contamination> getContaminationById(String id) {
        return ContaminationApi.super.getContaminationById(id);
    }
}
