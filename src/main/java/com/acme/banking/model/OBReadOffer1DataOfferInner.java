package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadOffer1DataOfferInnerAmount;
import com.acme.banking.model.OBReadOffer1DataOfferInnerFee;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * OBReadOffer1DataOfferInner
 */

@JsonTypeName("OBReadOffer1_Data_Offer_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadOffer1DataOfferInner {

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("OfferId")
  private String offerId;

  /**
   * Offer type, in a coded form.
   */
  public enum OfferTypeEnum {
    BALANCETRANSFER("BalanceTransfer"),
    
    LIMITINCREASE("LimitIncrease"),
    
    MONEYTRANSFER("MoneyTransfer"),
    
    OTHER("Other"),
    
    PROMOTIONALRATE("PromotionalRate");

    private String value;

    OfferTypeEnum(String value) {
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
    public static OfferTypeEnum fromValue(String value) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("OfferType")
  private OfferTypeEnum offerType;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("StartDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateTime;

  @JsonProperty("EndDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateTime;

  @JsonProperty("Rate")
  private String rate;

  @JsonProperty("Value")
  private Integer value;

  @JsonProperty("Term")
  private String term;

  @JsonProperty("URL")
  private String URL;

  @JsonProperty("Amount")
  private OBReadOffer1DataOfferInnerAmount amount;

  @JsonProperty("Fee")
  private OBReadOffer1DataOfferInnerFee fee;

  public OBReadOffer1DataOfferInner accountId(String accountId) {
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

  public OBReadOffer1DataOfferInner offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.
   * @return offerId
  */
  @Size(min = 1, max = 40) 
  @Schema(name = "OfferId", description = "A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.", required = false)
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OBReadOffer1DataOfferInner offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

  /**
   * Offer type, in a coded form.
   * @return offerType
  */
  
  @Schema(name = "OfferType", description = "Offer type, in a coded form.", required = false)
  public OfferTypeEnum getOfferType() {
    return offerType;
  }

  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  public OBReadOffer1DataOfferInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Further details of the offer.
   * @return description
  */
  @Size(min = 1, max = 500) 
  @Schema(name = "Description", description = "Further details of the offer.", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBReadOffer1DataOfferInner startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Date and time at which the offer starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return startDateTime
  */
  @Valid 
  @Schema(name = "StartDateTime", description = "Date and time at which the offer starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", required = false)
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBReadOffer1DataOfferInner endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Date and time at which the offer ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return endDateTime
  */
  @Valid 
  @Schema(name = "EndDateTime", description = "Date and time at which the offer ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", required = false)
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBReadOffer1DataOfferInner rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate associated with the offer type.
   * @return rate
  */
  @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  @Schema(name = "Rate", description = "Rate associated with the offer type.", required = false)
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public OBReadOffer1DataOfferInner value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Value associated with the offer type.
   * @return value
  */
  
  @Schema(name = "Value", description = "Value associated with the offer type.", required = false)
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public OBReadOffer1DataOfferInner term(String term) {
    this.term = term;
    return this;
  }

  /**
   * Further details of the term of the offer.
   * @return term
  */
  @Size(min = 1, max = 500) 
  @Schema(name = "Term", description = "Further details of the term of the offer.", required = false)
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public OBReadOffer1DataOfferInner URL(String URL) {
    this.URL = URL;
    return this;
  }

  /**
   * URL (Uniform Resource Locator) where documentation on the offer can be found
   * @return URL
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "URL", description = "URL (Uniform Resource Locator) where documentation on the offer can be found", required = false)
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public OBReadOffer1DataOfferInner amount(OBReadOffer1DataOfferInnerAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "Amount", required = false)
  public OBReadOffer1DataOfferInnerAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadOffer1DataOfferInnerAmount amount) {
    this.amount = amount;
  }

  public OBReadOffer1DataOfferInner fee(OBReadOffer1DataOfferInnerFee fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Get fee
   * @return fee
  */
  @Valid 
  @Schema(name = "Fee", required = false)
  public OBReadOffer1DataOfferInnerFee getFee() {
    return fee;
  }

  public void setFee(OBReadOffer1DataOfferInnerFee fee) {
    this.fee = fee;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadOffer1DataOfferInner obReadOffer1DataOfferInner = (OBReadOffer1DataOfferInner) o;
    return Objects.equals(this.accountId, obReadOffer1DataOfferInner.accountId) &&
        Objects.equals(this.offerId, obReadOffer1DataOfferInner.offerId) &&
        Objects.equals(this.offerType, obReadOffer1DataOfferInner.offerType) &&
        Objects.equals(this.description, obReadOffer1DataOfferInner.description) &&
        Objects.equals(this.startDateTime, obReadOffer1DataOfferInner.startDateTime) &&
        Objects.equals(this.endDateTime, obReadOffer1DataOfferInner.endDateTime) &&
        Objects.equals(this.rate, obReadOffer1DataOfferInner.rate) &&
        Objects.equals(this.value, obReadOffer1DataOfferInner.value) &&
        Objects.equals(this.term, obReadOffer1DataOfferInner.term) &&
        Objects.equals(this.URL, obReadOffer1DataOfferInner.URL) &&
        Objects.equals(this.amount, obReadOffer1DataOfferInner.amount) &&
        Objects.equals(this.fee, obReadOffer1DataOfferInner.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, offerId, offerType, description, startDateTime, endDateTime, rate, value, term, URL, amount, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadOffer1DataOfferInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

