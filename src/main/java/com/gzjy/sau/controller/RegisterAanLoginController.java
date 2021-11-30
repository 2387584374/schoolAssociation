package com.gzjy.sau.controller;



import com.gzjy.sau.mapper.UserMapper;
import com.gzjy.sau.model.User;
import com.gzjy.sau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/register")
public class RegisterAanLoginController {

    @Autowired
    private UserService userService;


    @RequestMapping("/register")
    public String register(){

        return "register/register";
    }


    /**
     * 注册
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/userSave")
    public String registerSave(User user, HttpServletRequest request){

        User user1 = userService.queryUser(user.getName());

        if (user1 == null){

            userService.userSave(user);

            HttpSession session = request.getSession();

            Object username = session.getAttribute("username");

            if(username != null){
                session.setAttribute("username",user);
            }
            return "forward:/";
        }else{
            request.setAttribute("users",user);
            request.setAttribute("error","false");
            return "forward:/register/register";
        }


    }

    /**
     * 处理用户在注册页面点击去登录页的处理
     * @return
     */
    @RequestMapping("/userLogin")
    public String userLogin(HttpServletRequest request){

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        if(user != null){

            return "forward:/management/managementIndex";
        }

        return "login/login";

    }

    /**
     * 用户提交找回密码处理
     * @return
     */
    @RequestMapping("/userFind")
    public String userFind(){

        //提示返回首页
        return "forward:/";
    }

    @RequestMapping("/uppassword")
    public String upPassword(){

        System.out.println("通过controller");

        return "register/uppassword";
    }

}
