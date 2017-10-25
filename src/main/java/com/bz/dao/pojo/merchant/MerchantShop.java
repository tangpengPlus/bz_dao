package com.bz.dao.pojo.merchant;

import com.bz.framework.pojo.base.BasePojo;
import java.util.Date;

/**
	* 作者:唐鹏
	* 描述:
	* 版本: version 1.0.0
	* 时间:2017-10-18 17:20:25
  */
public class MerchantShop extends BasePojo {
    /**
     * 店铺ID
     * 表字段 : merchant_shop.id
     */
    private Integer id;

    /**
     * 商铺编号
     * 表字段 : merchant_shop.number
     */
    private String number;

    /**
     * 店铺名称
     * 表字段 : merchant_shop.name
     */
    private String name;

    /**
     * 营业执照图片
     * 表字段 : merchant_shop.licenseImage
     */
    private String licenseimage;

    /**
     * 省级编码
     * 表字段 : merchant_shop.provinceLeveCode
     */
    private String provincelevecode;

    /**
     * 市级编码
     * 表字段 : merchant_shop.cityLeveCode
     */
    private String citylevecode;

    /**
     * 区域编码
     * 表字段 : merchant_shop.regionLeveCode
     */
    private String regionlevecode;

    /**
     * 详细地址
     * 表字段 : merchant_shop.detailAddress
     */
    private String detailaddress;

    /**
     * 店铺经纬度
     * 表字段 : merchant_shop.coordinate
     */
    private String coordinate;

    /**
     * 所属银行
     * 表字段 : merchant_shop.bankName
     */
    private String bankname;

    /**
     * 
     * 表字段 : merchant_shop.bankCard
     */
    private String bankcard;

    /**
     * 店铺电话
     * 表字段 : merchant_shop.phone
     */
    private String phone;

    /**
     * 店铺注册时使用微信ID
     * 表字段 : merchant_shop.weChatOpenId
     */
    private String wechatopenid;

    /**
     * 所属商户ID
     * 表字段 : merchant_shop.belongMerchantId
     */
    private Integer belongmerchantid;

    /**
     * 审核状态；0：待审核；1：审核成功;2：审核失败
     * 表字段 : merchant_shop.isVerify
     */
    private Integer isverify;

    /**
     * 上线状态;0:未上线;1::已经上线;2:已经下线
     * 表字段 : merchant_shop.onlineState
     */
    private Integer onlinestate;

    /**
     * 审核备注
     * 表字段 : merchant_shop.verifyRemark
     */
    private String verifyremark;

    /**
     * 审核人
     * 表字段 : merchant_shop.verifyAdmin
     */
    private Integer verifyadmin;

    /**
     * 审核时间
     * 表字段 : merchant_shop.verifyTime
     */
    private Date verifytime;

    /**
     * 店铺门面图片
     * 表字段 : merchant_shop.shopFacade
Image
     */
    private String shopfacadeimage;

    /**
     * 店铺实拍
     * 表字段 : merchant_shop.shopDetailImage
     */
    private String shopdetailimage;

    /**
     * 合作类型:1:扫码支付；2：线上开店；3线上线下共存
     * 表字段 : merchant_shop.cooperationType
     */
    private Integer cooperationtype;

    /**
     * 行业父类
     * 表字段 : merchant_shop.industryParent
     */
    private Integer industryparent;

    /**
     * 行业子类
     * 表字段 : merchant_shop.industrySubclass
     */
    private Integer industrysubclass;

    /**
     * 创建时间
     * 表字段 : merchant_shop.createTime
     */
    private Date createtime;

    /**
     * 0:保留;1:删除
     * 表字段 : merchant_shop.isDelete
     */
    private Integer isdelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table merchant_shop
     *
     * @mbg.generated Wed Oct 18 17:20:25 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 店铺ID 字段:merchant_shop.id
     *
     * @return merchant_shop.id, 店铺ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 店铺ID 字段:merchant_shop.id
     *
     * @param id the value for merchant_shop.id, 店铺ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 商铺编号 字段:merchant_shop.number
     *
     * @return merchant_shop.number, 商铺编号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置 商铺编号 字段:merchant_shop.number
     *
     * @param number the value for merchant_shop.number, 商铺编号
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 获取 店铺名称 字段:merchant_shop.name
     *
     * @return merchant_shop.name, 店铺名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 店铺名称 字段:merchant_shop.name
     *
     * @param name the value for merchant_shop.name, 店铺名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 营业执照图片 字段:merchant_shop.licenseImage
     *
     * @return merchant_shop.licenseImage, 营业执照图片
     */
    public String getLicenseimage() {
        return licenseimage;
    }

    /**
     * 设置 营业执照图片 字段:merchant_shop.licenseImage
     *
     * @param licenseimage the value for merchant_shop.licenseImage, 营业执照图片
     */
    public void setLicenseimage(String licenseimage) {
        this.licenseimage = licenseimage == null ? null : licenseimage.trim();
    }

    /**
     * 获取 省级编码 字段:merchant_shop.provinceLeveCode
     *
     * @return merchant_shop.provinceLeveCode, 省级编码
     */
    public String getProvincelevecode() {
        return provincelevecode;
    }

    /**
     * 设置 省级编码 字段:merchant_shop.provinceLeveCode
     *
     * @param provincelevecode the value for merchant_shop.provinceLeveCode, 省级编码
     */
    public void setProvincelevecode(String provincelevecode) {
        this.provincelevecode = provincelevecode == null ? null : provincelevecode.trim();
    }

    /**
     * 获取 市级编码 字段:merchant_shop.cityLeveCode
     *
     * @return merchant_shop.cityLeveCode, 市级编码
     */
    public String getCitylevecode() {
        return citylevecode;
    }

    /**
     * 设置 市级编码 字段:merchant_shop.cityLeveCode
     *
     * @param citylevecode the value for merchant_shop.cityLeveCode, 市级编码
     */
    public void setCitylevecode(String citylevecode) {
        this.citylevecode = citylevecode == null ? null : citylevecode.trim();
    }

    /**
     * 获取 区域编码 字段:merchant_shop.regionLeveCode
     *
     * @return merchant_shop.regionLeveCode, 区域编码
     */
    public String getRegionlevecode() {
        return regionlevecode;
    }

    /**
     * 设置 区域编码 字段:merchant_shop.regionLeveCode
     *
     * @param regionlevecode the value for merchant_shop.regionLeveCode, 区域编码
     */
    public void setRegionlevecode(String regionlevecode) {
        this.regionlevecode = regionlevecode == null ? null : regionlevecode.trim();
    }

    /**
     * 获取 详细地址 字段:merchant_shop.detailAddress
     *
     * @return merchant_shop.detailAddress, 详细地址
     */
    public String getDetailaddress() {
        return detailaddress;
    }

    /**
     * 设置 详细地址 字段:merchant_shop.detailAddress
     *
     * @param detailaddress the value for merchant_shop.detailAddress, 详细地址
     */
    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    /**
     * 获取 店铺经纬度 字段:merchant_shop.coordinate
     *
     * @return merchant_shop.coordinate, 店铺经纬度
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 设置 店铺经纬度 字段:merchant_shop.coordinate
     *
     * @param coordinate the value for merchant_shop.coordinate, 店铺经纬度
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

    /**
     * 获取 所属银行 字段:merchant_shop.bankName
     *
     * @return merchant_shop.bankName, 所属银行
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 设置 所属银行 字段:merchant_shop.bankName
     *
     * @param bankname the value for merchant_shop.bankName, 所属银行
     */
    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    /**
     * 获取  字段:merchant_shop.bankCard
     *
     * @return merchant_shop.bankCard, 
     */
    public String getBankcard() {
        return bankcard;
    }

    /**
     * 设置  字段:merchant_shop.bankCard
     *
     * @param bankcard the value for merchant_shop.bankCard, 
     */
    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    /**
     * 获取 店铺电话 字段:merchant_shop.phone
     *
     * @return merchant_shop.phone, 店铺电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置 店铺电话 字段:merchant_shop.phone
     *
     * @param phone the value for merchant_shop.phone, 店铺电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取 店铺注册时使用微信ID 字段:merchant_shop.weChatOpenId
     *
     * @return merchant_shop.weChatOpenId, 店铺注册时使用微信ID
     */
    public String getWechatopenid() {
        return wechatopenid;
    }

    /**
     * 设置 店铺注册时使用微信ID 字段:merchant_shop.weChatOpenId
     *
     * @param wechatopenid the value for merchant_shop.weChatOpenId, 店铺注册时使用微信ID
     */
    public void setWechatopenid(String wechatopenid) {
        this.wechatopenid = wechatopenid == null ? null : wechatopenid.trim();
    }

    /**
     * 获取 所属商户ID 字段:merchant_shop.belongMerchantId
     *
     * @return merchant_shop.belongMerchantId, 所属商户ID
     */
    public Integer getBelongmerchantid() {
        return belongmerchantid;
    }

    /**
     * 设置 所属商户ID 字段:merchant_shop.belongMerchantId
     *
     * @param belongmerchantid the value for merchant_shop.belongMerchantId, 所属商户ID
     */
    public void setBelongmerchantid(Integer belongmerchantid) {
        this.belongmerchantid = belongmerchantid;
    }

    /**
     * 获取 审核状态；0：待审核；1：审核成功;2：审核失败 字段:merchant_shop.isVerify
     *
     * @return merchant_shop.isVerify, 审核状态；0：待审核；1：审核成功;2：审核失败
     */
    public Integer getIsverify() {
        return isverify;
    }

    /**
     * 设置 审核状态；0：待审核；1：审核成功;2：审核失败 字段:merchant_shop.isVerify
     *
     * @param isverify the value for merchant_shop.isVerify, 审核状态；0：待审核；1：审核成功;2：审核失败
     */
    public void setIsverify(Integer isverify) {
        this.isverify = isverify;
    }

    /**
     * 获取 上线状态;0:未上线;1::已经上线;2:已经下线 字段:merchant_shop.onlineState
     *
     * @return merchant_shop.onlineState, 上线状态;0:未上线;1::已经上线;2:已经下线
     */
    public Integer getOnlinestate() {
        return onlinestate;
    }

    /**
     * 设置 上线状态;0:未上线;1::已经上线;2:已经下线 字段:merchant_shop.onlineState
     *
     * @param onlinestate the value for merchant_shop.onlineState, 上线状态;0:未上线;1::已经上线;2:已经下线
     */
    public void setOnlinestate(Integer onlinestate) {
        this.onlinestate = onlinestate;
    }

    /**
     * 获取 审核备注 字段:merchant_shop.verifyRemark
     *
     * @return merchant_shop.verifyRemark, 审核备注
     */
    public String getVerifyremark() {
        return verifyremark;
    }

    /**
     * 设置 审核备注 字段:merchant_shop.verifyRemark
     *
     * @param verifyremark the value for merchant_shop.verifyRemark, 审核备注
     */
    public void setVerifyremark(String verifyremark) {
        this.verifyremark = verifyremark == null ? null : verifyremark.trim();
    }

    /**
     * 获取 审核人 字段:merchant_shop.verifyAdmin
     *
     * @return merchant_shop.verifyAdmin, 审核人
     */
    public Integer getVerifyadmin() {
        return verifyadmin;
    }

    /**
     * 设置 审核人 字段:merchant_shop.verifyAdmin
     *
     * @param verifyadmin the value for merchant_shop.verifyAdmin, 审核人
     */
    public void setVerifyadmin(Integer verifyadmin) {
        this.verifyadmin = verifyadmin;
    }

    /**
     * 获取 审核时间 字段:merchant_shop.verifyTime
     *
     * @return merchant_shop.verifyTime, 审核时间
     */
    public Date getVerifytime() {
        return verifytime;
    }

    /**
     * 设置 审核时间 字段:merchant_shop.verifyTime
     *
     * @param verifytime the value for merchant_shop.verifyTime, 审核时间
     */
    public void setVerifytime(Date verifytime) {
        this.verifytime = verifytime;
    }

    /**
     * 获取 店铺门面图片 字段:merchant_shop.shopFacade
Image
     *
     * @return merchant_shop.shopFacade
Image, 店铺门面图片
     */
    public String getShopfacadeimage() {
        return shopfacadeimage;
    }

    /**
     * 设置 店铺门面图片 字段:merchant_shop.shopFacade
Image
     *
     * @param shopfacade
image the value for merchant_shop.shopFacade
Image, 店铺门面图片
     */
    public void setShopfacadeimage(String shopfacadeimage) {
        this.shopfacadeimage = shopfacadeimage == null ? null : shopfacadeimage.trim();
    }

    /**
     * 获取 店铺实拍 字段:merchant_shop.shopDetailImage
     *
     * @return merchant_shop.shopDetailImage, 店铺实拍
     */
    public String getShopdetailimage() {
        return shopdetailimage;
    }

    /**
     * 设置 店铺实拍 字段:merchant_shop.shopDetailImage
     *
     * @param shopdetailimage the value for merchant_shop.shopDetailImage, 店铺实拍
     */
    public void setShopdetailimage(String shopdetailimage) {
        this.shopdetailimage = shopdetailimage == null ? null : shopdetailimage.trim();
    }

    /**
     * 获取 合作类型:1:扫码支付；2：线上开店；3线上线下共存 字段:merchant_shop.cooperationType
     *
     * @return merchant_shop.cooperationType, 合作类型:1:扫码支付；2：线上开店；3线上线下共存
     */
    public Integer getCooperationtype() {
        return cooperationtype;
    }

    /**
     * 设置 合作类型:1:扫码支付；2：线上开店；3线上线下共存 字段:merchant_shop.cooperationType
     *
     * @param cooperationtype the value for merchant_shop.cooperationType, 合作类型:1:扫码支付；2：线上开店；3线上线下共存
     */
    public void setCooperationtype(Integer cooperationtype) {
        this.cooperationtype = cooperationtype;
    }

    /**
     * 获取 行业父类 字段:merchant_shop.industryParent
     *
     * @return merchant_shop.industryParent, 行业父类
     */
    public Integer getIndustryparent() {
        return industryparent;
    }

    /**
     * 设置 行业父类 字段:merchant_shop.industryParent
     *
     * @param industryparent the value for merchant_shop.industryParent, 行业父类
     */
    public void setIndustryparent(Integer industryparent) {
        this.industryparent = industryparent;
    }

    /**
     * 获取 行业子类 字段:merchant_shop.industrySubclass
     *
     * @return merchant_shop.industrySubclass, 行业子类
     */
    public Integer getIndustrysubclass() {
        return industrysubclass;
    }

    /**
     * 设置 行业子类 字段:merchant_shop.industrySubclass
     *
     * @param industrysubclass the value for merchant_shop.industrySubclass, 行业子类
     */
    public void setIndustrysubclass(Integer industrysubclass) {
        this.industrysubclass = industrysubclass;
    }

    /**
     * 获取 创建时间 字段:merchant_shop.createTime
     *
     * @return merchant_shop.createTime, 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置 创建时间 字段:merchant_shop.createTime
     *
     * @param createtime the value for merchant_shop.createTime, 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取 0:保留;1:删除 字段:merchant_shop.isDelete
     *
     * @return merchant_shop.isDelete, 0:保留;1:删除
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * 设置 0:保留;1:删除 字段:merchant_shop.isDelete
     *
     * @param isdelete the value for merchant_shop.isDelete, 0:保留;1:删除
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}