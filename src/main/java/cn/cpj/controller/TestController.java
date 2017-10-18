package cn.cpj.controller;

import cn.cpj.dao.UserDao;
import cn.cpj.model.User;
import cn.cpj.service.UserService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

/**
 * Created by ye on 2017/10/17
 */
@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @GetMapping("/sql")
    public Object sql() {
        User user = userDao.findByEmail("893820248@qq.com");
        logger.info(user.getEmail());
        return JSON.toJSON(user);
    }

    @GetMapping("/sql2")
    public List<Map<String, Object>> sql2() {
        return userService.getUser();
    }
}
