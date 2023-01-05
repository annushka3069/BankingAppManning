package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount0;
import com.acme.banking.model.OBExternalDirectDebitStatus1Code;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Account to or from which a cash entry is made.
 */

@Schema(name = "OBReadDirectDebit2_Data_DirectDebit_inner", description = "Account to or from which a cash entry is made.")
@JsonTypeName("OBReadDirectDebit2_Data_DirectDebit_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadDirectDebit2DataDirectDebitInner {

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("DirectDebitId")
  private String directDebitId;

  @JsonProperty("MandateIdentification")
  private String mandateIdentification;

  @JsonProperty("DirectDebitStatusCode")
  private OBExternalDirectDebitStatus1Code directDebitStatusCode;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("PreviousPaymentDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime previousPaymentDateTime;

  @JsonProperty("Frequency")
  private String frequency;

  @JsonProperty("PreviousPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount;

  public OBReadDirectDebit2DataDirectDebitInner accountId(String accountId) {
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

  public OBReadDirectDebit2DataDirectDebitInner directDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
   * @return directDebitId
  */
  @Size(min = 1, max = 40) 
  @Schema(name = "DirectDebitId", description = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.", required = false)
  public String getDirectDebitId() {
    return directDebitId;
  }

  public void setDirectDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
  }

  public OBReadDirectDebit2DataDirectDebitInner mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.
   * @return mandateIdentification
  */
  @NotNull @Size(min = 1, max = 35) 
  @Schema(name = "MandateIdentification", description = "Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.", required = true)
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public OBReadDirectDebit2DataDirectDebitInner directDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
    return this;
  }

  /**
   * Get directDebitStatusCode
   * @return directDebitStatusCode
  */
  @Valid 
  @Schema(name = "DirectDebitStatusCode", required = false)
  public OBExternalDirectDebitStatus1Code getDirectDebitStatusCode() {
    return directDebitStatusCode;
  }

  public void setDirectDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
  }

  public OBReadDirectDebit2DataDirectDebitInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Service User.
   * @return name
  */
  @NotNull @Size(min = 1, max = 70) 
  @Schema(name = "Name", description = "Name of Service User.", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadDirectDebit2DataDirectDebitInner previousPaymentDateTime(OffsetDateTime previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
    return this;
  }

  /**
   * Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return previousPaymentDateTime
  */
  @Valid 
  @Schema(name = "PreviousPaymentDateTime", description = "Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", required = false)
  public OffsetDateTime getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }

  public void setPreviousPaymentDateTime(OffsetDateTime previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }

  public OBReadDirectDebit2DataDirectDebitInner frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Regularity with which direct debit instructions are to be created and processed.
   * @return frequency
  */
  
  @Schema(name = "Frequency", description = "Regularity with which direct debit instructions are to be created and processed.", required = false)
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBReadDirectDebit2DataDirectDebitInner previousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
    return this;
  }

  /**
   * Get previousPaymentAmount
   * @return previousPaymentAmount
  */
  @Valid 
  @Schema(name = "PreviousPaymentAmount", required = false)
  public OBActiveOrHistoricCurrencyAndAmount0 getPreviousPaymentAmount() {
    return previousPaymentAmount;
  }

  public void setPreviousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit2DataDirectDebitInner obReadDirectDebit2DataDirectDebitInner = (OBReadDirectDebit2DataDirectDebitInner) o;
    return Objects.equals(this.accountId, obReadDirectDebit2DataDirectDebitInner.accountId) &&
        Objects.equals(this.directDebitId, obReadDirectDebit2DataDirectDebitInner.directDebitId) &&
        Objects.equals(this.mandateIdentification, obReadDirectDebit2DataDirectDebitInner.mandateIdentification) &&
        Objects.equals(this.directDebitStatusCode, obReadDirectDebit2DataDirectDebitInner.directDebitStatusCode) &&
        Objects.equals(this.name, obReadDirectDebit2DataDirectDebitInner.name) &&
        Objects.equals(this.previousPaymentDateTime, obReadDirectDebit2DataDirectDebitInner.previousPaymentDateTime) &&
        Objects.equals(this.frequency, obReadDirectDebit2DataDirectDebitInner.frequency) &&
        Objects.equals(this.previousPaymentAmount, obReadDirectDebit2DataDirectDebitInner.previousPaymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, directDebitId, mandateIdentification, directDebitStatusCode, name, previousPaymentDateTime, frequency, previousPaymentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit2DataDirectDebitInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    previousPaymentAmount: ").append(toIndentedString(previousPaymentAmount)).append("\n");
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

