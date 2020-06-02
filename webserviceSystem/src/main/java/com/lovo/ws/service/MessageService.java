package com.lovo.ws.service;

import javax.jws.WebService;

@WebService
public class MessageService implements IMessage {

    public String pushMessage(String tag) {
        String message="";
        if(tag.equals("1")){
            message="成都天气预报";
        }else if (tag.equals("2")){
            message="广州天气预报";
        }
        return message;
    }
}
