package com.snackpub.fastdfs.domain.proto.tracker;


import com.snackpub.fastdfs.domain.fdfs.StorageNodeInfo;
import com.snackpub.fastdfs.domain.proto.AbstractFdfsCommand;
import com.snackpub.fastdfs.domain.proto.FdfsResponse;
import com.snackpub.fastdfs.domain.proto.tracker.internal.TrackerGetFetchStorageRequest;

/**
 * 获取源服务器
 *
 * @author tobato
 */
public class TrackerGetFetchStorageCommand extends AbstractFdfsCommand<StorageNodeInfo> {

    public TrackerGetFetchStorageCommand(String groupName, String path, boolean toUpdate) {
        super.request = new TrackerGetFetchStorageRequest(groupName, path, toUpdate);
        super.response = new FdfsResponse<StorageNodeInfo>() {
            // default response
        };
    }

}
