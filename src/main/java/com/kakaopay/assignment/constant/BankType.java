package com.kakaopay.assignment.constant;

/**
 * @author doyoung hwang on 2019-07-28
 */
public enum BankType {

  HOUSE_FUND("주택도시기금", "01"),
  KUKMIN("국민은행", "02"),
  WOORI("우리은행", "03"),
  SHINHAN("신한은행", "04"),
  CITI("한국시티은행", "05"),
  HANA("하나은행", "06"),
  NH_SH("농협은행/수협은행", "07"),
  KEB("외환은행", "08"),
  ETC("기타은행", "98");

  private String bankName;
  private String bankCode;

  BankType(String bankName, String bankCode) {
    this.bankCode = bankCode;
    this.bankName = bankName;
  }
}
