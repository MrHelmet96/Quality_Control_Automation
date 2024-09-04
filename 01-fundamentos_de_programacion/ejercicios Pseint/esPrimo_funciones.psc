Algoritmo esPrimo_funciones
	definir num Como Entero
	
	Escribir "ingrese un número"
	leer num
	
	si determinarPrimo(num) == falso Entonces
		Escribir num, " no es primo"
	SiNo
		Escribir num, " es primo"
	FinSi
	
FinAlgoritmo

Funcion esPrimo <- determinarPrimo(n)
	definir esPrimo Como Logico
	definir i Como Entero
	
	esPrimo = Verdadero
	si n > 2 Entonces
		para i = 2 Hasta n - 1 Hacer
			si n mod i == 0 Entonces
				esPrimo = falso
			FinSi
		FinPara
	FinSi
	
	
FinFuncion
	