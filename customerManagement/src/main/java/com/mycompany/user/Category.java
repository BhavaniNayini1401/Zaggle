package com.mycompany.user;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Table(name = "Category")
public class Category {
    @Id
    private Integer id;
    @Column(length = 150, nullable = false)
    private String categoryName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
