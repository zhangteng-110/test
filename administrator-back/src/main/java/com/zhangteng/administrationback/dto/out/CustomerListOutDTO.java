package com.zhangteng.administrationback.dto.out;

/**
 * ClassName: CustomerListOutDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 17:56<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class CustomerListOutDTO {
    private Integer customerId;
    private String username;
    private String realName;
    private String mobile;
    private String email;
    private Byte status;
    private Long createTimestamp;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}
