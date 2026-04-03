# Use official Java image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Build the project
RUN chmod +x mvnw && ./mvnw clean package

# Run the jar file
CMD ["java", "-jar", "target/authapp-0.0.1-SNAPSHOT.jar"]