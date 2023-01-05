package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBBalanceType1Code;
import com.acme.banking.model.OBCreditDebitCode2;
import com.acme.banking.model.OBReadBalance1DataBalanceInnerAmount;
import com.acme.banking.model.OBReadBalance1DataBalanceInnerCreditLineInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Set of elements used to define the balance details.
 */

@Schema(name = "OBReadBalance1_Data_Balance_inner", description = "Set of elements used to define the balance details.")
@JsonTypeName("OBReadBalance1_Data_Balance_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadBalance1DataBalanceInner {

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode2 creditDebitIndicator;

  @JsonProperty("Type")
  private OBBalanceType1Code type;

  @JsonProperty("DateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateTime;

  @JsonProperty("Amount")
  private OBReadBalance1DataBalanceInnerAmount amount;

  @JsonProperty("CreditLine")
  @Valid
  private List<OBReadBalance1DataBalanceInnerCreditLineInner> creditLine = null;

  public OBReadBalance1DataBalanceInner accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  */
  @NotNull @Size(min = 1, max = 40) 
  @Schema(name = "AccountId", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", required = true)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadBalance1DataBalanceInner creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
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

  public OBReadBalance1DataBalanceInner type(OBBalanceType1Code type) {
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

  public OBReadBalance1DataBalanceInner dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return dateTime
  */
  @NotNull @Valid 
  @Schema(name = "DateTime", description = "Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", required = true)
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public OBReadBalance1DataBalanceInner amount(OBReadBalance1DataBalanceInnerAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull @Valid 
  @Schema(name = "Amount", required = true)
  public OBReadBalance1DataBalanceInnerAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataBalanceInnerAmount amount) {
    this.amount = amount;
  }

  public OBReadBalance1DataBalanceInner creditLine(List<OBReadBalance1DataBalanceInnerCreditLineInner> creditLine) {
    this.creditLine = creditLine;
    return this;
  }

  public OBReadBalance1DataBalanceInner addCreditLineItem(OBReadBalance1DataBalanceInnerCreditLineInner creditLineItem) {
    if (this.creditLine == null) {
      this.creditLine = new ArrayList<>();
    }
    this.creditLine.add(creditLineItem);
    return this;
  }

  /**
   * Get creditLine
   * @return creditLine
  */
  @Valid 
  @Schema(name = "CreditLine", required = false)
  public List<OBReadBalance1DataBalanceInnerCreditLineInner> getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(List<OBReadBalance1DataBalanceInnerCreditLineInner> creditLine) {
    this.creditLine = creditLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1DataBalanceInner obReadBalance1DataBalanceInner = (OBReadBalance1DataBalanceInner) o;
    return Objects.equals(this.accountId, obReadBalance1DataBalanceInner.accountId) &&
        Objects.equals(this.creditDebitIndicator, obReadBalance1DataBalanceInner.creditDebitIndicator) &&
        Objects.equals(this.type, obReadBalance1DataBalanceInner.type) &&
        Objects.equals(this.dateTime, obReadBalance1DataBalanceInner.dateTime) &&
        Objects.equals(this.amount, obReadBalance1DataBalanceInner.amount) &&
        Objects.equals(this.creditLine, obReadBalance1DataBalanceInner.creditLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creditDebitIndicator, type, dateTime, amount, creditLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataBalanceInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
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

