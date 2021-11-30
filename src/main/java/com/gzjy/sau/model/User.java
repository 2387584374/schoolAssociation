package com.gzjy.sau.model;

public class User {

    private Integer id;

    private String name;

    private String password;

    private Long number;

    private String email;

    //用户权限  0表示普通用户 1表示root用户
    private int jurisdiction;

    private  String branchCourts;

    private String major;

    private String classGrade;

    private String userName;


    public User() {
    }

    public User(Integer id, String name, String password, Long number, String email, int jurisdiction, String branchCourts, String major, String classGrade, String userName) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.number = number;
        this.email = email;
        this.jurisdiction = jurisdiction;
        this.branchCourts = branchCourts;
        this.major = major;
        this.classGrade = classGrade;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(int jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getBranchCourts() {
        return branchCourts;
    }

    public void setBranchCourts(String branchCourts) {
        this.branchCourts = branchCourts;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", number=" + number +
                ", email='" + email + '\'' +
                ", jurisdiction='" + jurisdiction + '\'' +
                ", branchCourts='" + branchCourts + '\'' +
                ", major='" + major + '\'' +
                ", classGrade='" + classGrade + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
