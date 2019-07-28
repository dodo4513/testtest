package com.kakaopay.assignment.rest.controller;

import com.kakaopay.assignment.didi;
import com.kakaopay.assignment.repo.FinanceVoRepository;
import com.kakaopay.assignment.rest.response.BanksResponse;
import com.kakaopay.assignment.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author doyoung hwang on 2019-07-28
 */

@RestController
public class BankController {

  private final BankService bankService;

  private final FinanceVoRepository financeVoRepository;

  @Autowired
  public BankController(BankService bankService,
      FinanceVoRepository financeVoRepository) {
    this.bankService = bankService;
    this.financeVoRepository = financeVoRepository;
  }

  @GetMapping("/banks")
  public ResponseEntity<?> getBankLst() {

//    return bankService.getAllBanks();
    System.out.println(new didi());
    return ResponseEntity.ok(financeVoRepository.getct());
  }

}
