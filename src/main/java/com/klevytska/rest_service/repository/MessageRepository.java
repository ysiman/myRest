package com.klevytska.rest_service.repository;


import java.util.ArrayList;
import java.util.List;


public class MessageRepository {


    public List<String> getAllString() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("REST");
        arrayList.add("service");
        arrayList.add("test");
        arrayList.add("v18");
        return arrayList;
    }
}
