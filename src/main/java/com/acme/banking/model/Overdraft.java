package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OverdraftTierBandSetInner;
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
 * Borrowing details
 */

@Schema(name = "Overdraft", description = "Borrowing details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-05T12:36:05.734327300Z[UTC]")
public class Overdraft {

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftTierBandSet")
  @Valid
  private List<OverdraftTierBandSetInner> overdraftTierBandSet = new ArrayList<>();

  public Overdraft notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Associated Notes about the overdraft rates
   * @return notes
  */
  
  @Schema(name = "Notes", description = "Associated Notes about the overdraft rates", required = false)
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft overdraftTierBandSet(List<OverdraftTierBandSetInner> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
    return this;
  }

  public Overdraft addOverdraftTierBandSetItem(OverdraftTierBandSetInner overdraftTierBandSetItem) {
    this.overdraftTierBandSet.add(overdraftTierBandSetItem);
    return this;
  }

  /**
   * Tier band set details
   * @return overdraftTierBandSet
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "OverdraftTierBandSet", description = "Tier band set details", required = true)
  public List<OverdraftTierBandSetInner> getOverdraftTierBandSet() {
    return overdraftTierBandSet;
  }

  public void setOverdraftTierBandSet(List<OverdraftTierBandSetInner> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overdraft overdraft = (Overdraft) o;
    return Objects.equals(this.notes, overdraft.notes) &&
        Objects.equals(this.overdraftTierBandSet, overdraft.overdraftTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, overdraftTierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
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

