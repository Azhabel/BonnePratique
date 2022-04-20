package org.sam.mines.address.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.sam.mines.address.api.model.Town;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-20T12:17:40.149924878+02:00[Europe/Paris]")
public class Address   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("street")
  private String street;

  @JsonProperty("town")
  private Town town;

  public Address id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Address number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address town(Town town) {
    this.town = town;
    return this;
  }

  /**
   * Get town
   * @return town
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Town getTown() {
    return town;
  }

  public void setTown(Town town) {
    this.town = town;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.id, address.id) &&
        Objects.equals(this.number, address.number) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.town, address.town);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, street, town);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
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

