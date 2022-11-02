#! /bin/sh
cd ./src/main/docker
docker-compose down
docker rmi dancerush:latest
cd ../../../
# Must be run first: ./mvnw clean package -DskipTests
cp ./target/dancerush.jar ./src/main/docker
cd ./src/main/docker
docker-compose up --force-recreate
cd ../../../