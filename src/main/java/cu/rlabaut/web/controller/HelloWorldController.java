package cu.rlabaut.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "helloWorld";
    }

    @GetMapping("/hello/{name:.+}")
    public ModelAndView helloWorld(@PathVariable String name) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("helloWorld");
        modelAndView.addObject("name", name);

        return modelAndView;
    }
}
