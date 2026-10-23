package com.hrishikesh.AIoutputevauationtracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrishikesh.AIoutputevauationtracker.model.AI_response_record;
import com.hrishikesh.AIoutputevauationtracker.repo.AI_output_repo;

@Service
public class  AI_outputServiceimpl implements AI_outputService{
     
	@Autowired
	AI_output_repo ai_output_repo;

	@Override
	public AI_response_record add(AI_response_record record) {
		
		return ai_output_repo.save(record);
	}

	@Override
	public List<AI_response_record> getAll() {
		
		return ai_output_repo.findAll();
	}

	@Override
	public AI_response_record getById(Integer id) {
		
		return ai_output_repo.findById(id).get();
	}

	@Override
	public AI_response_record update(Integer id, AI_response_record record) {
		AI_response_record existing = ai_output_repo.findById(id).get();
		if(existing!= null) {
			existing.setPrompt(record.getPrompt());
			existing.setAiResponse(record.getAiResponse());
			existing.setModelName(record.getModelName());
			existing.setAccuracyScore(record.getAccuracyScore());
			existing.setRelevanceScore(record.getRelevanceScore());
			existing.setQualityScore(record.getQualityScore());
			existing.setFeedback(record.getFeedback());
			return ai_output_repo.save(existing);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		ai_output_repo.deleteById(id);
	}

	@Override
	public List<AI_response_record> search(String modelName) {
		return ai_output_repo.findByModelNameContainingIgnoreCase(modelName);
	}

	@Override
	public List<AI_response_record> getHighQuality(Integer qualityScore) {
		return ai_output_repo.findByQualityScoreGreaterThanEqual(qualityScore);
	}

	@Override
	public double averageQuality() {
		
	List<AI_response_record> records = ai_output_repo.findAll();

		int sum = 0;
		int count = 0;
		for(AI_response_record record:records) {
			if(record.getQualityScore()!=null) {
				sum = sum + record.getQualityScore();
				count++;
			}
		}
		if(count==0) {
			return 0.0;
		}
		return (double)sum/count;
	}

	
	
}