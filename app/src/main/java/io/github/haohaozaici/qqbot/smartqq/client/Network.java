package io.github.haohaozaici.qqbot.smartqq.client;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by haoyuan on 2018/1/9.
 */

public class Network {

  private static Network instance;

  private Network() {
  }

  public static synchronized Network getInstance() {
    if (instance == null) {
      instance = new Network();
    }
    return instance;
  }

  OkHttpClient okHttpClient = new OkHttpClient.Builder()
      .connectTimeout(10, TimeUnit.SECONDS)
      .readTimeout(30, TimeUnit.SECONDS)
      .addInterceptor(new HttpLoggingInterceptor())
      .build();


}
