package com.zhangteng.administrationback.dto.out;

/**
 * ClassName: OrderListOutDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 18:04<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class OrderListOutDTO {
    private Long orderId;
    private Integer customerId;
    private String customerName;
    private Byte status;
    private Double totalPirce;
    private Long createTimestamp;
    private Long updateTimestamp;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Double getTotalPirce() {
        return totalPirce;
    }

    public void setTotalPirce(Double totalPirce) {
        this.totalPirce = totalPirce;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Long getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}
