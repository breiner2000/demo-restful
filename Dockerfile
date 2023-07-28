#Dockerfile multi-stage build
FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY ./src ./src
RUN ./mvnw install -DskipTests

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENV SPRING_PROFILES_ACTIVE=default
ENTRYPOINT ["java","-jar","app.jar"]


#Dockerfile basico
#FROM eclipse-temurin:17-jdk-alpine
#VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#Dockerfile corriendo y moviendo el jar del proyecto
#FROM eclipse-temurin:17-jdk-alpine
#COPY .mvn .mvn
#COPY mvnw .
#COPY pom.xml .
#COPY src ./src
#RUN ./mvnw install -DskipTests
#RUN mv target/*jar app.jar
#ENTRYPOINT ["java","-jar","app.jar"]