package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBPostalAddress6;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Financial institution servicing an account for the debtor.
 */

@Schema(name = "OBBranchAndFinancialInstitutionIdentification6_2", description = "Financial institution servicing an account for the debtor.")
@JsonTypeName("OBBranchAndFinancialInstitutionIdentification6_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBBranchAndFinancialInstitutionIdentification62 {

  @JsonProperty("SchemeName")
  private String schemeName;

  @JsonProperty("Identification")
  private String identification;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("PostalAddress")
  private OBPostalAddress6 postalAddress;

  public OBBranchAndFinancialInstitutionIdentification62 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list.
   * @return schemeName
  */
  
  @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list.", required = false)
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBBranchAndFinancialInstitutionIdentification62 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
   * @return identification
  */
  @Size(min = 1, max = 35) 
  @Schema(name = "Identification", description = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.", required = false)
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBBranchAndFinancialInstitutionIdentification62 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which an agent is known and which is usually used to identify that agent.
   * @return name
  */
  @Size(min = 1, max = 140) 
  @Schema(name = "Name", description = "Name by which an agent is known and which is usually used to identify that agent.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBBranchAndFinancialInstitutionIdentification62 postalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  */
  @Valid 
  @Schema(name = "PostalAddress", required = false)
  public OBPostalAddress6 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBranchAndFinancialInstitutionIdentification62 obBranchAndFinancialInstitutionIdentification62 = (OBBranchAndFinancialInstitutionIdentification62) o;
    return Objects.equals(this.schemeName, obBranchAndFinancialInstitutionIdentification62.schemeName) &&
        Objects.equals(this.identification, obBranchAndFinancialInstitutionIdentification62.identification) &&
        Objects.equals(this.name, obBranchAndFinancialInstitutionIdentification62.name) &&
        Objects.equals(this.postalAddress, obBranchAndFinancialInstitutionIdentification62.postalAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, postalAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBranchAndFinancialInstitutionIdentification62 {\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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

