package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("rest/page/{pageName}")
    public String page(@PathVariable String pageName){
        return pageName;
    }
//    @RequestMapping("rest/page/item-add")
//    public String itemAdd(){
//        return "item-add";
//    }
//    @RequestMapping("rest/page/item-list")
//    public String itemList(){
//        return "item-list";
//    }
//    @RequestMapping("rest/page/content-category")
//    public String contentCategory(){
//        return "content-category";
//    }
//    @RequestMapping("rest/page/content")
//    public String content(){
//        return "content";
//    }

}
