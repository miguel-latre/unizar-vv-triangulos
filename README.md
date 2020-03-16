## Verificación y Validación
# Problema introductorio para la escritura de tests con JUnit

Plantilla de proyecto IntelliJ para resolver el problema de 
determinación del tipo de un triángulo en función de las
longitudes de sus lados.

Basado en Myers, G. J.; Badgett, T.; Sandler, C. (2011). 
_The Art of Software Testing_, 3rd Edition. John Wiley and Sons Ltd.


### Determinación del tipo de un triángulo en función de las longitudes de sus lados

Los objetos de la clase `TipoTriangulo` enumeran los distintos
tipos de triángulos: `EQUILATERO`, `ISOSCELES` y `ESCALENO`.

La clase `Triangulo`, en su estado actual, consta simplemente de
un constructor que permite crear un nuevo `Triangulo` especificando
las longitudes enteras de sus tres lados y un método que devuelve el
tipo del triángulo a través de un valor de la enumeración 
`TipoTriangulo`. 


### Tareas

 1. Descargad el proyecto de Moodle o clonadlo desde GitHub.
 1. Abridlo desde IntelliJ o Android Studio (a través del menú `Open`, no desde el de `Import project`).
 2. Observad la estructura del proyecto y, en particular, las clases `Triangulo`,`TipoTriangulo` y sus métodos.
 3. Para que los tests que escribamos con JUnit no se mezclen con el código fuente del proyecto,
    cread un nuevo directorio de código fuente denominado `test` y ubicado en el directorio `src`.
    Puede hacerse directamente desde IntelliJ o Android Studio a través del menú contextual (botón derecho) del
    directorio `src`.
 5. Dentro del directorio `test`, crea otro denominado `java`.
 6. Marcad este último como raíz del código fuente de test: menú contextual, opción `Mark Directory as` (está
    hacia el final del menú) y después `Test sources root`. El color del directorio tiene que cambiar a verde.
 7. Os ha tenido que quedar una estructura como esta:
 
 