# Aula 20 — Interface Gráfica com JavaFX

Exemplos práticos de criação de interfaces gráficas em Java usando **JavaFX**, incluindo a abordagem programática (código puro) e a abordagem declarativa com **FXML + Controller**.

---

## Estrutura do projeto

```
InterfaceGrafica/
├── src/
│   ├── App.java                  # Exemplo 1: interface criada 100% em código Java
│   ├── AppFXML.java              # Exemplo 2: interface carregada de um arquivo FXML
│   ├── Launcher.java             # Ponto de entrada alternativo para AppFXML
│   ├── layout.fxml               # Tela de login (usada por AppFXML)
│   ├── LoginController.java      # Controller da tela de login
│   ├── calculadora.fxml          # Tela de calculadora com tratamento de exceções
│   └── CalculadoraController.java# Controller da calculadora
├── bin/                          # Arquivos compilados (.class)
└── .vscode/
    ├── settings.json             # Configura o caminho das libs do JavaFX
    └── launch.json               # Configurações de execução para o VS Code
```

---

## Pré-requisitos

| Ferramenta | Versão recomendada |
|---|---|
| JDK | 17 ou superior |
| JavaFX SDK | 23 |
| VS Code | qualquer versão recente |
| Extensão VS Code | [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) |

### Instalando o JavaFX SDK

1. Acesse [gluonhq.com/products/javafx](https://gluonhq.com/products/javafx/) e baixe o **JavaFX 23 SDK** para o seu sistema operacional.
2. Extraia o conteúdo para `C:\Program Files\javafx-sdk-23\` (Windows) ou o caminho de sua preferência.
3. Se usar um caminho diferente, atualize o arquivo `.vscode/settings.json` e o campo `vmArgs` em `.vscode/launch.json` com o novo caminho.

---

## Como executar no VS Code

O projeto já possui configurações de execução prontas em `.vscode/launch.json`. Basta abrir qualquer arquivo `.java` e usar o menu **Run > Start Debugging** ou pressionar **F5**, escolhendo uma das configurações abaixo.

### Configurações disponíveis

| Configuração | Classe principal | O que executa |
|---|---|---|
| `App` | `App.java` | Tela simples com botão (sem FXML) |
| `AppFXML` | `AppFXML.java` | Tela de login carregada via FXML |
| `Launcher` | `Launcher.java` | Mesmo que `AppFXML`, via classe auxiliar |

---

## Exemplos

### Exemplo 1 — Interface em código Java (`App.java`)

Demonstra como criar uma janela com um botão usando apenas código Java, sem FXML.

- Cria um `Stage` (janela), uma `Scene` (cena) e um `Button`
- Registra um `EventHandler` para reagir ao clique do botão
- Imprime uma mensagem no console ao clicar

**Para executar:** selecione a configuração **`App`** no painel de execução.

---

### Exemplo 2 — Interface com FXML (`AppFXML.java` + `layout.fxml`)

Demonstra a separação entre layout (FXML) e lógica (Controller), que é o padrão usado em projetos JavaFX reais.

**Tela de Login** (`layout.fxml` + `LoginController.java`):
- Campos de usuário e senha
- Botão "Entrar" que valida as credenciais
- Exibe um popup de sucesso ou erro dependendo da entrada

**Credenciais para teste:**
- Usuario: `anderson`
- Senha: `123456`

**Para executar:** selecione a configuração **`AppFXML`** ou **`Launcher`**.

---

### Exemplo 3 — Calculadora com Exceções (`calculadora.fxml`)

Demonstra o tratamento de exceções dentro de uma interface gráfica.

- Realiza a divisão entre dois números inteiros
- Captura `NumberFormatException` quando o valor digitado não é um número
- Captura `ArithmeticException` quando o denominador é zero
- Exibe popups de erro com o nome da exceção capturada

**Para alternar entre as telas de login e calculadora**, edite a linha em `AppFXML.java`:

```java
// Trocar "layout.fxml" por "calculadora.fxml" para testar a calculadora
FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("layout.fxml"));
```

---

## Conceitos abordados

- `Application`, `Stage` e `Scene` — estrutura básica de uma aplicação JavaFX
- Componentes de UI: `Button`, `TextField`, `Label`, `Alert`, `MenuBar`, `Accordion`
- `EventHandler` e anotação `@FXML` para ligar eventos do FXML ao Controller
- `FXMLLoader` — carregamento de arquivos FXML em tempo de execução
- Padrão MVC aplicado a interfaces gráficas
- Tratamento de exceções (`try/catch`) integrado a formulários

---

## Solução de problemas

**Erro: `Error: JavaFX runtime components are missing`**
> Verifique se o caminho do JavaFX SDK está correto em `.vscode/settings.json` e no campo `vmArgs` de `.vscode/launch.json`.

**Erro de compilação nas classes JavaFX**
> Confirme que a extensão **Extension Pack for Java** está instalada e que o projeto foi reconhecido (ícone de xícara de café no explorador de arquivos).

**Janela não abre, nenhum erro aparece**
> Certifique-se de executar pela configuração correta no `launch.json`, não use "Current File" com `AppFXML.java`, pois essa classe não pode ser iniciada diretamente pelo módulo JavaFX sem os `vmArgs` adequados. Use a configuração **`Launcher`** nesse caso.
