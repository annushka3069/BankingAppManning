package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBError1;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * An array of detail error codes, and messages, and URLs to documentation to help remediation.
 */

@Schema(name = "OBErrorResponse1", description = "An array of detail error codes, and messages, and URLs to documentation to help remediation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class OBErrorResponse1 {

  @JsonProperty("Code")
  private String code;

  @JsonProperty("Id")
  private String id;

  @JsonProperty("Message")
  private String message;

  @JsonProperty("Errors")
  @Valid
  private List<OBError1> errors = new ArrayList<>();

  public OBErrorResponse1 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * High level textual error code, to help categorize the errors.
   * @return code
  */
  @NotNull @Size(min = 1, max = 40) 
  @Schema(name = "Code", description = "High level textual error code, to help categorize the errors.", required = true)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBErrorResponse1 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
   * @return id
  */
  @Size(min = 1, max = 40) 
  @Schema(name = "Id", description = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OBErrorResponse1 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Brief Error message, e.g., 'There is something wrong with the request parameters provided'
   * @return message
  */
  @NotNull @Size(min = 1, max = 500) 
  @Schema(name = "Message", description = "Brief Error message, e.g., 'There is something wrong with the request parameters provided'", required = true)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OBErrorResponse1 errors(List<OBError1> errors) {
    this.errors = errors;
    return this;
  }

  public OBErrorResponse1 addErrorsItem(OBError1 errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "Errors", required = true)
  public List<OBError1> getErrors() {
    return errors;
  }

  public void setErrors(List<OBError1> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBErrorResponse1 obErrorResponse1 = (OBErrorResponse1) o;
    return Objects.equals(this.code, obErrorResponse1.code) &&
        Objects.equals(this.id, obErrorResponse1.id) &&
        Objects.equals(this.message, obErrorResponse1.message) &&
        Objects.equals(this.errors, obErrorResponse1.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, id, message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBErrorResponse1 {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

