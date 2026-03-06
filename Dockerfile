# Utilisation d'une image Java 17 
FROM eclipse-temurin:17-jdk-alpine

# Dossier de travail
WORKDIR /app

# Copie du JAR généré par Maven
COPY target/product-api-0.0.1-SNAPSHOT.jar app.jar

# Exposition du port 
EXPOSE 8086

# Lancement de l'application
ENTRYPOINT ["java", "-jar", "app.jar"]