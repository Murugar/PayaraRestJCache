
package com.iqmsoft.payara.rest.jcache;

import java.util.Set;
import javax.ws.rs.core.Application;


@javax.ws.rs.ApplicationPath("webresources")
public class AppConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

   
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.iqmsoft.payara.rest.jcache.MainController.class);
    }
    
}
