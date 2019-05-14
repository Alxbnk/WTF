package com.example.rtm.Repositories;

import com.example.rtm.Models.SE;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SERepo {

    List<SE> getSE();
}
