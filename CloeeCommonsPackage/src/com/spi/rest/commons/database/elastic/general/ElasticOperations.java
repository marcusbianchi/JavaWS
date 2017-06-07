package com.spi.rest.commons.database.elastic.general;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.JestResult;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.Index;
import io.searchbox.core.Search;

/**
 * @desc this class holds CRUD functions for ElasticSearch * examples include
 *       getSpecific(), elasticUpsert()
 * @author Francisco Cardoso
 */
public class ElasticOperations {
	private SearchSourceBuilder searchSourceBuilder;
	private JestClient jestClient;

	private static JestClient getClient() throws Exception {
		
		  HttpClientConfig clientConfig = new HttpClientConfig.Builder(
		  "http://search-cloee-rnf2wyjyibkgfi7sboybscjgqu.us-west-2.es.amazonaws.com:80"
		  ).multiThreaded(true) .build();
		 

		/*HttpClientConfig clientConfig = new HttpClientConfig.Builder("http://localhost:9200").multiThreaded(true)
				.build();*/

		JestClientFactory factory = new JestClientFactory();
		factory.setHttpClientConfig(clientConfig);
		JestClient jestClient = factory.getObject();

		return jestClient;
	}

	/**
	 * @desc read JSON from ElasticSearch
	 * @param String
	 *            index, String type, String documentID
	 * @return String - JSON Object
	 * @throws Exception
	 */
	public String getSpecific(String index, String type, String documentID) throws Exception {
		searchSourceBuilder = new SearchSourceBuilder();
		jestClient = getClient();
		String response = "{}";

		QueryBuilder queryBuilder = QueryBuilders.boolQuery().must(QueryBuilders.termQuery("status", "active"))
				.must(QueryBuilders.termQuery("machineID", documentID));

		searchSourceBuilder.query(queryBuilder);

		Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(index).addType(type).build();

		System.out.println(searchSourceBuilder.toString());
		JestResult result = jestClient.execute(search);
		response = result.getJsonString();

		jestClient.shutdownClient();
		return response;

	}

	/**
	 * @desc update or insert JSON in ElasticSearch, depending if ID already
	 *       exists or not
	 * @param String
	 *            index, String type, String documentID, String dscValue
	 * @return String - Response entity
	 */
	public String elasticUpsert(String index, String type, String documentID, String dscValue) throws Exception {
		jestClient = getClient();
		Index indexRequest = new Index.Builder(dscValue).index(index).type(type).id(documentID).build();

		JestResult result = jestClient.execute(indexRequest);

		jestClient.shutdownClient();

		System.out.println(result.getResponseCode());

		if (result.isSucceeded()) {
			System.out.println(result.getJsonString());
			return "Itens have been successfully created/updated";
		} else {
			System.out.println(result.getErrorMessage());
			return result.getErrorMessage();
		}
	}
}
