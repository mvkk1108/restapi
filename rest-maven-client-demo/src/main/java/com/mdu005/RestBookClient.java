package com.mdu005;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class RestBookClient {
	
	public static void main(String[] args) {
		
		// create a client
		
		Client client = ClientBuilder.newClient();
		
	Book b =	client.target("http://localhost:8081/restapi-server-maven-demo/rest/bookservice/book/20201")
		.request(MediaType.APPLICATION_JSON).get(Book.class);
		System.out.println(b);
		
	}

}
