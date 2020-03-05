package com.zhangteng.storeback.enumeration;

/**
 * ClassName: OrderStatus <br/>
 * Description: <br/>
 * date: 2020/3/5 18:04<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public enum OrderStatus {
    ToProcess,//待处理
    Processing,//处理中
    ToShip,//待发货
    Shipped,//已发货
    ToReceive,//待签收
    Received,//已签收
    ToPay,//待支付
    Paid,//已支付
    Cancel,//取消
    Denied,//拒收
    Completed,//订单已送达
    ToComment,//待评价
    Commented//已评价
}
