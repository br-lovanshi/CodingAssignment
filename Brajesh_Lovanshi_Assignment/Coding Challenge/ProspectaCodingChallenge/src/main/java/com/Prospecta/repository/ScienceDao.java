package com.Prospecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Prospecta.model.Science;

@Repository
public interface ScienceDao  extends JpaRepository<Science, Integer>{

}
