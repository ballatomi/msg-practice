package com.msg.practice.rest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;

/**
 * @author ballat
 */
@Stateful
public class StatefulTest {

    public String say() {
        return this + "I am a stateful bean";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Called Stateful PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Called Stateful PreDestroy");
    }

    @PrePassivate
    public void PrePassivate() {
        System.out.println("Called Stateful PrePassivate");
    }

    @PostActivate
    public void PostActivate() {
        System.out.println("Called Stateful PostActivate");
    }
}
