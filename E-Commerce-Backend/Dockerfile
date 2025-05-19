# Stage 1: Build the jar using Maven
FROM maven:3.9.0-eclipse-temurin-17 AS build

WORKDIR /app

# Copy the pom and source files
COPY pom.xml .
COPY src ./src

# Build the project and package jar
RUN mvn clean package -DskipTests

# Stage 2: Run the app
FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copy the jar from the build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
