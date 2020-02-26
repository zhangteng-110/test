package com.zhangteng.administrationback.dto.in;

/**
 * ClassName: ReturnHistoryCreateInDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 17:50<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class ReturnHistoryCreateInDTO {
    private Integer returnId;
    private Byte returnStatus;
    private Boolean customerNotifeid;
    private String comment;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Byte getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    public Boolean getCustomerNotifeid() {
        return customerNotifeid;
    }

    public void setCustomerNotifeid(Boolean customerNotifeid) {
        this.customerNotifeid = customerNotifeid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
