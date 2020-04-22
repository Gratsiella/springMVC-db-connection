/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grats.assignment02.controllers;

import com.grats.assignment02.entities.Trainers;
import com.grats.assignment02.services.TrainerInterface;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author gkalf
 */

@Controller
@RequestMapping("/trainer")
public class TrainerController {
    
    @Autowired
    TrainerInterface trainerInterface;
    
 
    
    @GetMapping("/list")
    public String getAllTrainers(ModelMap mm){
        mm.addAttribute("trainers", trainerInterface.getAllTrainers());
        return "all_trainers";
    }
    
    @GetMapping("/new")
    public String preInsertTrainer(ModelMap mm){
        Trainers trainer = new Trainers();
        mm.addAttribute("trainer", trainer);
        return "new_trainer";
    }
    
    
    @PostMapping("/new")
    public String insertTrainer(@Valid @ModelAttribute("trainer") Trainers t,
            BindingResult br){
        if(br.hasErrors()){
            return "new_trainer";
        }
        trainerInterface.insertTrainer(t);
        return "redirect:/trainer/list";
    }
    
    @GetMapping("/preUpdate/{id}")
    public String preUpdateTrainer(ModelMap mm, @PathVariable Integer id){    
        mm.addAttribute("trainer", trainerInterface.getTrainerById(id));        
        return "edit_trainer";
    }
    
    @PostMapping("/update")
    public String upadateTrainer(@Valid @ModelAttribute("trainer") Trainers t,
            BindingResult br){
        if(br.hasErrors()){
            return "new_trainer";
        }
        trainerInterface.updateTrainer(t);
        return "redirect:/trainer/list";        
    }
    
    @GetMapping("/preDelete/{id}")
    public String preDeleteTrainer(@PathVariable Integer id){
        trainerInterface.deleteTrainer(id);
        return "redirect:/trainer/list";
    }
}
