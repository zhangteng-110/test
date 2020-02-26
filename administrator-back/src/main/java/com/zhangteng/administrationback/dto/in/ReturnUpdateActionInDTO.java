package com.zhangteng.administrationback.dto.in;

/**
 * ClassName: ReturnUpdateActionInDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 17:44<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class ReturnUpdateActionInDTO {
    private Integer returnId;
    private Byte action;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }
}
