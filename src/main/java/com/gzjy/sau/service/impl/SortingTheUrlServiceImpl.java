package com.gzjy.sau.service.impl;

import com.gzjy.sau.mapper.SortingTheUrlMapper;
import com.gzjy.sau.model.branchInform;
import com.gzjy.sau.service.SortingTheUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortingTheUrlServiceImpl implements SortingTheUrlService {

    //注入Mapper层对应对象
    @Autowired
    private SortingTheUrlMapper sortingTheUrlMapper;


    public List<branchInform> queryInfoActivityInform(){

        List<branchInform> branchInforms = sortingTheUrlMapper.queryInfoActivityInform();


        return  branchInforms;


    }

    @Override
    public List<branchInform> queryInfoClubInform() {

        List<branchInform> branchInforms = sortingTheUrlMapper.queryInfoClubInform();

        return branchInforms;
    }

    @Override
    public List<branchInform> queryInfoUnionInform() {

        List<branchInform> branchInforms = sortingTheUrlMapper.queryInfoUnionInform();

        return branchInforms;
    }

    //建筑工程

    @Override
    public List<branchInform> queryEngineeringActivityInform() {

        List<branchInform> activityInforms = sortingTheUrlMapper.queryEngineeringActivityInform();

        return activityInforms;
    }

    @Override
    public List<branchInform> queryEngineeringClubInform() {

        List<branchInform> clubInforms = sortingTheUrlMapper.queryEngineeringClubInform();

        return clubInforms;
    }

    @Override
    public List<branchInform> queryEngineeringUnionInform() {

        List<branchInform> unionInforms = sortingTheUrlMapper.queryEngineeringUnionInform();

        return unionInforms;
    }


    //建筑设备

    @Override
    public List<branchInform> queryEquipmentActivityInform() {

        List<branchInform> activityInforms = sortingTheUrlMapper.queryEquipmentActivityInform();

        return activityInforms;
    }

    @Override
    public List<branchInform> queryEquipmentClubInform() {

        List<branchInform> clubInforms = sortingTheUrlMapper.queryEquipmentClubInform();

        return clubInforms;
    }

    @Override
    public List<branchInform> queryEquipmentUnionInform() {

        List<branchInform> unionInforms = sortingTheUrlMapper.queryEquipmentUnionInform();

        return unionInforms;
    }


    //建筑设计

    @Override
    public List<branchInform> queryDesignActivityInform() {

        List<branchInform> activityInforms = sortingTheUrlMapper.queryDesignActivityInform();

        return activityInforms;
    }

    @Override
    public List<branchInform> queryDesignClubInform() {

        List<branchInform> clubInforms = sortingTheUrlMapper.queryDesignClubInform();

        return clubInforms;
    }

    @Override
    public List<branchInform> queryDesignUnionInform() {

        List<branchInform> unionInforms = sortingTheUrlMapper.queryDesignUnionInform();

        return unionInforms;
    }


}
