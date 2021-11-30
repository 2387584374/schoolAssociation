package com.gzjy.sau.model;

import java.util.Date;

public class Inform {

    private int id;

    private String informName;

    private String informTime;
    //通知所属部门
    private String informDept;
    //通知对应活动
    private int activityId;
    //通知对应的活动跳转地址
    private String activityUrl;

    public Inform() {
    }

    public Inform(int id, String informName, String informTime, String informDept, int activityId, String activityUrl) {
        this.id = id;
        this.informName = informName;
        this.informTime = informTime;
        this.informDept = informDept;
        this.activityId = activityId;
        this.activityUrl = activityUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInformName() {
        return informName;
    }

    public void setInformName(String informName) {
        this.informName = informName;
    }

    public String getInformTime() {
        return informTime;
    }

    public void setInformTime(String informTime) {
        this.informTime = informTime;
    }

    public String getInformDept() {
        return informDept;
    }

    public void setInformDept(String informDept) {
        this.informDept = informDept;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    @Override
    public String toString() {
        return "Inform{" +
                "id=" + id +
                ", informName='" + informName + '\'' +
                ", informTime='" + informTime + '\'' +
                ", informDept='" + informDept + '\'' +
                ", activityId=" + activityId +
                ", activityUrl='" + activityUrl + '\'' +
                '}';
    }
}
