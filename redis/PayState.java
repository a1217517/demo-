package com.example.demo.redis;

public enum PayState {

    FAILURE(-1), // 支付失败
    PENDING(0), // 未支付
    SUCCESS(1); // 已支付

    private int code;

    PayState(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
