FROM openjdk:17.0.2
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} medical-history.jar
CMD ["java","-jar","medical-history.jar"]

#1- build (clean, test, package)
#2- build: docker build -t habibahmedmagdy/microservice:emr .
#3- push: docker push habibahmedmagdy/microservice:emr
#4- run: docker run –p8010:8010 habibahmedmagdy/microservice:eureka

