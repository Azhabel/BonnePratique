package org.sam.mines.address.persistence;

import org.sam.mines.address.model.AddressEntity;
import org.sam.mines.address.model.ContaminationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ContaminationRepository extends JpaRepository <ContaminationEntity, UUID>{


    List<ContaminationEntity> getAllAddresses();
}
