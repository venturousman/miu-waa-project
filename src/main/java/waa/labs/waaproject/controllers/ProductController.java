package waa.labs.waaproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import waa.labs.waaproject.services.IProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final IProductService productService;

    // @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }
}
