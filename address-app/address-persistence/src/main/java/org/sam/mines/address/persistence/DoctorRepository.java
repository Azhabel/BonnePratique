package org.sam.mines.address.persistence;

import org.sam.mines.address.model.DoctorEntity;
import org.sam.mines.address.model.TownEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Repository
public interface DoctorRepository extends JpaRepository <DoctorEntity, UUID>{

    
}
