
package com.iqmsoft.payara.rest.jcache;

import javax.cache.annotation.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;


@Path("cache")
public class MainController {

    @Context
    private UriInfo context;

  
    public MainController() {
    }

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @CacheResult(cacheName = "RestJCache")
    public String getJSON(@QueryParam("key") @CacheKey String key ) {
        return "helloworld";
    }

   
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @CachePut(cacheName = "RestJCache") 
    public void putJSON(@QueryParam("key") @CacheKey String key, @CacheValue String content ) {
    }


    /**
     * DELETE method for cache eviction
     * @param key Key for the entry to remove
     */
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @CacheRemove(cacheName = "RestJCache")
    public void deleteJSON(@QueryParam("key") @CacheKey String key){ }



}
