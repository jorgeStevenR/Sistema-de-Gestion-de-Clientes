package com.customermanagementsystem.model;

import java.time.Instant;

public class Action {
    private String description;
    private Instant timestamp;

    public Action(String description) {
        this.description = description;
        this.timestamp = Instant.now();
    }

    public String getDescription() {
        return description;
    }

    public long getTimestamp() {
        return timestamp.toEpochMilli();
    }

    
    @Override
    public String toString() {
        return "[" + timestamp + "] " + description;
    }
}
