package com.mifko.model;


import org.springframework.lang.Nullable;

import javax.persistence.*;


@Entity
@Table(name = "MESSAGE")
public class Message
{
    private Long id;
    @Embedded
    @Nullable
    private MessageMetaData metaData;
    private String message;
    private Integer priority;

    public Message(String fileName)
    {
        this.metaData = new MessageMetaData(fileName);
    }
    public Message(String fileName, Integer priority)
    {
        this.metaData = new MessageMetaData(fileName);
        this.priority = priority;
    }

    public Message()
    {
    }


    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public MessageMetaData getMetaData() {return metaData;}

    @Nullable
    public void setMetaData(MessageMetaData metaData)
    {
        this.metaData = new MessageMetaData(this.message);
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String path)
    {
        this.message = path;
    }

    public Integer getPriority()
    {
        return priority;
    }

    public void setPriority(Integer priority)
    {
        this.priority = priority;
    }
}
