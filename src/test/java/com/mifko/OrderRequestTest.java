package com.mifko;


import com.mifko.model.Message;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import org.junit.jupiter.api.BeforeEach;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class OrderRequestTest
{

/*   private List<Message> list1;
   private List<Message> list2;

   final private List<Message> bigList1 = generateBigPrintDocumentList(500000);
   final private List<Message> bigList2 = generateBigPrintDocumentList(500000);

    @BeforeEach
    void setUp()
    {
        this.list1 = new ArrayList<>();
        this.list2 = new ArrayList<>();

    }*/


/*    @Test
    void exampleInputs()
    {
        this.list1.add(new Document("docA",1));
        this.list1.add(new Document("docD", 5));
        this.list1.add(new Document("docE", 2));
        this.list2.add(new Document("docA", 4));
        this.list2.add(new Document("docB", 6));
        this.list2.add(new Document("docD", 3));
        List<Document> resultList = OrderService.merge(this.list1, this.list2);
        for (Document r : resultList) {
            System.out.println(r);
        }

        List<Document> correctResultList = new ArrayList<>();
        correctResultList.add(new Document("docA", 1));
        correctResultList.add(new Document("docA", 4));
        correctResultList.add(new Document("docE", 2));
        correctResultList.add(new Document("docD", 3));
        correctResultList.add(new Document("docD", 5));
        correctResultList.add(new Document("docB", 6));

        assertEquals(correctResultList.size(), resultList.size());
*//*        for (int i = 0; i < correctResultList.size(); i++) {
            assertEquals(correctResultList.get(i).getMetaData().getFileName(),
                    resultList.get(i).getMetaData().getFileName());
            assertEquals(correctResultList.get(i).getPriority(), resultList.get(i).getPriority());
        }*//*
    }*/

/*    @Test
    void mergeCount()
    {
        List<Message> resultList = MessageService.merge(this.list1,this.list2);
        assertEquals(this.list1.size()+this.list2.size(),resultList.size(),"List size matches");
    }*/


/*    @Test
    void mergeStretchGoal()
    {
        long startTime = System.nanoTime();
        List<Message> resultList = MessageService.merge(bigList1,bigList2);
        long stopTime = System.nanoTime();
        System.out.println("Merged " + resultList.size() +" Documents in " + (stopTime-startTime)/1000000000f +" seconds");
    }*/

/*    private List<Message> generateBigPrintDocumentList(long size)
    {
        List<Message> returnList = new ArrayList<>();

        for(int i=0;i<size;i++)
        {
            String randomFileName = RandomStringUtils.randomAlphabetic(1,10);
            Integer randomPriority = RandomUtils.nextInt(1,10);
            returnList.add(new Message<String,Integer>(randomFileName,randomPriority));

        }
        return returnList;
    }*/
}