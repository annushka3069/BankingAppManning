package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Relationship to the Account resource.
 */

@Schema(name = "OBPartyRelationships1_Account", description = "Relationship to the Account resource.")
@JsonTypeName("OBPartyRelationships1_Account")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBPartyRelationships1Account {

  @JsonProperty("Related")
  private URI related;

  @JsonProperty("Id")
  private String id;

  public OBPartyRelationships1Account related(URI related) {
    this.related = related;
    return this;
  }

  /**
   * Absolute URI to the related resource.
   * @return related
  */
  @NotNull @Valid 
  @Schema(name = "Related", description = "Absolute URI to the related resource.", required = true)
  public URI getRelated() {
    return related;
  }

  public void setRelated(URI related) {
    this.related = related;
  }

  public OBPartyRelationships1Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the related resource.
   * @return id
  */
  @NotNull @Size(min = 1, max = 40) 
  @Schema(name = "Id", description = "Unique identification as assigned by the ASPSP to uniquely identify the related resource.", required = true)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPartyRelationships1Account obPartyRelationships1Account = (OBPartyRelationships1Account) o;
    return Objects.equals(this.related, obPartyRelationships1Account.related) &&
        Objects.equals(this.id, obPartyRelationships1Account.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(related, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1Account {\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

