package org.my.basic.repository;

import org.springframework.data.repository.CrudRepository;
import org.my.basic.model.DormInfo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called dormInfoRepository

public interface DormInfoRepository extends CrudRepository<DormInfo, Integer> {

}