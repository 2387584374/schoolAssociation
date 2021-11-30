package com.gzjy.sau.controller;


import com.gzjy.sau.model.User;
import com.gzjy.sau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/management")
public class ManagementController {

    @Autowired
    private UserService userServiceImpl;


    /**
     * 查询用户是否有权限 如果无权限则跳回首页
     * @param username 用户输入登录名
     * @param password 用户输入密码
     * @return 跳转地址
     */
    @RequestMapping("/managementLogin")
    public String managementIndex(String username, String password, HttpServletRequest request){

        //通过用户名查询用户
        User user = userServiceImpl.queryUser(username);
        //判断用户是否存在
        if(user != null){

            //用户存在进行密码级权限判断
            if(user.getPassword().equals(password) && user.getJurisdiction() == 1){
                HttpSession session = request.getSession();
                session.setAttribute("user",user);
                //权限密码正确进入后台界面
                return "management/managementIndex";

            }else{
                //权限不够或者密码错误
                request.setAttribute("errorUsers","false");
                //账号回填
                request.setAttribute("username",username);
                return "login/login";
            }
        }else{
            //用户名不存在
            request.setAttribute("errorUser","false");
            //账号回填
            request.setAttribute("username",username);
            return "login/login";
        }

    }    @RequestMapping("/managementIndex")
    public String managementIndex(){

        return "management/managementIndex";

    }

    @RequestMapping("/managementClub")
    public String managementClub(){

        return "management/managementClub";
    }

    @RequestMapping("/announcement")
    public String announcement(){

        return "management/announcement";
    }

    @RequestMapping("/announcementToInform")
    public String announcementToInform(){

        return "management/announcementToInform";
    }

    @RequestMapping("/noticeIssued")
    public String noticeIssued(){

        return "management/noticeIssued";
    }

    @RequestMapping("/reviewActivities")
    public String reviewActivities(){

        return "management/reviewActivities";
    }

    @RequestMapping("/activityReleased")
    public String activityReleased(){

        return "management/activityReleased";
    }

}
