package com.mifko.model;


import net.bytebuddy.implementation.bind.annotation.Default;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import javax.persistence.*;


@Entity
@Table(name = "MESSAGE")
@DynamicInsert
public class Message<T, I extends Number>
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String message;

    @Column(name = "PRIORITY", columnDefinition = "int default 10")
    private Integer priority;


    public Message()
    {
    }

    public Message(String input)
    {
        this.message=  input;
    }

    public Message(String input,Integer priority)
    {
        this.message=  input;
        this.priority=priority;
    }


    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }



    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void setMessage(T message, Integer priority)
    {
        this.priority = priority;
    }

    public void setId(Long id)
    {
        this.id = id;
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
