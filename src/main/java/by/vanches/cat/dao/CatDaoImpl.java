package by.vanches.cat.dao;

import by.vanches.cat.model.Cat;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Vanja Novak
 * Date: 31.03.2016
 * Time: 22:33
 */
@Repository("catDao")
public class CatDaoImpl extends AbstractDao<Integer, Cat> implements CatDao {


    public Cat findById(Integer id) {
        return getByKey(id);
    }

    public void save(Cat cat) {
        persist(cat);
    }

    public void update(Cat cat) {
        updateEntity(cat);
    }

    public void deleteById(Integer id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        Cat cat = (Cat) criteria.uniqueResult();
        delete(cat);
    }

    public List<Cat> findAllCat() {
        Criteria criteria = createEntityCriteria();
        criteria.addOrder(Order.asc("createDate"));
        return (List<Cat>) criteria.list();
    }
}
