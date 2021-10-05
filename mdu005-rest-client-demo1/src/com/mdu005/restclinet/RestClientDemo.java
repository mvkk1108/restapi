package com.mdu005.restclinet;

import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class RestClientDemo {

	public static void main(String[] args) {
		
		// Rest Client Object
		
		
		Client client = ClientBuilder.newClient();
		
		//String message  = client.target("http://localhost:8081/mdu005-rest-server-demo1/rest/ems/hello").request(MediaType.TEXT_PLAIN).get(String.class);
		//System.out.println(message);
		//WebTarget 	webtarget=null;
	//webtarget =	client.target("http://localhost:8081/mdu005-rest-server-demo1/rest/ems/employee");
	// webtarget = webtarget.queryParam("empno", 20201);
	//Builder builder =   webtarget.request(MediaType.APPLICATION_JSON);
	//Employee e =builder.get(Employee.class);
		//System.out.println(e);
		
/*	Employee e =	client.target("http://localhost:8081/mdu005-rest-server-demo1/rest/ems/employee")
		.queryParam("empno", 20201)
		.request(MediaType.APPLICATION_JSON)
		.get(Employee.class);
	
	System.out.println(e);
	*/
	
	List<Employee> empList =	client.target("http://localhost:8081/mdu005-rest-server-demo1/rest/ems/employees").request(MediaType.APPLICATION_JSON).get(new GenericType<List<Employee>>() {});

	
	empList.stream().forEach(t->System.out.println(t));
	
	
	
	
	
	
	}

}
