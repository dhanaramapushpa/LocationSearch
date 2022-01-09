package com.search.locationsearch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.locationsearch.model.SearchData;
import com.search.locationsearch.service.LocationSearchService;

@RestController
@CrossOrigin
@RequestMapping("/elastic")
public class LocationSearchController {
	
	@Autowired
	private LocationSearchService locationSearchService;
	
	@PostMapping("/save")
	public String saveCity(@RequestBody SearchData city) {
		List<SearchData> searchData = new ArrayList<>();
		searchData.add(city);
		locationSearchService.saveAll(searchData);
		return "save";
	}
	
	@GetMapping("/getAll")
	public List<SearchData> getAll() {
		Iterable<SearchData> searchData = new ArrayList<>();
		searchData = locationSearchService.getAll();
		List<SearchData> list = new ArrayList<>();
		  
        // Add each element of iterator to the List
		searchData.iterator().forEachRemaining(list::add);
  
        // Return the List
        return list;
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		locationSearchService.deleteAll();
		return "delete success";
	}

}
