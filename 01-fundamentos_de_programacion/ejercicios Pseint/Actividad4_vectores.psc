Algoritmo Actividad4_vectores
	Definir arreglo, i, tamanio, numeroAleatorio, posicion, mayor Como Entero
	Escribir "Ingrese el tama�o del arreglo"
	Leer tamanio
	Dimension arreglo[tamanio]
	Para i = 0 hasta tamanio - 1 Hacer
		Escribir "Ingrese el n�mero, " i+1 "/", tamanio
		leer arreglo[i]
	FinPara
	
	Para i = 0 Hasta tamanio -1 Hacer
		Escribir arreglo[i], "|" Sin Saltar
	FinPara
	Escribir ""
	
	mayor = 0
	Para i = 0 Hasta tamanio - 1 Hacer
		Si arreglo[i] >= mayor Entonces
			mayor = arreglo[i]
		FinSi
	FinPara
	Escribir "El n�mero m�s grande es ", mayor
	
FinAlgoritmo