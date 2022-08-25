FROM openjdk:8
EXPOSE 8080
ADD target/aws-cicd-build.jar aws-cicd-build.jar
ENTRYPOINT ["java","-jar","/aws-cicd-build.jar"]