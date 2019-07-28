package com.kakaopay.assignment.rest.response;

import com.kakaopay.assignment.constant.BankType;
import com.kakaopay.assignment.constant.ResponseType;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author doyoung hwang on 2019-07-28
 */

@Getter
@Setter
@AllArgsConstructor
public class BanksResponse {

  List<BankType> bankTypeList;

  ResponseType responseType;

}
