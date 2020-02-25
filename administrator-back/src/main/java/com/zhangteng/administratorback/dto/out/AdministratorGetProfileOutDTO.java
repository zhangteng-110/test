package com.zhangteng.administratorback.dto.out;

/**
 * ClassName: AdministratorGetProfileOutDTO <br/>
 * Description: <br/>
 * date: 2020/2/25 17:28<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class AdministratorGetProfileOutDTO {
    private Integer administratorId;
    private String username;
    private String realName;
    private String email;
    private String avatarUrl;
    private Byte status;
    private Long createTimestamp;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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
