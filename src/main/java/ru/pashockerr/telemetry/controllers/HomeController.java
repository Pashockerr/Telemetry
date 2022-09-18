/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package ru.pashockerr.telemetry.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.pashockerr.telemetry.beans.ValuesComponent;

/**
 *
 * @author userpc
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    ValuesComponent values;
    
    @GetMapping(value={"", "/"})
    public ModelAndView page() {
        var modelAndView = new ModelAndView("index");
        modelAndView.addObject("value", values.hashCode());
        return modelAndView;
    }
    
}
