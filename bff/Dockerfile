FROM amazoncorretto:21.0.2

# Créer un répertoire pour l'application
WORKDIR /app

# Copier le fichier JAR Spring Boot dans le conteneur
COPY target/bff-0.0.1-SNAPSHOT.jar /app/bff.jar
COPY src/main/resources/application-docker.properties /app/application.properties

# Commande par défaut pour exécuter l'application Spring Boot
CMD ["java", "-jar", "bff.jar"]
