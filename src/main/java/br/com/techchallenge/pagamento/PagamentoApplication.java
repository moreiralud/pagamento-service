package br.com.techchallenge.pagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing      // ativa @CreatedDate/@LastModifiedDate se quiser usar
public class PagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagamentoApplication.class, args);
	}
}
