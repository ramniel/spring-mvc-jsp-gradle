package tech.harkos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public String defaultPage() {
        return "index";
    }

    @GetMapping("/hello/{name:.+}")
    public ModelAndView hello(@PathVariable("name") String name) {

        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("name", name);

        return model;
    }
}
