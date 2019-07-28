package com.kakaopay.assignment.repo;

import com.kakaopay.assignment.repo.model.QTasurHist;
import com.kakaopay.assignment.repo.model.TasurHist;
import java.util.List;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

/**
 * @author doyoung hwang on 2019-07-28
 */
public class FinanceVoRepositoryImpl extends QuerydslRepositorySupport implements
    FinanceVoRepositoryCustom {

//  QTasurHist qTasurHist = QTasurHist.tasurHist;
  QTasurHist qTasurHist = QTasurHist.tasurHist;

  public FinanceVoRepositoryImpl() {
    super(TasurHist.class);
  }

  @Override
  public List<TasurHist> getct() {
    return from(qTasurHist).where(qTasurHist.bankType.eq("02")).fetch();
  }
}
