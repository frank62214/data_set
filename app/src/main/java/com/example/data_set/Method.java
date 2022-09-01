package com.example.data_set;

import com.example.data_set.data.data;
import com.example.data_set.data.form_list;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Method {

    public static String get_json_test(String text, String tag){
        String content = "";
        if (text.charAt(0) != '['){
            text = "[" + text + "]";
        }

        try {
            //建立一個JSONArray並帶入JSON格式文字，getString(String key)取出欄位的數值
            JSONArray array = new JSONArray(text);
            for (int i = 0; i < array.length(); i++) {
                JSONObject json = array.getJSONObject(i);
                //System.out.println(json.getString(tag));
                content = json.getString(tag);
                //arraylist.add(json.getString(tag));
            }
        }catch(JSONException e){
            e.printStackTrace();
        }
        return content;
    }
    public static int get_Array_Number(String text, String tag){
        //String content = "";
        int num = 0;
        if (text.charAt(0) != '['){
            text = "[" + text + "]";
        }

        try {
            //建立一個JSONArray並帶入JSON格式文字，getString(String key)取出欄位的數值
            JSONArray array = new JSONArray(text);
            num = array.length();
            //System.out.println("num = " + num);
        }catch(JSONException e){
            e.printStackTrace();
        }
        return num;
    }
    public static String get_json_test_2(String text, String tag, int n){
        String content = "";
        if (text.charAt(0) != '['){
            text = "[" + text + "]";
        }

        try {
            //System.out.println(text);
            //建立一個JSONArray並帶入JSON格式文字，getString(String key)取出欄位的數值
            JSONArray array = new JSONArray(text);
            //System.out.println(array.length());
            //for (int i = 0; i < array.length(); i++) {
            JSONObject json = array.getJSONObject(n);
                //System.out.println(json.getString(tag));
            content = json.getString(tag);
                //arraylist.add(json.getString(tag));
            //}
        }catch(JSONException e){
            e.printStackTrace();
        }
        return content;
    }
    public static ArrayList<String> get_route(String text){
        ArrayList<String> arraylist = new ArrayList<>();
        if (text.charAt(0) != '['){
            text = "[" + text + "]";
        }

        try {
            //System.out.println(text);
            //建立一個JSONArray並帶入JSON格式文字，getString(String key)取出欄位的數值
            JSONArray array = new JSONArray(text);

            //System.out.println(array.length());
            for (int i = 0; i < array.length(); i++) {
                //JSONObject json = array.getJSONObject(i);
                arraylist.add(array.get(i).toString());
                //System.out.println(array.get(i));
                //System.out.println(json.getString(tag));
                //arraylist.add(json.getString(tag));
            }
        }catch(JSONException e){
            e.printStackTrace();
        }
        return arraylist;
    }
    public static ArrayList<form_list> get_json_form_list(String text, String tag){

        ArrayList<form_list> ans = new ArrayList<form_list>();

        if (text.charAt(0) != '['){
            text = "[" + text + "]";
        }

        try {
            //建立一個JSONArray並帶入JSON格式文字，getString(String key)取出欄位的數值
            JSONArray array = new JSONArray(text);
            System.out.println(array.length());
            for (int i = 0; i < array.length(); i++) {
                JSONObject json = array.getJSONObject(i);
                //form_list form_list = new form_list();
                //ans.add(form_list);
                System.out.println(json.getString(tag));
                //form_list form_list = new form_list();
                //form_list.content = json.getString(tag);
                //ans.add(json.getString(tag));
                //arraylist.add(json.getString(tag));
                //System.out.println(form_list.content);
                System.out.println("FYBR");
            }

        }catch(JSONException e){
            e.printStackTrace();
        }
        return ans;
    }
}
