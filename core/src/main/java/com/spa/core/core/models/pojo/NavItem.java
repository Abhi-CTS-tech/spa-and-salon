package com.spa.core.core.models.pojo;

public class NavItem {
    private String title;
    private String link;

    public NavItem(String title,String link){
        this.title=title;
        this.link=link;
    }

    public String getTitle(){
        return title; //j
    }

    public String getLink(){
        return link;
    }
}
