package kz.proxor.retailproxor.services;


import kz.proxor.retailproxor.domain.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import kz.proxor.retailproxor.repositories.IProductRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final IProductRepository productRepository;

    public List<Product> getProductList(String name){
        if (name != null) {
            return productRepository.findByName(name);
        }
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        log.info("Saving new product: {}", product);
        productRepository.save(product);
    }

    public void deleteProduct(long id){
        productRepository.deleteById(id);
    }

    public Product getProductById(long id) {
        return productRepository.findById(id).orElse(null);
    }
}