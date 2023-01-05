package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Set of elements used to provide details of a generic number value related to the statement resource.
 */

@Schema(name = "OBStatement2_StatementValue_inner", description = "Set of elements used to provide details of a generic number value related to the statement resource.")
@JsonTypeName("OBStatement2_StatementValue_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBStatement2StatementValueInner {

  @JsonProperty("Value")
  private String value;

  @JsonProperty("Type")
  private String type;

  public OBStatement2StatementValueInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value associated with the statement value type.
   * @return value
  */
  @NotNull @Size(min = 1, max = 40) 
  @Schema(name = "Value", description = "Value associated with the statement value type.", required = true)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OBStatement2StatementValueInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Statement value type, in a coded form.
   * @return type
  */
  @NotNull 
  @Schema(name = "Type", description = "Statement value type, in a coded form.", required = true)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementValueInner obStatement2StatementValueInner = (OBStatement2StatementValueInner) o;
    return Objects.equals(this.value, obStatement2StatementValueInner.value) &&
        Objects.equals(this.type, obStatement2StatementValueInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementValueInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

