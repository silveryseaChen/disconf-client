package com.chy.disconf.client.controller;

import com.chy.disconf.client.config.Config;
import com.chy.disconf.client.domain.ConfigVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chy on 2017/8/10.
 */
@Controller
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);


    @Autowired
    private Config config;

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request){

        LOGGER.info(" index interface ....{}", request.getSession().getId());
        return "index";
    }

    @RequestMapping(value = "/config")
    @ResponseBody
    public ConfigVO config(){

        ConfigVO config1 = new ConfigVO();
        config1.setAppName(config.getAppName());
        config1.setLogHome(config.getLogHome());
        return config1;

    }

}
