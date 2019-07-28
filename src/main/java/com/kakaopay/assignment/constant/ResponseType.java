package com.kakaopay.assignment.constant;

import org.springframework.http.HttpStatus;

/**
 * @author doyoung hwang on 2019-07-28
 */
public enum ResponseType {

  KAKAO_SUCCESS("KA2001", "SUCEESS", HttpStatus.OK),
  KAKAO_ACCEPTED("KA2021", "ACCEPTED", HttpStatus.ACCEPTED);

  private String resultCode;
  private String resutMessage;
  private HttpStatus resultStatus;

  ResponseType(String resultCode, String resutMessage, HttpStatus resultStatus) {
    this.resultCode = resultCode;
    this.resutMessage = resutMessage;
    this.resultStatus = resultStatus;
  }
}
