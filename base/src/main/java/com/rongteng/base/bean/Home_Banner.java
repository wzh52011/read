package com.rongteng.base.bean;

import java.io.Serializable;


public class Home_Banner implements Serializable {
    private static final long serialVersionUID = 1L;
    private String link;//链接地址
    private String imgUrl;//图片地址
    private String title;//标题

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
