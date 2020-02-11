package com.snackpub.fastdfs.domain.proto.tracker;


import com.snackpub.fastdfs.domain.fdfs.GroupState;
import com.snackpub.fastdfs.domain.proto.AbstractFdfsCommand;
import com.snackpub.fastdfs.domain.proto.tracker.internal.TrackerListGroupsRequest;
import com.snackpub.fastdfs.domain.proto.tracker.internal.TrackerListGroupsResponse;

import java.util.List;

/**
 * 列出组命令
 *
 * @author tobato
 */
public class TrackerListGroupsCommand extends AbstractFdfsCommand<List<GroupState>> {

    public TrackerListGroupsCommand() {
        super.request = new TrackerListGroupsRequest();
        super.response = new TrackerListGroupsResponse();
    }

}
