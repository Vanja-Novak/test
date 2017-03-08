package by.vanches.cat.dao;

import by.vanches.cat.model.Cat;
import by.vanches.cat.model.Image;

import java.util.List;

/**
 * User: Vanja Novak
 * Date: 31.03.2016
 * Time: 22:33
 */

public interface CatDao {

    Cat findById(Integer id);

    void save(Cat car);

    void update(Cat cat);

    void deleteById(Integer id);

    List<Cat> findAllCat();
}
