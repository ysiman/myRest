package com.klevytska.rest_service.rest;

import java.util.List;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import static org.junit.Assert.*;

public class MessageRESTTest extends JerseyTest{

    @Override
    protected Application configure() {
        return new JaxRsActivator();
    }

    @Test
    public void getListAll() {
       String cities = target("message").request().get(String.class);
        System.out.println("#cities="+cities.toString());
    }
}