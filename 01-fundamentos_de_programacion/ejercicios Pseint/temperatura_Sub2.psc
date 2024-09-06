/// Crea un procedimiento que calcule la temperatura media de un día a partir
/// de la temperatura máxima y mínima. Luego, desarrolla un programa principal que, 
/// utilizando este procedimiento, solicite la temperatura máxima y mínima de n días y 
/// muestre la media de cada día. 
/// El programa pedirá al usuario el número de días a introducir.

Algoritmo temperatura_Sub
	
	Definir tempMin, tempMax, tempMedia Como Real
	Definir i, dias Como Entero
	
	Escribir "ingrese el numero de dias que desea saber la temp Media"
	leer dias
	
	i=1
	mientras i <= dias Hacer
		Escribir "Ingrese la temperatura mínima del día " i
		leer tempMin
		Escribir "Ingrese la temperatura máxima del día " i
		leer tempMax
		
		calcularTempMedia(tempMin, tempMax, tempMedia)
		
		
		Escribir "la temperatura media del día ", i, " es de " tempMedia
		Escribir "------------------------------------------------"
		Escribir ""
		
		i = i+1
	FinMientras
	
	
FinAlgoritmo

SubProceso calcularTempMedia(min, max, media Por Referencia)
	media = (min + max ) / 2
FinSubProceso
	