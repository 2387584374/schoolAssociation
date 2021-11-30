package com.gzjy.sau.controller;


import com.gzjy.sau.model.*;
import com.gzjy.sau.service.InformService;
import com.gzjy.sau.service.UserService;
import com.gzjy.sau.service.impl.ActivityServiceImpl;
import com.gzjy.sau.service.impl.ClubInformServiceImpl;
import com.gzjy.sau.service.impl.SchoolInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexControllers {


    @Autowired
    private UserService userService;

    @Autowired
    private InformService informService;

    @Autowired
    private ClubInformServiceImpl clubInformService;

    @Autowired
    private ActivityServiceImpl activeService;

    @Autowired
    private SchoolInfoServiceImpl schoolInfoService;


    /**
     * 访问首页
     * @param request
     * @return
     */
    @RequestMapping("/")
    public String Index(HttpServletRequest request , HttpSession session){

        //查询所有活动通知
        List<Inform> informs = informService.fadAll();

        //查询社团通知
        List<clubInform> clubInforms = clubInformService.queryAll();

        //查询热门活动通知
        List<activity> actives = activeService.queryAll();

        //学院公告
        List<schoolInfo> schoolInfos = schoolInfoService.queryAll();

        //将查询结果存放到request域对象中
        request.setAttribute("clubInforms",clubInforms);

        request.setAttribute("informs",informs);

        request.setAttribute("actives",actives);

        request.setAttribute("schoolInfos",schoolInfos);

        request.setAttribute("username",session.getAttribute("username"));

        return "index/index";

    }

    /**
     * 处理主页登录 将用户信息存入session中 前端进行判断
     * @return
     */
    @PostMapping("/login")
    public String Longin(@RequestParam String username, String password, HttpSession session,HttpServletRequest request){

        //进行用户查询
        User user1 = userService.queryUser(username);


        //判断mapper层查询结果和用户输入账号密码是否相同 相同将用户信息存入session中
        if (user1 !=null  && user1.getPassword().equals(password)){

            session.setAttribute("username",user1.getName());

            return "forward:/";

        }else{

            request.setAttribute("error" ,"false");

          return "forward:/";

        }

    }

}
