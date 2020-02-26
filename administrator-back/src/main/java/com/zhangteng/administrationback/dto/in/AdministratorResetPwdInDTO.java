package com.zhangteng.administrationback.dto.in;

/**
 * ClassName: AdministratorResetPwdInDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 17:01<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class AdministratorResetPwdInDTO {
    private String email;
    private String resetCode;
    private String newPwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResetCode() {
        return resetCode;
    }

    public void setResetCode(String resetCode) {
        this.resetCode = resetCode;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }
}
