Algoritmo temperatura_Subprocesos
	
	Definir dias, i Como Entero
	Definir tempMin, tempMax, tempMedia Como Real
	
	Escribir "De cuantos días le interesa saber la temperatura media? (1-7)"
	leer dias
	
	para i = 1 Hasta dias Hacer
		Escribir "Ingrese la temperatura mínima del día " i
		leer tempMin
		Escribir "Ingrese la temperatura máxima del día " i
		leer tempMax
		
		temperaturaMedia(tempMin, tempMax, tempMedia)
		
		Escribir "la temperatura media del día ", i, " es de " tempMedia
		Escribir "------------------------------------------------"
		Escribir ""
	FinPara
	
FinAlgoritmo

SubProceso temperaturaMedia (min Por Referencia, max Por Referencia, media Por Referencia)

	media = (min + max) / 2
	
FinSubProceso
	