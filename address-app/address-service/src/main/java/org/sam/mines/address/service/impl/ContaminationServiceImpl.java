package org.sam.mines.address.service.impl;

import org.sam.mines.address.model.ContaminationEntity;
import org.sam.mines.address.persistence.ContaminationRepository;
import org.sam.mines.address.service.ContaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ContaminationServiceImpl implements ContaminationService {

    private ContaminationRepository contaminationRepository;

    @Autowired
    public ContaminationServiceImpl(ContaminationRepository _contaminationRepository) {
        this.contaminationRepository = _contaminationRepository;
    }

    @Override
    public List<ContaminationEntity> getAll() {
        return contaminationRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<ContaminationEntity> getContamination(UUID id) {
        return contaminationRepository.findById(id);
    }

    @Override
    public void deleteContamination(UUID id) {
        contaminationRepository.deleteById(id);
    }
}
