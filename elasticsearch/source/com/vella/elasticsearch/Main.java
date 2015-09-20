package com.vella.elasticsearch;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.node.NodeBuilder;

/**
 * Created by s on 9/6/15.
 */
public class Main {
        private static final String INDEX = "tmp";

        public static void main(String []args) {



            Client client = NodeBuilder.nodeBuilder()
                    .client(true)
                    .node()
                    .client();
//            Settings settings = ImmutableSettings.settingsBuilder()
//                    .put("client.transport.sniff", true)
//                    .put("cluster.name", "my-cluster").build();
//            Client client = new TransportClient(settings)
//                    .addTransportAddress(new InetSocketTransportAddress("localhost", 9200));
            boolean indexExists = client.admin().indices().prepareExists(INDEX).execute().actionGet().isExists();
            if (indexExists) {
                client.admin().indices().prepareDelete(INDEX).execute().actionGet();
            }
            client.admin().indices().prepareCreate(INDEX).execute().actionGet();

            SearchResponse allHits = client.prepareSearch("products")
                    .addFields("title", "category")
                    .setQuery(QueryBuilders.matchAllQuery())
                    .execute().actionGet();
            System.out.println(allHits.getHits().getAt(0).toString());
        }

}
