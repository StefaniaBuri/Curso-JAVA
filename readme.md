---
Title: IFCD052P JAVA
Place: Centro de Formación Digital San Blas
Empresa: CAS - https://cursoscastraining.es/centro-de-formacion-digital-san-blas/curso/curso-programacion-en-java/
---

## CALENDARIO 📆

### DIA 1

- Configurar _VNC VIEWER_
- ¿Que es Java? - Lenguajes compilados / interpretados -> mixto
- JVM(java virtual machine): emulador que permite que java se ejecute -> JRE(java runtime environment) (usuario) || _JDK_(desarrollador)
- Posibles herramientas: IDE v. Editor de Código
- Instalar _VSC_ + _Plugin_ Java
- Otras extensiones: theme, icons
- Ejemplo _HOLA MUNDO_
- Instalar y configurar _GIT_

### DIA 2

- Instalar y configurar git (continuación)
- Conceptos
  - Estado de los archivos: U - M - A (S) - C
  - Areas: WorkArea - Stage - Repositorio
- Uso básico de Git
  - Creación del repositorio: git init
  - git add y git commit
  - git status y git log
- GitHub: hosting de repositorios
  - Conexión con GitHub: git remote add
  - git push y git pull
  - git clone

### DIA 3

- Review: Git - GitHub
- Java: Hola Mundo
- Estructura de un programa
- public class / método _main_
- println()
- Tipos de datos primitivos
- Números (6)
- Boolean y Chart
- Datos referenciados (objetos): String
- Formatos de la información: Template string
- Ejercicio: Entidad con diversos tipos de datos
- Entrada de información: Scanner
- Concepto de Clases y Objetos
- Ejercicio: Entidad con entrada de los datos

### DIA 4

- Repaso tipos de datos
- Profundizar clases y objetos
- Crear una clase e instanciar objetos
- Elementos estáticos de una clase
- printf
- Operadores
- Ejercicio: clase Car

### DIA 5

- Review:
  - Instalación y configuración del entorno
  - Datos y variables
  - Tipos primitivos
  - Clases y objetos
  - Entrada y salida para el usuario
- Elementos estáticos de una clase
  - Ejemplo clase Car
  - Class Calc: cálculos básicos
- Concepto de funciones:
  - Definición Función: conjunto de instrucciones con nombre.
  - Parámetros y argumentos
  - Retorno y efectos secundarios
  - Invocación
  - Ámbito de las variables
  
  ### DIA 6

- Review: Funciones
  - Ejercicio: Areas
  - Sobrecarga de funciones
- Args en la función main
  - argumentos desde CLI
  - Conversión de String a enteros
  - Uso de métodos públicos de otras clases
- Operadores:
  - Asignación
  - Aritméticos
  - Comparación
- Condiciones: IF
  - Ejercicio: 
    - Números pares/impares
    - if
    - if defensivo: precondiciones
    - valores previos (else por defecto)
    - Saludo según edad: else if

### DIA 7

- Review: Funciones
- Solución ejercicio AgeGreetings
- Ejercicio: School
  - else if()
  - Arrays
  - Ternarios
- Switch / case
  - Ejemplo: Week
  - Ejercicio: WeekTranslator
- Operadores lógicos (AND - OR)
- Ejercicio: Tienda

### DIA 8

- Review
- Diferentes soluciones ejercicio Shop
- Ampliación Shop
  - Constantes
  - Condiciones
  - Valores por defecto iniciales
  - Cálculo de valores
  - Salida con formato usando template strings
  - Reutilización de código
- Números random:
  - Librería: Math.random()
  - Class Random
- Ejercicio: Roll dice
- Ejercicios extras

### DIA 9

- Iteraciones: bucles:
  - Contadores(for)
  - Centinelas(while / do while)
- Iteraciones con contador
  - for
  - foreach
- Uso con arrays
- Bucle infinito -> condición de salida
- Ejemplo: tablas de multiplicar
- Ejemplo: número primo
- Ejemplo: lista de números primos

### DIA 10

- Solución del ejercicio números primos
- Iteraciones con centinela (while)
  - Condición en el bucle
  - Salida mediante break
  - continue
- Ejemplo: manejo de Strings
- Ejemplo: palíndromo
- Otros ejercicios propuestos

### DIA 11

- Iteraciones do-while.
  - Diferencia con while
- Uso de iteraciones al pedir datos al usuario
- Arrays: vectores[] y matrices[][]
  - Creación
  - Recorrido: for / for each
- Ejercicio: Pedirle palabras al usuario

### DIA 12

- Ejercicios:
  - Fibonacci
  - Piedra, papel o tijeras
  - Estadísticos -> Varargs
  - Factorial

### DIA 13

- Factorial(recursivo)
- VSC: Proyectos y packages
- OOP
  - Concepto
  - Abstracción
  - Encapsulación
  - Herencia
  - Polimorfismo
- Abstracción: clases y objetos
  - Ejemplo: clase Person
  - Propiedades y métodos
  - Propiedades estáticas
  - Constructores
  - Miembros estáticos
- Encapsulación
  - Ámbitos
    - Private
    - Protected (default)
    - Public
- Ámbitos y packages
- Ejercicio: clase Character

### DIA 14

- Ejercicio: clase Character
  - Añadir Enum
  - Añadir métodos de instancia
  - Añadir static: id
- Ejercicio: Factura (Invoice)

### DIA 15

- Ejercicio: Factura (Invoice) - solución:
  - Análisis semántico -> modelado
  - Relaciones de dependencia (composición)
  - Crear clases y enum
  - Repartir responsabilidades
  - En la terminal escribir: `chcp 65001` to switch the command prompt encoding to UTF-8. Para que aparezca el €.

- Herencia:
  - class extends
  - constructor: super()
  - override methods: super.method()
  - visibilidad: public, protected, private, "default"
  - Ejemplo Pet -> Dog, Cat
  - instance of
  - Object: toString()

### DIA 16

- Equality y tipos de datos:
  - Primitivos
  - Wrapper objects
  - Strings
  - Objetos, clases propias
  - Arrays y listas
  - Valores y referencias
- Comparación
  - Operador ==
  - Método equals
  - Override de equals
- Otros métodos y su override
  - Método toString
- Casting o coerción
- Paso de parámetros a funciones
  - Argumentos de tipo referencia
  - Clonado de objetos
  - Clonado de Arrays y listas

### DIA 17

- Review
- Clonado de objetos
- Clonado y otros métodos de arrays
- Polimorfismo (& herencia)
  - Overload
  - Override
- Clases abstractas
- Interfaces
  - Ejemplo de segregación de interfaces

### DIA 18

- Ejercicio: supermarket(part1)
  - Análisis y diseño.
  - UML
  - Interfaces
- Estructura de datos: Set
- Clases principales:
  - Supermarket (main)
  - Order
  - Container
  - Product
- Enums

### DIA 19

- Ejercicio: supermarket(part2)
- Review
- Jerarquía de Clases
  - Container (Abstract) -> Box / Bag
- Instancia de objetos
  - Override de toString
- Jerarquía de Clases
  - Product (Abstract)
    - Food
    - Hygiene
    - Drugstore
    - Pet
- Lógica del embolsado

### DIA 20

- Ejercicio: Supermarket final
- Lógica del embolsado(continuación)
- Javadoc
- Proyectos Maven: gestor de dependencias.
- Errores y excepciones en Java
  - Errores
  - Tipos de excepciones en Java
    - Runtime exceptions: IndexOutBoundsException, NullPointerException
      - Runtime: Exception en tiempo de ejecución
    - Checked exceptions: Java detecta la exception, avisa y obliga a controlarla.
- Aparición de excepciones en Java
  - Creación de excepciones en el sistema
  - Tratamiento de excepciones:
    - Throws: avisa que ha detectado una posible exception checked dentro
    - Throw: lanza la exception, lo usa:
      - Java
      - Programador: exception de Java / exception propias
    - Try / Catch: gestiona la exception. Try vigila, Catch captura la exception
    - Finally

### DIA 21

- Review: Maven
- Lanzamiento de runtime exceptions propias de java
  - IndexOutOfBoundsException -> throw en el código de charAt()
  - NullPointerException
  - ClassCastException 
- Api de las exceptions: API(Application Programming Interface) interfaz de programación
- Excepciones propias:
  - RuntimeException - TechnicalException
  - Checked Exception - BusinessException
- Ejemplo: Calculator
  - Refactorización OOP
  - Division por 0 - ArithmeticException
    - Rethrow como BusinessException
    - Exception cause
  - Scanner y Try with resources
- Ejercicio: Factorial
  - Refactorización OOP
  - Gestión de excepciones

### DIA 22

- Ejercicio: Factorial (solución)
  - Refactorización OOP
  - Formateo de números: NumberFormat
  - Gestión de excepciones
- Excepciones en Java (continuación)
  - Finally
    -Uso después de un catch con throw o return
  - Novedades
    - Con recursos (try-with-resources)
    - Multi-captura de excepciones
  - Malas prácticas
    - No tratadas
    - Tratadas incorrectamente (e.g. imprimir stack trace: e.printStackTrace())
    - Perder la historia
    - Generalización
- Arquitectura/Patrones de diseño
  - MVC
  - Vistas y controladores
- Ejemplo: calculadora
  - Vista: CalcView
  - Controlador: CalcController
  - Aplicación: CalcApp
  - Inyección de dependencias

### DIA 23

- Arquitectura/Patrones de diseño (continuación)
  - Ejercicio: calculadora
    - Gestión de excepciones
- Testing
  - ¿Qué es un test?
  - Tipos de test
    - Unitarios
    - De integración
    - De sistema
  - Herramientas de testing en Java
    - JUnit
    - Mockito

### DIA 24

- Tests unitarios con JUnit
  - Configuración (review)
  - Configuración sin Maven
- Tests de CalcController
  - assertEquals
  - casos de uso
  - casos con excepciones
    - assertTrue() / fail
  - valores especiales
    - Double.NaN
    - Double.POSITIVE_INFINITY

### DIA 25

- Actualizaciones del sistema
  - JDK 21
  - Maven 3.9
  - JUnit 5
  - Mockito

- Tests unitarios con JUnit
  - casos con excepciones -> lambdas
  - métodos privados en la vista
  - tests de la vista
    - mock input (Streams)
    - mock output (Streams)
    - mock controller (Mockito)
      - casos correctos thenReturn()
      - casos con excepciones thenThrow()
  - TDD

### DIA 26

- Ampliación de CLI
  - 2 menus
  - System.exit(0)
  - test ajustados al nuevo CLI
- Test parametrizados
  - Instalación con Maven
  - Uso
- Lambdas
  - Definición: @FunctionalInterface
  - Uso
- Datos
  - Valores primitivos: números
  - Objetos numéricos

### DIA 27

- Datos (continuación)
  - Strings / StringBuffers
  - LocalDates / LocalTimeDates
  - Ejemplo: calcular edad
- Arrays
  - Instancias
  - Clase de utilidad Arrays
- Genéricos
  - Creación
  - Uso
- Collection: Introducción

### DIA 28

- Collections
  - Interface Collections
  - List
    - ArrayList
    - LinkedList
  - Set
    - HashSet
    - LinkedHashSet
    - TreeSet
  - Ejercicio: Listas

### Día 29

- Iterators
- Ejercicio: solución
  - Versión básica
  - Versión OOP
- Ejercicio: Palíndromo (Stack)
- Ejercicio: Figuras (Listas & Interfaces)
- Ejercicio propuesto: Baraja

### Día 30

- Ejercicio propuesto: Baraja
- Maps
- Ejercicio:
  - PhoneAgenda (Map)
  - PhoneAgenda (sin Map)

### Día 31

- Solución PhoneAgenda (Map v. sin Map)
  . == v.equals
  . uso de streams
- Persistencia: Ficheros(1)
  - java.io.File
  - FileSystem
  - FileWriting

### Día 32
- Solución ejercicio SaveUserData
- Persistencia: Ficheros(2)
  - java.nio.file.Path
  - manejo de Streams
- Ejercicio: completar FileSystem2

### Día 33

- Revisión FileSystem2
- Streams
- Serialización
  - JSON
- Serialización JSON con Jackson
  - Configuración de Jackson
  - Ejemplo: serializar un objeto
  - Ejemplo: serializar una lista de objetos
  - Problemas con LocalDate y LocalDateTime

  ### Día 34

- Serialización - JSON (continuación)
  - Serialización de fechas y horas LocalDate y LocalDateTime (https://www.baeldung.com/jackson-serialize-dates)
- Abstracción de los métodos de serialización
- CRUD
  - Concepto de CRUD
  - Patrón de diseño: Repositorio
  - Demo: interface Repository
  - Demo: entidad Product
  - Demo: ProductInMemoryRepository
- Propuestas
  - Testing de ProductInMemoryRepository
  - Demo: ProductFileRepository

### Día 35


