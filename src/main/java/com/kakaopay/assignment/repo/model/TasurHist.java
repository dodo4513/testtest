package com.kakaopay.assignment.repo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author doyoung hwang on 2019-07-28
 */

@Entity
@Getter
@Setter
@Table(name = "tasur_hist", schema = "kakao_finance_be")
public class TasurHist {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id")
  private long id;

  @Column(name = "year")
  private int year;

  @Column(name = "month")
  private int month;

  @Column(name = "bank_type")
  private String bankType;

  @Column(name = "asur_price")
  private int assurancePrice;
}
