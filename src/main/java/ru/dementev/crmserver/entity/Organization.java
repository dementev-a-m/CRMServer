package ru.dementev.crmserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name= "organization")
public class Organization {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    @Column(name ="name", nullable = false, length = 45)
    private String name;
    @Column(name ="address", nullable = false, length = 45)
    private String address;
    @Column(name ="inn", nullable = false, length = 45)
    private int inn;
    @Column(name ="phone", nullable = false, length = 45)
    private String phone;
    @Column(name ="email", nullable = false, length = 45)
    private String email;
    @Column(name ="primaryPersonId", nullable = false, length = 45)
    private long primaryPersonId;
    public Organization (){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPrimaryPersonId() {
        return primaryPersonId;
    }

    public void setPrimaryPersonId(long primaryPersonId) {
        this.primaryPersonId = primaryPersonId;
    }
}
