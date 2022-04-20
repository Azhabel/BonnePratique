package org.sam.mines.address.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sam.mines.address.model.ContaminationEntity;
import org.sam.mines.address.persistence.ContaminationRepository;
import org.sam.mines.address.service.ContaminationService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ContaminationServiceImplTest {
    @Mock
    private ContaminationRepository contaminationRepository;

    @InjectMocks
    private ContaminationService contaminationService = new ContaminationServiceImpl(contaminationRepository);
    

    @Test
    void shouldGetById() {
        // GIVEN
        UUID id = UUID.randomUUID();
        ContaminationEntity value = new ContaminationEntity();
        value.setDisease("covid");
        when(contaminationRepository.findById(id)).thenReturn(Optional.of(value));

        // When
        Optional<ContaminationEntity> contamination = contaminationService.getContamination(id);

        // THEN
        assertTrue(contamination.isPresent());

        ContaminationEntity contamination1 = contamination.get();
        assertEquals("covid", contamination1.getDisease());

        assertFalse( contaminationService.getContamination(UUID.randomUUID()).isPresent());
    }

    @Test
    void shouldNotGetById() {
        // GIVEN
        UUID id = UUID.randomUUID();
        when(contaminationRepository.findById(id)).thenReturn(Optional.empty());

        // When
        Optional<ContaminationEntity> contamination = contaminationService.getContamination(id);

        // THEN
        assertFalse(contamination.isPresent());

    }

}
