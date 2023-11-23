package org.mohsin;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/greeting")
public class SecondResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String greeting(){
        return "<h1>Hello World</h1>";
    }
}
