package br.com.techchallenge.pagamento.core.domain;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record PaymentRequest(
        @NotNull Long orderId,
        @NotNull @DecimalMin("0.01") BigDecimal amount
) {}
