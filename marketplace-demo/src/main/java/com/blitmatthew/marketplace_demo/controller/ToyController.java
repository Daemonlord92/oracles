package com.blitmatthew.marketplace_demo.controller;

import com.blitmatthew.marketplace_demo.entity.Toy;
import com.blitmatthew.marketplace_demo.service.ToyService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ToyController {
    private final ToyService toyService;

    public ToyController(ToyService toyService) {
        this.toyService = toyService;
    }

    @GetMapping("/toy/")
    public String getAllToys(Model model) {
        List<Toy> toys = toyService.getToys();
        model.addAttribute("toys", toys);
        return "listOfToys";
    }

    @GetMapping("/toy/add")
    public String addToy(Model model) {
        model.addAttribute("toy", new Toy());
        return "addToy";
    }

    @PostMapping("/toy/add")
    public String addToy(@ModelAttribute("toy") @Valid Toy toy, Errors errors) {
        if(errors.hasErrors()) {
            return "addToy";
        }
        toyService.saveToy(toy);
        return "redirect:/toy/";
    }

    @GetMapping("/toy/edit/{id}")
    public String updateToy(@PathVariable Long id, Model model) {
        Toy toy = toyService.getToyById(id);
        model.addAttribute("toy", toy);
        return "editToy";
    }

    @PostMapping("/toy/edit/{id}")
    public String updateToy(@ModelAttribute("toy") @Valid Toy toy, Errors errors) {
        if(errors.hasErrors()){
            return "editToy";
        }

        toyService.updateToy(toy);
        return "redirect:/toy/";
    }

    @GetMapping("/toy/delete/{id}")
    public String deleteToy(@PathVariable Long id) {
        toyService.deleteToyById(id);
        return "redirect:/toy/";
    }
}
