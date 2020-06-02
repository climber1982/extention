package com.lovo.ws.client;

public class ClientMain {
    public static void main(String[] args) {
        MessageServiceService messageServiceService=new MessageServiceService();
        //获得远程对象
      MessageService messageService=  messageServiceService.getMessageServicePort();
      //调用远程方法
      String str=  messageService.pushMessage("2");
        System.out.println(str);
    }
}
