package com.devendra.bestproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

//    @Autowired
//    @Qualifier("myFirstBean")
    private MyFirstClass myFirstClass;

    @Autowired
    public void injectDependencies(@Qualifier("bean3") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory(){
        return "The dependency is saying : " + myFirstClass.sayHello();
    }
}
