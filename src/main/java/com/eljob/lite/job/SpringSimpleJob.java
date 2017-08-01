package com.eljob.lite.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by xy on 2017/7/14.
 */
public class SpringSimpleJob implements SimpleJob {
    public static final Logger logger = LoggerFactory.getLogger(SpringSimpleJob.class);

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("in");
        int parameter = shardingContext.getShardingItem();
        switch (parameter){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:break;
        }
        System.out.println("out");
    }
}
