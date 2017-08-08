package com.qdcz.chat.controller;

import com.qdcz.chat.service.HighService;
import com.qdcz.service.bean.RequestParameter;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by star on 17-8-1.
 */
@RestController
public class ChatController {

    @Autowired
    private HighService highService;




    @RequestMapping(path = "/testask", method = {RequestMethod.POST,RequestMethod.GET})
    public void  testQuery(@RequestParam String question){
//        cypherSearchService.queryWithCypher(question);

    }



    @CrossOrigin
    @RequestMapping(path = "/ask", method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String ask(@RequestParam String question){
        RequestParameter requestParameter =null;
        requestParameter =new RequestParameter();
        requestParameter.label="test";
        requestParameter.relationship=new ArrayList<>();
        requestParameter.relationship.add("gra");
        requestParameter.requestSource = Thread.currentThread().getStackTrace()[1].getMethodName();
        String s = highService.smartQA(requestParameter,question);
        return s;
    }


    @CrossOrigin
    @RequestMapping(path = "/askFromWeChat", method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String askOfWeChat(@RequestParam String question){
        RequestParameter requestParameter =null;
        requestParameter =new RequestParameter();
        requestParameter.label="test";
        requestParameter.relationship=new ArrayList<>();
        requestParameter.relationship.add("gra");
        requestParameter.requestSource = Thread.currentThread().getStackTrace()[1].getMethodName();
        String s = highService.smartQA(requestParameter,question);
        return s;
    }

}
