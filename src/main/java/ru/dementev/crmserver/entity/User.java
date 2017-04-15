package ru.dementev.crmserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "user")
public class User {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name ="login", length = 20)
    private String login;

    @Column (name = "password",length = 30)
    private String password;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "organizationId")
    private Organization organization;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "personId")
    private Person person;
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "positionId")
    private Position position;

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    @OneToMany(fetch =FetchType.LAZY, mappedBy = "user")
    private Set<Task> tasks;

    public User(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
