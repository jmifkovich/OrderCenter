package com.mifko;

import com.mifko.documents.Document;
import com.mifko.documents.DocumentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase
{



    @Bean
    CommandLineRunner initDatabase(DocumentRepository repository){

        return args ->{

            OrderCenterApplication.log.info("Preloading " +repository.save(new Document("docA.docx")));

        };
    }
}