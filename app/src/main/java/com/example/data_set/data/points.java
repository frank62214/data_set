package com.example.data_set.data;

import com.example.data_set.Method;

public class points {

    public String content = "";
    public String seq = "";
    public String spDesc = "";
    public String street = "";
    public String lat = "";
    public String lng = "";
    public String latlng = "";
    public String memo = "";
    public String event = "";
    public String checkIn = "";


    public void getItem(int n){
        seq = Method.get_json_test_2(content, "seq", n);
        spDesc = Method.get_json_test_2(content, "spDesc", n);
        street = Method.get_json_test_2(content, "street", n);
        lat = Method.get_json_test_2(content, "lat", n);
        lng = Method.get_json_test_2(content, "lng", n);
        latlng = Method.get_json_test_2(content, "latlng", n);
        memo = Method.get_json_test_2(content, "memo", n);
        event = Method.get_json_test_2(content, "event", n);
        checkIn = Method.get_json_test_2(content, "checkIn", n);
    }
}
