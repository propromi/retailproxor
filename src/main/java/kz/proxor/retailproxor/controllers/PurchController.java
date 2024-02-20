package kz.proxor.retailproxor.controllers;

import kz.proxor.retailproxor.domain.Purch;
import kz.proxor.retailproxor.services.PurchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PurchController {
    private final PurchService orderService;

    @GetMapping("/purch/")
    public String purches(Model model){
        model.addAttribute("products", orderService.getPurchList());
        return "purches";
    }

    @GetMapping("/purch/{id}")
    public String showPurchDetails(@PathVariable long id, Model model){
        Purch purch = orderService.getPurchById(id);
        model.addAttribute("product", purch);
        return "productsInfoPage";
    }

    @PostMapping("/purch/create")
    public String createPurch(Purch purch){
        orderService.savePurch(purch);
        return "redirect:/purch/";
    }

    @PostMapping("/purch/delete/{id}")
    public String deletePurch(@PathVariable long id){
        orderService.deletePurch(id);
        return "redirect:/purch/";
    }
}
