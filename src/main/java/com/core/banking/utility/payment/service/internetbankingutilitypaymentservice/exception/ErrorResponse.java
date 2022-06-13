package com.core.banking.utility.payment.service.internetbankingutilitypaymentservice.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponse {
    private String code;
    private String message;
}
