
# Use an OpenJDK base image
FROM openjdk:17-jdk-alpine

# Copy the jar file into the container
COPY target/your-app-name.jar app.jar

# Expose port 8080 (or your app's port)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
