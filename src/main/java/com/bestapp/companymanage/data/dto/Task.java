package com.bestapp.companymanage.data.dto;

import org.hibernate.validator.constraints.Email;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TASK")
public class Task extends BaseDto {

    @Column(nullable = false)
    @Size(min = 0, max = 50)
    private String name;

    @Size(min = 0, max = 500)
    private String description;

    @Size(min = 0, max = 500)
    private String employee;

    private Date createDate;

    private Date endOfWorkDate;

    @ManyToOne()
    @JoinColumn(name = "SAM_PERSON_ID", nullable = false)
    private Customer customer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEndOfWorkDate() {
        return endOfWorkDate;
    }

    public void setEndOfWorkDate(Date endOfWorkDate) {
        this.endOfWorkDate = endOfWorkDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", employee='" + employee + '\'' +
                ", createDate=" + createDate +
                ", endOfWorkDate=" + endOfWorkDate +
                ", customer=" + customer +
                "} " + super.toString();
    }
}
