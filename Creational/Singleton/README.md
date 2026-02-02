# 🔒 Singleton Pattern

O **Singleton Pattern** é um padrão de projeto de criação cujo objetivo é garantir que apenas uma única instância de uma classe exista durante todo o ciclo de vida da aplicação, fornecendo um ponto global de acesso a essa instância.

Ele é utilizado quando é necessário controlar o acesso a um recurso compartilhado, como configurações, gerenciadores de conexão ou serviços centrais.

---

## 🎯 Ideia central

O Singleton restringe a criação de objetos por meio de:
- Construtor privado  
- Controle interno da instância  
- Método de acesso global  

A própria classe é responsável por garantir que apenas uma instância seja criada.

---

## ✅ Benefícios

- Garante unicidade da instância  
- Centraliza o acesso a recursos compartilhados  
- Evita múltiplas inicializações desnecessárias  

---

## ⚠️ Considerações importantes

- Introduz estado global na aplicação  
- Pode dificultar testes e manutenção  
- Requer cuidado em ambientes concorrentes  
- Fere o **Princípio da Responsabilidade Única (SRP)** do SOLID, pois a classe passa a ser responsável tanto pela sua lógica de negócio quanto pelo controle do seu próprio ciclo de vida  

---

## 📌 Quando usar

**Use o Singleton Pattern quando:**
- Apenas uma instância da classe deve existir  
- O recurso precisa ser compartilhado globalmente  
- O controle da instância é um requisito claro  

**Evite quando:**
- Injeção de dependência for uma alternativa mais adequada  
- O uso de estado global puder gerar acoplamento excessivo  
