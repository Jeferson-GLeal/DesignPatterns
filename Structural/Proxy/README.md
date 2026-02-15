# 🎯 Proxy Pattern

## 📌 Definição

O **Proxy Pattern** é um padrão estrutural que fornece um **objeto substituto (representante)** para controlar o acesso a outro objeto.

Segundo o livro *Design Patterns: Elements of Reusable Object-Oriented Software* (Gang of Four):

> Fornecer um substituto ou placeholder para outro objeto para controlar o acesso a ele.

O Proxy implementa a **mesma interface do objeto real**, garantindo transparência para o cliente.

---

## 🧠 Problema

Em alguns cenários, o acesso direto a um objeto pode ser indesejado ou custoso, por exemplo:

- O objeto é pesado para instanciar
- É necessário controlar permissões
- O objeto está em outro servidor
- É preciso adicionar cache ou logs
- O acesso deve ser monitorado

Permitir que o cliente acesse diretamente o objeto pode gerar:

- Alto acoplamento
- Problemas de segurança
- Baixa performance
- Falta de controle

---

## 💡 Solução

Criar um **Proxy** que:

- Implemente a mesma interface do objeto real
- Intercepte chamadas
- Controle ou complemente o comportamento
- Delegue a execução ao objeto real quando apropriado

O cliente interage com a interface, sem saber se está usando o Proxy ou o objeto real.

---

## 🧩 Estrutura
```text
                        Cliente
                           |
                           v
                   +----------------+
                   |   Interface    |
                   +----------------+
                      ^          ^
                      |          |
            +----------------+  +----------------+
            |   RealObject   |  |     Proxy      |
            +----------------+  +----------------+
                                      |
                                      v
                              +----------------+
                              |   RealObject   |
                              +----------------+
```
