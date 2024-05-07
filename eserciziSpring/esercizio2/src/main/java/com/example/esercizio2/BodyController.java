package com.example.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class BodyController {


    @GetMapping(path = "/ciao/{provincia}")
    public User ciao(
            @PathVariable String provincia,
            @RequestParam(required = true) String nome
    ){
        return new User(nome,provincia);
    }

}
