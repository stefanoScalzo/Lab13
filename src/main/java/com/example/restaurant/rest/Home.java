package com.example.restaurant.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class Home {

    /**
     * Home page of api
     */
    @GET
    @Produces("text/html")
    public Response Hello() {
        return Response.status(Response.Status.OK).entity("This is a restaurant api service").build();
    }

}
