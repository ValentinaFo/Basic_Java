package co.develhope.EnvironmentVariables2;

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
    public String welcome(){
        String benvenuto = environment.getProperty("welcomeMsg");
        return benvenuto;
    }
}
