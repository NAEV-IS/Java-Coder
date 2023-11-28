package com.controller;

import com.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
}
