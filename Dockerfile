#FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift
FROM maven:3.5.0-jdk-8-onbuild

COPY src src
COPY pom.xml pom.xml

RUN chmod -R 777 . 

RUN mvn -B install

EXPOSE 8080

ENTRYPOINT java -jar target/kart-0.0.1-*.jar