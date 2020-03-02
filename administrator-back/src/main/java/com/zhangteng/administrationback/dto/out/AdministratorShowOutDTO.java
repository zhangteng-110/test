package com.zhangteng.administrationback.dto.out;

/**
 * ClassName: AdministratorShowOutDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 17:10<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class AdministratorShowOutDTO {
    private Integer administratorId;
    private String username;
    private String email;
    private String realName;
    private String avatarUrl;
    private Byte status;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
