# iPhone - Modelagem POO em Java

![Java](https://img.shields.io/badge/Java-21-blue)
![UML](https://img.shields.io/badge/UML-Diagram-orange)
![POO](https://img.shields.io/badge/OOP-Design-success)

Projeto de modelagem do iPhone como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, seguindo os princípios de Programação Orientada a Objetos (POO) e UML.

## 📋 Descrição

Implementação em Java que simula as funcionalidades básicas de um iPhone, conforme apresentado no lançamento de 2007, com:

- **Reprodutor Musical**: tocar, pausar e selecionar músicas
- **Aparelho Telefônico**: ligar, atender e iniciar correio de voz
- **Navegador na Internet**: exibir páginas, adicionar abas e atualizar páginas

## 📊 Diagrama UML

```plaintext
+-------------------+       +-----------------------+
|    Dispositivo    |       |     ReprodutorMusical |
+-------------------+       +-----------------------+
| - modelo: String  |       | + tocar(): void       |
| - armazenamento:  |       | + pausar(): void      |
|   int             |       | + selecionarMusica(): |
+-------------------+       |   void                |
| + ligar(): void   |       +-----------------------+
| + desligar(): void|                  ^
+-------------------+                  |
        ^                              |
        |                              |
+-------------------+       +-----------------------+
|      iPhone       |       |    AparelhoTelefonico |
+-------------------+       +-----------------------+
| + tocar(): void   |       | + ligar(): void       |
| + pausar(): void  |       | + atender(): void     |
| + selecionarMusica|       | + iniciarCorreioVoz():|
|   (): void        |       |   void                |
| + ligar(): void   |       +-----------------------+
| + atender(): void |                  ^
| + iniciarCorreio- |                  |
|   Voz(): void     |                  |
| + exibirPagina(): |       +-----------------------+
|   void            |       |    NavegadorInternet  |
| + adicionarNova-  |       +-----------------------+
|   Aba(): void     |       | + exibirPagina(): void|
| + atualizarPagina:|       | + adicionarNovaAba(): |
|   void            |       |   void                |
+-------------------+       | + atualizarPagina():  |
                            |   void                |
                            +-----------------------+

```

## 🏗️ Estrutura do Projeto

```
src/
├── main/
│   └── java/
│       └── com/
│           └── exemplo/
│               └── iphone/
│                   ├── interfaces/
│                   │   ├── AparelhoTelefonico.java
│                   │   ├── NavegadorInternet.java
│                   │   └── ReprodutorMusical.java
│                   ├── model/
│                   │   ├── Dispositivo.java
│                   │   └── IPhone.java
│                   └── Main.java

```

## 🚀 Como Executar

1. Clone o repositório:
```
git clone https://github.com/seu-usuario/iphone-poo-java.git
```
2. Navegue até o diretório do projeto:
```
cd iphone-poo-java
```
