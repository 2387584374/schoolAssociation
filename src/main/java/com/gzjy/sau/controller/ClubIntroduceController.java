package com.gzjy.sau.controller;


import com.gzjy.sau.model.club;
import com.gzjy.sau.model.clubInform;
import com.gzjy.sau.service.impl.ClubInformServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/clubIntroduce")
public class ClubIntroduceController {


    //注入clubInformServiceImpl对象
    @Autowired
    private ClubInformServiceImpl clubInformService;


    @RequestMapping("/clubIntroduce")
    public String ClubIntroduce(HttpServletRequest request){

        //查询社团中心活动通知

        List<clubInform> clubInforms = clubInformService.queryClubActive();

        //查询社团中心社团招新通知
        List<clubInform> clubInformsEnroll = clubInformService.queryClubEnroll();

        //查询展示社团
        List<club> clubs = clubInformService.queryClubs();

        //存入request域对象中
        request.setAttribute("clubInforms",clubInforms);
        request.setAttribute("clubInformsEnroll",clubInformsEnroll);
        request.setAttribute("clubs",clubs);

        return "clubIntroduce/club";
    }
}
