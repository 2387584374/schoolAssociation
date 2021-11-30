package com.gzjy.sau.controller;


import com.gzjy.sau.model.branchInform;
import com.gzjy.sau.model.clubInform;
import com.gzjy.sau.service.SortingTheUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/SortingTheUrl")
public class SortingTheUrlController {

    //注入sortingTheUrlServiceImpl对象
    @Autowired
    private SortingTheUrlService sortingTheUrlService;


    /**
     * 处理首页点击信息管理页面时请求
     * @return
     */
    @RequestMapping("/infoManagement")
    public String infoSortingTheUrl(HttpServletRequest request){
        //获取信息管理活动通知
        List<branchInform> ActivityInform = sortingTheUrlService.queryInfoActivityInform();

        //获取信息管理社团通知
        List<branchInform> clubInform = sortingTheUrlService.queryInfoClubInform();

        //获取信息管理学生会通知
        List<branchInform> unionInform = sortingTheUrlService.queryInfoUnionInform();


        //存入request域中
        request.setAttribute("ActivityInform",ActivityInform);
        request.setAttribute("clubInform",clubInform);
        request.setAttribute("unionInform",unionInform);

        return "SortingTheUrl/infoManagement";
    }

    /**
     * 处理首页点击建筑工程页面时请求
     * @return
     */
    @RequestMapping("/architecturalEngineering")
    public String architecturalEngineering(HttpServletRequest request){

        //获取活动通知信息
        List<branchInform> activityInform = sortingTheUrlService.queryEngineeringActivityInform();
        //获取社团通知信息
        List<branchInform> clubInform = sortingTheUrlService.queryEngineeringClubInform();
        //获取学生会通知信息
        List<branchInform> unionInform = sortingTheUrlService.queryEngineeringUnionInform();

        //出入request域对象中

        request.setAttribute("ActivityInform",activityInform);
        request.setAttribute("clubInform",clubInform);
        request.setAttribute("unionInform",unionInform);



        return "SortingTheUrl/architecturalEngineering";
    }

    /**
     * 处理首页点击建筑设计页面时请求
     * @return
     */
    @RequestMapping("/buildingDesign")
    public String buildingDesign(HttpServletRequest request){

        //获取活动通知信息
        List<branchInform> activityInform = sortingTheUrlService.queryDesignActivityInform();
        //获取社团通知信息
        List<branchInform> clubInform = sortingTheUrlService.queryDesignClubInform();
        //获取学生会通知信息
        List<branchInform> unionInform = sortingTheUrlService.queryDesignUnionInform();

        //出入request域对象中

        request.setAttribute("ActivityInform",activityInform);
        request.setAttribute("clubInform",clubInform);
        request.setAttribute("unionInform",unionInform);


        return "SortingTheUrl/buildingDesign";
    }

    /**
     * 处理首页点击建筑设备页面时请求
     * @return
     */
    @RequestMapping("/architecturalEquipment")
    public String architecturalEquipment(HttpServletRequest request){


        //获取活动通知信息
        List<branchInform> activityInform = sortingTheUrlService.queryEquipmentActivityInform();
        //获取社团通知信息
        List<branchInform> clubInform = sortingTheUrlService.queryEquipmentClubInform();
        //获取学生会通知信息
        List<branchInform> unionInform = sortingTheUrlService.queryEquipmentUnionInform();

        //出入request域对象中

        request.setAttribute("ActivityInform",activityInform);
        request.setAttribute("clubInform",clubInform);
        request.setAttribute("unionInform",unionInform);


        return "SortingTheUrl/architecturalEquipment";
    }

}
