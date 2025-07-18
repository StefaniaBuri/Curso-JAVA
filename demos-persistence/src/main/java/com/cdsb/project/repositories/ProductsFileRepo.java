package com.cdsb.project.repositories;

import java.util.List;

import com.cdsb.project.entities.Product;
import com.cdsb.project.tools.JsonTools;


public class ProductsFileRepo implements Repo<Integer, Product> {

    String pathName = "demos-persistence/resources/products.json";
    JsonTools jsonTools = new JsonTools(pathName);

    @Override
    public List<Product> readAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }

    @Override
    public Product readById(Integer id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readById'");
    }

    @Override
    public Product create(Product data) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Product updateById(Product data) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateById'");
    }

    @Override
    public Product deleteById(Integer id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }


}
