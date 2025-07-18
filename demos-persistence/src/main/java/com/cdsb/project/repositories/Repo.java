package com.cdsb.project.repositories;

import java.util.List;
import java.util.Optional;

public interface Repo<I, E> {

    //R EVISAR

    List<E> readAll();
    //findAll
    //getAll

    E readById(I id) throws Exception; //OPTION 1
    //Optional<E> readById(I id); //OPTION 2
    //findById
    //getById

    E create(E data) throws Exception;
    //save

    E updateById(E data) throws Exception;
    //update

    E deleteById(I id) throws Exception;
    //delete
}
