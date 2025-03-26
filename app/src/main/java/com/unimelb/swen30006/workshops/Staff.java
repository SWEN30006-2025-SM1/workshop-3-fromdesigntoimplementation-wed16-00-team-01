package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Staff extends Person{
    private String[] roles;
    private String staffID;

    public Staff(String address, Date dob, String name, String staffID) {
        super(address, dob, name);
        this.staffID = staffID;
    }
}
