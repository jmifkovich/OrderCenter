package com.mifko.services;

import com.mifko.model.Message;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MessageServiceImpl implements MessageService
{

    //do something

    @Override
    public List<Message> getMessages()
    {
        throw new NotYetImplementedException("Nothing here");
    }


}
