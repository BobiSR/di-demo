package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


// Wrong Way!!!!!!!
@Controller
public class PropertyInjectedController {

    @Autowired
    //public GreetingServiceImpl greetingService;
    public GreetingService greetingServiceImpl;

    /*public String sayHello() {
        return greetingService.sayGreeting();
    }*/

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }

}
