package co.develhope.EnvironmentVariables1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @Autowired
    private Environment environment;

    @GetMapping
    public String greetings(){
        String message = environment.getProperty("devName") +" "+ environment.getProperty("authCode");
        return message;
    }
}
