package com.zhangteng.administrationback.dto.out;

/**
 * ClassName: ReturnHistoryListOutDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 17:48<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class ReturnHistoryListOutDTO {
    private Integer returnHistoryId;
    private Long timestamp;
    private Byte returnStatus;
    private String comment;
    private Boolean customerNotified;

    public Integer getReturnHistoryId() {
        return returnHistoryId;
    }

    public void setReturnHistoryId(Integer returnHistoryId) {
        this.returnHistoryId = returnHistoryId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Byte getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getCustomerNotified() {
        return customerNotified;
    }

    public void setCustomerNotified(Boolean customerNotified) {
        this.customerNotified = customerNotified;
    }
}
