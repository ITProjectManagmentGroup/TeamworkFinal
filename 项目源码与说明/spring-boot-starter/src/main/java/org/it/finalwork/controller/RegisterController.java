package org.it.finalwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisterController {
    static public Map<String, String> userdb = new HashMap<String, String>();

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    //@ResponseBody
    public String register(@RequestParam("netid") String netid,
                           @RequestParam("password") String password,
                           Map<String,Object> map) throws Exception {
        if (userdb != null && userdb.containsKey(netid)) {
            map.put("msg", "已有相同用户名,请重新注册");
            return "register";
        } else {
            userdb.put(netid, password);
            //注册成功转到登录页面
            map.put("msg", "注册成功,请登陆");
            System.out.println(netid+" 注册成功++++++++++++++");
            return "login";
        }
    }
}
