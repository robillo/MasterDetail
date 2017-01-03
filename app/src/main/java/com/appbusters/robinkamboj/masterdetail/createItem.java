package com.appbusters.robinkamboj.masterdetail;

/**
 * Created by robinkamboj on 03/01/17.
 */

public class createItem {
    public final String id;
    public final String content;
    public final String details;

    public createItem(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    @Override
    public String toString() {
        return content;
    }
}
