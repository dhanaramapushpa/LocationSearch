package com.search.locationsearch.service;

import java.util.List;

import com.search.locationsearch.model.SearchData;

public interface LocationSearchService {
	
	void saveAll(List<SearchData> searchData);
	
	Iterable<SearchData> getAll();
	
	void deleteAll();

}
