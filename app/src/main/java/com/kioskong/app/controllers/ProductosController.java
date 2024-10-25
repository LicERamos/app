package com.kioskong.app.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.kioskong.app.models.Producto;
import com.kioskong.app.repositories.ProductoRepository;


@Controller
public class ProductosController {

    @Autowired
    ProductoRepository productoRepository;
   
    @GetMapping("/productos")
    public String listarProductos(Model model) {
        List<Producto> productos = productoRepository.findAll();
        model.addAttribute("productos", productos);
        return "productos";
    }  
}






