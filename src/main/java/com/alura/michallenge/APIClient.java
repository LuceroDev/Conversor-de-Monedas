package com.alura.michallenge;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class APIClient {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/cce83fde0359f840d0b32338/latest/USD";
    private OkHttpClient client;

    public APIClient() {
        client = new OkHttpClient();
    }

    public String getExchangeRates() throws IOException {
        Request request = new Request.Builder()
                .url(API_URL)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }
}
