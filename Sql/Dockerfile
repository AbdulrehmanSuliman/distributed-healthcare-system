FROM openjdk:17.0.2
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} patient-info.jar
CMD ["java","-jar","patient-info.jar"]

#1- build (clean, test, package)
#2- build: docker build -t habibahmedmagdy/microservice:pharmacy .
#3- push: docker push habibahmedmagdy/microservice:pharmacy
#4- run: docker run –p8010:8010 habibahmedmagdy/microservice:pharmacy

