package com.example.demo.redis;

public enum OrderState {

    JOIN_FAILED(-5), // 参团失败, 已退款
    AUDIT_FAILED(-4), // 审核未通过, 已退款
    NOT_ENOUGH(-3), // 人数未达到, 已退款
    REFUNDING(-2), // 人数未达到,退款中
    EXPIRED(-1), // 过期
    PAYING(0), // 待付款
//    DELIVERING(1), // 待发货
//    COMBINING(1), // 待拼团
    SHARING(1), // 待分享
    AUDITING(2), // 待审核
    RECEIPTING(3), // 待收货
    EVALUATING(4), // 待评价
    COMPLETED(5); // 已完成

    private int code;

    OrderState(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
