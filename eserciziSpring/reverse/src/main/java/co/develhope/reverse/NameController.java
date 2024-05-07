package co.develhope.reverse;

import org.springframework.web.bind.annotation.*;

@RestController

public class NameController {
    @GetMapping("/name")
    public String getName(
            @RequestParam String name) {
        return name;
    }
    @PostMapping("/reverse")
    public StringBuilder postName (
            @RequestParam StringBuilder name) {
        return name.reverse();
    }

}

