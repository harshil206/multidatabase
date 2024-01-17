package com.example.multi.configuration;

public class DbContextHolder {

    private static final ThreadLocal<ClientNames> contextHolder = new ThreadLocal<>();

    public static void setCurrentDb(ClientNames dbType) {
        contextHolder.set(dbType);
    }

    public static ClientNames getCurrentDb() {
        return contextHolder.get();
    }

    public static void clear() {
        contextHolder.remove();
    }

}
