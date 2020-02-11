package com.snackpub.fastdfs.domain.proto;


import com.snackpub.fastdfs.domain.conn.Connection;

/**
 * Fdfs交易命令抽象
 *
 * @author tobato
 */
public interface FdfsCommand<T> {

    /**
     * 执行交易
     */
    public T execute(Connection conn);

}
