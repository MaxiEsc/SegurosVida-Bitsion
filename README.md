# SegurosVida-Bitsion
Proyecto solicitado para la prueba tecnica de Bitsion

![Titulo de programa](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/titulp.png?raw=true)

En esta oportunidad se presenta el proyecto web app aplicacion solicitada para la prueba tecnica.

Presentamos la base de datos que se va a utilizar mediante pantallas
Muestra la tabla persona
![Tabla Persona y sus columnas](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/Base%20de%20datos.png?raw=true)

Tabla rol y sus columnas

![Tabla rol y sus columnas](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/base%20de%20datos%20tabla%20de%20rol.png?raw=true)

Aqui como se puede apreciar podemos ver que para el rol del administrador se le asigna el siguiente texto.
ROLE_ADMIN

en el rol sus usuario se el asigna el texto: ROLE_USER

continuemos con la siguiente tabla

![Tabla usuario y sus columnas](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/tabla%20usuario.png?raw=true)

en este caso se puede observar que posee una clave encriptada por parte de las librerias de Java entonces a la hora de crear al usuario se puede utilizar el archivo de com.maxsoft.holamundo.util para encriptar las contraseñas, las excriptaciones siempre seran distintas por mas que la contraseña sea igual.

diferencias entre el rol usuarios y administrador

El usuario administrador podra realizar las operaciones de lectura, alta, baja y modificacion sobre la bases de datos

Esta es la pestaña de administrador.

![Pantalla Administrador de la app](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/pantalla%20administrador.png?raw=true)

ahora esta es la pantalla para el rol de usuario del sistema.

![Pantalla Usuario de la app](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/pantalla%20usuario.png?raw=true)
En esta ocasión presentamos la pantalla de usuario del sistema, por lo cual, podemos apreciar en el sistema las siguientes caracteristicas caracen de las opreciones de alta,baja y modificacion, con lo que solo se podra leer datos.
 
Continuamos con la pantalla de agregar cliente del modo administrador

![Agregar cliente del rol de administrador](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/pantalla%20agregar%20cliente.png?raw=true)

Aqui podemos apreciar todos los atributos necesarios para llevar a cabo un proceso de alta de cliente en esta app con esto dado a las caracteristicas necesarias en la peticion de la prueba tecnica, una vez completada con sus condiciones necesarias, entonces podemos dar por hecho un alta de cliente en el sistema.

![Editar cliente del rol de administrador](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/pantalla%20editar%20cliente.png?raw=true)

Aqui podemos ver los datos que hay que completar para realizar la edicion de cliente en el sistema, si bien esta pantalla tambien sera utilizada en caso de presentar algun error en el formulario de carga de alta, esta ultima redirigirá en esta pantalla junto a un cartel que indicara que no se han cargado correctamente los datos.

![Pantalla para mostrar todos los datos del cliente](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/pantalla%20mostrar%20Cliente.png?raw=true)

En esta pantalla es para el administrador para que puede observar los datos del cliente si bien, si bien se penso mucho para que el usuario pueda acceder tambien se descarto por no conocer en fin del alcance de negocio del mismo.

Internacionalizacion:

Esta app posee el concepto de internacionalizacion, el cual le permite tener multiidioma, en los mensajes basico y de advetencia de los mismos, si bien el concepto de internacionalizacion solo es valido para la web en si, los datos cargados en la base de datos solo se pueden cargar en un idioma y se mostraran en el idioma que se cargo oficialmente, ya que son datos puros que van directos a la base de datos.

a continuacion la pestañas anteriores mostradas en ingles.

![Internacionalizacion 1](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/internacionalizacion%201.png?raw=true)

![Internacionalizacion 2](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/internacionalizacion%202.png?raw=true)

![Internacionalizacion 3](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/internacionalizacion%203.png?raw=true)
 
![internacionalizacion 4](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/internacionalizacion%204.png?raw=true)
 
![Internacionalizacion 5](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/internacionalizacion%205.png?raw=true)

Como veran esta app Funciona con las siguientes configuracion si bien ha sido programada con Apache netbeans 12.6 con el plugin de Spring boot

Aqui dejo sus configuraciones principales, lo de mas en el pom

![config 1](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/configuracion1.png?raw=true)

![config 2](https://github.com/MaxiEsc/SegurosVida-Bitsion/blob/main/markdown/imagenes/configuracion2.png?raw=true)



