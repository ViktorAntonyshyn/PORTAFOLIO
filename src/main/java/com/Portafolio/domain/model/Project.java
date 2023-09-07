package com.Portafolio.domain.model;

import java.sql.Blob;

public class Project {
    private Integer id;
    private String name;
    private String description;
    private Blob picture;
    private String link1;
    private String link2;

    public Project() {
    }

    public Project(Integer id, String name, String description, Blob picture, String link1, String link2) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.link1 = link1;
        this.link2 = link2;
    }

    public Project(String name, String description, Blob picture, String link1, String link2) {
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.link1 = link1;
        this.link2 = link2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public String getLink1() {
        return link1;
    }

    public void setLink1(String link1) {
        this.link1 = link1;
    }

    public String getLink2() {
        return link2;
    }

    public void setLink2(String link2) {
        this.link2 = link2;
    }
}
