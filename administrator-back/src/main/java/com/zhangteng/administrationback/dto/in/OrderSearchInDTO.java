package com.zhangteng.administrationback.dto.in;

/**
 * ClassName: OrderSearchInDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 18:07<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class OrderSearchInDTO {
    private Long orderId;
    private String customerName;
    private Byte status;
    private Double totalPrice;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
