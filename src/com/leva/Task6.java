package com.leva;

import java.util.*;
public class Task6 {


    private List<Object> objectList = new ArrayList<>();
    private Map<Object, Integer> objectMap = new HashMap<>();

    public Object get(int index) {
        return objectList.get(index);
    }

    public List<Object> getAll() {
        return objectList;
    }

    public void insert(Object a) {
        int index = objectList.size();
        objectList.add(a);
        objectMap.put(a, index);
    }

    public void remove(Object o) {
        int index = objectMap.get(o);
        Collections.swap(objectList, index, objectList.size() - 1);
        objectList.remove(objectList.size() - 1);
    }

}
