FROM openjdk:latest

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline

COPY src ./src




CMD ["./mvnw", "spring-boot:run"]
#CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles=mysql"]
