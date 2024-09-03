Algoritmo ParOImpar
	
    // Declaración de variables
    Definir numero Como Entero
	
    // Solicitar el número al usuario
    Escribir "Ingrese un número entero: "
    Leer numero
	
    // Verificar si el número es par
    Si numero MOD 2 = 0 Entonces
        Escribir "El número ", numero, " es par."
    SiNo
        Escribir "El número ", numero, " es impar."
    FinSi
	
FinAlgoritmo