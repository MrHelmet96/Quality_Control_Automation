//Dada una matriz de tamaño n x m, donde n y m son valores ingresados por el usuario, se requiere implementar dos subprogramas:

//El primer subprograma se encargará de llenar la matriz con números aleatorios.
//El segundo subprograma calculará y mostrará la suma de todos los elementos de la matriz.
//Después de ejecutar ambos subprogramas, se mostrará la matriz generada junto con los resultados de la suma por pantalla.

Algoritmo Matrices_con_Funciones
	
	Definir m, n Como Entero
	Definir laMatriz Como Real
	
	Escribir "Ingrese las dimensiones de la la matriz (m,n)" Sin Saltar
	Leer m, n 
	Dimension laMatriz[m, n]
	
	llenarMatriz(laMatriz, m, n)
	mostrarMatriz(laMatriz, m, n)
	sumarElementos(laMatriz, m, n)
	
	
FinAlgoritmo

SubProceso llenarMatriz(matriz, m, n)
	Definir i, j Como Entero
	
	Para i=0 hasta m-1 Hacer
		para j= 0 hasta n-1 Hacer
			matriz[i,j] = aleatorio(1, 50)
		FinPara
	FinPara
FinSubProceso

SubProceso sumarElementos(matriz, m, n)
	
	Definir i, j como entero
	Definir sumador Como Real
	
	sumador = 0
	Para i=0 hasta m-1 Hacer
		para j= 0 hasta n-1 Hacer
			sumador = sumador + matriz[i,j]
		FinPara
	FinPara
	
	Escribir "la suma de todos los elementos de la matriz es: " sumador
FinSubProceso

SubProceso mostrarMatriz(matriz, m, n)
	Definir i, j como entero
	
	Para i=0 hasta m-1 Hacer
		para j= 0 hasta n-1 Hacer
			Escribir matriz[i,j], "; " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	