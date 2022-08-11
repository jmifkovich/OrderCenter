package com.mifko;

import com.mifko.model.Message;
import com.mifko.services.MessageService;
import com.mifko.services.MessageServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MessageServiceTest
{


    @Test
    void checkService()
    {
        MessageServiceImpl test = new MessageServiceImpl();
        List<Message> messages =test.getMessages();
        assertNotNull(messages);
        System.out.println(messages.size());
    }

}
