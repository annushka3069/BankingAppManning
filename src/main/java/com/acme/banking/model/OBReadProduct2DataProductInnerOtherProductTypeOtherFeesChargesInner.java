package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType;
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

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_OtherFeesCharges_inner", description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_OtherFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner {

  /**
   * TariffType which defines the fee and charges.
   */
  public enum TariffTypeEnum {
    TTEL("TTEL"),
    
    TTMX("TTMX"),
    
    TTOT("TTOT");

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
  private OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType otherTariffType;

  @JsonProperty("FeeChargeDetail")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail = new ArrayList<>();

  @JsonProperty("FeeChargeCap")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap = null;

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner tariffType(TariffTypeEnum tariffType) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner tariffName(String tariffName) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner otherTariffType(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
    return this;
  }

  /**
   * Get otherTariffType
   * @return otherTariffType
  */
  @Valid 
  @Schema(name = "OtherTariffType", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType getOtherTariffType() {
    return otherTariffType;
  }

  public void setOtherTariffType(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner feeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner addFeeChargeDetailItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

  /**
   * Get feeChargeDetail
   * @return feeChargeDetail
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "FeeChargeDetail", required = true)
  public List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner feeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner addFeeChargeCapItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Get feeChargeCap
   * @return feeChargeCap
  */
  @Valid 
  @Schema(name = "FeeChargeCap", required = false)
  public List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap) {
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
    OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner = (OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner) o;
    return Objects.equals(this.tariffType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.tariffType) &&
        Objects.equals(this.tariffName, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.tariffName) &&
        Objects.equals(this.otherTariffType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.otherTariffType) &&
        Objects.equals(this.feeChargeDetail, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner {\n");
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

