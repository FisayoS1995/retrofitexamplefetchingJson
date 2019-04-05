package com.example.retrofitexamplefetchingjson;

public class Hero {

private static String Name;
private static String realname;
private static String team;
private static String firstappareance;
private static String createdby;
private static String publisher;
private static String imageurl;
private static String bio;

    public Hero(String name, String realname, String team, String firstappareance, String createdby, String publisher, String imageurl, String bio) {
        Name = name;
        this.realname = realname;
        this.team = team;
        this.firstappareance = firstappareance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }

    public static String getName() {
        return Name;
    }

    public static String getRealname() {
        return realname;
    }

    public static String getTeam() {
        return team;
    }

    public static String getFirstappareance() {
        return firstappareance;
    }

    public static String getCreatedby() {
        return createdby;
    }

    public static String getPublisher() {
        return publisher;
    }

    public static String getImageurl() {
        return imageurl;
    }

    public static String getBio() {
        return bio;
    }
}
