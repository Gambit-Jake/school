package com.school.entity;

public class Department {
    Integer department_id;
    Integer authority;
    Integer template;

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", authority=" + authority +
                ", template=" + template +
                '}';
    }

    public Integer getDepartment_id() {
        return department_id;
    }
    public void setDepartment_id(Integer department_id1) {
        this.department_id = department_id1;
    }
    public Integer getAuthority(){return authority;}
    public void setAuthority(Integer authority1){this.authority=authority1;}
    public Integer getTemplate(){return template;}
    public void setTemplate(Integer template1) {this.template=template1;}
}
