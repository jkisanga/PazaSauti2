package com.tanzania.jkisanga.pazasauti.app;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dell on 10/3/2017.
 */

public class AppConfig {
    private static String BASE_URL = "http://192.168.43.196/fileUpload/";
     public static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}