package com.bank.bank_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="sttm_customer_personal")
public class CustomerPersonal {
    @Id
    @Column(name="CUSTOMER_NO")
    private String customerNo;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="MIDDLE_NAME")
    private String middleName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
