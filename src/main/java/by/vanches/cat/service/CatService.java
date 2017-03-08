package by.vanches.cat.service;

import by.vanches.cat.model.Cat;

import java.util.List;

/**
 * User: Vanja Novak
 * Date: 31.03.2016
 * Time: 22:31
 */

public interface CatService {

    Cat findById(Integer id);

    void save(Cat cat);

    void update(Cat cat);

    void add();

    void deleteById(Integer id);

    List<Cat> findAllCat();

}
