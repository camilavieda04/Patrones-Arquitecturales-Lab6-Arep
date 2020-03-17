# AREP-AWS PATRONES ARQUITECTURALES S3, EC2 Y RDS

# Tutoriales 

["Desplegar un sitio estático usando S3"]("https://youtu.be/nbNxX6hozdo")

["Desplegar un forumulario dinámico usando EC2"]("https://youtu.be/tDyVYwTjzVs")

# PATRONES ARQUITECTURALES
Una empresa lo ha contratado para capacitar a sus ingenieros en la construcción de sitios web dinámicos sobre Amazon Web Services. Para esto usted decidió construir un tutorial y un video que permita a los ingenieros hacer lo siguiente:

# 1. DESPLEGAR UN SITIO ESTÁTICO USANDO S3.

   1.1 Entramos a la consola de AWS y en la parte de servicios escribimos S3.
   
   ![Captura](https://user-images.githubusercontent.com/48154086/76712696-20af6480-66e9-11ea-92f5-f0928b6a2b87.PNG)
     
   1.2 Una vez ubicados en el servicio S3 crearemos un nuevo bucket 
      
   ![Captura1](https://user-images.githubusercontent.com/48154086/76712698-2147fb00-66e9-11ea-8209-84079c912dad.PNG)
      
   1.3 El bucket lo llamaremos "staticbucketresource". 
     
   ![Captura2](https://user-images.githubusercontent.com/48154086/76712699-21e09180-66e9-11ea-9191-5f5b62537fea.PNG)
      
1.4 Damos click a las opciones de siguiente hasta crear un nuevo bucket. 

![Captura3](https://user-images.githubusercontent.com/48154086/76712700-22792800-66e9-11ea-95f4-8198625a9f35.PNG)
![Captura4](https://user-images.githubusercontent.com/48154086/76712702-2311be80-66e9-11ea-89a9-64c35a256efd.PNG)
![Captura5](https://user-images.githubusercontent.com/48154086/76712704-260caf00-66e9-11ea-8de1-bb77eff54593.PNG)

1.5 Editamos la configuración de acceso público, para ello seleccionaremos la opción que se tiene en pantalla. 

![Captura6](https://user-images.githubusercontent.com/48154086/76712705-26a54580-66e9-11ea-92ed-97bef7556cab.PNG)

1.6 Una vez hecho esto vamos a quitar el bloqueo de acceso público y guardar.  

![Captura7](https://user-images.githubusercontent.com/48154086/76712707-273ddc00-66e9-11ea-9547-419a684db23e.PNG)

1.7 Para terminar la configuración de acceso escribimos la palabra "confirm" en la pantalla que nos ha salido justo despues de guardar las configuraciones.

![Captura8](https://user-images.githubusercontent.com/48154086/76712708-27d67280-66e9-11ea-8b5b-67bd15423bc6.PNG)

1.8 Entramos al bucket creado y señalamos la opción de subir archivo. 

![Captura9](https://user-images.githubusercontent.com/48154086/76712724-39b81580-66e9-11ea-82b8-565c0e2eeeea.PNG)

![Captura10](https://user-images.githubusercontent.com/48154086/76712714-302ead80-66e9-11ea-8285-0b1179695a9c.PNG)

1.9 Aparecerá una pantalla como la siguiente y subiremos el archivo que deseamos. 

![Captura11](https://user-images.githubusercontent.com/48154086/76712716-345acb00-66e9-11ea-99a2-78f32db87b06.PNG)

1.10 En mi caso subí una imagen de tipo jpg de un paisaje de Bogotá.

![Captura12](https://user-images.githubusercontent.com/48154086/76712717-36248e80-66e9-11ea-9465-921da18f24e5.PNG)

1.11 Aparecerá la imagen como subida exitosamente y damos click en ella para entrar. 

![Captura13](https://user-images.githubusercontent.com/48154086/76712718-36bd2500-66e9-11ea-8a7a-bbd84640b117.PNG)

1.12 Damos click en la URL del objeto. 

![Captura14](https://user-images.githubusercontent.com/48154086/76712720-3755bb80-66e9-11ea-8b6b-cfaa90971336.PNG)

1.13 En la siguiente pantalla podemos ver la url del objeto y la imagen que se subió. 

![Captura15](https://user-images.githubusercontent.com/48154086/76712721-37ee5200-66e9-11ea-8323-dab4c5b214fe.PNG)


## 2. Desplegar un formulario dinámico usando EC2

2.1 Volvemos a la consola principal de servicios de AWS y buscamos la opción EC2. 

![CapturaE1](https://user-images.githubusercontent.com/48154086/76713246-3faff580-66ed-11ea-851e-a0aab47596e3.PNG)

2.2  En la parte izquierda de nuestra pantalla encontraremos el siguiente menú. Damos click en la opción "Instances" y creamos una nueva instancia. 


![CapturaE2](https://user-images.githubusercontent.com/48154086/76713247-4179b900-66ed-11ea-8552-e7af30868f1e.PNG)

![CapturaE3](https://user-images.githubusercontent.com/48154086/76713249-42124f80-66ed-11ea-9466-4c9b19341d3d.PNG)

2.3 Escogemos la máquina Amazon Linux 2 AMI.

![CapturaE4](https://user-images.githubusercontent.com/48154086/76713250-42aae600-66ed-11ea-9dbc-4cee1837830a.PNG)

2.4 Escogemos el tipo de instancia y tomamos la que sale por defecto. 

![CapturaE5](https://user-images.githubusercontent.com/48154086/76713251-42aae600-66ed-11ea-8dd3-0f218312fcc0.PNG)

2.5 Para terminar de construir la instancia damos click en la opción lunch. 

![CapturaE6](https://user-images.githubusercontent.com/48154086/76713252-43437c80-66ed-11ea-87b1-aef3a7ead502.PNG)

2.6 A continuación creamos un par de llaves en mi caso se llamaran "sarahv" luego damos click en la opción Download Key Pair y luego Launch Instances. 

![CapturaE7](https://user-images.githubusercontent.com/48154086/76713253-4474a980-66ed-11ea-82f6-e10451002666.PNG)

![CapturaE8](https://user-images.githubusercontent.com/48154086/76713254-450d4000-66ed-11ea-80d2-0673b2a959c5.PNG)

2.7 Finalmente vemos todas las instancias y ponemos a correr la que fue creada recientemente.

![CapturaE9](https://user-images.githubusercontent.com/48154086/76713256-45a5d680-66ed-11ea-8f46-ca9b7abe4c5a.PNG)

![CapturaE10](https://user-images.githubusercontent.com/48154086/76713261-49395d80-66ed-11ea-8d97-2b3c256582a0.PNG)
      
## 3. Enlazar el formulario a una base de datos relacional o no-relacional, para almacenar y traer los datos almacenados. Use servicios de base de datos de AWS.

3.1 Para crear la base de datos buscamos en el menú de servicios de AWS "RDS" el cual es el administrador de bases de datos relacionales.

![CapturaR1](https://user-images.githubusercontent.com/48154086/76713790-36c12300-66f1-11ea-891f-628e8e5951a1.PNG

3.2 A continuación damos click en la opción "Create Database" 

![CapturaR2](https://user-images.githubusercontent.com/48154086/76713791-3759b980-66f1-11ea-940b-5725bec8582b.PNG)

3.3 Escogemos las siguientes opciones de configuracion de nuestra base de datos:

   - Easy Create 
   
   ![CapturaR4](https://user-images.githubusercontent.com/48154086/76713794-388ae680-66f1-11ea-904b-639e3c40ff2e.PNG)
   
   - Escogemos el motor de base de datos en nuestro caso Postgresql
 
   ![CapturaR5](https://user-images.githubusercontent.com/48154086/76713795-388ae680-66f1-11ea-9d7c-51edc7f2f747.PNG)

   - Tamaño "Free tier"
   
   ![CapturaR6](https://user-images.githubusercontent.com/48154086/76713796-39237d00-66f1-11ea-8618-a92fbfc496b7.PNG)
   
   - Configuramos el nombre y la clave de la base de datos 
   
   ![CapturaR7](https://user-images.githubusercontent.com/48154086/76713797-3a54aa00-66f1-11ea-8aac-afa7b6d72c77.PNG)
   
3.4 Finalmente damos click en la opción "Create Database"

   ![CapturaR8](https://user-images.githubusercontent.com/48154086/76713799-3aed4080-66f1-11ea-9fc4-086a76106832.PNG)
   

3.5 Podemos ver la configuración de nuestra base de datos creada recientemente.

![CapturaR10](https://user-images.githubusercontent.com/48154086/76713803-3c1e6d80-66f1-11ea-862d-6947a1a5bd7a.PNG)

![CapturaR11](https://user-images.githubusercontent.com/48154086/76713804-3cb70400-66f1-11ea-8dac-32d70f538685.PNG)


## 4. Configurar un VPC para gestionar la seguridad y los permisos de acceso a sus servidores.
   
4.1 A continuación configuraremos la seguridad de la instancia que se creo en el Paso 2 de EC2 con el fin de abrir el puerto 5432 Postgresql para que pueda enviar y recibir información por medio de este.

Ponemos a correr  en la instancia

![CapturaV1](https://user-images.githubusercontent.com/48154086/76714162-915b7e80-66f3-11ea-8bd9-4be2b2460d37.PNG)

4.2 Seleccionamos en security groups "launch-wizard-6"

![CapturaV2](https://user-images.githubusercontent.com/48154086/76714163-91f41500-66f3-11ea-94e4-91eff2c3ed3a.PNG)

4.3 Creamos un grupo de seguridad.

![CapturaV3](https://user-images.githubusercontent.com/48154086/76714165-93bdd880-66f3-11ea-8e4c-71c505070327.PNG)

4.4 Configuramos Inbound Rules con PostgreSQL 

![CapturaV4](https://user-images.githubusercontent.com/48154086/76714167-94566f00-66f3-11ea-8cc5-20b0878218e5.PNG)

4.5 Configuramos Outbound Rules con PostgreSQL

![CapturaV5](https://user-images.githubusercontent.com/48154086/76714169-96b8c900-66f3-11ea-8fb7-ef386e8197d3.PNG)

4.6 Finalmente podemos ver como quedo creado nuestro grupo de seguridad.

![Capturav6](https://user-images.githubusercontent.com/48154086/76714171-97515f80-66f3-11ea-8625-2e0ccdb7e648.PNG)

## Autor 

Sarah Camila Vieda Castro



## Despliegue
[![CircleCI](https://circleci.com/gh/camilavieda04/Patrones-Arquitecturales-Lab6-Arep.svg?style=svg)](https://circleci.com/gh/camilavieda04/Patrones-Arquitecturales-Lab6-Arep)



## Licencia 

This project is licensed under the GNU General Public License v3.0 - see the LICENSE.md file for details.
