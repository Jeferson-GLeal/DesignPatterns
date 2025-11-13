## 🧩 Design Patterns (Padrões de Projeto)

**Design Patterns** (ou *Padrões de Projeto*) são **soluções reutilizáveis, flexíveis e testadas** para problemas recorrentes no desenvolvimento de software.  
Eles **não são código pronto**, mas **modelos conceituais** que ajudam a criar sistemas com **baixo acoplamento**, **alta coesão** e **manutenibilidade**.

Os padrões foram consolidados no livro **"Design Patterns: Elements of Reusable Object-Oriented Software"** (1994), conhecido como **GoF (Gang of Four)**, e são divididos em **três categorias**:

---

## 🔨 Padrões de Criação
| Padrão             | Responsabilidade Principal | Exemplo em Java / Framework |
|--------------------|----------------------------|-----------------------------|
| **Singleton**      | Garantir única instância global | `Runtime.getRuntime()`, Spring Beans |
| **Factory Method** | Delegar criação de objetos para subclasses | `Calendar.getInstance()`, Spring `BeanFactory` |
| **Abstract Factory** | Criar famílias de objetos relacionados | GUI Toolkits, `DocumentBuilderFactory` |
| **Builder**        | Construção passo a passo de objetos complexos | `StringBuilder`, `HttpRequest.Builder` |
| **Prototype**      | Criar novos objetos copiando instâncias existentes | `clone()` em Java |

---

## 🏗️ Padrões Estruturais
| Padrão             | Responsabilidade Principal | Exemplo em Java / Framework |
|--------------------|----------------------------|-----------------------------|
| **Adapter**        | Converter interface para outra esperada | `InputStreamReader` |
| **Bridge**         | Separar abstração da implementação | JDBC Drivers |
| **Composite**      | Compor objetos em estruturas hierárquicas | `java.awt.Container` |
| **Decorator**      | Adicionar responsabilidades dinamicamente | `BufferedReader` envolvendo `FileReader` |
| **Facade**         | Fornecer interface simplificada para subsistemas | `javax.faces.context.FacesContext` |
| **Flyweight**      | Compartilhar objetos para eficiência | `Integer.valueOf()` cache |
| **Proxy**          | Controlar acesso a um objeto | Hibernate Lazy Loading, `java.lang.reflect.Proxy` |

---

## 🔄 Padrões Comportamentais
| Padrão             | Responsabilidade Principal | Exemplo em Java / Framework |
|--------------------|----------------------------|-----------------------------|
| **Chain of Responsibility** | Passar requisição por uma cadeia de handlers | `Servlet Filters` |
| **Command**        | Encapsular requisições como objetos | `Runnable`, `ExecutorService` |
| **Interpreter**    | Interpretar gramáticas e linguagens | `Pattern` e `Matcher` (Regex) |
| **Iterator**       | Acessar elementos sequencialmente sem expor estrutura | `Iterator` em `Collections` |
| **Mediator**       | Centralizar comunicação entre objetos | `java.util.Timer` |
| **Memento**        | Capturar e restaurar estado interno | `Serializable` |
| **Observer**       | Notificação automática de mudanças | `PropertyChangeListener`, eventos Swing |
| **State**          | Alterar comportamento conforme estado interno | `Thread` (NEW, RUNNABLE, BLOCKED) |
| **Strategy**       | Encapsular algoritmos e permitir alternância | `Comparator` em `Collections.sort()` |
| **Template Method**| Definir esqueleto de algoritmo e permitir variações | `AbstractList`, `HttpServlet` |
| **Visitor**        | Separar algoritmos da estrutura de objetos | `FileVisitor` em NIO |
---

### 💬 **Resumo**
> Os **23 Design Patterns da GoF** são o alicerce da **engenharia de software orientada a objetos**.  
> Eles promovem **reutilização, extensibilidade e legibilidade**, servindo como referência para arquiteturas modernas como **Clean Architecture**, **DDD** e **Microsserviços**.

---

📘 **Referência:**  
*Gamma, Erich; Helm, Richard; Johnson, Ralph; Vlissides, John – Design Patterns: Elements of Reusable Object-Oriented Software (1994).*
