package com.example.rtm.Services;

import com.example.rtm.Models.SE;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SEService {

    List<SE> getSE();
}
