# 🏭 Factory Method Pattern

O **Factory Method Pattern** é um **padrão de projeto de criação** que define uma interface para criar objetos, mas permite que as subclasses decidam qual classe concreta instanciar.  

Dessa forma, o Factory Method delega a responsabilidade da criação para subclasses, promovendo maior flexibilidade e desacoplamento entre o código cliente e as classes concretas.

Ele é indicado quando o sistema precisa ser independente da forma como seus objetos são criados, compostos ou representados.

---

## 🎯 Ideia central

O Factory Method substitui a criação direta de objetos (`new`) por um método de fábrica, que pode ser sobrescrito por subclasses.  

Assim:
- O cliente trabalha com **interfaces ou classes abstratas**  
- A decisão sobre **qual classe concreta instanciar** é delegada às subclasses  
- O processo de criação fica **encapsulado e flexível**  

---

## ✅ Benefícios

- Reduz acoplamento entre cliente e classes concretas  
- Facilita a extensão do sistema sem modificar código existente  
- Centraliza e organiza a lógica de criação de objetos  
- Permite aplicar o princípio **Open/Closed** (aberto para extensão, fechado para modificação)  

---

## ⚠️ Considerações importantes

- Pode aumentar a complexidade do código devido à criação de hierarquias de classes  
- Exige maior planejamento para definir interfaces e classes abstratas  
- O excesso de fábricas pode tornar o design mais difícil de compreender  

---

## 📌 Quando usar

**Use o Factory Method Pattern quando:**
- O sistema deve ser independente das classes concretas utilizadas  
- Há necessidade de criar objetos de diferentes tipos sem alterar o código cliente  
- Deseja-se aplicar polimorfismo na criação de objetos  

**Evite quando:**
- A criação de objetos é simples e não exige flexibilidade  
- O uso de fábricas adiciona complexidade desnecessária ao projeto  
