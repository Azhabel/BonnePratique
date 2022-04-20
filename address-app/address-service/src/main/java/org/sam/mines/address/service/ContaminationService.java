package org.sam.mines.address.service;

import org.sam.mines.address.model.ContaminationEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ContaminationService {

    List<ContaminationEntity> getAll();

    Optional<ContaminationEntity> getContamination(UUID id);

    void deleteContamination(UUID id);
}