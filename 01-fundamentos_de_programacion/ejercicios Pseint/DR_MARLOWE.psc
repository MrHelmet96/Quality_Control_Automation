Algoritmo DR_MARLOWE
	Definir muestra, matriz Como Caracter
	Definir longitudMuestra, i, Tamano, j Como Entero
	Definir muestraValida Como Logico
	
	Repetir
		
		Escribir "Ingrese muestra"
		Leer muestra
		
		Si Longitud(muestra) == 9 Entonces
			Tamano=3
		SiNo
			Tamano=4
			
		FinSi
		
	Hasta Que Longitud(muestra) == 9 o Longitud(muestra) == 16
	
	Dimension matriz(Tamano,Tamano)
	Para i = 0 Hasta Tamano -1 Hacer
		Para j = 0 hasta Tamano -1 Hacer
			matriz[i,j] = Subcadena(muestra, i, i)			
		FinPara
	FinPara
	
	Para i = 0 Hasta Tamano -1 Hacer
		Para j = 0 hasta Tamano -1 Hacer
			Escribir matriz[i,j] Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo