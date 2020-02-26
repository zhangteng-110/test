package com.zhangteng.administrationback.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.ServletException;

/**
 * ClassName: ClientException <br/>
 * Description: <br/>
 * date: 2020/2/26 17:22<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ClientException extends ServletException {
    private String errCode;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public ClientException(String errMsg, String errCode) {
        super(errMsg);
        this.errCode = errCode;
    }
}
