package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataProductInner;
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
 * Aligning with the read write specs structure.
 */

@Schema(name = "OBReadProduct2_Data", description = "Aligning with the read write specs structure.")
@JsonTypeName("OBReadProduct2_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2Data {

  @JsonProperty("Product")
  @Valid
  private List<OBReadProduct2DataProductInner> product = null;

  public OBReadProduct2Data product(List<OBReadProduct2DataProductInner> product) {
    this.product = product;
    return this;
  }

  public OBReadProduct2Data addProductItem(OBReadProduct2DataProductInner productItem) {
    if (this.product == null) {
      this.product = new ArrayList<>();
    }
    this.product.add(productItem);
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @Valid 
  @Schema(name = "Product", required = false)
  public List<OBReadProduct2DataProductInner> getProduct() {
    return product;
  }

  public void setProduct(List<OBReadProduct2DataProductInner> product) {
    this.product = product;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2Data obReadProduct2Data = (OBReadProduct2Data) o;
    return Objects.equals(this.product, obReadProduct2Data.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2Data {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

