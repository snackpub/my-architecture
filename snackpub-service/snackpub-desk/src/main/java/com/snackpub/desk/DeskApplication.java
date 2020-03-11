package com.snackpub.desk;

import com.snackpub.core.launch.SnackPubApplication;
import com.snackpub.core.launch.constant.AppConstant;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Desk启动器
 *
 * @author Chill
 */
@SpringCloudApplication
@EnableFeignClients(AppConstant.BASE_PACKAGES)
public class DeskApplication {

    public static void main(String[] args) {
        SnackPubApplication.run(AppConstant.APPLICATION_DESK_NAME, DeskApplication.class, args);
    }

}
