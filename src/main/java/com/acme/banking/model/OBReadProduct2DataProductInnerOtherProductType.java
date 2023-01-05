package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterest;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterest;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraft;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeProductDetails;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepayment;
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
 * Other product type details associated with the account.
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType", description = "Other product type details associated with the account.")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2DataProductInnerOtherProductType {

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("ProductDetails")
  private OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails;

  @JsonProperty("CreditInterest")
  private OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest;

  @JsonProperty("Overdraft")
  private OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft;

  @JsonProperty("LoanInterest")
  private OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest;

  @JsonProperty("Repayment")
  private OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment;

  @JsonProperty("OtherFeesCharges")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges = null;

  @JsonProperty("SupplementaryData")
  private Object supplementaryData;

  public OBReadProduct2DataProductInnerOtherProductType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the product
   * @return name
  */
  @NotNull @Size(min = 1, max = 350) 
  @Schema(name = "Name", description = "Long name associated with the product", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadProduct2DataProductInnerOtherProductType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Product associated with the account
   * @return description
  */
  @NotNull @Size(min = 1, max = 350) 
  @Schema(name = "Description", description = "Description of the Product associated with the account", required = true)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBReadProduct2DataProductInnerOtherProductType productDetails(OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @Valid 
  @Schema(name = "ProductDetails", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails) {
    this.productDetails = productDetails;
  }

  public OBReadProduct2DataProductInnerOtherProductType creditInterest(OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
  */
  @Valid 
  @Schema(name = "CreditInterest", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest) {
    this.creditInterest = creditInterest;
  }

  public OBReadProduct2DataProductInnerOtherProductType overdraft(OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
  */
  @Valid 
  @Schema(name = "Overdraft", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeOverdraft getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft) {
    this.overdraft = overdraft;
  }

  public OBReadProduct2DataProductInnerOtherProductType loanInterest(OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest) {
    this.loanInterest = loanInterest;
    return this;
  }

  /**
   * Get loanInterest
   * @return loanInterest
  */
  @Valid 
  @Schema(name = "LoanInterest", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest getLoanInterest() {
    return loanInterest;
  }

  public void setLoanInterest(OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest) {
    this.loanInterest = loanInterest;
  }

  public OBReadProduct2DataProductInnerOtherProductType repayment(OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment) {
    this.repayment = repayment;
    return this;
  }

  /**
   * Get repayment
   * @return repayment
  */
  @Valid 
  @Schema(name = "Repayment", required = false)
  public OBReadProduct2DataProductInnerOtherProductTypeRepayment getRepayment() {
    return repayment;
  }

  public void setRepayment(OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment) {
    this.repayment = repayment;
  }

  public OBReadProduct2DataProductInnerOtherProductType otherFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductType addOtherFeesChargesItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner otherFeesChargesItem) {
    if (this.otherFeesCharges == null) {
      this.otherFeesCharges = new ArrayList<>();
    }
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

  /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  */
  @Valid 
  @Schema(name = "OtherFeesCharges", required = false)
  public List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public OBReadProduct2DataProductInnerOtherProductType supplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   * @return supplementaryData
  */
  
  @Schema(name = "SupplementaryData", description = "Additional information that can not be captured in the structured fields and/or any other specific block.", required = false)
  public Object getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductType obReadProduct2DataProductInnerOtherProductType = (OBReadProduct2DataProductInnerOtherProductType) o;
    return Objects.equals(this.name, obReadProduct2DataProductInnerOtherProductType.name) &&
        Objects.equals(this.description, obReadProduct2DataProductInnerOtherProductType.description) &&
        Objects.equals(this.productDetails, obReadProduct2DataProductInnerOtherProductType.productDetails) &&
        Objects.equals(this.creditInterest, obReadProduct2DataProductInnerOtherProductType.creditInterest) &&
        Objects.equals(this.overdraft, obReadProduct2DataProductInnerOtherProductType.overdraft) &&
        Objects.equals(this.loanInterest, obReadProduct2DataProductInnerOtherProductType.loanInterest) &&
        Objects.equals(this.repayment, obReadProduct2DataProductInnerOtherProductType.repayment) &&
        Objects.equals(this.otherFeesCharges, obReadProduct2DataProductInnerOtherProductType.otherFeesCharges) &&
        Objects.equals(this.supplementaryData, obReadProduct2DataProductInnerOtherProductType.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, productDetails, creditInterest, overdraft, loanInterest, repayment, otherFeesCharges, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    loanInterest: ").append(toIndentedString(loanInterest)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

