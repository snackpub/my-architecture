package com.snackpub.user;

import com.snackpub.core.launch.SnackPubApplication;
import com.snackpub.core.launch.constant.AppConstant;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务启动类
 *
 * @author snackpub
 */
@SpringCloudApplication
@EnableFeignClients(AppConstant.BASE_PACKAGES)
public class UserApplication {

    public static void main(String[] args) {
        SnackPubApplication.run(AppConstant.APPLICATION_USER_NAME, UserApplication.class, args);
    }

}
