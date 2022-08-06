package com.mifko;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderCenterApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderCenterApplication.class, args);

        System.out.println("Started");

/*        List<PrintDocument> list1 = new ArrayList<>();
        list1.add(new PrintDocument(new Document("docA"), 1));
        list1.add(new PrintDocument(new Document("docD"), 5));
        list1.add(new PrintDocument(new Document("docE"), 2));

        List<PrintDocument> list2 = new ArrayList<>();
        list2.add(new PrintDocument(new Document("docA"), 4));
        list2.add(new PrintDocument(new Document("docB"), 6));
        list2.add(new PrintDocument(new Document("docD"), 3));


        List<PrintDocument> list3 = PrintDocument.merge(list1, list2);
        for (PrintDocument printDocument : list3) {
            printDocument.print();
        }
        System.out.println(list3.size());*/

    }

    @RequestMapping("/")
    public String home()
    {
        return "PrintCenter Up";
    }

}