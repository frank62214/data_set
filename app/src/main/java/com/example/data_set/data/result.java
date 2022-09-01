package com.example.data_set.data;

import com.example.data_set.Method;

import java.util.ArrayList;

public class result {
    public String content = "";
    public ArrayList<form_list> form_list =new ArrayList<form_list>();

    public void store(){

        //form_list.content = Method.get_json_test(content, "form_list");
        //form_list.store();

        String tmp_content = Method.get_json_test(content, "form_list");
        //取得有幾個工單，以供單的ID為主。
        int num = Method.get_Array_Number(tmp_content, "formId");
        for(int i=0; i<num ;i++){
            form_list tmp_list = new form_list();
            tmp_list.content = tmp_content;
            tmp_list.getItem(i);
            form_list.add(tmp_list);
        }
    }
}
