package com.lovo.ws.service;

import javax.xml.ws.Endpoint;

public class WsMain {
    public static void main(String[] args) {
        IMessage message=new MessageService();
        Endpoint.publish("http://192.168.10.222:8000/message",message);
    }
}
