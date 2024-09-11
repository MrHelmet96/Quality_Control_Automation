Algoritmo complementario_1_VECTORES
	Definir arreglo, i, j , n, aux Como Entero
	Escribir "Ingrese el tamaño del vector"
	Leer n
	Dimension arreglo(n)
	
	Para i=0 Hasta n-1 Hacer
		arreglo[i]=Azar(100)
	FinPara
	//Mostrar original
	Para i=0 Hasta n-1 Hacer
		Si i==n-1 Entonces
			Escribir arreglo[i] "."
		SiNo
			Escribir Sin Saltar arreglo[i] " - "
		FinSi
	FinPara
	//Ordenamiento
	//
	Para i=0 Hasta n-2 Hacer
		Para j=0 Hasta n-i-2 Hacer
			Si arreglo[j]>arreglo[j+1] Entonces
				aux=arreglo[j]
				arreglo[j]=arreglo[j+1]
				arreglo[j+1]=aux
			FinSi
		FinPara
	FinPara
	//Mostrar "Ordenado"
	Para i=0 Hasta n-1 Hacer
		Si i==n-1 Entonces
			Escribir arreglo[i] "."
		SiNo
			Escribir Sin Saltar arreglo[i] " - "
		FinSi
	FinPara
FinAlgoritmo