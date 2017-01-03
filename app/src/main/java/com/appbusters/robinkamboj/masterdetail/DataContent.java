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
    public static final List<Data> ITEMS = new ArrayList<Data>();

    //A MAP od sample items, by id
    public static final Map<String, Data> ITEM_MAP = new HashMap<String, Data>();

    //Number of items in recyclerview/list
    public static final int count=25;

    static {
        //add some sampleitems
        for(int i=1; i<=25; i++){

        }
    }

    private static void addItem(Data item){
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


}
