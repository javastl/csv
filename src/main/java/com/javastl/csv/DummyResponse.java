package com.javastl.csv;

public class DummyResponse {

    private String message;
    
    public DummyResponse(String msg){
        this.message = msg;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
