### Build project
```bash
gradle clean build
```

### Dockerfile
```bash
FROM adoptopenjdk/openjdk8-openj9:jdk8u212-b03_openj9-0.14.0-alpine-slim
RUN mkdir /app
WORKDIR /app

ARG app_name
ARG app_version
ENV full_app_name=${app_name}-${app_version}.jar
COPY build/libs/${full_app_name} ./

ENTRYPOINT java -jar ${full_app_name}
EXPOSE <PORT>
```
*Replace \<PORT\> by project's port*
# Build Docker image
```bash
 docker build \  
 --build-arg app_name=s<APP_NAME> \
 --build-arg app_version=APP_VERSION> \
 -t spring-service-demo:<APP_VERSION> \
 ./
```
*Replace \<version\>, \<APP_NAME\>, \<APP_VERSION\>*

# Run Docker container
 ```bash
 docker run \
 --name <APP_NAME>
 --rm \ 
 -p 127.0.0.1:<PORT> \
 <IMAGE_NAME>:<TAG>
 ```
 *Replace \<PORT\> and \<APP_VERSION\>*
