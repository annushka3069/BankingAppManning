package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount5;
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
 * Set of elements used to provide details of a benefit or reward amount for the statement resource.
 */

@Schema(name = "OBStatement2_StatementBenefit_inner", description = "Set of elements used to provide details of a benefit or reward amount for the statement resource.")
@JsonTypeName("OBStatement2_StatementBenefit_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBStatement2StatementBenefitInner {

  @JsonProperty("Type")
  private String type;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount5 amount;

  public OBStatement2StatementBenefitInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Benefit type, in a coded form.
   * @return type
  */
  @NotNull 
  @Schema(name = "Type", description = "Benefit type, in a coded form.", required = true)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementBenefitInner amount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull @Valid 
  @Schema(name = "Amount", required = true)
  public OBActiveOrHistoricCurrencyAndAmount5 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementBenefitInner obStatement2StatementBenefitInner = (OBStatement2StatementBenefitInner) o;
    return Objects.equals(this.type, obStatement2StatementBenefitInner.type) &&
        Objects.equals(this.amount, obStatement2StatementBenefitInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementBenefitInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

