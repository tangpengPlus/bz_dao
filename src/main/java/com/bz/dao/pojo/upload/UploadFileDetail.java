package com.bz.dao.pojo.upload;

import com.bz.framework.pojo.base.BasePojo;
import java.util.Date;

/**
	* 作者:唐鹏
	* 描述:
	* 版本: version 1.0.0
	* 时间:2017-09-30 16:58:26
  */
public class UploadFileDetail extends BasePojo {
    /**
     * Id
     * 表字段 : system_upload_file_detail.id
     */
    private Long id;

    /**
     * 上传文件Id
     * 表字段 : system_upload_file_detail.uploadFileId
     */
    private Long uploadfileid;

    /**
     * 文件尺寸规格
     * 表字段 : system_upload_file_detail.fileFormat
     */
    private Integer fileformat;

    /**
     * 服务地址
     * 表字段 : system_upload_file_detail.serverUrl
     */
    private String serverurl;

    /**
     * 文件大小(字节)
     * 表字段 : system_upload_file_detail.size
     */
    private Long size;

    /**
     * 文件地址
     * 表字段 : system_upload_file_detail.fileUrl
     */
    private String fileurl;

    /**
     * 文件扩展名
     * 表字段 : system_upload_file_detail.extName
     */
    private String extname;

    /**
     * 是否删除：0未删除；1已删除
     * 表字段 : system_upload_file_detail.isDelete
     */
    private Byte isdelete;

    /**
     * 创建时间
     * 表字段 : system_upload_file_detail.createTime
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_upload_file_detail
     *
     * @mbg.generated Sat Sep 30 16:58:26 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 Id 字段:system_upload_file_detail.id
     *
     * @return system_upload_file_detail.id, Id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 Id 字段:system_upload_file_detail.id
     *
     * @param id the value for system_upload_file_detail.id, Id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 上传文件Id 字段:system_upload_file_detail.uploadFileId
     *
     * @return system_upload_file_detail.uploadFileId, 上传文件Id
     */
    public Long getUploadfileid() {
        return uploadfileid;
    }

    /**
     * 设置 上传文件Id 字段:system_upload_file_detail.uploadFileId
     *
     * @param uploadfileid the value for system_upload_file_detail.uploadFileId, 上传文件Id
     */
    public void setUploadfileid(Long uploadfileid) {
        this.uploadfileid = uploadfileid;
    }

    /**
     * 获取 文件尺寸规格 字段:system_upload_file_detail.fileFormat
     *
     * @return system_upload_file_detail.fileFormat, 文件尺寸规格
     */
    public Integer getFileformat() {
        return fileformat;
    }

    /**
     * 设置 文件尺寸规格 字段:system_upload_file_detail.fileFormat
     *
     * @param fileformat the value for system_upload_file_detail.fileFormat, 文件尺寸规格
     */
    public void setFileformat(Integer fileformat) {
        this.fileformat = fileformat;
    }

    /**
     * 获取 服务地址 字段:system_upload_file_detail.serverUrl
     *
     * @return system_upload_file_detail.serverUrl, 服务地址
     */
    public String getServerurl() {
        return serverurl;
    }

    /**
     * 设置 服务地址 字段:system_upload_file_detail.serverUrl
     *
     * @param serverurl the value for system_upload_file_detail.serverUrl, 服务地址
     */
    public void setServerurl(String serverurl) {
        this.serverurl = serverurl == null ? null : serverurl.trim();
    }

    /**
     * 获取 文件大小(字节) 字段:system_upload_file_detail.size
     *
     * @return system_upload_file_detail.size, 文件大小(字节)
     */
    public Long getSize() {
        return size;
    }

    /**
     * 设置 文件大小(字节) 字段:system_upload_file_detail.size
     *
     * @param size the value for system_upload_file_detail.size, 文件大小(字节)
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * 获取 文件地址 字段:system_upload_file_detail.fileUrl
     *
     * @return system_upload_file_detail.fileUrl, 文件地址
     */
    public String getFileurl() {
        return fileurl;
    }

    /**
     * 设置 文件地址 字段:system_upload_file_detail.fileUrl
     *
     * @param fileurl the value for system_upload_file_detail.fileUrl, 文件地址
     */
    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    /**
     * 获取 文件扩展名 字段:system_upload_file_detail.extName
     *
     * @return system_upload_file_detail.extName, 文件扩展名
     */
    public String getExtname() {
        return extname;
    }

    /**
     * 设置 文件扩展名 字段:system_upload_file_detail.extName
     *
     * @param extname the value for system_upload_file_detail.extName, 文件扩展名
     */
    public void setExtname(String extname) {
        this.extname = extname == null ? null : extname.trim();
    }

    /**
     * 获取 是否删除：0未删除；1已删除 字段:system_upload_file_detail.isDelete
     *
     * @return system_upload_file_detail.isDelete, 是否删除：0未删除；1已删除
     */
    public Byte getIsdelete() {
        return isdelete;
    }

    /**
     * 设置 是否删除：0未删除；1已删除 字段:system_upload_file_detail.isDelete
     *
     * @param isdelete the value for system_upload_file_detail.isDelete, 是否删除：0未删除；1已删除
     */
    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 获取 创建时间 字段:system_upload_file_detail.createTime
     *
     * @return system_upload_file_detail.createTime, 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置 创建时间 字段:system_upload_file_detail.createTime
     *
     * @param createtime the value for system_upload_file_detail.createTime, 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}