package com.example.loginapp;

import java.util.Timer;
import java.util.TimerTask;

public class TokenManager {
    private static String Token = null;
    private static boolean isTokenPresent = false;

    public static void storeToken(String token) {
        Token = token;
        isTokenPresent = true;
        Timer timer = new Timer(true);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                clearToken();
                timer.cancel();
            }
        }, 30L * 24 * 60 * 60 * 1000);
    }

    public static boolean isTokenPresent() {
        return isTokenPresent;
    }

    public static String getToken() {
        return Token;
    }

    private static void clearToken() {
        Token = null;
        isTokenPresent = false;
    }
}
