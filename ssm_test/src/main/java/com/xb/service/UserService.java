package com.xb.service;

import com.xb.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public List<User> getUser();

}
