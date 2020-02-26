package com.zhangteng.administrationback.dto.in;

/**
 * ClassName: ReturnSearchInDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 17:40<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class ReturnSearchInDTO {
    private Integer returnId;
    private Long orderId;
    private String customerName;
    private String productCode;
    private String productName;
    private Byte status;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
