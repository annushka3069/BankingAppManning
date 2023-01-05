package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBInterestCalculationMethod1Code;
import com.acme.banking.model.OBOtherCodeType10;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner;
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
 * The group of tiers or bands for which credit interest can be applied.
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner", description = "The group of tiers or bands for which credit interest can be applied.")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner {

  /**
   * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
   */
  public enum TierBandMethodEnum {
    INBA("INBA"),
    
    INTI("INTI"),
    
    INWH("INWH");

    private String value;

    TierBandMethodEnum(String value) {
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
    public static TierBandMethodEnum fromValue(String value) {
      for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("TierBandMethod")
  private TierBandMethodEnum tierBandMethod;

  @JsonProperty("CalculationMethod")
  private OBInterestCalculationMethod1Code calculationMethod;

  /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   */
  public enum DestinationEnum {
    INOT("INOT"),
    
    INPA("INPA"),
    
    INSC("INSC");

    private String value;

    DestinationEnum(String value) {
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
    public static DestinationEnum fromValue(String value) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Destination")
  private DestinationEnum destination;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherCalculationMethod")
  private OBOtherCodeType10 otherCalculationMethod;

  @JsonProperty("OtherDestination")
  private OBOtherCodeType10 otherDestination;

  @JsonProperty("TierBand")
  @Valid
  private List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
   * @return tierBandMethod
  */
  @NotNull 
  @Schema(name = "TierBandMethod", description = "The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance", required = true)
  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Get calculationMethod
   * @return calculationMethod
  */
  @Valid 
  @Schema(name = "CalculationMethod", required = false)
  public OBInterestCalculationMethod1Code getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   * @return destination
  */
  @NotNull 
  @Schema(name = "Destination", description = "Describes whether accrued interest is payable only to the BCA or to another bank account", required = true)
  public DestinationEnum getDestination() {
    return destination;
  }

  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner otherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
    return this;
  }

  /**
   * Get otherCalculationMethod
   * @return otherCalculationMethod
  */
  @Valid 
  @Schema(name = "OtherCalculationMethod", required = false)
  public OBOtherCodeType10 getOtherCalculationMethod() {
    return otherCalculationMethod;
  }

  public void setOtherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner otherDestination(OBOtherCodeType10 otherDestination) {
    this.otherDestination = otherDestination;
    return this;
  }

  /**
   * Get otherDestination
   * @return otherDestination
  */
  @Valid 
  @Schema(name = "OtherDestination", required = false)
  public OBOtherCodeType10 getOtherDestination() {
    return otherDestination;
  }

  public void setOtherDestination(OBOtherCodeType10 otherDestination) {
    this.otherDestination = otherDestination;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner tierBand(List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand) {
    this.tierBand = tierBand;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner addTierBandItem(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner tierBandItem) {
    this.tierBand.add(tierBandItem);
    return this;
  }

  /**
   * Get tierBand
   * @return tierBand
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "TierBand", required = true)
  public List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> getTierBand() {
    return tierBand;
  }

  public void setTierBand(List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand) {
    this.tierBand = tierBand;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner = (OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner) o;
    return Objects.equals(this.tierBandMethod, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.tierBandMethod) &&
        Objects.equals(this.calculationMethod, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.calculationMethod) &&
        Objects.equals(this.destination, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.destination) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.notes) &&
        Objects.equals(this.otherCalculationMethod, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.otherCalculationMethod) &&
        Objects.equals(this.otherDestination, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.otherDestination) &&
        Objects.equals(this.tierBand, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.tierBand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, calculationMethod, destination, notes, otherCalculationMethod, otherDestination, tierBand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner {\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
    sb.append("    otherDestination: ").append(toIndentedString(otherDestination)).append("\n");
    sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
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

