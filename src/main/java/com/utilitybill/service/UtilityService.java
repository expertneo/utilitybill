package com.utilitybill.service;

import java.util.List;
import com.utilitybill.model.UtilityEntity;

public interface UtilityService {

  List<UtilityEntity> getAllUtilities();

  void saveUtility(UtilityEntity utilityEntity);

}
