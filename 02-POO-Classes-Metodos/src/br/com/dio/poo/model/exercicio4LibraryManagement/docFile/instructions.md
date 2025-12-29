# Exercício 04: Sistema de Biblioteca (Herança e Lógica de Identificação)

## 📝 Enunciado
Você está desenvolvendo um sistema para uma biblioteca que precisa catalogar diferentes tipos de mídias: livros, revistas e e-books. Cada mídia possui informações comuns, mas também características únicas que precisam ser exibidas para facilitar a consulta pelos bibliotecários.

## 🚀 Requisitos do Programa
1. **Classe `Media`**: Superclasse com os atributos `title` (String) e `year` (int).
2. **Geração de Código**: Criar um método `generateCode()` que retorne uma String no formato:
   > `LIB-` + (3 primeiras letras do título em maiúsculo) + `year`  
   > *Exemplo: LIB-OHO1937 (Para o título "O Hobbit")*
3. **Classes Filhas**: Criar as seguintes subclasses herdando de `Media`:
    - **`Book`**: Adiciona o atributo `author`.
    - **`Magazine`**: Adiciona o atributo `edition`.
    - **`Ebook`**: Adiciona o atributo `format`.
4. **Método `displayInfo()`**: Cada classe deve exibir o código gerado e seus detalhes específicos.
5. **Instanciação**: Cadastrar uma mídia de cada tipo e exibir os dados no terminal.

---

## 📖 Explicação Técnica: Reutilização de Atributos e Comportamento

Nessa atividade, usamos **Inheritance** (Herança) para promover a reutilização de atributos e, principalmente, de comportamento.

### 1. A Superclasse (`Media`)
Todas as entidades compartilham características em comum — como `title` e `year` — e, por isso, extraímos essas informações para a superclasse chamada `Media`.

### 2. Comportamento Centralizado (`generateCode`)
A classe `Media` centraliza tanto os dados comuns quanto o comportamento comum: o método `generateCode()`. Ele é responsável por gerar uma identificação padronizada para qualquer mídia cadastrada.
* Este método é **usado diretamente pelas subclasses** sem a necessidade de reimplementação.
* Isso garante **consistência** no formato de código do sistema e evita repetição de lógica (DRY - *Don't Repeat Yourself*).



### 3. Especialização
Cada subclasse adiciona um detalhe específico para o seu domínio:
- **`Book`** recebe o `author`.
- **`Magazine`** recebe a `edition`.
- **`Ebook`** recebe o `format`.

A lógica de exibição combina **dados herdados** (como o título e o código gerado pelo pai) com **dados exclusivos** de cada tipo de mídia. Isso demonstra como a herança permite construir sistemas organizados, onde o que é geral fica no topo e o que é específico fica nas pontas.

---m/~],