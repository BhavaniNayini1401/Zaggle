package com.mycompany.user;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Table(name = "Expense")
public class Expense {
    @Id
    private Integer id;
    @Column(nullable = false, length = 45)
    private Date date;
    @Column(length = 150, nullable = false)
    private String description;
    @Column(length = 45, nullable = false)
    private String location;
    @Column(length = 45, nullable = false)
    private Integer categoryid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", catid=" + categoryid +
                '}';
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }
}