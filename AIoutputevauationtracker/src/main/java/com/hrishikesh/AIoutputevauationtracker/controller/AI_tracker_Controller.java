package com.hrishikesh.AIoutputevauationtracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrishikesh.AIoutputevauationtracker.model.AI_response_record;
import com.hrishikesh.AIoutputevauationtracker.service.AI_outputService;


@RestController
@CrossOrigin(origins="http://localhost:5173")
@RequestMapping("/tracker")
public class AI_tracker_Controller {
    @Autowired
	AI_outputService ai_outputService;
	
    //http://localhost:8080/tracker
    @PostMapping("/add")
	public AI_response_record add(@RequestBody AI_response_record record) {
		return ai_outputService.add(record);
	}
    
    //http://localhost:8080/tracker
    @GetMapping("/getAllrecords")
    List<AI_response_record> getAll(){
    	   return ai_outputService.getAll();
    }
	
    //http://localhost:8080/tracker/1
    @GetMapping("/{id}")
    AI_response_record getById(@PathVariable Integer id) {
    	   return ai_outputService.getById(id);
    }
    
    //http://localhost:8080/tracker/1
    @PutMapping("/{id}")
    AI_response_record update(@PathVariable Integer id,@RequestBody AI_response_record record) {
    	return ai_outputService.update(id, record);
    }
    
    //http://localhost:8080/tracker/1
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
    	    ai_outputService.delete(id);
    }
    
    //http://localhost:8080/tracker/search?modelName=ChatGpt
    @GetMapping("/search")
    List<AI_response_record> search(@RequestParam String modelName){
    	   return ai_outputService.search(modelName);
    }
    
    @GetMapping("/high-quality")
    //http://localhost:8080/tracker/high-quality?qualityScore=8
    List<AI_response_record> getHighQuality(@RequestParam Integer qualityScore){
    	  return ai_outputService.getHighQuality(qualityScore);
    }
    
    @GetMapping("/average-quality")
    public double averageQuality() {
        return ai_outputService.averageQuality();
    }
}
