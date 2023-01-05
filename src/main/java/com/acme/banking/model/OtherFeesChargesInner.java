package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.FeeChargeCapInner;
import com.acme.banking.model.FeeChargeDetailInner;
import com.acme.banking.model.OtherTariffType;
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
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */

@Schema(name = "OtherFeesCharges_inner", description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@JsonTypeName("OtherFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OtherFeesChargesInner {

  /**
   * TariffType which defines the fee and charges.
   */
  public enum TariffTypeEnum {
    ELECTRONIC("Electronic"),
    
    MIXED("Mixed"),
    
    OTHER("Other");

    private String value;

    TariffTypeEnum(String value) {
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
    public static TariffTypeEnum fromValue(String value) {
      for (TariffTypeEnum b : TariffTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("TariffType")
  private TariffTypeEnum tariffType;

  @JsonProperty("TariffName")
  private String tariffName;

  @JsonProperty("OtherTariffType")
  private OtherTariffType otherTariffType;

  @JsonProperty("FeeChargeDetail")
  @Valid
  private List<FeeChargeDetailInner> feeChargeDetail = new ArrayList<>();

  @JsonProperty("FeeChargeCap")
  @Valid
  private List<FeeChargeCapInner> feeChargeCap = null;

  public OtherFeesChargesInner tariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
    return this;
  }

  /**
   * TariffType which defines the fee and charges.
   * @return tariffType
  */
  
  @Schema(name = "TariffType", description = "TariffType which defines the fee and charges.", required = false)
  public TariffTypeEnum getTariffType() {
    return tariffType;
  }

  public void setTariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
  }

  public OtherFeesChargesInner tariffName(String tariffName) {
    this.tariffName = tariffName;
    return this;
  }

  /**
   * Name of the tariff
   * @return tariffName
  */
  @Size(min = 1, max = 350) 
  @Schema(name = "TariffName", description = "Name of the tariff", required = false)
  public String getTariffName() {
    return tariffName;
  }

  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }

  public OtherFeesChargesInner otherTariffType(OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
    return this;
  }

  /**
   * Get otherTariffType
   * @return otherTariffType
  */
  @Valid 
  @Schema(name = "OtherTariffType", required = false)
  public OtherTariffType getOtherTariffType() {
    return otherTariffType;
  }

  public void setOtherTariffType(OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }

  public OtherFeesChargesInner feeChargeDetail(List<FeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OtherFeesChargesInner addFeeChargeDetailItem(FeeChargeDetailInner feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

  /**
   * Other fees/charges details
   * @return feeChargeDetail
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "FeeChargeDetail", description = "Other fees/charges details", required = true)
  public List<FeeChargeDetailInner> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<FeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OtherFeesChargesInner feeChargeCap(List<FeeChargeCapInner> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OtherFeesChargesInner addFeeChargeCapItem(FeeChargeCapInner feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
   * @return feeChargeCap
  */
  @Valid 
  @Schema(name = "FeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge", required = false)
  public List<FeeChargeCapInner> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<FeeChargeCapInner> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFeesChargesInner otherFeesChargesInner = (OtherFeesChargesInner) o;
    return Objects.equals(this.tariffType, otherFeesChargesInner.tariffType) &&
        Objects.equals(this.tariffName, otherFeesChargesInner.tariffName) &&
        Objects.equals(this.otherTariffType, otherFeesChargesInner.otherTariffType) &&
        Objects.equals(this.feeChargeDetail, otherFeesChargesInner.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, otherFeesChargesInner.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesChargesInner {\n");
    sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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

