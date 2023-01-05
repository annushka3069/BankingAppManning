package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_RepaymentFeeCharges", description = "Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_RepaymentFeeCharges")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges {

  @JsonProperty("RepaymentFeeChargeDetail")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner> repaymentFeeChargeDetail = new ArrayList<>();

  @JsonProperty("RepaymentFeeChargeCap")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner> repaymentFeeChargeCap = null;

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeDetailItem(OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner repaymentFeeChargeDetailItem) {
    this.repaymentFeeChargeDetail.add(repaymentFeeChargeDetailItem);
    return this;
  }

  /**
   * Get repaymentFeeChargeDetail
   * @return repaymentFeeChargeDetail
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "RepaymentFeeChargeDetail", required = true)
  public List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner> getRepaymentFeeChargeDetail() {
    return repaymentFeeChargeDetail;
  }

  public void setRepaymentFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeCapItem(OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner repaymentFeeChargeCapItem) {
    if (this.repaymentFeeChargeCap == null) {
      this.repaymentFeeChargeCap = new ArrayList<>();
    }
    this.repaymentFeeChargeCap.add(repaymentFeeChargeCapItem);
    return this;
  }

  /**
   * Get repaymentFeeChargeCap
   * @return repaymentFeeChargeCap
  */
  @Valid 
  @Schema(name = "RepaymentFeeChargeCap", required = false)
  public List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner> getRepaymentFeeChargeCap() {
    return repaymentFeeChargeCap;
  }

  public void setRepaymentFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges = (OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges) o;
    return Objects.equals(this.repaymentFeeChargeDetail, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges.repaymentFeeChargeDetail) &&
        Objects.equals(this.repaymentFeeChargeCap, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges.repaymentFeeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentFeeChargeDetail, repaymentFeeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges {\n");
    sb.append("    repaymentFeeChargeDetail: ").append(toIndentedString(repaymentFeeChargeDetail)).append("\n");
    sb.append("    repaymentFeeChargeCap: ").append(toIndentedString(repaymentFeeChargeCap)).append("\n");
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

