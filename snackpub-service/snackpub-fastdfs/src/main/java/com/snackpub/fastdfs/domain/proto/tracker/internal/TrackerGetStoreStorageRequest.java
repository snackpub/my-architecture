package com.snackpub.fastdfs.domain.proto.tracker.internal;

import com.snackpub.fastdfs.domain.proto.CmdConstants;
import com.snackpub.fastdfs.domain.proto.FdfsRequest;
import com.snackpub.fastdfs.domain.proto.ProtoHead;

/**
 * 获取存储节点请求
 *
 * @author tobato
 */
public class TrackerGetStoreStorageRequest extends FdfsRequest {

    private static final byte withoutGroupCmd = CmdConstants.TRACKER_PROTO_CMD_SERVICE_QUERY_STORE_WITHOUT_GROUP_ONE;

    /**
     * 获取存储节点
     */
    public TrackerGetStoreStorageRequest() {
        super();
        this.head = new ProtoHead(withoutGroupCmd);
    }

}
