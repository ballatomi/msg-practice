package com.msg.practice.rest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Startup;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author ballat
 */
@Path("/lifecycle")
public class EJBLifecycle {

    @Inject
    StatelessTest statelessTest;

    @Inject
    StatefulTest statefulTest;

    @GET
    @Path("/stateless")
    public String stateless() {
        return "Test lifecycle ---- " + statelessTest.say();
    }

    @GET
    @Path("/stateful")
    public String getHello() {
        return "Test lifecycle ---- " + statefulTest.say();
    }

}
