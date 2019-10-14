package com.utilitybill.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.utilitybill.model.UtilityEntity;

@Repository
public interface UtilityRepository extends JpaRepository<UtilityEntity, Long> {
}
