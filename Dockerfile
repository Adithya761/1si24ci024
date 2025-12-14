# Simple Java application Dockerfile example
# # Use Eclipse Temurin JDK 21 (The modern standard for Java 21)
# FROM eclipse-temurin:21

# WORKDIR /app

# COPY . /app

# # Compile inside the container to ensure version compatibility
# RUN javac Hello.java

# CMD ["java", "Hello"]

# login app dockerfile

FROM eclipse-temurin:21
WORKDIR /app
COPY . /app
RUN javac LoginApp.java
CMD ["java", "LoginApp"]