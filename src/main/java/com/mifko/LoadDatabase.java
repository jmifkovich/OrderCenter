package com.mifko;

import com.mifko.model.Message;
import com.mifko.controller.MessageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase
{



    @Bean
    CommandLineRunner initDatabase(MessageRepository repository){

        return args ->{

            OrderCenterApplication.log.info("Preloading " +repository.save(new Message("Hello World")));

        };
    }
}