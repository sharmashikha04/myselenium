package com.shikha.input;

public class CSVInputManagerImpl  implements InputManager{

    private String testID;
    private String testAction;
    private String testDescrption;
    private String testlocator;
    private String testValue;
    private String testverify;


    public String getTestID() {
        return testID;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public String getTestAction()
    {
        return testAction;
    }

    public void setTestAction(String testAction) {
        this.testAction = testAction;
    }

    public String getTestDescrption() {
        return testDescrption;
    }

    public void setTestDescrption(String testDescrption) {
        this.testDescrption = testDescrption;
    }

    public String getTestlocato() {
        return testlocator;
    }

    public void setTestlocato(String testlocato) {
        this.testlocator = testlocato;
    }

    public String getTestValue() {
        return testValue;
    }

    public void setTestValue(String testValue) {
        this.testValue = testValue;
    }

    public String getTestverify() {
        return testverify;
    }

    public void setTestverify(String testverify) {
        this.testverify = testverify;
    }

    @Override
    public String toString() {
        return "CSVInputManagerImpl{" +
                "testID='" + testID + '\'' +
                ", testAction='" + testAction + '\'' +
                ", testDescrption='" + testDescrption + '\'' +
                ", testlocator='" + testlocator + '\'' +
                ", testValue='" + testValue + '\'' +
                ", testverify='" + testverify + '\'' +
                '}';
    }
}
