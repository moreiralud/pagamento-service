package br.com.techchallenge.pagamento.infrastructure.repository;

import br.com.techchallenge.pagamento.core.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByOrderId(Long orderId);
}
