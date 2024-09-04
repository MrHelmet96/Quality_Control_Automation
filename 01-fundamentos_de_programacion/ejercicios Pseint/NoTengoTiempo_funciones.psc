Algoritmo NoTengoTiempo
	Definir n1 Como Entero
	Escribir "Ingrese numero: "
	Leer n1
	Escribir "-----------------------------------------------------------------"
	Escribir " * La suma de todos los divisores de " n1 " es: " SumaDeDivisores(n1) " * "
	Escribir "-----------------------------------------------------------------"
FinAlgoritmo

Funcion suma <- SumaDeDivisores(num)
	Definir suma, i Como Entero
	suma = 1
	Para i = 2 Hasta num - 1 Hacer
		Si num mod i == 0 Entonces
			suma = suma + i
		FinSi
	FinPara
FinFuncion