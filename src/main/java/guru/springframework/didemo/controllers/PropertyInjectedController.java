package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;


// Wrong Way!!!!!!!
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
