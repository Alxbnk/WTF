package com.example.rtm.Services;

import com.example.rtm.Models.SE;
import com.example.rtm.Repositories.SERepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SEServiceImpl implements SEService{

    @Autowired
    SERepo seRepo;

    @Override
    public List<SE> getSE(){
        return seRepo.getSE();
    }
}
