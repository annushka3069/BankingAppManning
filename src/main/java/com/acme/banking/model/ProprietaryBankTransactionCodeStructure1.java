package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Set of elements to fully identify a proprietary bank transaction code.
 */

@Schema(name = "ProprietaryBankTransactionCodeStructure1", description = "Set of elements to fully identify a proprietary bank transaction code.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class ProprietaryBankTransactionCodeStructure1 {

  @JsonProperty("Code")
  private String code;

  @JsonProperty("Issuer")
  private String issuer;

  public ProprietaryBankTransactionCodeStructure1 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Proprietary bank transaction code to identify the underlying transaction.
   * @return code
  */
  @NotNull @Size(min = 1, max = 35) 
  @Schema(name = "Code", description = "Proprietary bank transaction code to identify the underlying transaction.", required = true)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProprietaryBankTransactionCodeStructure1 issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Identification of the issuer of the proprietary bank transaction code.
   * @return issuer
  */
  @Size(min = 1, max = 35) 
  @Schema(name = "Issuer", description = "Identification of the issuer of the proprietary bank transaction code.", required = false)
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCodeStructure1 = (ProprietaryBankTransactionCodeStructure1) o;
    return Objects.equals(this.code, proprietaryBankTransactionCodeStructure1.code) &&
        Objects.equals(this.issuer, proprietaryBankTransactionCodeStructure1.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProprietaryBankTransactionCodeStructure1 {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

