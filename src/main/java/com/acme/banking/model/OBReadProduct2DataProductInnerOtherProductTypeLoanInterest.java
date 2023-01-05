package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner;
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
 * Details about the interest that may be payable to the SME Loan holders
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest", description = "Details about the interest that may be payable to the SME Loan holders")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest {

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("LoanInterestTierBandSet")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterestTierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest addLoanInterestTierBandSetItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner loanInterestTierBandSetItem) {
    this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
    return this;
  }

  /**
   * Get loanInterestTierBandSet
   * @return loanInterestTierBandSet
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "LoanInterestTierBandSet", required = true)
  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> getLoanInterestTierBandSet() {
    return loanInterestTierBandSet;
  }

  public void setLoanInterestTierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeLoanInterest obReadProduct2DataProductInnerOtherProductTypeLoanInterest = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterest) o;
    return Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeLoanInterest.notes) &&
        Objects.equals(this.loanInterestTierBandSet, obReadProduct2DataProductInnerOtherProductTypeLoanInterest.loanInterestTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, loanInterestTierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    loanInterestTierBandSet: ").append(toIndentedString(loanInterestTierBandSet)).append("\n");
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

