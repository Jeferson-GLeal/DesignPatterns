# 🏢 Abstract Factory Pattern

O **Abstract Factory Pattern** é um **padrão de projeto de criação** que fornece uma interface para criar **famílias de objetos relacionados ou dependentes** sem especificar suas classes concretas.  

Ele é útil quando o sistema precisa ser independente da forma como os objetos são criados e quando diferentes variantes de produtos devem ser suportadas de forma consistente.

---

## 🎯 Ideia central

O Abstract Factory encapsula um conjunto de fábricas relacionadas em uma única interface.  

Assim:
- O cliente trabalha apenas com **interfaces de fábrica**  
- Cada fábrica concreta é responsável por criar uma **família de objetos compatíveis**  
- Garante que os objetos criados sejam **coerentes entre si**  

---

## ✅ Benefícios

- Promove **desacoplamento** entre cliente e classes concretas  
- Facilita a criação de famílias de objetos relacionados  
- Garante consistência entre objetos de uma mesma família  
- Segue o princípio **Open/Closed** (aberto para extensão, fechado para modificação)  

---

## ⚠️ Considerações importantes

- Pode aumentar a complexidade do design devido à criação de múltiplas interfaces e classes  
- Exige planejamento para definir famílias de produtos e suas variantes  
- Pode ser excessivo para sistemas simples com poucas dependências  

---

## 📌 Quando usar

**Use o Abstract Factory Pattern quando:**
- O sistema precisa criar famílias de objetos relacionados  
- Há múltiplas variantes de produtos que devem ser suportadas  
- É necessário garantir consistência entre objetos criados  

**Evite quando:**
- O sistema não exige múltiplas famílias de objetos  
- A criação de objetos é simples e não requer flexibilidade adicional  
