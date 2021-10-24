package com.ypy.service;

public class Status {
    private final String NAME;

    private Status(String name) {
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");

    public String getName() {
        return this.NAME;
    }

    public String toString() {
        return this.NAME;
    }

}
