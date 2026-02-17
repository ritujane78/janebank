# Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk-jammy

# Information around whoo maintains the image
LABEL maintainer="rbafna.official@gmail.com"

# Add the application's jar to the image
COPY /target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]

