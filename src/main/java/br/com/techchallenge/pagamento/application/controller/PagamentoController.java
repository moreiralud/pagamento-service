package br.com.techchallenge.pagamento.application.controller;

import br.com.techchallenge.pagamento.core.domain.*;
import br.com.techchallenge.pagamento.core.usecase.PaymentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PaymentService service;
    public PagamentoController(PaymentService service) { this.service = service; }

    @PostMapping
    public ResponseEntity<PaymentResponse> criar(@RequestBody @Valid PaymentRequest req) {
        return ResponseEntity.ok(toResp(service.create(req)));
    }

    @PostMapping("/{id}/autorizacao")
    public ResponseEntity<PaymentResponse> autorizar(@PathVariable Long id) {
        return ResponseEntity.ok(toResp(service.authorize(id)));
    }

    private PaymentResponse toResp(Payment p) {
        return new PaymentResponse(
                p.getId(), p.getOrderId(), p.getAmount(),
                p.getStatus(), p.getCreatedAt(), p.getUpdatedAt());
    }
}
