package com.jj.rest.controller;


import com.jj.rest.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shitt7 on 2018/5/25.
 */
@Controller
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    private NovelService novelService;



//    @RequestMapping("/list")
//    public ModelAndView list(){
//        List<Novel> demoList = novelService.findAll();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("demoList",demoList);
//        modelAndView.setViewName("demo");
//        return modelAndView;
//    }

}
