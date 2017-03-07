package by.vanches.cat.service;

import by.vanches.cat.dao.CatDao;
import by.vanches.cat.dao.ImageDao;
import by.vanches.cat.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * User: Vanja Novak
 * Date: 31.03.2016
 * Time: 22:31
 */

@Service("catService")
@Transactional
public class CatServiceImpl implements CatService {

    private final static String defaultName = "Default_Name";

    private final static String getDefaultColor = "red";

    @Autowired
    private CatDao catDao;

    @Autowired
    private ImageDao imageDao;

    public Cat findById(Integer id) {
        return catDao.findById(id);
    }

    public void save(Cat cat) {
        catDao.save(cat);
    }

    public void update(Cat cat) {
        catDao.update(cat);
    }

    public void add() {
        Cat cat = new Cat();
        cat.setCreateDate(new Date());
        cat.setName(defaultName);
        cat.setBorderColor(getDefaultColor);
        cat.setImage(imageDao.getRandomImage());
        catDao.save(cat);
    }


    public void deleteById(Integer id) {
        catDao.deleteById(id);
    }

    public List<Cat> findAllCat() {
        return catDao.findAllCat();
    }
}
