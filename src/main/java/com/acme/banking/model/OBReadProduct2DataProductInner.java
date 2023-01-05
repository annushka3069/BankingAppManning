package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBBCAData1;
import com.acme.banking.model.OBPCAData1;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Product details associated with the Account
 */

@Schema(name = "OBReadProduct2_Data_Product_inner", description = "Product details associated with the Account")
@JsonTypeName("OBReadProduct2_Data_Product_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2DataProductInner {

  @JsonProperty("ProductName")
  private String productName;

  @JsonProperty("ProductId")
  private String productId;

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("SecondaryProductId")
  private String secondaryProductId;

  /**
   * Product type : Personal Current Account, Business Current Account
   */
  public enum ProductTypeEnum {
    BUSINESSCURRENTACCOUNT("BusinessCurrentAccount"),
    
    COMMERCIALCREDITCARD("CommercialCreditCard"),
    
    OTHER("Other"),
    
    PERSONALCURRENTACCOUNT("PersonalCurrentAccount"),
    
    SMELOAN("SMELoan");

    private String value;

    ProductTypeEnum(String value) {
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
    public static ProductTypeEnum fromValue(String value) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ProductType")
  private ProductTypeEnum productType;

  @JsonProperty("MarketingStateId")
  private String marketingStateId;

  @JsonProperty("OtherProductType")
  private OBReadProduct2DataProductInnerOtherProductType otherProductType;

  @JsonProperty("BCA")
  private OBBCAData1 BCA;

  @JsonProperty("PCA")
  private OBPCAData1 PCA;

  public OBReadProduct2DataProductInner productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return productName
  */
  @Size(min = 1, max = 350) 
  @Schema(name = "ProductName", description = "The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.", required = false)
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public OBReadProduct2DataProductInner productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
   * @return productId
  */
  @Size(min = 1, max = 40) 
  @Schema(name = "ProductId", description = "The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.", required = false)
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public OBReadProduct2DataProductInner accountId(String accountId) {
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

  public OBReadProduct2DataProductInner secondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
    return this;
  }

  /**
   * Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.
   * @return secondaryProductId
  */
  @Size(min = 1, max = 70) 
  @Schema(name = "SecondaryProductId", description = "Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.", required = false)
  public String getSecondaryProductId() {
    return secondaryProductId;
  }

  public void setSecondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
  }

  public OBReadProduct2DataProductInner productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Product type : Personal Current Account, Business Current Account
   * @return productType
  */
  @NotNull 
  @Schema(name = "ProductType", description = "Product type : Personal Current Account, Business Current Account", required = true)
  public ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public OBReadProduct2DataProductInner marketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Product Marketing State.
   * @return marketingStateId
  */
  @Size(min = 1, max = 35) 
  @Schema(name = "MarketingStateId", description = "Unique and unambiguous identification of a  Product Marketing State.", required = false)
  public String getMarketingStateId() {
    return marketingStateId;
  }

  public void setMarketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
  }

  public OBReadProduct2DataProductInner otherProductType(OBReadProduct2DataProductInnerOtherProductType otherProductType) {
    this.otherProductType = otherProductType;
    return this;
  }

  /**
   * Get otherProductType
   * @return otherProductType
  */
  @Valid 
  @Schema(name = "OtherProductType", required = false)
  public OBReadProduct2DataProductInnerOtherProductType getOtherProductType() {
    return otherProductType;
  }

  public void setOtherProductType(OBReadProduct2DataProductInnerOtherProductType otherProductType) {
    this.otherProductType = otherProductType;
  }

  public OBReadProduct2DataProductInner BCA(OBBCAData1 BCA) {
    this.BCA = BCA;
    return this;
  }

  /**
   * Get BCA
   * @return BCA
  */
  @Valid 
  @Schema(name = "BCA", required = false)
  public OBBCAData1 getBCA() {
    return BCA;
  }

  public void setBCA(OBBCAData1 BCA) {
    this.BCA = BCA;
  }

  public OBReadProduct2DataProductInner PCA(OBPCAData1 PCA) {
    this.PCA = PCA;
    return this;
  }

  /**
   * Get PCA
   * @return PCA
  */
  @Valid 
  @Schema(name = "PCA", required = false)
  public OBPCAData1 getPCA() {
    return PCA;
  }

  public void setPCA(OBPCAData1 PCA) {
    this.PCA = PCA;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInner obReadProduct2DataProductInner = (OBReadProduct2DataProductInner) o;
    return Objects.equals(this.productName, obReadProduct2DataProductInner.productName) &&
        Objects.equals(this.productId, obReadProduct2DataProductInner.productId) &&
        Objects.equals(this.accountId, obReadProduct2DataProductInner.accountId) &&
        Objects.equals(this.secondaryProductId, obReadProduct2DataProductInner.secondaryProductId) &&
        Objects.equals(this.productType, obReadProduct2DataProductInner.productType) &&
        Objects.equals(this.marketingStateId, obReadProduct2DataProductInner.marketingStateId) &&
        Objects.equals(this.otherProductType, obReadProduct2DataProductInner.otherProductType) &&
        Objects.equals(this.BCA, obReadProduct2DataProductInner.BCA) &&
        Objects.equals(this.PCA, obReadProduct2DataProductInner.PCA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, productId, accountId, secondaryProductId, productType, marketingStateId, otherProductType, BCA, PCA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInner {\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    secondaryProductId: ").append(toIndentedString(secondaryProductId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    marketingStateId: ").append(toIndentedString(marketingStateId)).append("\n");
    sb.append("    otherProductType: ").append(toIndentedString(otherProductType)).append("\n");
    sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");
    sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
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

