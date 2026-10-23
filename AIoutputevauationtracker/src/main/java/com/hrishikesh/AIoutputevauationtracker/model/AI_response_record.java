package com.hrishikesh.AIoutputevauationtracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="AI_response_record")
@Setter
@Getter
public class AI_response_record {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String prompt;
	String aiResponse;
	String modelName;
	Double accuracyScore;
	Double relevanceScore;
	Integer qualityScore;
	String feedback;
}
