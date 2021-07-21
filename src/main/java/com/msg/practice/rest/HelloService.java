package com.msg.practice.rest;

import com.msg.practice.dto.TestDto;
import javax.annotation.security.DenyAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author ballat
 */
@Path("/hello")
public class HelloService {

    @GET
    @Path("/text")
    public String getHello() {
        return "hello world!";
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public TestDto getPropertyJSON() {
        TestDto p = new TestDto("key example", "value example");
        return p;
    }

    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public TestDto getPropertyXML() {
        TestDto p = new TestDto("key", "value");
        return p;
    }
}
