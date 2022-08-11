package com.mifko.services;


import com.mifko.model.Message;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MessageServiceImpl implements MessageService
{


    @Override
    public List<Message> getMessages(){

         List<Message>  returnMe = new ArrayList<>();
         return returnMe;

        //throw new NotYetImplementedException("Nothing here");
    }


}
