package com.java.davita.springbootsample.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Setter
//@Getter
@Builder
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    private int id;

    private String userName;

    private String domain;

    private String company;

    private String address;

    private String phno;


    public Employee(int id, String userName, String domain, String company, String address, String phno) {
        this.id = id;
        this.userName = userName;
        this.domain = domain;
        this.company = company;
        this.address = address;
        this.phno = phno;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", domain='" + domain + '\'' +
                ", company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", phno='" + phno + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (userName != null ? !userName.equals(employee.userName) : employee.userName != null) return false;
        if (domain != null ? !domain.equals(employee.domain) : employee.domain != null) return false;
        if (company != null ? !company.equals(employee.company) : employee.company != null) return false;
        if (address != null ? !address.equals(employee.address) : employee.address != null) return false;
        return phno != null ? phno.equals(employee.phno) : employee.phno == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phno != null ? phno.hashCode() : 0);
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
