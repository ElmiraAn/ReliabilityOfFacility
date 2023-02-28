package com.elmiraantipina.spring.project.spring_reliability.controller;

import com.elmiraantipina.spring.project.spring_reliability.entity.Failure;
import com.elmiraantipina.spring.project.spring_reliability.entity.Unit;
import com.elmiraantipina.spring.project.spring_reliability.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private MyService unitService;


    @RequestMapping("/")
    public String showAllUnits(Model model){
        List<Unit> allUnits = unitService.getAllUnits();
        model.addAttribute("allUni", allUnits);
        return "all-units";
    }

    @RequestMapping("/failures")
    public String showAllFails(Model model){
        List<Failure> allFails = unitService.getAllFails();
        model.addAttribute("allFailures", allFails);
        return "all-failures";
    }

    @RequestMapping("/addNewUnit")
    public String addUnit(Model model){
        Failure fail = new Failure();
        Unit unit = new Unit();

        unit.addFailureToUnit(fail);

        model.addAttribute("fail", fail);
        model.addAttribute("unit", unit);
        // для причины отказа
        //Failure fail = new Failure();
        //model.addAttribute("fail", fail);


        return "unit-info";
    }

    @RequestMapping("/saveUnit")
    public String saveUnit(@ModelAttribute("unit") Unit unit){

        unitService.saveUnit(unit);

        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateUnit(@RequestParam("unitId") int id, Model model){
        Unit unit = unitService.getUnit(id);

        //List<Failure> allFails = unitService.getAllFails(id);
        //model.addAttribute("allFails", allFails);
        List<Failure> allFails = unit.getFailures();
        model.addAttribute("allFails", allFails);

        model.addAttribute("unit", unit);
        // для причины отказа
        /*Failure fail = new Failure();
        model.addAttribute("fail", fail);*/

        return "unit-info";

    }

    @RequestMapping("/deleteUnit")
    public String deleteUnit(@RequestParam("unitId") int id){

        unitService.deleteUnit(id);

        return "redirect:/";
    }


}
