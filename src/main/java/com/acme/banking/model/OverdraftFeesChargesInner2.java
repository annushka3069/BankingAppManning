package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OverdraftFeeChargeCapInner1;
import com.acme.banking.model.OverdraftFeeChargeDetailInner1;
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
 * Overdraft fees and charges
 */

@Schema(name = "OverdraftFeesCharges_inner_2", description = "Overdraft fees and charges")
@JsonTypeName("OverdraftFeesCharges_inner_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OverdraftFeesChargesInner2 {

  @JsonProperty("OverdraftFeeChargeCap")
  @Valid
  private List<OverdraftFeeChargeCapInner1> overdraftFeeChargeCap = null;

  @JsonProperty("OverdraftFeeChargeDetail")
  @Valid
  private List<OverdraftFeeChargeDetailInner1> overdraftFeeChargeDetail = new ArrayList<>();

  public OverdraftFeesChargesInner2 overdraftFeeChargeCap(List<OverdraftFeeChargeCapInner1> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OverdraftFeesChargesInner2 addOverdraftFeeChargeCapItem(OverdraftFeeChargeCapInner1 overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return overdraftFeeChargeCap
  */
  @Valid 
  @Schema(name = "OverdraftFeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge", required = false)
  public List<OverdraftFeeChargeCapInner1> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OverdraftFeeChargeCapInner1> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OverdraftFeesChargesInner2 overdraftFeeChargeDetail(List<OverdraftFeeChargeDetailInner1> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OverdraftFeesChargesInner2 addOverdraftFeeChargeDetailItem(OverdraftFeeChargeDetailInner1 overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

  /**
   * Details about the fees/charges
   * @return overdraftFeeChargeDetail
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "OverdraftFeeChargeDetail", description = "Details about the fees/charges", required = true)
  public List<OverdraftFeeChargeDetailInner1> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<OverdraftFeeChargeDetailInner1> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverdraftFeesChargesInner2 overdraftFeesChargesInner2 = (OverdraftFeesChargesInner2) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraftFeesChargesInner2.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, overdraftFeesChargesInner2.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftFeesChargesInner2 {\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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

