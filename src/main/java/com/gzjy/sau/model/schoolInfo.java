package com.gzjy.sau.model;

public class schoolInfo {

    private  int id;

    private String infoName;

    private String infoItem;

    public schoolInfo() {
    }

    public schoolInfo(int id, String infoName, String infoItem) {
        this.id = id;
        this.infoName = infoName;
        this.infoItem = infoItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoItem() {
        return infoItem;
    }

    public void setInfoItem(String infoItem) {
        this.infoItem = infoItem;
    }

    @Override
    public String toString() {
        return "schoolInfo{" +
                "id=" + id +
                ", infoName='" + infoName + '\'' +
                ", infoItem='" + infoItem + '\'' +
                '}';
    }
}
