package co.develhope.interceptor2.controllers;

import co.develhope.interceptor2.entity.Month;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/month")

public class MonthController {

    @GetMapping
    public Month getMonth(@RequestAttribute("monthNumber") Month month) {
        return month;
    }
}
