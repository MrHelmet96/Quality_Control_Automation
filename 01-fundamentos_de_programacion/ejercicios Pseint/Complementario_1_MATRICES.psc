Algoritmo Complementario_1_MATRICES
	Definir matriz, n Como Entero
	
	Escribir "Ingrese el orden de la matriz"
	Leer n
	Dimension matriz[n,n]
	
	llenarMatriz(matriz,n)
	mostrarMatriz(matriz,n)
FinAlgoritmo

SubAlgoritmo llenarMatriz(mat Por Referencia, dimen)
	Definir i, j Como Entero
	Para i=0 Hasta dimen-1 Hacer
		Para j=0 Hasta dimen-1 Hacer
			Si i==j Entonces
				mat[i,j]=0
			SiNo
				mat[i,j]=Azar(10)
			FinSi
		FinPara
	FinPara
FinSubAlgoritmo

SubAlgoritmo mostrarMatriz(mat,dimen)
	Definir i,j Como Entero
	Limpiar Pantalla
	Escribir ""
	Para i=0 Hasta dimen-1 Hacer
		Para j=0 Hasta dimen-1 Hacer
			Si j==dimen-1 Entonces
				Escribir mat[i,j]
			SiNo
				Escribir Sin Saltar mat[i,j] ", "
			FinSi
		FinPara
	FinPara
	Escribir ""
	Escribir "Presione una tecla para cerrar"
FinSubAlgoritmo