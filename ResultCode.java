package com.example.demo;

public enum ResultCode {

  SUCCESS(1000, "成功"),
  FAIL(1001, "失败"),
  ERROR(1002, "错误"),
  EXCEPTION(1003, "异常");

  private Integer code;

  private String message;

  ResultCode(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  public Integer code() {
    return this.code;
  }

  public String message() {
    return this.message;
  }

  public static String getMessage(String name) {
    for (ResultCode item : ResultCode.values()) {
      if (item.name().equals(name)) {
        return item.message;
      }
    }
    return name;
  }

  public static Integer getCode(String name) {
    for (ResultCode item : ResultCode.values()) {
      if (item.name().equals(name)) {
        return item.code;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return this.name();
  }
}
