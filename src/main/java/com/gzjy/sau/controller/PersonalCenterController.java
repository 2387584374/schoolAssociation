package com.gzjy.sau.controller;


import com.gzjy.sau.model.Inform;
import com.gzjy.sau.model.User;
import com.gzjy.sau.model.activityCrew;
import com.gzjy.sau.service.ActivityCrewService;
import com.gzjy.sau.service.InformService;
import com.gzjy.sau.service.PersonalCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/personalCenter")
public class PersonalCenterController {

    @Autowired
    private PersonalCenterService personalCenterServiceImpl;

    @Autowired
    private InformService informServiceImpl;

    @Autowired
    private ActivityCrewService activityCrewServiceImpl;

    @RequestMapping("/personalIndex/{username}")
    public String personalIndex(@PathVariable("username") String username,HttpServletRequest request){

        //查询用户信息

        User user = personalCenterServiceImpl.queryInfo(username);

        //查询活动通知
        List<Inform> informs = informServiceImpl.fadAll();

        //保存域
        HttpSession session = request.getSession();
        session.setAttribute("userinfo" ,user);

        request.setAttribute("activeInform",informs);

        return "personalCenter/personalIndex";
    }

    @RequestMapping("/myActivity/{number}")
    public String myActivity(@PathVariable("number")Long number,HttpServletRequest request){

        List<activityCrew> activityCrews = activityCrewServiceImpl.queryActivityCrews(number);

        request.setAttribute("activityCrews",activityCrews);

        return "personalCenter/myActivity";
    }

    @RequestMapping("/myClub")
    public String myClub(){

        return "personalCenter/myClub";
    }

    @RequestMapping("/myEmail")
    public String myEmail(){

        return "personalCenter/myEmail";
    }

    @RequestMapping("/activity")
    public String activity(){

       return  "personalCenter/activity";
    }

    @RequestMapping("/schedule")
    public String schedule(){

        return "personalCenter/schedule";
    }
}
