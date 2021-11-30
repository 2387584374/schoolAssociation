package com.gzjy.sau.model;


/**
 * 社团活动通知bean
 */
public class clubInform {

    private int id;

    private String activeName;

    private String activeTime;

    private String issueTime;

    private String activeSite;

    private String activeObject;

    private String activeTheme;

    //1表示活动通知 0表示招新通知
    private int activeType;

    public clubInform() {
    }

    public clubInform(int id, String activeName, String activeTime, String issueTime, String activeSite, String activeObject, String activeTheme, int activeType) {
        this.id = id;
        this.activeName = activeName;
        this.activeTime = activeTime;
        this.issueTime = issueTime;
        this.activeSite = activeSite;
        this.activeObject = activeObject;
        this.activeTheme = activeTheme;
        this.activeType = activeType;
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

    public String getActiveSite() {
        return activeSite;
    }

    public void setActiveSite(String activeSite) {
        this.activeSite = activeSite;
    }

    public String getActiveObject() {
        return activeObject;
    }

    public void setActiveObject(String activeObject) {
        this.activeObject = activeObject;
    }

    public String getActiveTheme() {
        return activeTheme;
    }

    public void setActiveTheme(String activeTheme) {
        this.activeTheme = activeTheme;
    }

    public int getActiveType() {
        return activeType;
    }

    public void setActiveType(int activeType) {
        this.activeType = activeType;
    }

    @Override
    public String toString() {
        return "clubInform{" +
                "id=" + id +
                ", activeName='" + activeName + '\'' +
                ", activeTime='" + activeTime + '\'' +
                ", issueTime='" + issueTime + '\'' +
                ", activeSite='" + activeSite + '\'' +
                ", activeObject='" + activeObject + '\'' +
                ", activeTheme='" + activeTheme + '\'' +
                ", activeInce='" + activeType + '\'' +
                '}';
    }
}
