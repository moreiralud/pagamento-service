package br.com.techchallenge.pagamento.core.usecase;

import br.com.techchallenge.pagamento.core.domain.*;
import br.com.techchallenge.pagamento.infrastructure.repository.PaymentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class PaymentService {

    private final PaymentRepository repo;
    public PaymentService(PaymentRepository repo) { this.repo = repo; }

    @Transactional
    public Payment create(PaymentRequest dto) {
        Payment p = Payment.builder()
                .orderId(dto.orderId())
                .amount(dto.amount())
                .status(PaymentStatus.PENDING)
                .createdAt(Instant.now())
                .build();
        return repo.save(p);
    }

    @Transactional
    public Payment authorize(Long id) {
        Payment p = repo.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        p.setStatus(PaymentStatus.AUTHORIZED);
        p.setUpdatedAt(Instant.now());
        return repo.save(p);
    }
}
