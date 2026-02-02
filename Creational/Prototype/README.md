# 🧬 Prototype Pattern

O **Prototype Pattern** é um padrão de projeto de criação que permite criar novos objetos a partir da clonagem de uma instância existente, em vez de instanciá-los diretamente com `new`.

Esse padrão é útil quando:
- A criação de objetos é custosa
- Vários objetos compartilham a mesma estrutura
- Deseja-se reduzir o acoplamento entre o cliente e as classes concretas

---

## 🎯 Ideia central

Em vez de o cliente conhecer os detalhes de criação do objeto, ele trabalha com um protótipo, solicitando cópias dele sempre que necessário.

Cada objeto é responsável por definir como deve ser clonado.

---

## ✅ Benefícios

- Reduz dependência de classes concretas  
- Melhora desempenho em cenários de criação custosa  
- Facilita a criação de objetos com configurações semelhantes  
- Permite clonagem dinâmica em tempo de execução  

---

## ⚠️ Considerações

- A clonagem pode ser *shallow* ou *deep*, dependendo da necessidade  
- Objetos com muitas referências internas exigem cuidado na implementação  
- Em Java, recomenda-se evitar o uso direto de `Cloneable`, preferindo lógica explícita de clonagem  

---

## 📌 Quando usar

**Use o Prototype Pattern quando:**
- Objetos precisam ser duplicados com frequência  
- A criação do objeto é complexa ou cara  
- Configurações iniciais são reutilizadas  

**Evite quando:**
- A criação direta do objeto é simples  
- A lógica de clonagem se torna mais complexa que a instanciação  
