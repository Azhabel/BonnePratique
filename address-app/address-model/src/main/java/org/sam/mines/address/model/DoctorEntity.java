package org.sam.mines.address.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.UUID;


 
public class DoctorEntity{
    private TargetEntity user;
    private String speciality;
    private UUID id;
    
    public DoctorEntity(String _speciality, UUID _id, String _firstname, String _name, Set<AddressEntity> _addresses ){
        this.user = new TargetEntity();
        this.user.setId(_id);
        this.user.setFirstname(_firstname);
        this.user.setName(_firstname);
        this.user.setAddresses(_addresses);
        this.speciality = _speciality; 
    }


    public Set<AddressEntity> getAddresses(){
        return this.user.getAddresses();
    }
    
    

    public UUID getId(){
        return this.id;
    }

    public String getFirstname(){
        return this.user.getFirstname();
    }

    public String getName(){
        return this.user.getName();
    }

    
    public String getSpeciality(){
        return speciality;
    }

    public void setSpecility(String _speciality){
        this.speciality= _speciality;
    }


}
