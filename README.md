#Proveedores API
##Requisitos
-Java 17
-Maven
-MySQL

##Configuración
1. Configura la conexión a la base de datos en 'application.properties'.
2. Ejecuta el script 'script.sql'para crear y probar la base de datos

##Ejecución
1.Ejecuta el comando: 'mvn spring-boot:run'.
2.Prueba el end point: 'GET http://localhost:8080/api/proveedor/{idCliente}'.

##Pruebas
Ejecuta las pruebas con:
'''bash
mvn test
