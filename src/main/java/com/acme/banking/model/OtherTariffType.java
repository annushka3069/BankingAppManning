package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
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
 * Other tariff type which is not in the standard list.
 */

@Schema(name = "OtherTariffType", description = "Other tariff type which is not in the standard list.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OtherTariffType {

  @JsonProperty("Code")
  private String code;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Description")
  private String description;

  public OtherTariffType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
  */
  @Pattern(regexp = "^\\w{0,4}$") @Size(min = 0, max = 4) 
  @Schema(name = "Code", description = "The four letter Mnemonic used within an XML file to identify a code", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OtherTariffType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   * @return name
  */
  @NotNull @Size(min = 1, max = 70) 
  @Schema(name = "Name", description = "Long name associated with the code", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OtherTariffType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   * @return description
  */
  @NotNull @Size(min = 1, max = 350) 
  @Schema(name = "Description", description = "Description to describe the purpose of the code", required = true)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherTariffType otherTariffType = (OtherTariffType) o;
    return Objects.equals(this.code, otherTariffType.code) &&
        Objects.equals(this.name, otherTariffType.name) &&
        Objects.equals(this.description, otherTariffType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherTariffType {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

