package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.TierBandSetInner1;
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
 * Details about the interest that may be payable to the PCA account holders
 */

@Schema(name = "CreditInterest_1", description = "Details about the interest that may be payable to the PCA account holders")
@JsonTypeName("CreditInterest_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class CreditInterest1 {

  @JsonProperty("TierBandSet")
  @Valid
  private List<TierBandSetInner1> tierBandSet = new ArrayList<>();

  public CreditInterest1 tierBandSet(List<TierBandSetInner1> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public CreditInterest1 addTierBandSetItem(TierBandSetInner1 tierBandSetItem) {
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

  /**
   * The group of tiers or bands for which credit interest can be applied.
   * @return tierBandSet
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "TierBandSet", description = "The group of tiers or bands for which credit interest can be applied.", required = true)
  public List<TierBandSetInner1> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<TierBandSetInner1> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterest1 creditInterest1 = (CreditInterest1) o;
    return Objects.equals(this.tierBandSet, creditInterest1.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest1 {\n");
    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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

