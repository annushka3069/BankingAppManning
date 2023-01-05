package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBBalanceType1Code;
import com.acme.banking.model.OBCreditDebitCode2;
import com.acme.banking.model.OBTransactionCashBalanceAmount;
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
 * Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.
 */

@Schema(name = "OBTransactionCashBalance", description = "Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBTransactionCashBalance {

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode2 creditDebitIndicator;

  @JsonProperty("Type")
  private OBBalanceType1Code type;

  @JsonProperty("Amount")
  private OBTransactionCashBalanceAmount amount;

  public OBTransactionCashBalance creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  */
  @NotNull @Valid 
  @Schema(name = "CreditDebitIndicator", required = true)
  public OBCreditDebitCode2 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransactionCashBalance type(OBBalanceType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "Type", required = true)
  public OBBalanceType1Code getType() {
    return type;
  }

  public void setType(OBBalanceType1Code type) {
    this.type = type;
  }

  public OBTransactionCashBalance amount(OBTransactionCashBalanceAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull @Valid 
  @Schema(name = "Amount", required = true)
  public OBTransactionCashBalanceAmount getAmount() {
    return amount;
  }

  public void setAmount(OBTransactionCashBalanceAmount amount) {
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
    OBTransactionCashBalance obTransactionCashBalance = (OBTransactionCashBalance) o;
    return Objects.equals(this.creditDebitIndicator, obTransactionCashBalance.creditDebitIndicator) &&
        Objects.equals(this.type, obTransactionCashBalance.type) &&
        Objects.equals(this.amount, obTransactionCashBalance.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditDebitIndicator, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransactionCashBalance {\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
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

