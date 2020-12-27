package com.klevytska.rest_service.rest;

import com.klevytska.rest_service.repository.MessageRepository;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by katerynalevytska on 2/11/17.
 */

@Path("message")
public class MessageREST {





    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getListAll(){
        return "Test message";
    }


}


