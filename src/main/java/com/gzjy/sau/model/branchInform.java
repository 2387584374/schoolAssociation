package com.gzjy.sau.model;


/**
 *  该实体为分院通知公共实体类
 */
public class branchInform {

    private int id;

    private String informName;


    // 1 表示分院活动通知    2 表示分院社团通知  3 表示 分院学生会通知
    private int informType;

    private String informTime;

    public branchInform() {
    }

    public branchInform(int id, String informName, int informType, String informTime) {
        this.id = id;
        this.informName = informName;
        this.informType = informType;
        this.informTime = informTime;
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

    public int getInformType() {
        return informType;
    }

    public void setInformType(int informType) {
        this.informType = informType;
    }

    public String getInformTime() {
        return informTime;
    }

    public void setInformTime(String informTime) {
        this.informTime = informTime;
    }

    @Override
    public String toString() {
        return "branchInform{" +
                "id=" + id +
                ", informName='" + informName + '\'' +
                ", informType=" + informType +
                ", informTime='" + informTime + '\'' +
                '}';
    }
}
