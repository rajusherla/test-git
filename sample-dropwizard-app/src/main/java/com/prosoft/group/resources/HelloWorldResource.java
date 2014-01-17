package com.prosoft.group.resources;

import com.google.common.base.Optional;
import com.prosoft.group.core.Saying;
import com.yammer.metrics.annotation.Timed;


import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String defaultName;

    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
    	Saying saying = new Saying();
    	saying.setNumber1(12);
    	saying.setNumber2(23);
    	saying.setResult(1563);
    	return new Saying();
//        return new Saying(counter.incrementAndGet(),
//                          String.format(template, name.or(defaultName)));
    }
    
    @POST
    @Path("/add")
    public Response add(Saying saying) {
    	
    	saying.setResult(saying.getNumber1() + saying.getNumber2());
    	 return Response.status(201).entity(saying).build();
    }
}