# Calculadora Basica en Java

Este es un proyecto sencillo de una calculadora 
basica en Java. La calculadora puede realizar 
operaciones de suma, resta, multiplicación y división.

## Características

- **Operaciones soportadas**:
    - Suma
    - Resta
    - Multiplicación
    - División (con manejo de división por cero)
- Interfaz de usuario basada en consola.
- Manejo de errores para entradas no válidas.

## Requisitos

- **Java**: Versión 21 o superior.
- **Maven**: Para la gestión del proyecto.

## Estructura del Proyecto

```
CalculadoraJava/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── Calculadora/
                └── CalculadoraBasica.java
```

## Como Ejecutar el proyecto

1. Clonar este repositorio:
    1. Clona este repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd CalculadoraJava

## Ejemplo de uso
    ```
    2. Compilar el proyecto:
    ```bash
    mvn clean install
    ```
    3. Ejecutar la calculadora:
    ```bash
    mvn exec:java -Dexec.mainClass="Calculadora.CalculadoraBasica"
    ```
    4. Seguir las instrucciones en la consola para realizar operaciones.

** Calculadora Básica **
1. Suma
2. Resta
3. Multiplicación
4. División
5. Salir
Elige una opción: 1
Ingresa el primer número: 5
Ingresa el segundo número: 3
Resultado: 8.0

## Licencia

Este proyecto no tiene una licencia específica, pero se puede usar libremente para fines educativos y de aprendizaje.


## 🚀 Mejoras Futuras

    Añadir operaciones avanzadas (potencias, raíces)

    Implementar historial de operaciones

    Crear interfaz gráfica con Java Swing

    Agregar soporte para múltiples operaciones en cadena

Hecho con ❤️ por Joao - ¡Si te gusta el proyecto déjale una ⭐!
