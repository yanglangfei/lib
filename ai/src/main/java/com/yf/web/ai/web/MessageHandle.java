package com.yf.web.ai.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

@Slf4j
public class MessageHandle extends AbstractWebSocketHandler {

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        super.handleMessage(session, message);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        //处理字符串消息
        session.sendMessage(new TextMessage(message.asBytes()));
        log.info("接收到文本消息:["+message.getPayload()+"]");
    }

    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
        //处理二进制消息
        session.sendMessage(new BinaryMessage(message.getPayload()));
    }

    @Override
    protected void handlePongMessage(WebSocketSession session, PongMessage message) throws Exception {
        super.handlePongMessage(session, message);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        //传出错误的处理
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        //连接关闭的处理
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        //连接建立后的处理
        log.info("建立连接:"+session.getId()+"]");
    }
}
