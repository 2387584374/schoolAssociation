package com.gzjy.sau.model;

import java.util.List;

public class activityCrew {

    private int id;

    private String courtsName;

    private String majorName;

    private String gradeName;

    private Long number;

    private String userName;

    private String projectName;

    //参加对应活动
    private String activity;
    //参加用户对应用户id
    private int userId;


    public activityCrew() {
    }

    public activityCrew(int id, String courtsName, String majorName, String gradeName, Long number, String userName, String projectName, String activity, int userId) {
        this.id = id;
        this.courtsName = courtsName;
        this.majorName = majorName;
        this.gradeName = gradeName;
        this.number = number;
        this.userName = userName;
        this.projectName = projectName;
        this.activity = activity;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourtsName() {
        return courtsName;
    }

    public void setCourtsName(String courtsName) {
        this.courtsName = courtsName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "activityCrew{" +
                "id=" + id +
                ", courtsName='" + courtsName + '\'' +
                ", majorName='" + majorName + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", number=" + number +
                ", userName='" + userName + '\'' +
                ", projectName='" + projectName + '\'' +
                ", activity=" + activity +
                ", userId=" + userId +
                '}';
    }
}
