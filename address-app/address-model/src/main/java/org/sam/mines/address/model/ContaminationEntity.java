package org.sam.mines.address.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.UUID;


public class ContaminationEntity {
    private Set<AddressEntity> addresses;
    private String disease;
    private Set<TargetEntity> person;


    public ContaminationEntity(String _disease, Set<AddressEntity> _addresses) {
        this.disease = _disease;
        this.addresses = _addresses;

    }

    public String getDisease() {
        return this.disease;
    }

    public void setDisease(String _disease) {
        this.disease = _disease;
    }

    public void setTargerEntity(Set<TargetEntity> _person) {
        this.person = _person;
    }

    @ManyToMany
    @JoinTable(name = "Contamination", joinColumns = @JoinColumn(name = "address_uuid", referencedColumnName = "addresses"), inverseJoinColumns = @JoinColumn(name = "target_uuid", referencedColumnName = "person"))
    public Set<TargetEntity> getPerson() {
        return this.person;
    }
}
