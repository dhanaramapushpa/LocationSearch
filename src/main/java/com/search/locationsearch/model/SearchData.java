package com.search.locationsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "location-index")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchData {
	
	@Id
	private String id;
	
	private String cityName;
	
	private String region;
}
