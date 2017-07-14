package com.df.water.dto;

/**
 * 首页banner, 数据传输对象
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public class BannerDTO {

    private String code;

    private String title;

    private String remark;

    private String image;

    private String url;

    private Integer showOrder;

    private Boolean show;

    private Boolean needLogin;

    private Boolean validFlag;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getNeedLogin() {
        return needLogin;
    }

    public void setNeedLogin(Boolean needLogin) {
        this.needLogin = needLogin;
    }

    public Boolean getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Boolean validFlag) {
        this.validFlag = validFlag;
    }
}
