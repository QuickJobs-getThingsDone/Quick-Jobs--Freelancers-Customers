package com.quickjobs.quickjobs_freelancercustomers.Objects;

public class FreelancerHistoryLJObject {
    private String title,desc,location,cat,phno;
    private String time;


    public FreelancerHistoryLJObject(String title, String desc, String location, String cat, String time,String phno) {
        this.title = title;
        this.desc = desc;
        this.location = location;
        this.cat = cat;
        this.time = time;
        this.phno = phno;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}