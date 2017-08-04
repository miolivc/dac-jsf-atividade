docker kill app banco
docker rm app banco 
docker rmi miolivc/app miolivc/banco
mvn clean install
docker build -t miolivc/banco ./banco/
docker run -p 5432:5432 -d --name banco miolivc/banco
docker build -t miolivc/app ./
docker run -p 8080:8080 -d --link banco:host-database --name app miolivc/app
