# Exercício 03: Gestão Escolar (Herança e Especialização)

## 📝 Enunciado
Você está desenvolvendo um sistema de gestão para uma escola, onde é necessário organizar informações de alunos e
docentes. Cada pessoa na escola possui dados básicos, como nome e idade. No entanto, cada grupo também possui 
características próprias: os alunos possuem uma nota final e os docentes são responsáveis por uma disciplina.

## 🚀 Requisitos do Programa
1. **Classe `Person`**: Definir os atributos básicos `name` (String) e `age` (int).
2. **Classe `Student`**: Herdar de `Person` e adicionar o atributo `grade` (double).
3. **Classe `Teacher`**: Herdar de `Person` e adicionar o atributo `subject` (String).
4. **Método `displayData()`**: Cada classe deve implementar seu próprio método para exibir suas informações específicas.
5. **Instanciação**: Criar 2 objetos `Student` e 2 objetos `Teacher` no `main` e exibir os dados no terminal.

---

## 📖 Explicação Técnica: Abstração e Especialização

Nesta atividade, aprofundamos o uso da **Inheritance** (Herança) para organizar uma hierarquia de classes eficiente.

### 1. A Superclasse (`Person`)
Começamos com a classe `Person`, que representa tudo o que é comum a qualquer pessoa no ambiente escolar: o `name` e
a `age`. Isso é um exemplo claro de **Abstraction** (Abstração) — estamos criando um modelo genérico que serve de base
para diferentes tipos de registros.

### 2. Reaproveitamento com Subclasses (`Student` e `Teacher`)
As classes `Student` e `Teacher` herdam de `Person`, o que significa que ambas passam a ter os atributos `name` e 
`age` automaticamente, sem precisarmos digitá-los novamente. Isso evita a repetição de código e facilita muito a
manutenção.



### 3. Especialização de Atributos e Métodos
Cada subclasse adiciona o que é específico (Especialização):
* **`Student`**: Recebe o atributo `grade`.
* **`Teacher`**: Recebe o atributo `subject`.

Além disso, cada uma implementa seu próprio método `displayData()`. Aqui aplicamos o conceito de criar métodos 
para o que aquela subclasse precisa mostrar. Essa separação permite tratar as pessoas de forma **genérica** 
quando necessário e, ao mesmo tempo, acessar o que é **particular** a cada tipo quando for o caso.

---
*Dica: Ao criar as subclasses, lembre-se de usar o `super(name, age)` nos construtores para inicializar os dados
na classe `Person` corretamente.*