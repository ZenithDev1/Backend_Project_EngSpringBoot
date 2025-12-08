package com.devendra.bestproject;

//@Component
public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar){
        this.myVar = myVar;
    }

    public String sayHello(){
        return "saying hello from MyFirstClass ==> myVar = " + myVar;
    }
}
