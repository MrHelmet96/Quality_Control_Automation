Algoritmo MenuVectoresEjercicioComplementario
	Definir N, opcion, opcionMostrar Como Entero
	Definir i Como Entero
	Definir A, B, C Como Entero
	
	Escribir "Por favor, ingresá el tamaño de los vectores (n° positivo): "
	Leer N
	
	Dimension A[N]
	Dimension B[N]
	Dimension C[N]
	
	Mientras Verdadero Hacer
		Escribir "Menú de opciones:"
		Escribir "1. Llenar Vector A"
		Escribir "2. Llenar Vector B"
		Escribir "3. Llenar Vector C con la suma de valores en posiciones de A y B"
		Escribir "4. Llenar Vector C con la resta de valores en posiciones de B y A"
		Escribir "5. Mostrar Vector"
		Escribir "6. Salir"
		Escribir "Seleccione una opción: "
		Leer opcion
		
		Segun opcion Hacer
			Caso 1:
				Para i <- 0 Hasta N-1 Hacer
					A[i] <- Aleatorio(-100, 100)
				FinPara
				Escribir "Vector A ya se llenó."
			Caso 2:
				Para i <- 0 Hasta N-1 Hacer
					B[i] <- Aleatorio(-100, 100)
				FinPara
				Escribir "Vector B ya se llenó."
			Caso 3:
				Para i <- 0 Hasta N-1 Hacer
					C[i] <- A[i] + B[i]
				FinPara
				Escribir "Vector C se llenó con la suma de valores en posiciones de A y B."
			Caso 4:
				Para i <- 0 Hasta N-1 Hacer
					C[i] <- B[i] - A[i]
				FinPara
				Escribir "Vector C se llenó con la resta de valores en posiciones de B y A."
			Caso 5:
				Escribir "Seleccione el vector a mostrar:"
				Escribir "1. Vector A"
				Escribir "2. Vector B"
				Escribir "3. Vector C"
				Leer opcionMostrar
				
				Segun opcionMostrar Hacer
					Caso 1:
						Escribir "Vector A:"
						Para i <- 0 Hasta N-1 Hacer
							Escribir A[i]
						FinPara
					Caso 2:
						Escribir "Vector B:"
						Para i <- 0 Hasta N-1 Hacer
							Escribir B[i]
						FinPara
					Caso 3:
						Escribir "Vector C:"
						Para i <- 0 Hasta N-1 Hacer
							Escribir C[i]
						FinPara
					De Otro Modo:
						Escribir "Opción no válida."
				FinSegun
			Caso 6:
				Escribir "Saliendo del programa..."
			De Otro Modo:
				Escribir "Opción no válida. Intente de nuevo."
		FinSegun
	FinMientras
FinAlgoritmo