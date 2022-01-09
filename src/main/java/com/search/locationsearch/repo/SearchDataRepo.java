package com.search.locationsearch.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.search.locationsearch.model.SearchData;

@Repository
public interface SearchDataRepo extends ElasticsearchRepository<SearchData, String>{

}
