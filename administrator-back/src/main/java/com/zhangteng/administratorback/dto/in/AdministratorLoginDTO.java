package com.zhangteng.administratorback.dto.in;

/**
 * ClassName: AdministratorLoginDTO <br/>
 * Description: <br/>
 * date: 2020/2/25 17:24<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class AdministratorLoginDTO {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
