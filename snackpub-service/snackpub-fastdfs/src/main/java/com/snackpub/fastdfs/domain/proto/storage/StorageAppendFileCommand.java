package com.snackpub.fastdfs.domain.proto.storage;

import com.snackpub.fastdfs.domain.proto.AbstractFdfsCommand;
import com.snackpub.fastdfs.domain.proto.FdfsResponse;
import com.snackpub.fastdfs.domain.proto.storage.internal.StorageAppendFileRequest;

import java.io.InputStream;

/**
 * 添加文件命令
 *
 * @author tobato
 */
public class StorageAppendFileCommand extends AbstractFdfsCommand<Void> {

    public StorageAppendFileCommand(InputStream inputStream, long fileSize, String path) {
        this.request = new StorageAppendFileRequest(inputStream, fileSize, path);
        // 输出响应
        this.response = new FdfsResponse<Void>() {
            // default response
        };
    }

}
