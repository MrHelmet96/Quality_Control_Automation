Algoritmo MatrizSuma
    Definir filas, num1, num2, suma, i, matriz Como Entero
	
    Escribir "Ingrese el número de filas: "
    Leer filas
	
	Dimension matriz[filas, 3] 
	
    // Llenar la matriz con valores aleatorios
    Para i = 0 Hasta filas - 1 Hacer
        num1 = Aleatorio(1, 10)
        num2 = Aleatorio(1, 10)
        suma = num1 + num2
        matriz[i, 0] = num1
        matriz[i, 1] = num2
        matriz[i, 2] = suma
    FinPara
	
    // Mostrar la matriz con el formato solicitado
    Escribir "La matriz resultante es:"
    Para i = 0 Hasta filas - 1 Hacer
        Escribir matriz[i, 0], " | ", matriz[i, 1], " | ", matriz[i, 2], " -> ", matriz[i, 2], " se obtuvo de sumar ", matriz[i, 0], " + ", matriz[i, 1]
    FinPara
FinAlgoritmo