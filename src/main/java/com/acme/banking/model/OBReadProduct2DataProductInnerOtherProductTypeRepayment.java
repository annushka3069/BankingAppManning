package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Repayment details of the Loan product
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Repayment", description = "Repayment details of the Loan product")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Repayment")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2DataProductInnerOtherProductTypeRepayment {

  /**
   * Repayment type
   */
  public enum RepaymentTypeEnum {
    USBA("USBA"),
    
    USBU("USBU"),
    
    USCI("USCI"),
    
    USCS("USCS"),
    
    USER("USER"),
    
    USFA("USFA"),
    
    USFB("USFB"),
    
    USFI("USFI"),
    
    USIO("USIO"),
    
    USOT("USOT"),
    
    USPF("USPF"),
    
    USRW("USRW"),
    
    USSL("USSL");

    private String value;

    RepaymentTypeEnum(String value) {
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
    public static RepaymentTypeEnum fromValue(String value) {
      for (RepaymentTypeEnum b : RepaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("RepaymentType")
  private RepaymentTypeEnum repaymentType;

  /**
   * Repayment frequency
   */
  public enum RepaymentFrequencyEnum {
    SMDA("SMDA"),
    
    SMFL("SMFL"),
    
    SMFO("SMFO"),
    
    SMHY("SMHY"),
    
    SMMO("SMMO"),
    
    SMOT("SMOT"),
    
    SMQU("SMQU"),
    
    SMWE("SMWE"),
    
    SMYE("SMYE");

    private String value;

    RepaymentFrequencyEnum(String value) {
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
    public static RepaymentFrequencyEnum fromValue(String value) {
      for (RepaymentFrequencyEnum b : RepaymentFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("RepaymentFrequency")
  private RepaymentFrequencyEnum repaymentFrequency;

  /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   */
  public enum AmountTypeEnum {
    RABD("RABD"),
    
    RABL("RABL"),
    
    RACI("RACI"),
    
    RAFC("RAFC"),
    
    RAIO("RAIO"),
    
    RALT("RALT"),
    
    USOT("USOT");

    private String value;

    AmountTypeEnum(String value) {
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
    public static AmountTypeEnum fromValue(String value) {
      for (AmountTypeEnum b : AmountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("AmountType")
  private AmountTypeEnum amountType;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherRepaymentType")
  private OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType;

  @JsonProperty("OtherRepaymentFrequency")
  private OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency;

  @JsonProperty("OtherAmountType")
  private OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType otherAmountType;

  @JsonProperty("RepaymentFeeCharges")
  private OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges;

  @JsonProperty("RepaymentHoliday")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner> repaymentHoliday = null;

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment repaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
    return this;
  }

  /**
   * Repayment type
   * @return repaymentType
  */
  
  @Schema(name = "RepaymentType", description = "Repayment type", required = false)
  public RepaymentTypeEnum getRepaymentType() {
    return repaymentType;
  }

  public void setRepaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment repaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

  /**
   * Repayment frequency
   * @return repaymentFrequency
  */
  
  @Schema(name = "RepaymentFrequency", description = "Repayment frequency", required = false)
  public RepaymentFrequencyEnum getRepaymentFrequency() {
    return repaymentFrequency;
  }

  public void setRepaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment amountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
    return this;
  }

  /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   * @return amountType
  */
  
  @Schema(name = "AmountType", description = "The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc", required = false)
  public AmountTypeEnum getAmountType() {
    return amountType;
  }

  public void setAmountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  
  @Schema(name = "Notes", required = false)
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment otherRepaymentType(OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
    return this;
  }

  /**
   * Get otherRepaymentType
   * @return otherRepaymentType
  */
  @Valid 
  @Schema(name = "OtherRepaymentType", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType getOtherRepaymentType() {
    return otherRepaymentType;
  }

  public void setOtherRepaymentType(OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment otherRepaymentFrequency(OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
    return this;
  }

  /**
   * Get otherRepaymentFrequency
   * @return otherRepaymentFrequency
  */
  @Valid 
  @Schema(name = "OtherRepaymentFrequency", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency getOtherRepaymentFrequency() {
    return otherRepaymentFrequency;
  }

  public void setOtherRepaymentFrequency(OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment otherAmountType(OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
    return this;
  }

  /**
   * Get otherAmountType
   * @return otherAmountType
  */
  @Valid 
  @Schema(name = "OtherAmountType", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType getOtherAmountType() {
    return otherAmountType;
  }

  public void setOtherAmountType(OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment repaymentFeeCharges(OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
    return this;
  }

  /**
   * Get repaymentFeeCharges
   * @return repaymentFeeCharges
  */
  @Valid 
  @Schema(name = "RepaymentFeeCharges", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges getRepaymentFeeCharges() {
    return repaymentFeeCharges;
  }

  public void setRepaymentFeeCharges(OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment repaymentHoliday(List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment addRepaymentHolidayItem(OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner repaymentHolidayItem) {
    if (this.repaymentHoliday == null) {
      this.repaymentHoliday = new ArrayList<>();
    }
    this.repaymentHoliday.add(repaymentHolidayItem);
    return this;
  }

  /**
   * Get repaymentHoliday
   * @return repaymentHoliday
  */
  @Valid 
  @Schema(name = "RepaymentHoliday", required = false)
  public List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner> getRepaymentHoliday() {
    return repaymentHoliday;
  }

  public void setRepaymentHoliday(List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeRepayment obReadProduct2DataProductInnerOtherProductTypeRepayment = (OBReadProduct2DataProductInnerOtherProductTypeRepayment) o;
    return Objects.equals(this.repaymentType, obReadProduct2DataProductInnerOtherProductTypeRepayment.repaymentType) &&
        Objects.equals(this.repaymentFrequency, obReadProduct2DataProductInnerOtherProductTypeRepayment.repaymentFrequency) &&
        Objects.equals(this.amountType, obReadProduct2DataProductInnerOtherProductTypeRepayment.amountType) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeRepayment.notes) &&
        Objects.equals(this.otherRepaymentType, obReadProduct2DataProductInnerOtherProductTypeRepayment.otherRepaymentType) &&
        Objects.equals(this.otherRepaymentFrequency, obReadProduct2DataProductInnerOtherProductTypeRepayment.otherRepaymentFrequency) &&
        Objects.equals(this.otherAmountType, obReadProduct2DataProductInnerOtherProductTypeRepayment.otherAmountType) &&
        Objects.equals(this.repaymentFeeCharges, obReadProduct2DataProductInnerOtherProductTypeRepayment.repaymentFeeCharges) &&
        Objects.equals(this.repaymentHoliday, obReadProduct2DataProductInnerOtherProductTypeRepayment.repaymentHoliday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentType, repaymentFrequency, amountType, notes, otherRepaymentType, otherRepaymentFrequency, otherAmountType, repaymentFeeCharges, repaymentHoliday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeRepayment {\n");
    sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
    sb.append("    repaymentFrequency: ").append(toIndentedString(repaymentFrequency)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherRepaymentType: ").append(toIndentedString(otherRepaymentType)).append("\n");
    sb.append("    otherRepaymentFrequency: ").append(toIndentedString(otherRepaymentFrequency)).append("\n");
    sb.append("    otherAmountType: ").append(toIndentedString(otherAmountType)).append("\n");
    sb.append("    repaymentFeeCharges: ").append(toIndentedString(repaymentFeeCharges)).append("\n");
    sb.append("    repaymentHoliday: ").append(toIndentedString(repaymentHoliday)).append("\n");
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

