package com.gzjy.sau.controller;


import com.gzjy.sau.model.User;
import com.gzjy.sau.model.activity;
import com.gzjy.sau.model.activityCrew;
import com.gzjy.sau.service.UserService;
import com.gzjy.sau.service.activityApplyService;
import com.gzjy.sau.service.activityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/activityApply")
public class ActivityApplyController {

        //注入service层
    @Autowired
    private activityApplyService activityApplyServiceImpl;

    @Autowired
    private UserService userServiceImpl;

    @Autowired
    private activityService activityServiceImpl;


    /**
     * 学生报名处理
     * @param request
     * @param session
     * @param activityId
     * @return
     */
    @RequestMapping("/verify/{activityId}")
    public String verify(HttpServletRequest request, HttpSession session,@PathVariable("activityId") int activityId){

        Object username = session.getAttribute("username");


        if(username == null){
            //用户未登录时返回提示 跳转到首页提示登录
            request.setAttribute("enter","false");
            return "forward:/";
        }else{
            //通过账号查询该学生信息存入request域中进行回显
            User user = userServiceImpl.queryUser((String) username);

            request.setAttribute("user",user);
            //存入活动id
            request.setAttribute("activityId",activityId);
            //跳到活动报名页面
            return "activityApply/activityApply";
        }

    }

    /**
     * 活动报名
     * @param activityCrew
     * @param request
     * @return
     */
    @RequestMapping("/ApplySave")
    public String ApplySave(activityCrew activityCrew,HttpServletRequest request,String activityId){

        String projectName = activityCrew.getProjectName();

        Long number = activityCrew.getNumber();

        com.gzjy.sau.model.activityCrew activityCrew1 = activityApplyServiceImpl.queryOne(number, projectName);

        System.out.println(activityCrew1);

        //如果相同 表示该同学已经报名该项目 不进行提交数据库储存
        if(activityCrew1 != null && activityCrew1.getNumber().equals(activityCrew.getNumber()) && activityCrew1.getProjectName().equals(activityCrew.getProjectName())){


            request.setAttribute("affect","success");

            return "forward:/";


        }else{
            //如果不相同进行保存
            int activityID = Integer.parseInt(activityId);
            activity activity = activityServiceImpl.queryActivity(activityID);

            activityCrew.setActivity(activity.getActiveName());

            int affect = activityApplyServiceImpl.activityApplySave(activityCrew);
            //如果为0表示储存失败
            if(affect == 0){
                request.setAttribute("affect","false");

                return "forward:/";
            }
            request.setAttribute("affect","ture");
            return "forward:/";

        }
    }

    @RequestMapping("/clubApply")
    public String clubApply(HttpServletRequest request){

        HttpSession session = request.getSession();

        Object username1 = session.getAttribute("username");

        User user = userServiceImpl.queryUser((String) username1);
        if(username1 != null){
            request.setAttribute("user",user);
            return "activityApply/clubApply";
        }

        //用户未登录时返回提示 跳转到首页提示登录
        request.setAttribute("enter","false");
        return "forward:/";
    }
}
