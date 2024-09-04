Algoritmo numeros_Y_asteriscos
	
	Definir num,i,j como Entero
	
	Para i=1 Hasta 5 Hacer
		Escribir "Por favor, ingrese entre 1 y 20"
		Leer num
		
		Mientras num < 1 o num > 20 Hacer
			Escribir "No válido!. El número debe ser entre 1 y 20"
			Leer num
		FinMientras
		
		para j=1 hasta num Hacer
			si j==1 Entonces
				Escribir sin saltar num," "
			FinSi
			si j <> num entonces
				Escribir sin saltar "*"
			SiNo
				Escribir "*"
			FinSi
		FinPara
		
	FinPara
	
	
FinAlgoritmo
