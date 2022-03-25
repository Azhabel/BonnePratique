package org.sam.mines.address.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.UUID;


 @Entity
public class DoctorEntity{
  //   @OneToOne(mappedBy = "target")
  //  private TargetEntity user;
    private String speciality;
    private UUID id;


     public void setId(UUID id) {
         this.id = id;
     }

     @Id
     @GeneratedValue(generator = "UUID")
     @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
     @Column(name = "uuid", unique = true, nullable = false)
     @Type(type = "pg-uuid")
    public UUID getId(){
        return this.id;
    }

     public String getSpeciality() {
         return speciality;
     }

     public void setSpeciality(String speciality) {
         this.speciality = speciality;
     }


 }
