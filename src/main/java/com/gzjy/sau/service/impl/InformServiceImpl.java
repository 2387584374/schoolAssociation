package com.gzjy.sau.service.impl;

import com.gzjy.sau.mapper.InformMapper;
import com.gzjy.sau.model.Inform;
import com.gzjy.sau.service.InformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformServiceImpl implements InformService {

    @Autowired
    private InformMapper informMapper;

    @Override
    public Inform informOne() {

        Inform inform = informMapper.informOne();

        return inform;
    }

    @Override
    public List<Inform> fadAll() {

        List<Inform> informs = informMapper.fadAll();

        return informs;
    }
}
