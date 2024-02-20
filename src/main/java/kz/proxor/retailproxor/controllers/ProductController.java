package kz.proxor.retailproxor.controllers;

import kz.proxor.retailproxor.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import kz.proxor.retailproxor.services.ProductService;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/")
    public String products(@RequestParam(name = "name", required = false) String name, Model model){
        model.addAttribute("products", productService.getProductList(name));
        return "products";
    }

    @GetMapping("/product/{id}")
    public String showProductDetails(@PathVariable long id, Model model){
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "productsInfoPage";
    }

    @PostMapping("/product/create")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable long id){
        productService.deleteProduct(id);
        return "redirect:/";
    }
}
