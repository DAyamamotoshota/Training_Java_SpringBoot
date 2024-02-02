package com.sre.web_app_training;
import com.sre.web_app_training.model.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @PostMapping("/message")
    public Message createMessage(@RequestBody Message message){
        //受け取ったメッセージを加工する処理など
        Message response = new Message("2", "b");
        return response;
    }
}