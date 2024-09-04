Algoritmo sumaConFuncion
	Definir nro1, nro2, suma Como Real
	
	Escribir "Ingrese un número"
	leer nro1
	Escribir "Ingrese otro número"
	leer nro2
	
	suma = calcularSuma(nro1, nro2)
	
	Escribir "La suma entre " nro1 " y " nro2 " es: " suma
	
FinAlgoritmo

Funcion resultado <- calcularSuma(n1, n2)
	Definir resultado Como Real
	resultado = n1 + n2
	FinFuncion
	