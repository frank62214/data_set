package com.example.data_set.data;

import com.example.data_set.Method;

import org.json.JSONArray;

import java.util.ArrayList;

public class detail {
    public String content = "";
    public ArrayList<points> points = new ArrayList<points>();
    public ArrayList<String> route = new ArrayList<String>();

    public void store(){
        String tmp_content = Method.get_json_test(content, "points");
        int num = Method.get_Array_Number(tmp_content, "seq");
        for(int i=0; i<num; i++){
            points point = new points();
            point.content = tmp_content;
            point.getItem(i);
            points.add(point);
        }

        String test = Method.get_json_test(content, "route");
        route = Method.get_route(test);
    }
}
