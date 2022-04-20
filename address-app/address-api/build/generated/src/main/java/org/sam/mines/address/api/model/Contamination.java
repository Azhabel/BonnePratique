package org.sam.mines.address.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.sam.mines.address.api.model.Address;
import org.sam.mines.address.api.model.Target;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Contamination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-20T12:17:40.149924878+02:00[Europe/Paris]")
public class Contamination   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("disease")
  private String disease;

  @JsonProperty("person")
  @Valid
  private List<Target> person = new ArrayList<>();

  @JsonProperty("address")
  @Valid
  private List<Address> address = new ArrayList<>();

  public Contamination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Contamination disease(String disease) {
    this.disease = disease;
    return this;
  }

  /**
   * Get disease
   * @return disease
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDisease() {
    return disease;
  }

  public void setDisease(String disease) {
    this.disease = disease;
  }

  public Contamination person(List<Target> person) {
    this.person = person;
    return this;
  }

  public Contamination addPersonItem(Target personItem) {
    this.person.add(personItem);
    return this;
  }

  /**
   * Get person
   * @return person
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Target> getPerson() {
    return person;
  }

  public void setPerson(List<Target> person) {
    this.person = person;
  }

  public Contamination address(List<Address> address) {
    this.address = address;
    return this;
  }

  public Contamination addAddressItem(Address addressItem) {
    this.address.add(addressItem);
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Address> getAddress() {
    return address;
  }

  public void setAddress(List<Address> address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contamination contamination = (Contamination) o;
    return Objects.equals(this.id, contamination.id) &&
        Objects.equals(this.disease, contamination.disease) &&
        Objects.equals(this.person, contamination.person) &&
        Objects.equals(this.address, contamination.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, disease, person, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contamination {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    disease: ").append(toIndentedString(disease)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

