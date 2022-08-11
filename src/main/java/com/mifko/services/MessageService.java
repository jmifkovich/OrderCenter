package com.mifko.services;

import com.mifko.controller.MessageRepository;
import com.mifko.model.Message;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface MessageService
{
    List<Message> getMessages();


/*    public static List<Message> merge(List<Message> d1, List<Message> d2) {
        Map<String, List<Message>> resultMap= Stream.of(d1, d2).flatMap(List::stream)
                .filter(m->m.getMessage()!=null)
                .filter(m->m.getPriority()>0)
                .sorted(Comparator.comparingLong(Message::getPriority))
                .collect(Collectors.groupingBy(o -> o.getMetaData().getMessageType(), LinkedHashMap::new,
                        Collectors.toList()));
        List<Message> resultList = new ArrayList<>();
        resultMap.forEach((s, printDocuments) -> resultList.addAll(printDocuments));
        return resultList;
    }*/

}
