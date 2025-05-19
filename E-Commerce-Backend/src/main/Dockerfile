# Stage 1: Build the jar
FROM maven:3.9.0-eclipse-temurin-17 AS build

WORKDIR /build

# Copy pom and src from E-Commerce-Backend folder
COPY E-Commerce-Backend/pom.xml .
COPY E-Commerce-Backend/src ./src

# Build the jar
RUN mvn clean package -DskipTests

# Stage 2: Run the app
FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /build/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
