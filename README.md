## Spring Boot Microservice 2 - Order Service

### Endpoints

#### Save Order

````
POST /api/order HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json

{
    "userId": 1,
    "productId":1,
    "shipping": "address",
    "payment": "paypal"
}
````

#### Get Order Of User

````
GET /api/order/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
````

#### Docker commands

````
1.Create jar file
mvn clean install -Dmaven.test.skip

2.Run app with mvn
mvn spring-boot:run

3.Create docker image
docker build . -t subo8/mini2-order

4.Docker run
docker run -d --network=backend --name=order -p 4444:4444 subo8/mini2-order

5. Push images to docker hub
docker login
#Optional
docker tag mini2/eureka:latest subo8/mini2-eureka:latest

docker push subo8/mini2-order

#Optional
4.Create docker file automaticaly by paketobuildpacks
mvn spring-boot:build-image
````