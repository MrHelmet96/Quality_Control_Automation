Algoritmo buscarEn_MATRIZ
	
	Definir m, n, matrix, num_user Como Entero
	Dimension matrix(5,5)
	
	Escribir "Ingrese un número para buscarlo en la matriz"
	Leer num_user
	
	llenado(matrix)
	encontrar(matrix,num_user,m,n)
	mostrarMatriz(matrix, m, n)
FinAlgoritmo


Subproceso llenado(matrix)
	Definir m,n Como Entero
	Para m=0 hasta 4 Hacer
		para n=0 hasta 4 Hacer
			matrix[m,n] = aleatorio(10, 40)
		FinPara
	FinPara
FinSubProceso

Subproceso encontrar(matrix,num_user,m Por Referencia,n Por Referencia)
	Definir logic como logico
	logic=falso
	Para m=0 hasta 4 Hacer
		para n=0 hasta 4 Hacer
			Si matrix(m,n)==num_user Entonces
				Logic=Verdadero
				Escribir "El número se encuentra en la posición ", m+1, ", ", n+1
				m=4
				n=4
			FinSi
		FinPara
	FinPara
	Si logic==falso Entonces
		Escribir "El número no se encuentra dentro de la matriz"
	FinSi
	
FinSubProceso

SubProceso mostrarMatriz(matrix, m, n)
	Para m=0 hasta m-1 Hacer
		para n= 0 hasta n-1 Hacer
			Escribir matrix[m,n], "; " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso