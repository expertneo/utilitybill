package com.utilitybill.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.utilitybill.model.UtilityEntity;
import com.utilitybill.repository.UtilityRepository;

@Service
public class UtilityServiceImpl implements UtilityService {

  private final UtilityRepository utilityRepository;

  @Autowired
  public UtilityServiceImpl(UtilityRepository utilityRepository) {
    this.utilityRepository = utilityRepository;
  }

  @Override
  public List<UtilityEntity> getAllUtilities() {
    return utilityRepository.findAll();
  }

  @Override
  public void saveUtility(UtilityEntity utility) {
    utilityRepository.save(utility);
  }

}
