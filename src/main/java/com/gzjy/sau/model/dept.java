package com.gzjy.sau.model;

public class dept {

    private int id;

    private String deptName;


    public dept() {
    }

    public dept(int id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "dept{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
