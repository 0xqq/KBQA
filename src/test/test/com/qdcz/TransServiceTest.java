package com.qdcz;

import com.qdcz.service.TransactionService;
import com.qdcz.sdn.entity._Vertex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by hadoop on 17-6-22.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootSdnEmbeddedApplication.class)
public class TransServiceTest {

    @Autowired
    private TransactionService transactionService;



    @Test
    public void testshow(){
        transactionService.check("监督管理");
        System.out.println();
    }
    @Test
    public void testadd(){
        _Vertex vertex=new _Vertex("","建新","呵呵","奇点创智");
        transactionService.addVertex(vertex);
        System.out.println();
    }
    @Test
    public void testDeleteVertex(){
        transactionService.deleteVertex(2686l);
        System.out.println();
    }
    @Test
    public void testadEdge(){
//        transactionService.addEgde();
//        transactionService.deleteEgde(1848l);
        transactionService.show("浩哥");
        System.out.println();
    }
    @Test
    public void testcheck(){
        transactionService.check("续贷条件");
        System.out.println();
    }
    @Test
    public  void testchange(){
        _Vertex newVertex=new _Vertex("","宇哥","呵呵","奇点创智");
        transactionService.changeVertex(2686l,newVertex);

    }
    @Test
    public void testcheckedge(){
        transactionService.getInfoByRname("领导");
    }

}
