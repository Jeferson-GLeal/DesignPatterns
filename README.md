## 🧩 Design Patterns (Padrões de Projeto)

**Design Patterns** (ou *Padrões de Projeto*) são **soluções reutilizáveis, flexíveis e testadas** para problemas recorrentes no desenvolvimento de software.  
Eles **não são código pronto**, mas **modelos conceituais** que ajudam a criar sistemas com **baixo acoplamento**, **alta coesão** e **manutenibilidade**.

Os padrões foram consolidados no livro **"Design Patterns: Elements of Reusable Object-Oriented Software"** (1994), conhecido como **GoF (Gang of Four)**, e são divididos em **três categorias**:

---

### 🏗️ **1. Padrões Criacionais**
> Focam em **como os objetos são criados**, garantindo flexibilidade e controle sobre o processo de instanciação.

| Padrão | Descrição |
|--------|------------|
| **Singleton** | Garante que exista apenas uma instância de uma classe e fornece um ponto global de acesso a ela. |
| **Factory Method** | Define uma interface para criar objetos, mas permite que as subclasses decidam qual classe instanciar. |
| **Abstract Factory** | Permite criar famílias de objetos relacionados sem especificar suas classes concretas. |
| **Builder** | Separa a construção complexa de um objeto da sua representação final. |
| **Prototype** | Cria novos objetos copiando (clonando) uma instância existente. |

---

### 🧩 **2. Padrões Estruturais**
> Lidam com **a composição de classes e objetos**, garantindo estruturas flexíveis e reutilizáveis.

| Padrão | Descrição |
|--------|------------|
| **Adapter** | Permite que classes com interfaces incompatíveis trabalhem juntas. |
| **Bridge** | Desacopla uma abstração da sua implementação, permitindo que ambas evoluam independentemente. |
| **Composite** | Permite tratar objetos individuais e composições de objetos de forma uniforme. |
| **Decorator** | Adiciona comportamentos a um objeto dinamicamente, sem alterar sua estrutura original. |
| **Facade** | Fornece uma interface simplificada para um conjunto complexo de classes ou subsistemas. |
| **Flyweight** | Otimiza o uso de memória compartilhando objetos semelhantes. |
| **Proxy** | Cria um substituto ou representante para controlar o acesso a um objeto real. |

---

### 🔁 **3. Padrões Comportamentais**
> Focam em **como os objetos interagem e se comunicam** entre si, definindo responsabilidades e fluxos de execução.

| Padrão | Descrição |
|--------|------------|
| **Chain of Responsibility** | Encadeia objetos para processar uma solicitação até que um deles a trate. |
| **Command** | Encapsula uma solicitação como um objeto, permitindo desfazer e refazer operações. |
| **Interpreter** | Define uma gramática e um interpretador para expressões em uma linguagem específica. |
| **Iterator** | Fornece uma maneira de percorrer elementos de uma coleção sem expor sua representação interna. |
| **Mediator** | Centraliza a comunicação entre objetos, reduzindo dependências diretas entre eles. |
| **Memento** | Permite capturar e restaurar o estado interno de um objeto sem violar o encapsulamento. |
| **Observer** | Define uma dependência de um-para-muitos, notificando automaticamente os observadores quando o estado muda. |
| **State** | Permite que um objeto altere seu comportamento quando seu estado interno muda. |
| **Strategy** | Define uma família de algoritmos e permite alterná-los dinamicamente. |
| **Template Method** | Define o esqueleto de um algoritmo, permitindo que subclasses implementem etapas específicas. |
| **Visitor** | Separa um algoritmo da estrutura de objetos sobre a qual ele opera. |

---

### 💬 **Resumo**
> Os **23 Design Patterns da GoF** são o alicerce da **engenharia de software orientada a objetos**.  
> Eles promovem **reutilização, extensibilidade e legibilidade**, servindo como referência para arquiteturas modernas como **Clean Architecture**, **DDD** e **Microsserviços**.

---

📘 **Referência:**  
*Gamma, Erich; Helm, Richard; Johnson, Ralph; Vlissides, John – Design Patterns: Elements of Reusable Object-Oriented Software (1994).*
