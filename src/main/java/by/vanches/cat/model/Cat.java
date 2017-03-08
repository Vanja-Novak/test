package by.vanches.cat.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * User: Vanja Novak
 * Date: 31.03.2016
 * Time: 22:32
 */
@Entity
@Table(name = "Cat")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "name", nullable = false)
    private String name;

    @DateTimeFormat(pattern = "dd/MM/YY")
    @Column(name = "createDate", insertable = true, updatable = false)
    private Date createDate;

    @NotEmpty
    @Column(name = "color", nullable = false)
    private String borderColor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "image_id", insertable = true, updatable = false)
    private Image image;

    //region GET/SET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    //endregion
}
