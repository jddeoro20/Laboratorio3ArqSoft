# Laboratorio 3 — API REST de Vuelos con Kubernetes
**Universidad de Antioquia · Arquitectura de Software**
Autores: Juan Camilo Vélez · Jesús De Oro

## Stack tecnológico
- Spring Boot 3.5 · Java 21 · MySQL 8
- Docker · Kubernetes (Minikube) · Swagger/OpenAPI

## Cómo compilar
```bash
.\mvnw clean package -DskipTests
```

## Cómo desplegar en Kubernetes
```bash
# 1. Apuntar Docker a Minikube
& minikube -p minikube docker-env | Invoke-Expression
# 2. Construir imagen
docker build -t restoct-app:latest .
# 3. Aplicar YAMLs
kubectl apply -f mysql-configmap.yml
kubectl apply -f mysql-deployment.yml
kubectl apply -f restoct-deployment.yml
# 4. Acceder
minikube service restoct-service
```

## Endpoints disponibles
| Método | Ruta | Descripción |
|--------|------|-------------|
| POST   | /flight/save | Crear vuelo |
| GET    | /flight/listAll | Listar todos |
| GET    | /flight/list/{id} | Buscar por ID |
| GET    | /flight/topFlights | Top vuelos |
| PUT    | /flight | Actualizar |
| DELETE | /flight/{id} | Eliminar |

## Swagger UI
```
http://<minikube-url>/swagger-ui/index.html
```
