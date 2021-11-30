package com.gzjy.sau.model;

public class activity {

    private int id;

    private String activeName;

   private String  activeTheme;

   private String   activeDatails;

   private String activeTime;

   private String issueTime;

   private int activeType;

   private  String activeBrief;

    public activity() {

    }

    public activity(int id, String activeName, String activeTheme, String activeDatails, String activeTime, String issueTime, int activeType, String activityBrief) {
        this.id = id;
        this.activeName = activeName;
        this.activeTheme = activeTheme;
        this.activeDatails = activeDatails;
        this.activeTime = activeTime;
        this.issueTime = issueTime;
        this.activeType = activeType;
        this.activeBrief = activityBrief;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public String getActiveTheme() {
        return activeTheme;
    }

    public void setActiveTheme(String activeTheme) {
        this.activeTheme = activeTheme;
    }

    public String getActiveDatails() {
        return activeDatails;
    }

    public void setActiveDatails(String activeDatails) {
        this.activeDatails = activeDatails;
    }

    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public int getActiveType() {
        return activeType;
    }

    public void setActiveType(int activeType) {
        this.activeType = activeType;
    }

    public String getActivityBrief() {
        return activeBrief;
    }

    public void setActivityBrief(String activityBrief) {
        this.activeBrief = activityBrief;
    }

    @Override
    public String toString() {
        return "activity{" +
                "id=" + id +
                ", activeName='" + activeName + '\'' +
                ", activeTheme='" + activeTheme + '\'' +
                ", activeDatails='" + activeDatails + '\'' +
                ", activeTime='" + activeTime + '\'' +
                ", issueTime='" + issueTime + '\'' +
                ", activeType=" + activeType +
                ", activityBrief='" + activeBrief + '\'' +
                '}';
    }
}
