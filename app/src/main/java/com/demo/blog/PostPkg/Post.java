package com.demo.blog.PostPkg;

public class Post {
String post_id;
String post_title;
String post_description;
String post_link;
String post_image;
String created_at;


    public Post(String post_id, String post_title, String post_description, String post_link, String post_image, String created_at) {
        this.post_id = post_id;
        this.post_title = post_title;
        this.post_description = post_description;
        this.post_link = post_link;
        this.post_image = post_image;
        this.created_at = created_at;
    }


    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_description() {
        return post_description;
    }

    public void setPost_description(String post_description) {
        this.post_description = post_description;
    }

    public String getPost_link() {
        return post_link;
    }

    public void setPost_link(String post_link) {
        this.post_link = post_link;
    }

    public String getPost_image() {
        return post_image;
    }

    public void setPost_image(String post_image) {
        this.post_image = post_image;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
