package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;
    private Submission[] submissions;

    public Assignment(String description, Date date, int maxAttempts, String name) {
        this.description = description;
        this.dueDate = date;
        this.maxAttempts = maxAttempts;
        this.name = name;
    }
}
