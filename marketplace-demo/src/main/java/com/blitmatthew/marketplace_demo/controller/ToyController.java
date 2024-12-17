package com.blitmatthew.marketplace_demo.controller;

import com.blitmatthew.marketplace_demo.entity.Toy;
import com.blitmatthew.marketplace_demo.service.ToyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
