package com.gzjy.sau.model;

public class club {


    private  int id;

    private  String clubName;
    //对应dept表部门id
    private  int department;

    private  String clubBrief;
    //对应的活动id
    private  int clubActive;

    private  String imgUrl;

    public club() {
    }

    public club(int id, String clubName, int department, String clubBrief, int clubActive, String imgUrl) {
        this.id = id;
        this.clubName = clubName;
        this.department = department;
        this.clubBrief = clubBrief;
        this.clubActive = clubActive;
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getClubBrief() {
        return clubBrief;
    }

    public void setClubBrief(String clubBrief) {
        this.clubBrief = clubBrief;
    }

    public int getClubActive() {
        return clubActive;
    }

    public void setClubActive(int clubActive) {
        this.clubActive = clubActive;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "club{" +
                "id=" + id +
                ", clubName='" + clubName + '\'' +
                ", department=" + department +
                ", clubBrief='" + clubBrief + '\'' +
                ", clubActive=" + clubActive +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
