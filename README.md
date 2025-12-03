<div align="center">

# 🏙️ Palhoça Cidadã
### Solução de Engajamento Cívico e Gestão Urbana

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-yellow?style=for-the-badge)
![License](https://img.shields.io/badge/License-Academic-blue?style=for-the-badge)

<p align="center">
  <i>"Conectando a população aos órgãos públicos para uma cidade melhor."</i>
  <br>
  <b>ODS 11</b> (Cidades Sustentáveis) • <b>ODS 16</b> (Instituições Eficazes)
</p>

</div>

---

## 📋 Sobre o Projeto
O **Palhoça Cidadã** resolve a dificuldade dos moradores em reportar problemas urbanos (buracos, iluminação, lixo). A plataforma centraliza queixas, gera visibilidade através de um feed público e permite a gestão eficiente por parte da administração municipal.

## ✨ Funcionalidades Principais

<table>
  <tr>
    <td>📢 <b>Relatos de Problemas</b></td>
    <td>Usuários criam queixas com descrição, categoria e fotos.</td>
  </tr>
  <tr>
    <td>📍 <b>Geolocalização</b></td>
    <td>Registro exato do local (Bairro, Rua, Latitude/Longitude).</td>
  </tr>
  <tr>
    <td>🕵️ <b>Anonimato & Segurança</b></td>
    <td>Opção de relatar sem se identificar publicamente.</td>
  </tr>
  <tr>
    <td>👮 <b>Moderação Administrativa</b></td>
    <td>Painel para ocultar relatos impróprios e gerenciar contatos úteis.</td>
  </tr>
</table>

## 🛠️ Arquitetura e Tecnologia

Projeto desenvolvido em **Java**, focado em **Orientação a Objetos** e **Arquitetura Limpa**.

* **POO Pura:** Uso intensivo de Herança (`Pessoa` -> `Usuario`), Polimorfismo e Encapsulamento.
* **SOLID:** Separação de responsabilidades com `IOperacoesDeRelatos` (Interface) e `GerenciadorDeRelatos` (Regra de Negócio).
* **Composição:** Entidades complexas como `Relato` dependem de `Localizacao`.

### 📂 Estrutura de Classes
```bash
src/
├── 👤 Atores
│   ├── Pessoa.java (Abstract)
│   ├── Usuario.java
│   └── Administrador.java
├── 📄 Core
│   ├── Relato.java
│   ├── Localizacao.java
│   └── Curtida.java (Assoc.)
└── ⚙️ Serviços
    ├── IOperacoesDeRelatos.java (Interface)
    └── GerenciadorDeRelatos.java (Controller)
