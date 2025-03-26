package com.unimelb.swen30006.workshops;

// Sample private submission class to be replaced by your implementation
class Submission {
    private int attemptNum;
    private File[] files;
    private int numFiles;

    public Submission(int attemptNum, File[] files) {
        this.attemptNum = attemptNum;
        this.files = files;
    }

    public File[] includedFiles() {
        return files;
    }

}
