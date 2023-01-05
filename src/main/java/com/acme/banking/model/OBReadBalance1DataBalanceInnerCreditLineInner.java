package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadBalance1DataBalanceInnerCreditLineInnerAmount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Set of elements used to provide details on the credit line.
 */

@Schema(name = "OBReadBalance1_Data_Balance_inner_CreditLine_inner", description = "Set of elements used to provide details on the credit line.")
@JsonTypeName("OBReadBalance1_Data_Balance_inner_CreditLine_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadBalance1DataBalanceInnerCreditLineInner {

  @JsonProperty("Included")
  private Boolean included;

  /**
   * Limit type, in a coded form.
   */
  public enum TypeEnum {
    AVAILABLE("Available"),
    
    CREDIT("Credit"),
    
    EMERGENCY("Emergency"),
    
    PRE_AGREED("Pre-Agreed"),
    
    TEMPORARY("Temporary");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Type")
  private TypeEnum type;

  @JsonProperty("Amount")
  private OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount;

  public OBReadBalance1DataBalanceInnerCreditLineInner included(Boolean included) {
    this.included = included;
    return this;
  }

  /**
   * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
   * @return included
  */
  @NotNull 
  @Schema(name = "Included", description = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.", required = true)
  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public OBReadBalance1DataBalanceInnerCreditLineInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Limit type, in a coded form.
   * @return type
  */
  
  @Schema(name = "Type", description = "Limit type, in a coded form.", required = false)
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OBReadBalance1DataBalanceInnerCreditLineInner amount(OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "Amount", required = false)
  public OBReadBalance1DataBalanceInnerCreditLineInnerAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount) {
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
    OBReadBalance1DataBalanceInnerCreditLineInner obReadBalance1DataBalanceInnerCreditLineInner = (OBReadBalance1DataBalanceInnerCreditLineInner) o;
    return Objects.equals(this.included, obReadBalance1DataBalanceInnerCreditLineInner.included) &&
        Objects.equals(this.type, obReadBalance1DataBalanceInnerCreditLineInner.type) &&
        Objects.equals(this.amount, obReadBalance1DataBalanceInnerCreditLineInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataBalanceInnerCreditLineInner {\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

