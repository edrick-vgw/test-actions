FROM eclipse-temurin:21.0.1_12-jre-alpine
ADD build/distributions/app.tar ./
CMD app/bin/app
