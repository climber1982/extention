package ws.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/socket")
@Component
public class WebSocketService {
    @OnOpen
    public void onOpen(Session session){
        System.out.println(session+"/");
       this.sendMessage(session,"后台已经收到建立链接请求");
    }
    @OnClose
    public void onClose() {

    }
    @OnMessage
    public void onMessage(String message,Session session) throws IOException {
        System.out.println(session+"/");
        System.out.println(message);
        this.sendMessage(session,"后台收到了你的消息:"+message);


    }

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println(session+"/");
    }
     //发送消息
    public void sendMessage(Session session,String messageText){
        try {
            session.getBasicRemote().sendText(messageText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
