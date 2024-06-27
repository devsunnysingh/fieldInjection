package com.devsunnysingh.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

//This is an example of field injection.
// The way to do this is to use @Autowired annotation to inject the dependencies.
//  It is not adviced to use field injection. The best way for dependency injection
//  is to use constructor injection.
    @Autowired
    @Qualifier("bean2")
    private MyFirstClass myFirstClass;

    public String tellAStory(){
//This method is sjsust making a call to the sayHello method of the MyFirstClass.
        return "The dependancy is saying : "+myFirstClass.sayHello();
    }

}
