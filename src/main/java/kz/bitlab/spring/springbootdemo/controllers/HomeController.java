package kz.bitlab.spring.springbootdemo.controllers;

import kz.bitlab.spring.springbootdemo.db.DBManager;
import kz.bitlab.spring.springbootdemo.model.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
@GetMapping(value = "/home")
    public String indexPage(Model model){
    List<Items> items = DBManager.getAllItems();
    model.addAttribute("allItems",items);
    return "index";
}
}
