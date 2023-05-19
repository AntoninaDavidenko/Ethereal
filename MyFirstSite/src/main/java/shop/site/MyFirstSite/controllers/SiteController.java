package shop.site.MyFirstSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("title", "Ethereal");
        return "item1";
    }
}
