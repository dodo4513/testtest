package com.kakaopay.assignment.repo;

import com.kakaopay.assignment.repo.model.TasurHist;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author doyoung hwang on 2019-07-28
 */
public interface FinanceVoRepository extends JpaRepository<TasurHist, Long>,
    FinanceVoRepositoryCustom {
}
