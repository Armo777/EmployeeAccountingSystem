package ru.top;

import java.util.Date;

public class Employee {
    private String name;
    private Date birthDate;
    private String gender;
    private String phone;
    private String position;
    private String departmentName;
    private Employee manager;
    private Date hireDate;
    private double salary;

    public Employee(String name, Date birthdate, String gender, String phone, String position,
                    String departmentName, Employee manager, Date hireDate, double salary) {
        this.name = name;
        this.birthDate = birthdate;
        this.gender = gender;
        this.phone = phone;
        this.position = position;
        this.departmentName = departmentName;
        this.manager = manager;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthDate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthDate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
