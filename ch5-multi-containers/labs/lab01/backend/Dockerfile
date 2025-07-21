# =========================================
#  1단계: 빌드(Build) 환경
# =========================================
FROM gradle:8.8-jdk17-alpine AS build

WORKDIR /app
COPY . .
RUN gradle bootJar

# =========================================
#  2단계: 실행(Runtime) 환경
# =========================================
FROM openjdk:17-jre-slim

WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]