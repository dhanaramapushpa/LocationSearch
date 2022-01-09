package com.search.locationsearch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.locationsearch.model.SearchData;
import com.search.locationsearch.repo.SearchDataRepo;
import com.search.locationsearch.service.LocationSearchService;

@Service
public class LocationSearchServiceImpl implements LocationSearchService{
	
	@Autowired
	private SearchDataRepo searchDataRepo;

	@Override
	public void saveAll(List<SearchData> searchData) {
		searchDataRepo.saveAll(searchData);
	}

	@Override
	public Iterable<SearchData> getAll() {
		Iterable<SearchData> findAll = searchDataRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteAll() {
		searchDataRepo.deleteAll();
	}

}
