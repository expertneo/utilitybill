/*
 * Copyright (c) 2019 GE. All Rights Reserved.
 */
package com.utilitybill.model.builder;

import java.util.Date;
import org.springframework.stereotype.Component;
import com.utilitybill.model.UtilityEntity;

@Component
public final class UtilityEntityBuilder {
  private String companyName;
  private Date dueDate;

  private UtilityEntityBuilder() {
  }

  public static UtilityEntityBuilder anUtilityEntity() {
    return new UtilityEntityBuilder();
  }

  public UtilityEntityBuilder withCompanyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  public UtilityEntityBuilder withDueDate(Date dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  public UtilityEntity build() {
    UtilityEntity utilityEntity = new UtilityEntity();
    utilityEntity.setUtilityName(companyName);
    utilityEntity.setDueDate(dueDate);
    return utilityEntity;
  }

}
