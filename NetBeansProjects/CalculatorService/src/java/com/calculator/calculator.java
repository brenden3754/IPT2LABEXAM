/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author brenden09
 */
@WebService 
public class calculator {
    @WebMethod
    public int add(int a, int b){
        return a+b; 
    }
    @WebMethod
    public int substract(int a, int b){
        return a-b;
    }
    @WebMethod
    public int multiply(int a, int b){
        return a*b;
    }
    @WebMethod
    public int division(int a, int b){
        return a/b;
    }
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
