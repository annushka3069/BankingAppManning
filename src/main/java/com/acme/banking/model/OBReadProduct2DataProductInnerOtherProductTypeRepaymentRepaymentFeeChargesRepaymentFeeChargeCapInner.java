package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBMinMaxType1Code;
import com.acme.banking.model.OBPeriod1Code;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner;
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
 * RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_RepaymentFeeCharges_RepaymentFeeChargeCap_inner", description = "RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_RepaymentFeeCharges_RepaymentFeeChargeCap_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner {

  /**
   * Fee/charge type which is being capped
   */
  public enum FeeTypeEnum {
    FEPF("FEPF"),
    
    FTOT("FTOT"),
    
    FYAF("FYAF"),
    
    FYAM("FYAM"),
    
    FYAQ("FYAQ"),
    
    FYCP("FYCP"),
    
    FYDB("FYDB"),
    
    FYMI("FYMI"),
    
    FYXX("FYXX");

    private String value;

    FeeTypeEnum(String value) {
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
    public static FeeTypeEnum fromValue(String value) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("FeeType")
  @Valid
  private List<FeeTypeEnum> feeType = new ArrayList<>();

  @JsonProperty("MinMaxType")
  private OBMinMaxType1Code minMaxType;

  @JsonProperty("FeeCapOccurrence")
  private Integer feeCapOccurrence;

  @JsonProperty("FeeCapAmount")
  private String feeCapAmount;

  @JsonProperty("CappingPeriod")
  private OBPeriod1Code cappingPeriod;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherFeeType")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner> otherFeeType = null;

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

  /**
   * Get feeType
   * @return feeType
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "FeeType", required = true)
  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner minMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Get minMaxType
   * @return minMaxType
  */
  @NotNull @Valid 
  @Schema(name = "MinMaxType", required = true)
  public OBMinMaxType1Code getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner feeCapOccurrence(Integer feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

  /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  */
  
  @Schema(name = "FeeCapOccurrence", description = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount", required = false)
  public Integer getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Integer feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

  /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
  */
  @Pattern(regexp = "^(-?\\\\d{1,14}){1}(\\\\.\\\\d{1,4}){0,1}$") 
  @Schema(name = "FeeCapAmount", description = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)", required = false)
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner cappingPeriod(OBPeriod1Code cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

  /**
   * Get cappingPeriod
   * @return cappingPeriod
  */
  @Valid 
  @Schema(name = "CappingPeriod", required = false)
  public OBPeriod1Code getCappingPeriod() {
    return cappingPeriod;
  }

  public void setCappingPeriod(OBPeriod1Code cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner otherFeeType(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner addOtherFeeTypeItem(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
  */
  @Valid 
  @Schema(name = "OtherFeeType", required = false)
  public List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner = (OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner) o;
    return Objects.equals(this.feeType, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.feeType) &&
        Objects.equals(this.minMaxType, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.minMaxType) &&
        Objects.equals(this.feeCapOccurrence, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.feeCapOccurrence) &&
        Objects.equals(this.feeCapAmount, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.feeCapAmount) &&
        Objects.equals(this.cappingPeriod, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.cappingPeriod) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.notes) &&
        Objects.equals(this.otherFeeType, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner {\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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
