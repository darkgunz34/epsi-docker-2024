# Docker

Explication du projet

## Prérequis

- Utilisation d'angular 17
- Utilisation de JAVA 21

## Installation

### front

Build :

```bash
npm install
```

Docker :

```bash
docker build . -t epsi-front
```

### bff

Build :

```bash
mvn clean install
```

Docker :

```bash
docker build . -t epsi-bff
```

### Shell

Le docker-compose se trouve directement dans le dossier shell.

## Repo docker

https://hub.docker.com/u/stephanparichon

## Utilisation

Usage des points suivants :

- Création d'une image docker spécifique à son environnement
- Utilisation de docker-compose pour lancer l'ensemble des services
  - Usage des variables d'environnement
  - Utilisation de volumes
- Création de tag pour les images
- Push sur le registry
