package com.example.data_set.data;

import com.example.data_set.Method;

public class data {
    public String content = "";
    public String errCode = "";
    public String errMessage = "";
    public result result = new result();

    public void store(){
        errCode = Method.get_json_test(content, "errCode");
        errMessage = Method.get_json_test(content, "errMessage");
        result.content = Method.get_json_test(content, "result");
        result.store();
    }

}
