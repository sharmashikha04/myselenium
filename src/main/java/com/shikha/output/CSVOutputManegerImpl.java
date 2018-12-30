package com.shikha.output;

public class CSVOutputManegerImpl {
    private String testID;
    private String testDescrption;
    private String testResult;
    private long   testTime;


    public String getTestID() {
        return testID;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public String getTestDescrption() {
        return testDescrption;
    }

    public void setTestDescrption(String testDescrption) {
        this.testDescrption = testDescrption;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public long getTestTime() {
        return testTime;
    }

    public void setTestTime(long testTime) {
        this.testTime = testTime;
    }
}
