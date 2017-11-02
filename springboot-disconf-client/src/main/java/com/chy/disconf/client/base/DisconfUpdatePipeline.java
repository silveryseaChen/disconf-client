package com.chy.disconf.client.base;

import com.baidu.disconf.client.common.update.IDisconfUpdatePipeline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by chy on 2017/10/19.
 * disconf 配置自动更新回调
 */
@Service
public class DisconfUpdatePipeline implements IDisconfUpdatePipeline{

    private static final Logger LOGGER = LoggerFactory.getLogger(DisconfUpdatePipeline.class);

    @Override
    public void reloadDisconfFile(String s, String s1) throws Exception {
        LOGGER.info("============ disconf file {} udpate ============", s);
    }

    @Override
    public void reloadDisconfItem(String s, Object o) throws Exception {
        LOGGER.info("============ disconf item {} udpate ============", s);
    }

}
