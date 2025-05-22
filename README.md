===================================
PAGAMENTO-SERVICE - TECH CHALLENGE
===================================

Microsserviço responsável pelo gerenciamento de pagamentos de pedidos no sistema distribuído do Tech Challenge.

-------------------------------
📦 TECNOLOGIAS UTILIZADAS
-------------------------------
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Docker
- Maven
- Lombok

-------------------------------
📁 ESTRUTURA DO PROJETO
-------------------------------
src/
├── main/
│   ├── java/
│   │   └── br.com.techchallenge.pagamento/
│   │       ├── application/    -> Controllers (API REST)
│   │       ├── core/           -> Domínio, entidades e interfaces
│   │       └── infrastructure/ -> Repositórios, gateways e config
│   └── resources/
│       ├── application.yml     -> Configurações do serviço
│       └── ...                 -> Outros recursos
└── test/                       -> Testes unitários e de integração

-------------------------------
⚙️ COMO EXECUTAR LOCALMENTE
-------------------------------
1. Verifique se o Docker está instalado e em execução.
2. Execute o comando:
   docker compose up --build

O serviço estará acessível em: http://localhost:8083

-------------------------------
🔁 ENDPOINTS PRINCIPAIS
-------------------------------
GET     /pagamentos             - Lista todos os pagamentos
POST    /pagamentos             - Registra um novo pagamento
GET     /pagamentos/{id}        - Busca detalhes de um pagamento
PUT     /pagamentos/{id}        - Atualiza informações de pagamento
DELETE  /pagamentos/{id}        - Remove um pagamento

-------------------------------
✅ TESTES
-------------------------------
Os testes estão localizados em `src/test`.

Para executar:
> mvn test

Para gerar relatório de cobertura:
> mvn jacoco:report

Relatório disponível em:
target/site/jacoco/index.html

-------------------------------
📌 OBSERVAÇÕES
-------------------------------
- Serviço integrado com pedidos e estoque.
- Realiza a validação e atualização do status de pagamento.
- Banco de dados configurável via `application.yml`.

-------------------------------
👩‍💻 DESENVOLVIDO POR
-------------------------------
Ludmila Moreira - Tech Challenge 2025
