package com.ptp.phamtanphat.appnhac.Service;

/**
 * Created by KhoaPhamPC on 9/4/2018.
 */

public class APIService {
    private static String base_url = "https://phatdroid94com.000webhostapp.com/Server/";

    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
