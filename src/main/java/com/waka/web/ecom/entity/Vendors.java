package com.waka.web.ecom.entity;


import com.waka.web.ecom.util.Status;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "vendors")
public class Vendors implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "business_email")
    private String businessEmail;

    @Column(name = "business_phone")
    private String businessPhone;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;


    @OneToOne
    @JoinColumn(name = "users_id")
    private Users user;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
