package com.chy.disconf.client.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by chy on 2017/10/20.
 */
@Service
@Scope("singleton")
@DisconfFile(filename = "config.properties")
public class Config  {

    private String logHome;
    private String appName;

    @DisconfFileItem(name = "logHome", associateField = "logHome")
    public String getLogHome() {
        return logHome;
    }

    public void setLogHome(String logHome) {
        this.logHome = logHome;
    }

    @DisconfFileItem(name = "appName", associateField = "appName")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

}