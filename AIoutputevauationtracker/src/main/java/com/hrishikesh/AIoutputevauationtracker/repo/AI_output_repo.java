package com.hrishikesh.AIoutputevauationtracker.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrishikesh.AIoutputevauationtracker.model.AI_response_record;

@Repository
public interface AI_output_repo extends JpaRepository<AI_response_record,Integer>{

	List<AI_response_record> findByModelNameContainingIgnoreCase(String modelName);

	List<AI_response_record> findByQualityScoreGreaterThanEqual(Integer qualityScore);



}
