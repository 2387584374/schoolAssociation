package com.gzjy.sau.controller;


import com.gzjy.sau.model.activity;
import com.gzjy.sau.service.activityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/commonInform")
public class CommonInformController {


    //注入activityService
    @Autowired
    private activityService activityService;

    @RequestMapping("/activityInform/{id}")
    public String activityInform(@PathVariable("id")int id, HttpServletRequest request){

        //通过id进行查询活动对象
        activity activity = activityService.queryActivity(id);


        //存入request域中
        System.out.println(activity.toString());
        request.setAttribute("activity",activity);

        //请求转发到通知页面
        return "commonInform/activityInform";
    }
}
