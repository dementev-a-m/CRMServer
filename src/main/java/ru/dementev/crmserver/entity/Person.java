package ru.dementev.crmserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "person")
public class Person {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name ="lastName", nullable = false, length = 45)
    private String lastName;

    @Column(name ="firstName",nullable = false, length = 45)
    private String  firstName;

    @Column(name ="middelName", nullable = false, length = 45)
    private String middelName;

    @Column(name ="dataBithday", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataBithday;

    @Column(name = "address")
    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private Set<MarketingOffers> marketingOffersSet;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private Set<Transaction> transactions;

    @Column(name ="email", nullable = false, length = 45)
    private String email;


    @Column(name ="phone", nullable = false, length = 45)
    private String phone;

    @Column(name ="sex", nullable = false, length = 45)
    private String sex;

    @Column(name ="status", nullable = false, length = 45)
    private String status;

    public Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddelName() {
        return middelName;
    }

    public void setMiddelName(String middelName) {
        this.middelName = middelName;
    }

    public Date getDataBithday() {
        return dataBithday;
    }

    public void setDataBithday(Date dataBithday) {
        this.dataBithday = dataBithday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<MarketingOffers> getMarketingOffersSet() {
        return marketingOffersSet;
    }

    public void setMarketingOffersSet(Set<MarketingOffers> marketingOffersSet) {
        this.marketingOffersSet = marketingOffersSet;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}
