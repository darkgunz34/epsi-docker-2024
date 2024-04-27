# Shell

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

### micro-service

Build :

```bash
mvn clean install
```

Docker :

```bash
docker build . -t epsi-micro-service
```

## Utilisation

Usage des points suivants :

- Création d'une image docker spécifique à son environnement
- Utilisation de docker-compose pour lancer l'ensemble des services
  - Usage des variables d'environnement **OK**
  - Utilisation de volumes **OK**
- Création de tag pour les images **OK**
- Push sur le registry **OK**
