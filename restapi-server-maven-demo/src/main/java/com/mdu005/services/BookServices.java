package com.mdu005.services;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mdu005.model.Book;
@Path("bookservice")
public class BookServices {
// services
	
@GET
@Path("/book/{id}")
@Produces(MediaType.APPLICATION_JSON)
public Book getBooks(@PathParam("id") int id)
{
	return new Book(101,"java",200.0);
}
@Path("/books")
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Book> books()
{

	return Arrays.asList(
			new Book(101,"java",200.0),
			new Book(102,"Microservices",210.0)
			,
			new Book(103,"DOT NET",300.0)
			,
			new Book(104,"PHP",400.0)
			
			);
	
}
	
}
