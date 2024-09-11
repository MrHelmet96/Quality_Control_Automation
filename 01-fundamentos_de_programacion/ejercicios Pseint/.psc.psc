//Realiza un programa que lea 10 números reales por teclado,
//los almacene en un arreglo y muestre por pantalla la suma y
//multiplicación de todos los números ingresados al arreglo.
Algoritmo SumaYMultiplicacionDeNumeros
	Dimension num[10]
	Definir suma, multiplicacion, num, i Como Real
	suma = 0
	multiplicacion = 1
	//Pedir al usuario que ingrese 10 números reales
	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese el número ", i, ": "
		Leer num[i]
		suma = suma + num[i]
		multiplicacion = multiplicacion * num[i]
	FinPara
	//Mostrar resultados
	Escribir "La suma de los números es: ", suma
	Escribir "La multiplicación de los números es: ", multiplicacion
FinAlgoritmo