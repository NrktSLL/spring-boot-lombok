package com.nrktsll.springbootlombok.model.Impl;

import com.nrktsll.springbootlombok.service.MailService;
import org.springframework.stereotype.Service;

@Service
public class MailImpl implements MailService {

    @Override
    public void sendMail() {
        System.out.println("Mail sent");
        //Mail sender
    }
}
