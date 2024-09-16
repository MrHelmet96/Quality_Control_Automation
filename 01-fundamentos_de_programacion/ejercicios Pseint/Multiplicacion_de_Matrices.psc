Algoritmo Multiplicacion_de_Matrices
	Definir MatA, MatB, MatC, i, j Como Entero
	Dimension MatA[3,3], MatB[3,3], MatC[3,3]
	
	//rellenar matriz A
	Para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			MatA[i,j] = Aleatorio(1, 10)
		FinPara
	FinPara
	
	//mostrar A
	Escribir "Matriz A"
	Para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Escribir sin saltar MatA[i,j], " | "
		FinPara
		Escribir " "
	FinPara
	Escribir " "
	
	//rellenar matriz B
	Para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			MatB[i,j] = Aleatorio(1, 10)
		FinPara
	FinPara
	
	//mostrar B
	Escribir "Matriz B"
	Para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Escribir sin saltar MatB[i,j], " | "
		FinPara
		Escribir " "
	FinPara
	Escribir " "
	
	//rellenar matriz C
	Para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			MatC[i,j] = 0
			MatC[i,j] = MatC[i,j] + (MatA[i,j] * MatB[i, j])
		FinPara
	FinPara
	
	//mostrar C
	Escribir "Matriz C"
	Para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Escribir sin saltar MatC[i,j], " | "
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo
