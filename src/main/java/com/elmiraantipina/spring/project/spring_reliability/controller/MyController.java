package com.elmiraantipina.spring.project.spring_reliability.controller;

import com.elmiraantipina.spring.project.spring_reliability.dao.UnitDao;
import com.elmiraantipina.spring.project.spring_reliability.entity.Unit;
import com.elmiraantipina.spring.project.spring_reliability.service.UnitService;
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
    private UnitService unitService;

    @RequestMapping("/")
    public String showAllUnits(Model model){
        List<Unit> allUnits = unitService.getAllUnits();
        model.addAttribute("allUni", allUnits);
        return "all-units";
    }

    @RequestMapping("/addNewUnit")
    public String addUnit(Model model){
        Unit unit = new Unit();
        model.addAttribute("unit", unit);


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
        model.addAttribute("unit", unit);
        return "unit-info";

    }

    @RequestMapping("/deleteUnit")
    public String deleteUnit(@RequestParam("unitId") int id){

        unitService.deleteUnit(id);

        return "redirect:/";
    }


}
