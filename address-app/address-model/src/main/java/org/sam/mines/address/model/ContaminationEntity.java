package org.sam.mines.address.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
public class ContaminationEntity {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

//    private Set<AddressEntity> addresses;
    private String disease;
    private Set<TargetEntity> person;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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


//    public Set<AddressEntity> getAddresses (){ return this.addresses; }
//
//    public void setAddresses(Set<AddressEntity> addresses) {c
//        this.addresses = addresses;
//    }


    @ManyToMany
    @JoinTable(name = "Contamination", joinColumns = @JoinColumn(name = "address_uuid", referencedColumnName = "addresses"), inverseJoinColumns = @JoinColumn(name = "target_uuid", referencedColumnName = "person"))
    public Set<TargetEntity> getPerson() {
        return this.person;
    }

}
