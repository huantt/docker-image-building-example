FROM adoptopenjdk/openjdk8-openj9:jdk8u212-b03_openj9-0.14.0-alpine-slim
RUN mkdir /app
WORKDIR /app

ARG app_name
ARG app_version
ENV full_app_name=${app_name}-${app_version}.jar
COPY build/libs/${full_app_name} ./

ENTRYPOINT java -jar ${full_app_name}
EXPOSE 8080