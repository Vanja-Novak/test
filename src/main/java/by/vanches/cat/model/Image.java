package by.vanches.cat.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Base64;

/**
 * User: Vanja Novak
 * Date: 01.04.2016
 * Time: 0:38
 */
@Entity
@Table(name = "Image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data", nullable = false)
    private byte[] data;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "image")
    private Set<Cat> catSet = new HashSet<Cat>();

    /**
     * @return Base64 encoded string
     */
    public String getByteArrayString() {
        return Base64.getEncoder().encodeToString(data);
    }

    /**
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return
     */
    public byte[] getData() {
        return data;
    }

    /**
     * @param data
     */
    public void setData(byte[] data) {
        this.data = data;
    }

    /**
     * @return
     */
    public Set<Cat> getCatSet() {
        return catSet;
    }

    /**
     * @param catSet
     */
    public void setCatSet(Set<Cat> catSet) {
        this.catSet = catSet;
    }
}
