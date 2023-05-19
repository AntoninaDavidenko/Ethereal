package shop.site.MyFirstSite.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/checkout")
    public String checkout(Model model)
    {
        return "checkout_empty";
    }
}
