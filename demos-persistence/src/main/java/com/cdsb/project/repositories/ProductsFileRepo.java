package com.cdsb.project.repositories;

import java.util.List;

import com.cdsb.project.entities.Product;
import com.cdsb.project.tools.JsonTools;


public class ProductsFileRepo implements Repo<Integer, Product> {

    String pathName = "demos-persistence/resources/products.json";
    JsonTools jsonTools = new JsonTools(pathName);

    @Override
    public List<Product> readAll() {
        return List.of(jsonTools.fromJsonFile(Product[].class));
    }

    @Override
    public Product readById(Integer id) throws Exception {
        return List.of(jsonTools.fromJsonFile(Product[].class))
        .stream()
        .filter(p -> p.getId() == id)
        .findFirst()
        .orElseThrow(() -> new RuntimeException("Producto no encontrado al leer"));
    }

    @Override
    public Product create(Product data) throws Exception {
        List<Product> products = readAll();
        products
        .stream()
        .filter(p -> p.getId() == data.getId())
        .findFirst()
        .ifPresent(p -> {
            throw new RuntimeException("Producto ya existente");
        });
        products.add(data);
        jsonTools.toJsonFile(products);
        return data;
    }

    @Override
    public Product updateById(Product data) throws Exception {
        List<Product> products = readAll();
        products
        .stream()
        .filter(p -> p.getId() == data.getId()).findFirst()
        .ifPresentOrElse(product -> {
            products.remove(product);
            products.add(data);
            jsonTools.toJsonFile(products);
        }, () -> {
            throw new RuntimeException("Producto no encontrado al actualizar");
        });
        return data;
    }

    @Override
    public Product deleteById(Integer id) throws Exception {
        List<Product> products = readAll();
        final Product[] deletedProducts = new Product[1];
        products.stream().filter(p -> p.getId() == id).findFirst().ifPresentOrElse(product -> {
            products.remove(product);
            deletedProducts[1] = product;
            jsonTools.toJsonFile(products);
        }, () -> {
            throw new RuntimeException("Producto no encontrado al eliminar");
        });
        return deletedProducts[0];
    }
}
