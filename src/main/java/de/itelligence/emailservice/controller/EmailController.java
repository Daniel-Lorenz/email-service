package de.itelligence.emailservice.controller;


import de.itelligence.emailservice.email.EmailSender;
import de.itelligence.emailservice.email.EmailSpec;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class EmailController {

    private final EmailSender sender;

    public EmailController(EmailSender sender) {
        this.sender = sender;
    }

    @PostMapping("/send")
    ResponseEntity<String> sendEmail(@RequestBody EmailSpec content){

        try {
            sender.sendMail(content.getMsg(), content.getRecipient());
        } catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Arrays.toString(e.getStackTrace())); //Don't do this in production ;-)
        }
        return ResponseEntity.ok("Email sent");
    }


}