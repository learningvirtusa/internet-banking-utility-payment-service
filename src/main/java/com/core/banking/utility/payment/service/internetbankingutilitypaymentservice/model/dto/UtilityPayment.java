package com.core.banking.utility.payment.service.internetbankingutilitypaymentservice.model.dto;

import com.core.banking.utility.payment.service.internetbankingutilitypaymentservice.model.TransactionStatus;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UtilityPayment {
    private Long providerId;
    private BigDecimal amount;
    private String referenceNumber;
    private String account;
    private TransactionStatus status;
}
