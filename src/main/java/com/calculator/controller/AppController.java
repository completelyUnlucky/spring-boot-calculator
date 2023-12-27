package com.calculator.controller;

import com.calculator.model.AppModel;
import com.calculator.service.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {
    AppModel appModel = new AppModel();
    @Autowired
    private Operations operations;
    @GetMapping(value = "/")
    public String root(Model model) {
        model.addAttribute("appModel", appModel);
        return "root";
    }
    @PostMapping(value = "/", params = "plus")
    public String plus(@ModelAttribute("appModel") AppModel appModel, Model model) {
        model.addAttribute("result", operations.plus(appModel));
        return "root";
    }
    @PostMapping(value = "/", params = "subtraction")
    public String subtraction(@ModelAttribute("appModel") AppModel appModel, Model model) {
        model.addAttribute("result", operations.subtraction(appModel));
        return "root";
    }
    @PostMapping(value = "/", params = "multiply")
    public String multiply(@ModelAttribute("appModel") AppModel appModel, Model model) {
        model.addAttribute("result", operations.multiply(appModel));
        return "root";
    }
    @PostMapping(value = "/", params = "divide")
    public String divide(@ModelAttribute("appModel") AppModel appModel, Model model) {
        model.addAttribute("result", operations.divide(appModel));
        return "root";
    }
}
