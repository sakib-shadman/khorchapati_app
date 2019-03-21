package com.jontromanob.app.khorchapati.retrofit;

/**
 * Created by Joy on 11/19/2016.
 */

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    public static final String BASE_URL_LOCAL = "http://61.247.185.122:85/";
    public static String BASE_URL_PREFIX = "http://";// Live Server_1
    public static String BASE_URL_Extension = ".pihr.xyz/";   // Live Server_1
    public static Retrofit retrofit = null;

    public static Retrofit getClient() {
        String url = "";
        if (retrofit == null) {

            url = BASE_URL_LOCAL;

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor ();
            logging.setLevel (HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder httpClient = new OkHttpClient
                    .Builder ()
                    .connectTimeout (60, TimeUnit.SECONDS)
                    .readTimeout (60, TimeUnit.SECONDS)
                    .writeTimeout (600, TimeUnit.SECONDS);

// add your other interceptors …

// add logging as last interceptor
            httpClient.addInterceptor (logging)
                    .addNetworkInterceptor (new StethoInterceptor ());  // <-
/*

            httpClient.
                    addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request request = chain.request();
                            Response response = chain.proceed(request);
                            if (response.code() == 401 || response.code() == 404) {
                                if (HomeActivity.getContext() != null) {
                                    Intent intent = new Intent (HomeActivity.RESPONSE_INTENT);
                                    LocalBroadcastManager.getInstance(HomeActivity.getContext()).sendBroadcast(intent);
                                }
                            }
                            return response;
                        }
                    });
*/

            Gson gson = new GsonBuilder ()
                    .setDateFormat ("yyyy-MM-dd'T'HH:mm:ss")
                    .setLenient ()
                    .create ();
            retrofit = new Retrofit.Builder ()
                    .baseUrl (url)
                    .addConverterFactory (GsonConverterFactory.create (gson))
                    .client (httpClient.build ())
                    .build ();

        }
        return retrofit;
    }

   /* public static String getCompleteUrl() {
        if (CompanyInfoPreference.getSubDomainName() != null) {
            return BASE_URL_PREFIX + CompanyInfoPreference.getSubDomainName() + BASE_URL_Extension;
        //return BASE_URL_LOCAL;
    }
        return null;
    }*/
}
