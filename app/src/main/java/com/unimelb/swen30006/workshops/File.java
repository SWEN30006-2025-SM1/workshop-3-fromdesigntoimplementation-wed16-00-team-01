package com.unimelb.swen30006.workshops;

import java.util.Date;

// Sample private file class to be replaced by your implementaiton
class File {
    private Date createdDate;
    private String fileData;
    private String fileName;
    private String fileType;

    public File (Date createdDate, String fileData, String fileName, String fileType) {
        this.createdDate = createdDate;
        this.fileData = fileData;
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public String content() {
        return fileData;
    }
    public int fileSize() {
        return fileData.length();
    }
    public String fileType(){
        return fileType;
    }
}