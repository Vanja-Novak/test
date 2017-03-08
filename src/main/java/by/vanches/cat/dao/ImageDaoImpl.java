package by.vanches.cat.dao;

import by.vanches.cat.model.Image;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projection;
import org.springframework.stereotype.Repository;

/**
 * User: Vanja Novak
 * Date: 01.04.2016
 * Time: 23:44
 */
@Repository("imageDao")
public class ImageDaoImpl extends AbstractDao<Integer, Image> implements ImageDao {

    private final static String queryRandomImage = "FROM Image ORDER BY RAND()";
    private final static Integer maxCountResult = 1;

    public Image getRandomImage() {
        Query query = getSession().createQuery(queryRandomImage);
        query.setMaxResults(maxCountResult);

        return (Image) query.uniqueResult();
    }
}