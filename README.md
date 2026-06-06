# Sistema de Pagamento – Padrão Adapter

## Descrição

Este projeto demonstra a implementação do **Padrão de Projeto Adapter** utilizando o tema **Sistema de Pagamento**.

O objetivo é permitir que o sistema utilize diferentes provedores de pagamento por meio de uma interface única, sem depender diretamente da implementação específica de cada gateway.

Neste exemplo foram simuladas integrações com:

- PayPal
- Mercado Pago

---

# Objetivo do Adapter

O padrão **Adapter** permite converter a interface de uma classe existente para outra interface esperada pelo sistema.

Sem o Adapter, cada integração exigiria alterações na lógica principal.

Com o Adapter, o sistema trabalha apenas com uma interface comum.

---

# Estrutura do Projeto

```text
src/
├── main/
│   └── java/
│       └── com/
│           └── pagamento/
│               └── adapter/
│                   ├── Pagamento.java
│                   ├── PayPalAPI.java
│                   ├── PayPalAdapter.java
│                   ├── MercadoPagoAPI.java
│                   ├── MercadoPagoAdapter.java
│                   └── Main.java
│
└── test/
    └── java/
        └── com/
            └── pagamento/
                └── adapter/
                    ├── PayPalAdapterTest.java
                    └── MercadoPagoAdapterTest.java
```

---

# Tecnologias Utilizadas

- Java
- Maven
- JUnit 5
- IntelliJ IDEA

---

# Participantes do Padrão Adapter

## Target (Interface Esperada)

Classe:

```java
Pagamento
```

Responsável por definir o contrato utilizado pelo sistema.

---

## Adapters

Classes:

```java
PayPalAdapter
MercadoPagoAdapter
```

Responsáveis por traduzir chamadas do sistema para APIs externas.

---

## Adaptees (Classes Existentes)

Classes:

```java
PayPalAPI
MercadoPagoAPI
```

Representam serviços externos que possuem interfaces diferentes.

---

# Diagrama de Classes

```

classDiagram

class Pagamento {
<<interface>>
+realizarPagamento(valor: double) boolean
}

class PayPalAdapter {
-payPalAPI: PayPalAPI
+realizarPagamento(valor: double) boolean
}

class MercadoPagoAdapter {
-mercadoPagoAPI: MercadoPagoAPI
+realizarPagamento(valor: double) boolean
}

class PayPalAPI {
+enviarPagamento(valor: double) boolean
}

class MercadoPagoAPI {
+processarTransacao(valor: double) boolean
}

Pagamento <|.. PayPalAdapter
Pagamento <|.. MercadoPagoAdapter

PayPalAdapter --> PayPalAPI
MercadoPagoAdapter --> MercadoPagoAPI

```

---

# Funcionamento

### Fluxo do pagamento

```text
Cliente
 ↓
Pagamento (Interface)
 ↓
Adapter
 ↓
Gateway Externo
```

### Exemplo

```text
Main
 ↓
Pagamento pagamento =
new PayPalAdapter(new PayPalAPI())

 ↓
pagamento.realizarPagamento(150)
 ↓
PayPalAPI.enviarPagamento(150)
```

---

# Executando o Projeto

### Clonar repositório

```bash
git clone URL_DO_REPOSITORIO
```

---

### Entrar na pasta

```bash
cd sistema-pagamento-adapter
```

---

### Compilar

```bash
mvn clean install
```

---

### Executar

```bash
mvn exec:java
```

---

# Executando os Testes

Executar todos os testes:

```bash
mvn test
```

Testes implementados:

- Pagamento via PayPal
- Pagamento via Mercado Pago

---

# Exemplo de Saída

```text
Pagamento realizado via PayPal: R$ 150.0

Pagamento realizado via Mercado Pago: R$ 250.0
```

---

# Benefícios do Adapter

- Baixo acoplamento
- Facilidade para adicionar novos gateways
- Reutilização de código
- Padronização das integrações
- Manutenção simplificada

---

# Autor

Projeto acadêmico desenvolvido para estudo do padrão de projeto Adapter.
