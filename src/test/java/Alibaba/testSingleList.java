package Alibaba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class testSingleList {
    @Test
    public void testPush(){
        SingleListImpl list = new SingleListImpl();
        list.push(1);
        list.push(2);
        list.push(3);
        Assertions.assertEquals(1,list.head.getItem());
        Assertions.assertEquals(2,list.head.getNext().getItem());
        Assertions.assertEquals(3,list.head.getNext().getNext().getItem());
        list.print();
    }
    @Test
    public void testSort(){
        SingleListImpl list = new SingleListImpl();
        list.push(1);
        list.push(3);
        list.push(2);
        list.sort();
        Assertions.assertEquals(1,list.head.getItem());
        Assertions.assertEquals(2,list.head.getNext().getItem());
        Assertions.assertEquals(3,list.head.getNext().getNext().getItem());

        SingleList list2 = new SingleListImpl();
        Random random = new Random();
        for(int i = 0;i<100;i++){
            list2.push(random.nextInt(200));
        }
        list2.print();
        System.out.println();
        list2.sort();
        list2.print();
    }
    @Test
    public  void testNull(){
        SingleList list = new SingleListImpl();
        list.sort();
        list.print();
    }
}
