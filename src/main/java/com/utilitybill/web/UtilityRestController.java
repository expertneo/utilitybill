package com.utilitybill.web;

import java.time.Instant;
import java.util.Date;
import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.utilitybill.model.UtilityEntity;
import com.utilitybill.model.builder.UtilityEntityBuilder;
import com.utilitybill.service.UtilityService;
import com.utilitybill.web.request.UtilityRequest;

@RestController
public class UtilityRestController {

  private final UtilityService utilityService;
  private final UtilityEntityBuilder utilityEntityBuilder;
  private static final Logger LOGGER = LoggerFactory.getLogger(UtilityRestController.class);

  private ModelMapper modelMapper = new ModelMapper();

  @Autowired
  public UtilityRestController(UtilityService utilityService, UtilityEntityBuilder utilityEntityBuilder) {
    this.utilityService = utilityService;
    this.utilityEntityBuilder = utilityEntityBuilder;
  }

  @PostMapping("/utility/create")
  public void createUtility(@RequestBody @Valid UtilityRequest utilityRequest) {
    LOGGER.info("/utility endpoint was called with a POST request and a body of {}", utilityRequest.toString());
    UtilityEntity utilityEntity = modelMapper.map(utilityRequest, UtilityEntity.class);
    utilityService.saveUtility(utilityEntity);
    LOGGER.info("Utility has been successfully persisted in the DataBase");
  }

  @GetMapping("/utility")
  public UtilityEntity getUtility() {
    return utilityEntityBuilder.withCompanyName("Elmu").withDueDate(Date.from(Instant.now())).build();
  }

}
