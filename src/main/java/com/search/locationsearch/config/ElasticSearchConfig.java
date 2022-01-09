package com.search.locationsearch.config;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.search.locationsearch.repo")
public class ElasticSearchConfig {

//	@Override
//    @Bean
//    public RestHighLevelClient elasticsearchClient() {
//        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("https://locationsearch.es.ap-south-1.aws.elastic-cloud.com:9243")
//                .withBasicAuth("elastic", "GxBogyDAnnhwAKxbnub4y13R")
//                .build();
//
//        return RestClients.create(clientConfiguration).rest();
//    }
	
	@Bean
	private static RestClientBuilder buildRestClient() {

	    RestClientBuilder builder = RestClient.builder("i-o-optimized-deployment:YXAtc291dGgtMS5hd3MuZWxhc3RpYy1jbG91ZC5jb206OTI0MyRhM2NiNTA2MjI3NDk0ZTFkODQ3NmFlMWZiMzgzNzBhZCQxMTE5NzRiYWIwNTE0NjRhODM0OWY5ZTY5ZWY2MWZlMw==");

	        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
	        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("elastic", "GxBogyDAnnhwAKxbnub4y13R"));
	        builder.setHttpClientConfigCallback(httpClientBuilder ->
	                httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider));

	    return builder;
	}
}
