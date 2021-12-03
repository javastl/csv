package com.javastl.csv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
public class CsvEndpoint {
    @GetMapping(value ="/hello", produces = "application/json")
    public DummyResponse hello(){
        String podName = "";
        int cores = 0;
        String os = "";
        try{
            cores = Runtime.getRuntime().availableProcessors();
            podName = java.net.InetAddress.getLocalHost().toString();
            os = System.getProperty("os.name");
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return new DummyResponse("CSV has this many Cores available: " + cores + " Running pod is: " + podName + " OS detected: " + os);
    }
}