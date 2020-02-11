package com.snackpub.fastdfs.domain.proto.tracker;


import com.snackpub.fastdfs.domain.fdfs.StorageState;
import com.snackpub.fastdfs.domain.proto.AbstractFdfsCommand;
import com.snackpub.fastdfs.domain.proto.tracker.internal.TrackerListStoragesRequest;
import com.snackpub.fastdfs.domain.proto.tracker.internal.TrackerListStoragesResponse;

import java.util.List;

/**
 * 列出组命令
 *
 * @author tobato
 */
public class TrackerListStoragesCommand extends AbstractFdfsCommand<List<StorageState>> {

    public TrackerListStoragesCommand(String groupName, String storageIpAddr) {
        super.request = new TrackerListStoragesRequest(groupName, storageIpAddr);
        super.response = new TrackerListStoragesResponse();
    }

    public TrackerListStoragesCommand(String groupName) {
        super.request = new TrackerListStoragesRequest(groupName);
        super.response = new TrackerListStoragesResponse();
    }

}
