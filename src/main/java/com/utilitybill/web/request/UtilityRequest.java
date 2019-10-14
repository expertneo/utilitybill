/*
 * Copyright (c) 2019 GE. All Rights Reserved.
 */
package com.utilitybill.web.request;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class UtilityRequest {

  @NotNull
  @JsonProperty("utility_name")
  private String utilityName;
  @NotNull
  @JsonProperty("due_date")
  private Date dueDate;

  public String getUtilityName() {
    return utilityName;
  }

  public void setUtilityName(String utilityName) {
    this.utilityName = utilityName;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  @Override
  public String toString() {
    return "UtilityRequest{" + "utilityName='" + utilityName + '\'' + ", dueDate=" + dueDate + '}';
  }

}
