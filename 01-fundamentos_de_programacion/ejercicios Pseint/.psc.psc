//Realiza un programa que lea 10 n�meros reales por teclado,
//los almacene en un arreglo y muestre por pantalla la suma y
//multiplicaci�n de todos los n�meros ingresados al arreglo.
Algoritmo SumaYMultiplicacionDeNumeros
	Dimension num[10]
	Definir suma, multiplicacion, num, i Como Real
	suma = 0
	multiplicacion = 1
	//Pedir al usuario que ingrese 10 n�meros reales
	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese el n�mero ", i, ": "
		Leer num[i]
		suma = suma + num[i]
		multiplicacion = multiplicacion * num[i]
	FinPara
	//Mostrar resultados
	Escribir "La suma de los n�meros es: ", suma
	Escribir "La multiplicaci�n de los n�meros es: ", multiplicacion
FinAlgoritmo