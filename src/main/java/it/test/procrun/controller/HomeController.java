package it.test.procrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zanutto on 2/23/15.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/index"})
    public void index(){}
}
