package com.msg.practice.rest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 * @author ballat
 */
@Stateless
public class StatelessTest {

    public String say() {
        return this + "I am a stateless bean";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Called Stateless PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Called Stateless PreDestroy");
    }

}
