Se asume...
- Java 8.
- Eclipse Neon.
- MySQL 5.X, acceso al usuario root u otro con mismos privilegios.
- Base de datos llamada 'tw1' ya creada.
- Apache-Tomcat-8.5.20
- Apache-Maven-3.5.0

1 - Crear en MySQL el usuario 'tallerweb1' con el password 'tallerweb1'. Ejecutar la sentencia..

GRANT ALL PRIVILEGES ON tw1.* To 'tallerweb1'@'localhost' IDENTIFIED BY 'tallerweb1';

2 - En Eclipse..

File -> Import -> Git -> Projects from Git -> Next -> Clone URI -> Next -> 
(Pegar en URI sin comillas: 'https://github.com/jmartingimenez/tpTwLedesmaGimenez.git')
-> Next -> Next -> Next -> Next -> Finish
