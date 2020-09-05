package com.school.entity;

public class HyperLinks {
    private Integer function_id;
    private String function_name;
    private String function_link;

    @Override
    public String toString() {
        return "HyperLinks{" +
                "function_id=" + function_id +
                ", function_name='" + function_name + '\'' +
                ", function_link='" + function_link + '\'' +
                '}';
    }

    public void setFunction_id(Integer function_id) {
        this.function_id = function_id;
    }
    public Integer getFunction_id() {
        return function_id;
    }
    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }
    public String getFunction_name() {
        return function_name;
    }
    public void setFunction_link(String function_link) {
        this.function_link = function_link;
    }
    public String getFunction_link() {
        return function_link;
    }
}
