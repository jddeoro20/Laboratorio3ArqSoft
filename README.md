✈️ Laboratorio 3 - Arquitectura de Software

Proyecto desarrollado para el Laboratorio 3 de Arquitectura de Software de la Universidad de Antioquia.

El objetivo del laboratorio fue implementar y desplegar una API RESTful utilizando Spring Boot, MySQL, Docker y Kubernetes con Minikube.

🚀 Tecnologías Utilizadas
Java 21
Spring Boot 3.5.14
Maven
Spring Data JPA
MySQL 8
Docker
Kubernetes
Minikube
Swagger / OpenAPI
Git y GitHub
📦 Funcionalidades Implementadas

✅ CRUD completo de vuelos
✅ Persistencia con MySQL
✅ API RESTful
✅ Swagger/OpenAPI
✅ Dockerización de la aplicación
✅ Imagen Docker funcional
✅ Kubernetes Deployments
✅ Kubernetes Services
✅ ConfigMaps
✅ Comunicación entre Pods
✅ Despliegue en Minikube
✅ Persistencia real en base de datos
✅ Git y GitHub configurados

🏗️ Arquitectura del Proyecto

La aplicación sigue una arquitectura en capas:

Controller → Service → Repository (DAO) → MySQL

En Kubernetes:

Cliente
   ↓
Kubernetes Service
   ↓
Pod Spring Boot
   ↓
MySQL Service
   ↓
Pod MySQL
📁 Estructura Principal
src/
 ├── controller/
 ├── dao/
 ├── exception/
 ├── model/
 ├── service/
 └── resources/

Dockerfile
mysql-configmap.yml
mysql-deployment.yml
restoct-deployment.yml
pom.xml
🔗 Endpoints Principales
Método	Endpoint	Descripción
POST	/flight/save	Crear vuelo
GET	/flight/listAll	Obtener todos los vuelos
GET	/flight/list/{id}	Obtener vuelo por ID
GET	/flight/topFlights	Obtener mejores vuelos
PUT	/flight	Actualizar vuelo
DELETE	/flight/{id}	Eliminar vuelo
⚙️ Ejecución Local
Clonar repositorio
git clone https://github.com/jddeoro20/Laboratorio3ArqSoft.git
Ejecutar Spring Boot localmente
.\mvnw.cmd spring-boot:run

Swagger local:

http://localhost:8089/swagger-ui/index.html
🐳 Docker
Construir imagen Docker
docker build -t restoct-app:latest .
☸️ Kubernetes + Minikube
Iniciar Minikube
minikube start --driver=docker
Configurar entorno Docker de Minikube
minikube -p minikube docker-env | Invoke-Expression
Aplicar configuraciones Kubernetes
kubectl apply -f mysql-configmap.yml
kubectl apply -f mysql-deployment.yml
kubectl apply -f restoct-deployment.yml
Verificar Pods
kubectl get pods
Verificar Services
kubectl get svc
Verificar Deployments
kubectl get deployments
Abrir aplicación desde Kubernetes
minikube service restoct-service

Esto genera una URL local temporal para acceder a la aplicación desplegada en Kubernetes.

Swagger desde Kubernetes:

http://127.0.0.1:<PUERTO>/swagger-ui/index.html
🗄️ Base de Datos

Motor utilizado:

MySQL 8

Configuración principal:

spring.datasource.url=jdbc:mysql://mysql:3306/restoct
spring.datasource.username=root
spring.datasource.password=root
📖 Swagger / OpenAPI

Swagger fue utilizado como interfaz visual para:

Probar endpoints REST
Validar CRUD
Verificar respuestas HTTP
Comprobar funcionamiento en Kubernetes
📷 Evidencias Recomendadas

El laboratorio puede validarse mediante:

✅ Swagger funcionando
✅ kubectl get pods
✅ kubectl get svc
✅ kubectl get deployments
✅ kubectl cluster-info
✅ CRUD funcional
✅ Pods Running

🔧 Adaptaciones Realizadas

El repositorio original entregado por el profesor utilizaba tecnologías antiguas:

Spring Boot 2.x
Java 11
Swagger antiguo
javax.persistence
imágenes Docker desactualizadas

El proyecto fue modernizado utilizando:

Spring Boot 3.5.14
Java 21
Jakarta Persistence
Swagger OpenAPI moderno
Docker moderno (eclipse-temurin:21-jdk)
Kubernetes actualizado
MySQL 8
👨‍💻 Autor

Jesús De Oro
Juan Camilo Velez

GitHub:
https://github.com/jddeoro20

Repositorio Guia: https://github.com/diegobotia/kbtvuelo

Repositorio del proyecto:
https://github.com/jddeoro20/Laboratorio3ArqSoft
