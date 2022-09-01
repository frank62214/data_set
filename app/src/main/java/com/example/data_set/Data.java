package com.example.data_set;

import java.io.BufferedReader;
import java.io.IOException;

import android.util.Log;


import com.example.data_set.data.data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.ConnectionSpec;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Data {

    String url = "http://nekomatsuri.ddns.net/test1.json";

    public void dataList( data data_test) {
        Log.d("obj", "FYBR");
        OkHttpClient client = getUnsafeOkHttpClient();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create("", mediaType);
        Request request = new Request.Builder()
                .url("https://nekomatsuri.ddns.net/test3.json")
                .method("POST", body)
                .build();
        try {
            Log.d("obj", "FYBR1");
            Response response = client.newCall(request).execute();

            if (response.isSuccessful()){
                String results = response.body().string();
                ArrayList<String> data = new ArrayList<>();
                ArrayList<String> result = new ArrayList<>();
                ArrayList<String> form_list = new ArrayList<>();
                ArrayList<String> detail = new ArrayList<>();

                //get_json_test(results, data_test, "data");

                data_test.content = Method.get_json_test(results, "data");
                data_test.store();
                System.out.println(data_test.result.form_list.get(0).detail.route.get(0));

                //get_json(results,data, "data");
//                Method.get_json(data, result,"result");
//                Method.get_json(result, form_list,"form_list");
//                Method.get_json(form_list, Data.formNo, "formNo");
//                Method.get_json(form_list, Data.formDate,"formDate");
//                Method.get_json(form_list, Data.formExpDate,"formExpDate");
//                Method.get_json(form_list,Data.formPriority,"formPriority");
//                Method.get_json(form_list,Data.formContent,"formContent");
//                Method.get_json(form_list,Data.formStatus,"formStatus");
//                Method.get_json(form_list,detail,"detail");
//                Method.get_json(detail,Data.points,"points");
//                Method.get_json(Data.points,Data.seq,"seq");
//                Method.get_json(Data.points,Data.spDesc,"spDesc");
//                Method.get_json(Data.points,Data.street,"street");
//                Method.get_json(Data.points,Data.latStation,"lat");
//                Method.get_json(Data.points,Data.lngStation,"lng");
//                Method.get_json(Data.points,Data.latlng,"latlng");
//                Method.get_json(Data.points,Data.memo,"memo");
//                Method.get_json(Data.points,Data.event,"event");
//                Method.get_json(Data.event,Data.eventCode,"eventCode");
//                Method.get_json(Data.event,Data.eventDesc,"eventDesc");
//                Method.get_json(Data.event,Data.eventStatus,"eventStatus");
//                Method.get_json(Data.event,Data.eventMemo,"eventMemo");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager)trustAllCerts[0]);
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            OkHttpClient okHttpClient = builder.build();
            return okHttpClient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
