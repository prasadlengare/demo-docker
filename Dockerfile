FROM openjdk:17
EXPOSE 8080
ADD target/demo-docer.jar demo-docer.jar
ENTRYPOINT ["java","-jar","/demo-docer.jar"]