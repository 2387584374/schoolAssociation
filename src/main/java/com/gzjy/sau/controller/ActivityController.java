package com.gzjy.sau.controller;


import com.gzjy.sau.model.Inform;
import com.gzjy.sau.model.activity;
import com.gzjy.sau.service.impl.ActivityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/activity")
public class ActivityController {

    //注入activeServiceImpl对象
    @Autowired
    private ActivityServiceImpl activeService;

    /**
     * 首页向学院活动页的处理
     * @param request
     * @return
     */
    @RequestMapping("/activity")
    public String Activity(HttpServletRequest request){

        //获取首页显示单个活动对象
        activity active = activeService.queryHome();

        List<Inform> informs = activeService.queryInform();


        //存入request域对象中
        request.setAttribute("activeHome",active);

        request.setAttribute("activeInform",informs);

        return "activity/activity";
    }


}
