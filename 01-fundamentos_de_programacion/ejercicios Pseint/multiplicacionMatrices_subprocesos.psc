Algoritmo multiplicacionMatrices
	Definir n, m, matriz como Entero
	n = 3
	m = 3
	
	Definir matrizA, matrizB, matrizC Como Entero
	Dimension matrizA(n,m)
	Dimension matrizB(n,m)
	Dimension matrizC(n,m)
	
	llenarMatrizA(matrizA, n, m)
	llenarMatrizB(matrizB, n, m)
	PruductoMatrizC(matrizA, matrizB, matrizC, n, m)
	
FinAlgoritmo

SubProceso llenarMatrizA(matrizA, n, m)
	Definir i, j Como Entero
	Escribir "La matriz A es: "
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			matrizA[i, j] = Aleatorio(1,10)
			Escribir Sin Saltar matrizA[i,j], " "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso

SubProceso llenarMatrizB(matrizB, n, m)
	Definir i, j Como Entero
	Escribir "La matriz B es: "
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			matrizB[i, j] = Aleatorio(1,10)
			Escribir Sin Saltar matrizB[i,j], " "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso

SubProceso PruductoMatrizC(matrizA, matrizB, matrizC, n, m)
	Definir i, j Como Entero
	Escribir "La matriz C es:"
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			matrizC[i, j] = MatrizA[i, j]* MatrizB[i, j]
			Escribir Sin Saltar matrizC[i,j], " "
		FinPara
		Escribir "" // Salto de línea después de cada fila
	FinPara
FinSubProceso