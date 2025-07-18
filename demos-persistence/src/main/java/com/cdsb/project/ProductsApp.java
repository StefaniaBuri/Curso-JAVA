package com.cdsb.project;

import com.cdsb.project.entities.Product;
import com.cdsb.project.repositories.ProductsInMemoryRepo;

public class ProductsApp {

    public static void main(String[] args) {

        try {
            ProductsInMemoryRepo repo = new ProductsInMemoryRepo();
            repo.create(new Product(repo.generateId(), "Mouse", 30, 10));
            repo.create(new Product(repo.generateId(),"Keyboard", 50, 10));
            System.out.println("Productos: " + repo.readAll());
            System.out.println("=".repeat(30));

            System.out.println("Producto Id 2:" + repo.readById(2));
            System.out.println("=".repeat(30));


            repo.deleteById(1);
            System.out.println("Producto borrado Id 1: " + repo.readAll());

            System.out.println("=".repeat(30));
            repo.updateById(new Product(2,"Keyboard", 1200, 10));
            System.out.println("Update product Id 2: " + repo.readAll());
            System.out.println("=".repeat(30));

            //Errores
            System.out.println("Creando producto: ");
            repo.create(new Product(2,"Ipad", 1500, 10));

            System.out.println("=".repeat(30));

            /* repo.deleteById(1);
            System.out.println(repo.readById(1)); */

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
