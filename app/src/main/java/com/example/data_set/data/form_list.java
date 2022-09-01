package com.example.data_set.data;

import android.nfc.FormatException;

import com.example.data_set.Method;

import java.util.ArrayList;

public class form_list {
    public String content = "";
    public String formId = "";
    public String formNo = "";
    public String formType = "";
    public String formDate = "";
    public String formExpDate = "";
    public String formPriority = "";
    public String dispatcher = "";
    public String handler = "";
    public String formContent = "";
    public String formStatus = "";
    public detail detail = new detail();

    public void store(){
//        formId = Method.get_json_test_2(content, "formId");
//        formNo = Method.get_json_test(content, "formNo");
//        formType = Method.get_json_test(content, "formType");
//        formDate = Method.get_json_test(content, "formDate");
//        formExpDate = Method.get_json_test(content, "formExpDate");
//        formPriority = Method.get_json_test(content, "formPriority");
//        dispatcher = Method.get_json_test(content, "dispatcher");
//        handler = Method.get_json_test(content, "handler");
//        formContent = Method.get_json_test(content, "formContent");
//        formStatus = Method.get_json_test(content, "formStatus");
//        detail.content = Method.get_json_test(content, "detail");
//        detail.store();
    }
    public void getItem(int n){
        formId = Method.get_json_test_2(content, "formId", n);
        formNo = Method.get_json_test_2(content, "formNo", n);
        formType = Method.get_json_test_2(content, "formType", n);
        formDate = Method.get_json_test_2(content, "formDate", n);
        formExpDate = Method.get_json_test_2(content, "formExpDate", n);
        formPriority = Method.get_json_test_2(content, "formPriority", n);
        dispatcher = Method.get_json_test_2(content, "dispatcher", n);
        handler = Method.get_json_test_2(content, "handler", n);
        formContent = Method.get_json_test_2(content, "formContent", n);
        formStatus = Method.get_json_test_2(content, "formStatus", n);
        detail.content = Method.get_json_test_2(content, "detail", n);
        detail.store();
    }
}
