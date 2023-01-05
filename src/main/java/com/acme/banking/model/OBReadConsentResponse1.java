package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.Links;
import com.acme.banking.model.Meta;
import com.acme.banking.model.OBReadConsentResponse1Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OBReadConsentResponse1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBReadConsentResponse1 {

  @JsonProperty("Data")
  private OBReadConsentResponse1Data data;

  @JsonProperty("Risk")
  private Object risk;

  @JsonProperty("Links")
  private Links links;

  @JsonProperty("Meta")
  private Meta meta;

  public OBReadConsentResponse1 data(OBReadConsentResponse1Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "Data", required = true)
  public OBReadConsentResponse1Data getData() {
    return data;
  }

  public void setData(OBReadConsentResponse1Data data) {
    this.data = data;
  }

  public OBReadConsentResponse1 risk(Object risk) {
    this.risk = risk;
    return this;
  }

  /**
   * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
   * @return risk
  */
  @NotNull 
  @Schema(name = "Risk", description = "The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.", required = true)
  public Object getRisk() {
    return risk;
  }

  public void setRisk(Object risk) {
    this.risk = risk;
  }

  public OBReadConsentResponse1 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "Links", required = false)
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadConsentResponse1 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @Valid 
  @Schema(name = "Meta", required = false)
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadConsentResponse1 obReadConsentResponse1 = (OBReadConsentResponse1) o;
    return Objects.equals(this.data, obReadConsentResponse1.data) &&
        Objects.equals(this.risk, obReadConsentResponse1.risk) &&
        Objects.equals(this.links, obReadConsentResponse1.links) &&
        Objects.equals(this.meta, obReadConsentResponse1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsentResponse1 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

