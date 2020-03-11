package com.snackpub.getaway;

import com.snackpub.core.launch.SnackPubApplication;
import com.snackpub.core.launch.constant.AppConstant;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 项目启动
 *
 * @author Chill
 */
@EnableHystrix
@EnableScheduling
@SpringCloudApplication
public class GateWayApplication {

    public static void main(String[] args) {
        SnackPubApplication.run(AppConstant.APPLICATION_GATEWAY_NAME, GateWayApplication.class, args);
    }
}

