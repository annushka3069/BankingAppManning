package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner;
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
 * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner_LoanInterestTierBand_inner_LoanInterestFeesCharges_inner", description = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner_LoanInterestTierBand_inner_LoanInterestFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner {

  @JsonProperty("LoanInterestFeeChargeDetail")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail = new ArrayList<>();

  @JsonProperty("LoanInterestFeeChargeCap")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> loanInterestFeeChargeCap = null;

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner loanInterestFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner addLoanInterestFeeChargeDetailItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner loanInterestFeeChargeDetailItem) {
    this.loanInterestFeeChargeDetail.add(loanInterestFeeChargeDetailItem);
    return this;
  }

  /**
   * Get loanInterestFeeChargeDetail
   * @return loanInterestFeeChargeDetail
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "LoanInterestFeeChargeDetail", required = true)
  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> getLoanInterestFeeChargeDetail() {
    return loanInterestFeeChargeDetail;
  }

  public void setLoanInterestFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner loanInterestFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner addLoanInterestFeeChargeCapItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner loanInterestFeeChargeCapItem) {
    if (this.loanInterestFeeChargeCap == null) {
      this.loanInterestFeeChargeCap = new ArrayList<>();
    }
    this.loanInterestFeeChargeCap.add(loanInterestFeeChargeCapItem);
    return this;
  }

  /**
   * Get loanInterestFeeChargeCap
   * @return loanInterestFeeChargeCap
  */
  @Valid 
  @Schema(name = "LoanInterestFeeChargeCap", required = false)
  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> getLoanInterestFeeChargeCap() {
    return loanInterestFeeChargeCap;
  }

  public void setLoanInterestFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner) o;
    return Objects.equals(this.loanInterestFeeChargeDetail, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner.loanInterestFeeChargeDetail) &&
        Objects.equals(this.loanInterestFeeChargeCap, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner.loanInterestFeeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanInterestFeeChargeDetail, loanInterestFeeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner {\n");
    sb.append("    loanInterestFeeChargeDetail: ").append(toIndentedString(loanInterestFeeChargeDetail)).append("\n");
    sb.append("    loanInterestFeeChargeCap: ").append(toIndentedString(loanInterestFeeChargeCap)).append("\n");
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

