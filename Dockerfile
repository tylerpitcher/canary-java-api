FROM maven:3.9.9-amazoncorretto-21 AS build

WORKDIR /app

COPY pom.xml /app/pom.xml

COPY src /app/src

RUN mvn clean package

FROM maven:3.9.9-amazoncorretto-21

WORKDIR /app

COPY --from=build /app/target/*.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/app.jar"]
