package com.tukapai.springboot.repositories;

import com.tukapai.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface MyDataRepository extends JpaRepository<TestEntity, Long> {
	
}
