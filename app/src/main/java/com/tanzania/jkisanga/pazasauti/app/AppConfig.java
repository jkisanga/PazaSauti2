package com.tanzania.jkisanga.pazasauti.app;

import android.util.DisplayMetrics;

import com.tanzania.jkisanga.pazasauti.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dell on 10/3/2017.
 */

public class AppConfig {

    public static final String ID = "ID";
    public static final String NAME = "NAME";
    public static final String PHONE = "PHONE";


    public static final int REQUEST_STORAGE_PERMS = 1;
    public static final int REQUEST_CAMERA_PERMISSION = 2;
    public static final int REQUEST_MULTIPLE_PERMISSIONS = 3;
    public static final int REQUEST_CALL_PERMS = 4;

    public static final int TYPE_MULTI_PICKER = 3;
    public static final int TYPE_MULTI_CAPTURE = 4;

    public static final String KEY_BUNDLE_LIST = "BUNDLE_LIST";
    public static final String KEY_PARAMS = "PARAMS";


    private static String BASE_URL = "http://192.168.43.196:8080/pazasautiweb/public/";
   // private static String BASE_URL = "http://pazasauti.android.co.tz/";

    private static String BASE_URL1 = "http://192.168.43.196:8080/fileUpload/";


     public static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
     public static Retrofit getRetrofit1() {
        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL1)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
