Algoritmo Complementario_2_MATRICES
	Definir n Como Entero
	n=3
	Definir matriz, palabra Como Caracter
	Dimension matriz[n,n]
	Repetir
		Escribir "Ingrese una palabra"
		Leer palabra
		Si Longitud(palabra)<>9 Entonces
			Escribir "La palabra ingresada debe tener 9 letras."
			Escribir "Presione una tecla para continuar"
			Esperar Tecla
			Limpiar Pantalla
		FinSi
	Mientras Que Longitud(palabra)<>9
	llenarMat(palabra,matriz,n)
	mostrarMat(matriz, n)
FinAlgoritmo

SubAlgoritmo llenarMat(palabra, mat Por Referencia, dim)
	Definir i,j, cont Como Entero
	cont=0
	Para i=0 Hasta dim-1 Hacer
		Para j=0 Hasta dim-1 Hacer
			mat[i,j]=Subcadena(palabra,cont,cont)
			cont=cont+1
		FinPara
	FinPara
FinSubAlgoritmo
SubAlgoritmo mostrarMat(mat Por Referencia, dim)
	Definir i,j Como Entero
	Limpiar Pantalla
	Escribir "La matriz quedo: "
	Escribir ""
	Para i=0 Hasta dim-1 Hacer
		Para j=0 Hasta dim-1 Hacer
			Si j==dim-1 Entonces
				Escribir mat[i,j]
			SiNo
				Escribir Sin Saltar mat[i,j] " "
			FinSi
		FinPara
	FinPara
	Escribir ""
	Escribir "Presione una tecla para cerrar"
FinSubAlgoritmo