# Exercício 02: Sistema Acadêmico (Herança e Reutilização)

## 📝 Enunciado
Você está construindo um sistema acadêmico para uma escola. Cada aluno possui um nome e pode ser identificado no sistema com uma mensagem padrão. A escola também possui alunos bolsistas. Para deixar o sistema mais informativo, queremos exibir o tipo do aluno no momento da identificação, como "bolsista" ou "regular".

## 🚀 Requisitos do Programa
1. **Classe `Student`**: Definir com os atributos `name` e `type`.
2. **Método `identify()`**: Deve imprimir: `"Student: [name] - Type: [type]"`.
3. **Classe `ScholarshipStudent`**: Deve herdar de `Student` e definir o tipo automaticamente como `"scholarship"`.
4. **Instanciação**: Criar um objeto `Student` (regular) e um `ScholarshipStudent`, chamando o método `identify()` de cada um.

---

## 📖 Explicação Técnica: O Conceito de Herança

Nesta atividade, usamos **Inheritance** (Herança). A ideia principal é permitir que uma classe (a **subclass**) aproveite **atributos e comportamentos já definidos em outra classe** (a **superclass**), promovendo **reutilização de código** e melhor organização da lógica.

### 1. A Superclasse (`Student`)
Começamos com a classe `Student`, que é a nossa superclasse. Ela define os atributos `name` e `type`, e também possui o método `identify()`, responsável por exibir os dados do aluno. Até aqui, estamos lidando com o conceito de **base class** — uma estrutura genérica que pode ser reutilizada por outras classes.

### 2. A Subclasse (`ScholarshipStudent`)
Na sequência, criamos a classe `ScholarshipStudent`, que **herda de** `Student` utilizando a palavra-chave `extends`. A classe `ScholarshipStudent` não precisa reescrever o método `identify()` porque esse comportamento já existe na superclasse. Esse é o ponto central da herança: **reaproveitar aquilo que já foi implementado**.



### 3. Especialização e o uso do `super`
O detalhe interessante aqui é que, ao herdar de `Student`, a classe `ScholarshipStudent` ainda pode **customizar os dados**, como fizemos ao definir o `type` automaticamente como `"scholarship"`.

Isso é possível porque usamos o `super(name, type)` no construtor, que permite chamar diretamente o construtor da classe mãe (`Student`) com os valores desejados. Essa chamada é fundamental para garantir que os atributos privados da superclasse sejam corretamente inicializados.

### Conclusão
Mesmo sem sobrescrever métodos (Overriding), conseguimos criar objetos especializados (`ScholarshipStudent`) com **características diferentes** (`type = scholarship`) e **comportamento compartilhado** (`identify()`).

---