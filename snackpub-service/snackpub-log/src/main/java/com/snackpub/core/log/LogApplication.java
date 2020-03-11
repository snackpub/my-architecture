package com.snackpub.core.log;

import com.snackpub.core.launch.SnackPubApplication;
import com.snackpub.core.launch.constant.AppConstant;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 日志启动程序
 *
 * @author snackpub
 */
@SpringCloudApplication
@EnableFeignClients(AppConstant.BASE_PACKAGES)
public class LogApplication {

    public static void main(String[] args) {
        SnackPubApplication.run(AppConstant.APPLICATION_LOG_NAME, LogApplication.class, args);
    }

}
