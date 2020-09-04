package com.school.entity;

/**
 * @Author: LHP
 * @Date: 2020/8/26 0:22
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */

public class Stugrade {
    Integer stu_id;
    Float operating_system;
    Float data_structure;
    Float math;
    Float physics;
    Float java;
    Float python;

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public Float getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(Float operating_system) {
        this.operating_system = operating_system;
    }

    public Float getData_structure() {
        return data_structure;
    }

    public void setData_structure(Float data_structure) {
        this.data_structure = data_structure;
    }

    public Float getMath() {
        return math;
    }

    public void setMath(Float math) {
        this.math = math;
    }

    public Float getPhysics() {
        return physics;
    }

    public void setPhysics(Float physics) {
        this.physics = physics;
    }

    public Float getJava() {
        return java;
    }

    public void setJava(Float java) {
        this.java = java;
    }

    public Float getPython() {
        return python;
    }

    public void setPython(Float python) {
        this.python = python;
    }

    @Override
    public String toString() {
        return "Stugrade{" +
                "stu_id=" + stu_id +
                ", operating_system=" + operating_system +
                ", data_structure=" + data_structure +
                ", math=" + math +
                ", physics=" + physics +
                ", java=" + java +
                ", python=" + python +
                '}';
    }
}
