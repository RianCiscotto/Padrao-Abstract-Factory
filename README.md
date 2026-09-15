# Padrão Abstract Factory — Sistema de Interface

Este projeto demonstra a aplicação do padrão de projeto criacional **Abstract Factory** em Java.

## Objetivo

Criar **famílias de objetos relacionados** sem que o código cliente precise conhecer ou instanciar diretamente suas classes concretas.

## Conceitos-Chave para Estudo

**Fábrica Abstrata:** Define os métodos responsáveis pela criação dos diferentes produtos.

**Famílias de Produtos:** Permite criar objetos relacionados que trabalham juntos, mantendo a compatibilidade entre eles.

**Desacoplamento:** O cliente depende apenas das interfaces, sem conhecer as implementações concretas.

**Criação Centralizada:** A responsabilidade de instanciar os objetos fica concentrada nas fábricas concretas.

**Fácil Substituição:** É possível trocar toda uma família de objetos alterando apenas a fábrica utilizada pelo cliente.
