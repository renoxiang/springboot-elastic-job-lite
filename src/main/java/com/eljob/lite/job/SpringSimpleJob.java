package com.eljob.lite.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.eljob.lite.domain.User;
import com.eljob.lite.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by xy on 2017/7/14.
 */
public class SpringSimpleJob implements SimpleJob {

    @Resource
    private UserService userService;
    public static final Logger logger = LoggerFactory.getLogger(SpringSimpleJob.class);

    @Override
    public void execute(ShardingContext shardingContext) {
        int parameter = shardingContext.getShardingItem();
        User user;
        switch (parameter){
            case 0:
                user = userService.getById(1L);
                logger.debug(user.getUsername()+"===============1");
                break;
            case 1:
                user = userService.getById(2L);
                logger.debug(user.getUsername()+"===============2");
                break;
            case 2:
                user = userService.getById(3L);
                logger.debug(user.getUsername()+"===============3");
                break;
            default:break;
        }
    }
}
