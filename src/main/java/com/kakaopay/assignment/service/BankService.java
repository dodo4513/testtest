package com.kakaopay.assignment.service;

import com.kakaopay.assignment.constant.BankType;
import com.kakaopay.assignment.constant.ResponseType;
import com.kakaopay.assignment.rest.response.BanksResponse;
import java.util.Arrays;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author doyoung hwang on 2019-07-28
 */

@Service
public class BankService {

  public ResponseEntity<BanksResponse> getAllBanks() {
    return ResponseEntity
        .ok(new BanksResponse(Arrays.asList(BankType.values()), ResponseType.KAKAO_ACCEPTED));
  }

}
