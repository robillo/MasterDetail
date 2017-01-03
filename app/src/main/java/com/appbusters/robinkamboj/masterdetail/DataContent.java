package com.appbusters.robinkamboj.masterdetail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by robinkamboj on 03/01/17.
 */

public class DataContent {


    //An array of sample items
    public static final List<createItem> ITEMS = new ArrayList<createItem>();

    //A MAP od sample items, by id
    public static final Map<String, createItem> ITEM_MAP = new HashMap<String, createItem>();

    //Number of items in recyclerview/list
    public static final int count=25;

    static {
        //add some sampleitems
        for(int i=1; i<=25; i++){
            addItem(createItems(i));
        }
    }

    private static void addItem(createItem item){
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static createItem createItems(int position){
        return new createItem(String.valueOf(position), "Item" + position, makeDetails(position));
    }

    private static String makeDetails(int position){
        StringBuilder builder = new StringBuilder();
        builder.append("Details about item:").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

}
