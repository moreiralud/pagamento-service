package br.com.techchallenge.pagamento.core.domain;

import java.math.BigDecimal;
import java.time.Instant;

public record PaymentResponse(
        Long id,
        Long orderId,
        BigDecimal amount,
        PaymentStatus status,
        Instant createdAt,
        Instant updatedAt
) {}
