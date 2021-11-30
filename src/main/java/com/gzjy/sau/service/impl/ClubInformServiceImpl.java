package com.gzjy.sau.service.impl;

import com.gzjy.sau.mapper.ClubInformMapper;
import com.gzjy.sau.model.club;
import com.gzjy.sau.model.clubInform;
import com.gzjy.sau.service.clubInformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClubInformServiceImpl implements clubInformService {

    /**
     * 注入mapper层对象
     */
    @Autowired
    private ClubInformMapper clubInformMapper;

    /**
     * 查询社团活动通知
     * @return 返回clubInform类型List集合
     */
    @Override
    public List<clubInform> queryAll() {

        List<clubInform> clubInforms = clubInformMapper.queryAll();

        return clubInforms;
    }

    /**
     * 查询社团中心活动通知
     * @return
     */
    @Override
    public List<clubInform> queryClubActive() {

        List<clubInform> clubInforms = clubInformMapper.queryClubActive();

        return clubInforms;
    }

    /**
     * 查询社团中心招新通知
     * @return
     */
    @Override
    public List<clubInform> queryClubEnroll() {

        List<clubInform> clubInforms = clubInformMapper.queryClubEnroll();

        return clubInforms;
    }

    /**
     * 查询社团展示
     * @return
     */
    @Override
    public List<club> queryClubs() {

        List<club> clubs = clubInformMapper.queryClubs();

        return clubs;
    }
}
