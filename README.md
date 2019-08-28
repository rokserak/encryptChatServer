# encyptedChat server

simple spring boot rest server with mongoDB

build command:
./gradlew build

run command:
./gradlew bootRun

run MongoDB in docker:
docker run -v $HOME/mongodb-data:/data/db -p 27017:27017  mongo:latest
