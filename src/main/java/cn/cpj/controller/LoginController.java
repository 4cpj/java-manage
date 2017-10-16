package cn.cpj.controller;

import cn.cpj.dao.UserDao;
import cn.cpj.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by ye on 2017/10/12
 */
@RestController
public class LoginController {
    Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    private UserDao userDao;

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }

    @RequestMapping("/login")
    public HashMap<String,Object> login(String username,String password) {
        HashMap<String,Object> map = new HashMap<>();
        User user = userDao.findUserByEmailAndPassword(username,password);
        logger.info(user.getNickname());
        if(user!=null) {
            map.put("returnFlag",true);
            map.put("returnMsg","登录成功");
            map.put("nickname",user.getNickname());
        }else{
            map.put("returnFlag",false);
            map.put("returnMsg","登录失败,密码或账号不正确");
        }

        return map;
    }
    @RequestMapping("/registry")
    public HashMap<String,Object> registry(HttpServletRequest request) {
        HashMap<String,Object> map = new HashMap<>();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String nickname = request.getParameter("nickname");
        if(phone==null || "".equals(phone)) {
            map.put("returnFlag",false);
            map.put("returnMsg","电话号码不能为空！");
            return map;
        }
        if(email!=null&&!"".equals(email)) {
            User user = userDao.findUserByEmail(email);
            if(user!=null) {
                map.put("returnFlag",false);
                map.put("returnMsg","该用户已存在！");
                return map;
            }else{
                User user1 = new User();
                user1.setEmail(email);
                user1.setPassword(password);
                user1.setPhone(phone);
                user1.setNickname(nickname);
                user1.setConcern(0);
                user1.setBeConcerned(0);
                user1.setRank(0);
                user1.setShowFlag(Byte.valueOf("0"));
                user1.setSex(Byte.valueOf("0"));
                user1.setCreateTime(new Timestamp(System.currentTimeMillis()));
                user1.setUpdateTime(new Timestamp(System.currentTimeMillis()));
                userDao.save(user1);
                map.put("returnFlag",true);
                map.put("returnMsg","注册成功");
            }
        }else if(email==null || "".equals(email)) {
            map.put("returnFlag",false);
            map.put("returnMsg","用户名不能为空!");
            return map;
        }
        return map;
    }

    @RequestMapping("/checkUsername")
    public HashMap<String,Object> checkUsername(HttpServletRequest request) {
        HashMap<String,Object> map = new HashMap<>();
        String email = request.getParameter("email");
        if(email!=null&&!"".equals(email)) {
            User user = userDao.findUserByEmail(email);
            if(user!=null) {
                map.put("returnFlag",false);
                map.put("returnMsg","该用户已存在！");
                return map;
            }else{
                map.put("returnFlag",true);
                map.put("returnMsg","该用户未注册!");
            }
        }else if(email==null || "".equals(email)) {
            map.put("returnFlag",false);
            map.put("returnMsg","用户名不能为空!");
            return map;
        }
        return map;
    }
}
