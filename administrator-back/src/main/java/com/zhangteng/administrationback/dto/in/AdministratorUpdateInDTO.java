package com.zhangteng.administrationback.dto.in;

/**
 * ClassName: AdministratorUpdateInDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 17:14<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class AdministratorUpdateInDTO {
    private Integer administratorId;
    private String realName;
    private String password;
    private String email;
    private Byte status;
    private String avatarUrl;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
