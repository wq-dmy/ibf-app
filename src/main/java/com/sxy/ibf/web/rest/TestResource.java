package com.sxy.ibf.web.rest;

import com.alibaba.fastjson.JSON;
import com.sxy.ibf.repository.mapper.SibeOtaMapper;

import com.sxy.ibf.security.oauth2.OAuth2AuthenticationNew;
import com.sxy.ibf.security.oauth2.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * @Description
 * @Author sxydmy
 * @Date 2020/5/14
 **/
@RestController
public class TestResource {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    SibeOtaMapper sibeOtaMapper;

    @GetMapping("/api/test")
    public String test(){

        return JSON.toJSONString(sibeOtaMapper.selectByMap(null));
    }

    @RequestMapping(value = "/api/user" ,method = {RequestMethod.GET,RequestMethod.POST})
    public String user(){
        OAuth2AuthenticationNew auth2AuthenticationNew = SecurityUtils.getAuthentication();

        if(auth2AuthenticationNew != null){

            logger.info("xing=" + auth2AuthenticationNew.getXing());
            logger.info("user=" + auth2AuthenticationNew.getUserAuthentication().getPrincipal());
            auth2AuthenticationNew.getAuthorities().stream().forEach((a)->{
                logger.info("Authority:"+a.getAuthority());
            });
            return auth2AuthenticationNew.getXing();
        }else {
            logger.warn("无用户登录信息！");
            return "无用户登录信息！";
        }

    }
}
