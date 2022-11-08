package com.lecuong.modal;

import lombok.Getter;
import lombok.Setter;

/**
 * @author CuongLM18
 * @created 08/11/2022 - 3:19 PM
 * @project websocket-chat
 */
@Getter
@Setter
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;

    public enum MessageType {
        CHAT, LEAVE, JOIN
    }


}
