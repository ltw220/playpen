#FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift
FROM maven:3.5.0-jdk-8-onbuild

ADD src
ADD pom.xml

RUN mvn -B install

EXPOSE 8080

ENTRYPOINT java -jar target/kart-0.0.1-*.jar