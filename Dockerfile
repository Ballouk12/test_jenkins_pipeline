# Utiliser une image Java légère
FROM openjdk:17-jdk-slim

# Définir le répertoire de travail
WORKDIR /app

COPY target/HelloWord2-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port utilisé par Spring Boot
EXPOSE 8080

# Lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
