# 🏗️ Builder Pattern

O **Builder Pattern** é um **padrão de projeto de criação** utilizado para construir objetos complexos **passo a passo**, separando o processo de construção da representação final do objeto.

Ele é indicado quando uma classe possui **muitos atributos**, especialmente **opcionais**, evitando construtores longos, confusos e dependentes da ordem dos parâmetros.

Com o Builder, o objeto é configurado de forma **legível e flexível**, sendo criado apenas ao final do processo de construção, normalmente por meio de um método `build()`.

---

## ✅ Benefícios

- Melhora a legibilidade do código  
- Elimina construtores extensos  
- Facilita a criação de objetos imutáveis  
- Evita erros de ordem de parâmetros  
- Centraliza a lógica de construção  

---

## 📌 Quando usar

**Use o Builder Pattern quando:**
- Há muitos parâmetros opcionais  
- A criação do objeto é complexa  
- Clareza e manutenção são prioridades  

**Evite quando:**
- A classe é simples  
- Um construtor direto é suficiente  
