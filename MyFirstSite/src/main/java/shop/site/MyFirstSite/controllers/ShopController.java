package shop.site.MyFirstSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping("/shop")
    public String shop(Model model) {
        return "shop";
    }

    @GetMapping("/bow")
    public String bow(Model model) {
        return "bow";
    }

    @GetMapping("/glasses")
    public String glasses(Model model) {
        return "glasses";
    }

    @GetMapping("/ikomi")
    public String ikomi(Model model) {
        return "ikomi";
    }

    @GetMapping("/furomi")
    public String furomi(Model model) {
        return "furomi";
    }

    @GetMapping("/kitty")
    public String kitty(Model model) {
        return "kitty";
    }

    @GetMapping("/catgirl")
    public String catgirl(Model model) {
        return "catgirl";
    }
}
