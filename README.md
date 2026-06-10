# Dinamicas Lineales

## Angelo Altamirano

# fecha: 08/06/2026

# Dinamicas Lineales

## Angelo Altamirano

# fecha: 08/06/2026

# Ejercicio 1: Invertir una cadena de texto con pila

### Descripción
Implementación de un algoritmo que invierte el orden de los caracteres de una cadena de texto utilizando una estructura de datos de tipo pila. 

Se desarrolló el método `invertString`, el cual realiza las siguientes acciones:
Convierte la cadena de texto de entrada en un arreglo de caracteres.
Almacena cada carácter secuencialmente dentro de una pila mediante el método `push()`.
Aprovechando la propiedad de las pilas donde el último elemento en entrar es el primero en salir, se desapilan los caracteres uno a uno con `pop()` para reconstruir e invertir el texto original.

## Imagen de salida en consola

![alt text](<assets/Salida en consola.png>)

## Imagen codigo ejercicio 1

![alt text](assets/Codigo.png)

# Ejercicio 2: Verificar palíndromos con pila

## Fecha: 10/06/2026

### Descripción
Implementación de un algoritmo para determinar si una palabra o cadena de texto es un palíndromo utilizando una estructura de datos lineal de tipo pila.

Se desarrolló el método `esPalindromo`, el cual funciona bajo la siguiente lógica:
Instancia una estructura `Stack<Character>` donde se insertan, uno por uno, todos los caracteres de la cadena original empleando el método `push()`.
Una vez llena la pila, se vuelve a recorrer la cadena original desde el principio carácter por carácter.
En cada iteración, se compara el carácter actual del texto con el carácter que se extrae del tope de la pila mediante `pop()`. 
Si en algún punto los caracteres comparados no coinciden, el método interrumpe su ejecución devolviendo `false`. Si el recorrido finaliza sin discrepancias, significa que el texto es simétrico y devuelve `true`.

### Método implementado

````java
public boolean esPalindromo(String texto) {
    Stack<Character> pila = new Stack<>();
        for(char c : texto.toCharArray()){
            pila.push(c);
        }
        for(char c : texto.toCharArray()){
            if(c != pila.pop()){
                return false;
            }
        }
        return true;
}
````

# Imagen Codigo

![alt text](assets/CodigoE2.png)

# Imagen salida en Consola

![alt text](<assets/Salida en consola E2.png>)
