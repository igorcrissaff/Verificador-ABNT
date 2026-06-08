# ABNT Validator

Sistema para validação automática de documentos acadêmicos conforme as normas da ABNT utilizando técnicas de compiladores, incluindo análise léxica, sintática e semântica.

## 📖 Sobre o Projeto

A revisão manual de trabalhos acadêmicos é uma tarefa repetitiva e suscetível a erros. Muitos estudantes, pesquisadores e professores enfrentam dificuldades para verificar se documentos seguem corretamente as normas da Associação Brasileira de Normas Técnicas (ABNT).

O ABNT Validator propõe uma abordagem baseada em conceitos de compiladores para analisar documentos acadêmicos, identificar inconsistências estruturais e gerar relatórios automáticos de conformidade.

## 🎯 Objetivos

* Validar a estrutura de documentos acadêmicos.
* Identificar erros de formatação conforme a ABNT.
* Verificar citações e referências bibliográficas.
* Detectar inconsistências de numeração e organização de seções.
* Gerar relatórios detalhados de conformidade.

## 🏗️ Arquitetura

O sistema segue uma arquitetura inspirada em compiladores:

```text
Documento (DOCX/PDF)
        │
        ▼
Extração de Conteúdo
        │
        ▼
Análise Léxica
        │
        ▼
Análise Sintática
        │
        ▼
Análise Semântica
        │
        ▼
Relatório de Conformidade
```

### Análise Léxica

Responsável por identificar elementos fundamentais do documento, tais como:

* Títulos
* Subtítulos
* Parágrafos
* Citações
* Referências
* Tabelas
* Figuras

### Análise Sintática

Verifica se a estrutura do documento está de acordo com as normas estabelecidas.

Exemplos:

* Presença de capa
* Folha de rosto
* Sumário
* Introdução
* Desenvolvimento
* Conclusão
* Referências

### Análise Semântica

Realiza validações mais complexas:

* Correspondência entre citações e referências.
* Numeração correta de seções.
* Consistência da estrutura documental.
* Verificação de elementos obrigatórios.

## 🚀 Funcionalidades

### Estrutura do Documento

* [ ] Verificação de capa
* [ ] Verificação de folha de rosto
* [ ] Verificação de sumário
* [ ] Verificação de seções obrigatórias

### Formatação

* [ ] Fonte padrão
* [ ] Tamanho da fonte
* [ ] Espaçamento
* [ ] Margens
* [ ] Recuo de parágrafo

### Citações e Referências

* [ ] Citações diretas
* [ ] Citações indiretas
* [ ] Correspondência com referências
* [ ] Ordem alfabética das referências

### Relatórios

* [ ] Relatório de conformidade
* [ ] Relatório de inconsistências
* [ ] Sugestões de correção

## 🛠️ Tecnologias

### Linguagem

* Python

### Bibliotecas

* ANTLR
* python-docx
* pypdf


## 📂 Estrutura do Projeto

```text
src/
├── amostras/           # Amostras de texto para testes
├── ANTLR/              # Arquivos gerados pelo ANTLR
├── extrator/           # Codigos para extração de conteudo dos documentos
├── gramatica/          # Arquivos das gramaticas
└── referencias/        # Artigos de referencias para futuro artigo
```
---

## 📋 Exemplo de Saída

```text
Documento analisado: trabalho.docx

[ERRO] Sumário não encontrado.
[ERRO] Citação "SILVA, 2022" sem referência correspondente.
[AVISO] Margem esquerda diferente do padrão ABNT.

Resultado:
85% de conformidade.
```
---

## 🔬 Aplicação Acadêmica

Este projeto foi desenvolvido como uma proposta de aplicação prática dos conceitos de compiladores na validação automática de documentos acadêmicos, contribuindo para a redução de erros e otimização do processo de revisão.
---

## 🤝 Contribuição

Contribuições são bem-vindas. Caso deseje colaborar, abra uma issue ou envie um pull request.
---


## 📄 Licença

Este projeto é distribuído sob os termos da **GNU General Public License v3.0 (GPL-3.0)**.

Você pode utilizar, estudar, modificar e redistribuir este software livremente, desde que qualquer trabalho derivado também seja distribuído sob a mesma licença e mantenha os créditos aos autores originais.

Para mais informações, consulte o arquivo `LICENSE` presente neste repositório ou visite:

https://www.gnu.org/licenses/gpl-3.0.html

