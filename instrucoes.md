# 🚀 Instalação e Uso

## Pré-requisitos

Antes de iniciar, certifique-se de possuir os seguintes softwares instalados:

* Python 3.10 ou superior
* Java JDK 11 ou superior
* Git

Verifique as versões instaladas:

```bash
python --version
java --version
git --version
```

---

## Clonando o Repositório

```bash
git clone https://github.com/seu-usuario/validador-ABNT.git
cd validador-ABNT
```

---

## Criando o Ambiente Virtual

### Linux/macOS

```bash
python -m venv venv
source venv/bin/activate
```

### Windows

```powershell
python -m venv venv
venv\Scripts\activate
```

---

## Instalando Dependências

```bash
pip install -r requirements.txt
```
---

## 📂 Estrutura do Projeto

```text
validador-ABNT/
├── amostras/           # Amostras de texto para testes
├── ANTLR/              # Arquivos gerados pelo ANTLR
├── extrator/           # Codigos para extração de conteudo dos documentos
├── gramatica/          # Arquivos das gramaticas
└── referencias/        # Artigos de referencias para futuro artigo
```
---

## Configurando o ANTLR

Baixe o ANTLR:

```bash
mkdir ferramentas
cd ferramentas

curl -O https://www.antlr.org/download/antlr-4.13.2-complete.jar
```

Retorne para a raiz do projeto:

```bash
cd ..
```
---

## Gerando o Lexer e Parser

Execute:

```bash
java -jar ferramentas/antlr-4.13.2-complete.jar \
-Dlanguage=Python3 \
-visitor \
gramaticas/*.g4 \
-o ANTLR
```

Arquivos gerados:

```text
ANTLR/
├── ABNTLexer.py
├── ABNTParser.py
├── ABNTVisitor.py
├── ABNTListener.py
└── ...
```

Sempre que a gramática for alterada, execute novamente este comando.

---

## Executando o Projeto

Para validar um documento:

```bash
python main.py amostras/exemplo.docx
```

ou

```bash
python main.py amostras/exemplo.pdf
```

---

## Exemplo de Saída

```text
Iniciando análise...

✓ Capa encontrada
✓ Sumário encontrado
✓ Introdução encontrada

⚠ Referência não utilizada:
  SILVA, João (2022)

✗ Citação sem referência:
  SANTOS (2023)

Resultado: 92% de conformidade
```

---

## Executando os Testes

```bash
pytest
```

ou

```bash
pytest tests/
```

---

## Fluxo de Funcionamento

```text
Documento DOCX/PDF
        │
        ▼
Extração de Conteúdo
        │
        ▼
Representação Intermediária (JSON)
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

---

## Contribuindo

1. Crie uma branch para sua funcionalidade:

```bash
git checkout -b feature/nova-funcionalidade
```

2. Realize suas alterações.

3. Execute os testes:

```bash
pytest
```

4. Envie suas alterações:

```bash
git push origin feature/nova-funcionalidade
```

5. Abra um Pull Request.

---

## 📄 Licença

Este projeto é distribuído sob os termos da **GNU General Public License v3.0 (GPL-3.0)**.

Você pode utilizar, estudar, modificar e redistribuir este software livremente, desde que qualquer trabalho derivado também seja distribuído sob a mesma licença e mantenha os créditos aos autores originais.

Para mais informações, consulte o arquivo `LICENSE` presente neste repositório ou visite:

https://www.gnu.org/licenses/gpl-3.0.html
