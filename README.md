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