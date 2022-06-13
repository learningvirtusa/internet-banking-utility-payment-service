package com.core.banking.utility.payment.service.internetbankingutilitypaymentservice.repository;

import com.core.banking.utility.payment.service.internetbankingutilitypaymentservice.model.dto.UtilityPayment;
import com.core.banking.utility.payment.service.internetbankingutilitypaymentservice.model.entity.UtilityPaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilityPaymentRepository extends JpaRepository<UtilityPaymentEntity, UtilityPayment> {
}
