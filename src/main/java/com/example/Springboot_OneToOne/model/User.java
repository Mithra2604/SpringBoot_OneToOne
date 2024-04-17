package com.example.Springboot_OneToOne.model;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String username;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="address_id" , referencedColumnName = "id")
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
