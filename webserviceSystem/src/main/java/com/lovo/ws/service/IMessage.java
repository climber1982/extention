package com.lovo.ws.service;

public interface IMessage {
    /**
     * 推送一个消息
     * @param tag
     * @return
     */
    public String pushMessage(String tag);
}
