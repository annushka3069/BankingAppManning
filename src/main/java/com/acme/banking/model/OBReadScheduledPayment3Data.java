package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBScheduledPayment3;
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
 * OBReadScheduledPayment3Data
 */

@JsonTypeName("OBReadScheduledPayment3_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadScheduledPayment3Data {

  @JsonProperty("ScheduledPayment")
  @Valid
  private List<OBScheduledPayment3> scheduledPayment = null;

  public OBReadScheduledPayment3Data scheduledPayment(List<OBScheduledPayment3> scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
    return this;
  }

  public OBReadScheduledPayment3Data addScheduledPaymentItem(OBScheduledPayment3 scheduledPaymentItem) {
    if (this.scheduledPayment == null) {
      this.scheduledPayment = new ArrayList<>();
    }
    this.scheduledPayment.add(scheduledPaymentItem);
    return this;
  }

  /**
   * Get scheduledPayment
   * @return scheduledPayment
  */
  @Valid 
  @Schema(name = "ScheduledPayment", required = false)
  public List<OBScheduledPayment3> getScheduledPayment() {
    return scheduledPayment;
  }

  public void setScheduledPayment(List<OBScheduledPayment3> scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadScheduledPayment3Data obReadScheduledPayment3Data = (OBReadScheduledPayment3Data) o;
    return Objects.equals(this.scheduledPayment, obReadScheduledPayment3Data.scheduledPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadScheduledPayment3Data {\n");
    sb.append("    scheduledPayment: ").append(toIndentedString(scheduledPayment)).append("\n");
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

