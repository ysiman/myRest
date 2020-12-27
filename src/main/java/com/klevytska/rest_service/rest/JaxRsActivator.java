package com.klevytska.rest_service.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by katerynalevytska on 1/30/17.
 */

@ApplicationPath("api")
public class JaxRsActivator extends ResourceConfig {
    public JaxRsActivator() {
        packages("com.klevytska.rest_service.rest");
    }
}
