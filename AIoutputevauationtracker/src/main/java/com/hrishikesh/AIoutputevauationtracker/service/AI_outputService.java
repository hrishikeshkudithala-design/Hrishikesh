package com.hrishikesh.AIoutputevauationtracker.service;

import java.util.List;

import com.hrishikesh.AIoutputevauationtracker.model.AI_response_record;

public interface AI_outputService {

	
	AI_response_record add(AI_response_record record);
	
	List<AI_response_record> getAll();
	
	AI_response_record getById(Integer id);
	
	AI_response_record update(Integer id, AI_response_record record);
	
	void delete(Integer id);
	
	List<AI_response_record> search(String modelName);
	

	
	double averageQuality();

	List<AI_response_record> getHighQuality(Integer qualityScore);
}
