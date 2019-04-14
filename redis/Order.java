package com.example.demo.redis;


import javax.persistence.*;


/**
 * The persistent class for the order database table.
 */
@Entity
@Table(name = "t_orders")
public class Order {

    @Id
    @Column(name = "order_id")
    private String orderId;

    private String transactionId; //微信交易id

    private String groupId;//团id

    private long commodityId;

    private String commodityName;

    private long varietyId;

    private String varietyTitle;

    private String guid;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String address;

    private int isNewUser = 0;

    private int orderState = OrderState.PAYING.code(); //订单状态

    private int payCoinState = PayState.PENDING.code(); //金币支付状态

    private int payAmountState = PayState.PENDING.code(); //现金支付状态

    private int coin;

    private int type; //订单类型，换购为1 端内发起拼单为2 端外支付为3

    private int amount;

    @Column(name = "logistics_company")
    private String logisticsCompany;

    @Column(name = "logistics_number")
    private String logisticsNumber;

    @Column(name = "logistics_phone")
    private String logisticsPhone;

    @Column(name = "valid_state")
    private int validState = 0;

    @Column(name = "create_time")
    private long createTime;

    @Column(name = "update_time")
    private long updateTime;

    @Transient
    private String commodityDesc;

    @Column(name = "buy_type")
    private int buyType ;

    @Column(name = "phone_user")
    private String phoneUser;

    //新下载检测 0:未检测 1:检测过
    @Column(name = "check_user_state")
    private int checkUserState=0;
    public Order() {
    }

    public Order(String orderId, String groupId, long commodityId, String commodityName, long varietyId, String varietyTitle, String guid, String nickname, String receiverName, String phoneNumber, String address, int type, int amount, long createTime) {
        this.orderId = orderId;
        this.groupId = groupId;
        this.commodityId = commodityId;
        this.varietyId = varietyId;
        this.varietyTitle = varietyTitle;
        this.commodityName = commodityName;
        this.guid = guid;
        this.nickname = nickname;
        this.receiverName = receiverName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.type = type;
        this.amount = amount;
        this.createTime = createTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsNewUser() {
        return isNewUser;
    }

    public void setIsNewUser(int isNewUser) {
        this.isNewUser = isNewUser;
    }

    public long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(long commodityId) {
        this.commodityId = commodityId;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getPayCoinState() {
        return payCoinState;
    }

    public void setPayCoinState(int payCoinState) {
        this.payCoinState = payCoinState;
    }

    public int getPayAmountState() {
        return payAmountState;
    }

    public void setPayAmountState(int payAmountState) {
        this.payAmountState = payAmountState;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    public void setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber;
    }

    public String getLogisticsPhone() {
        return logisticsPhone;
    }

    public void setLogisticsPhone(String logisticsPhone) {
        this.logisticsPhone = logisticsPhone;
    }

    public int getValidState() {
        return validState;
    }

    public void setValidState(int validState) {
        this.validState = validState;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public long getVarietyId() {
        return varietyId;
    }

    public void setVarietyId(long varietyId) {
        this.varietyId = varietyId;
    }

    public String getVarietyTitle() {
        return varietyTitle;
    }

    public void setVarietyTitle(String varietyTitle) {
        this.varietyTitle = varietyTitle;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCommodityDesc() {
        return commodityDesc;
    }

    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }

    public int getBuyType() {
        return buyType;
    }

    public void setBuyType(int buyType) {
        this.buyType = buyType;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public int getCheckUserState() {
        return checkUserState;
    }

    public void setCheckUserState(int checkUserState) {
        this.checkUserState = checkUserState;
    }
}