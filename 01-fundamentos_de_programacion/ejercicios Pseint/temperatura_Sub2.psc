/// Crea un procedimiento que calcule la temperatura media de un d�a a partir
/// de la temperatura m�xima y m�nima. Luego, desarrolla un programa principal que, 
/// utilizando este procedimiento, solicite la temperatura m�xima y m�nima de n d�as y 
/// muestre la media de cada d�a. 
/// El programa pedir� al usuario el n�mero de d�as a introducir.

Algoritmo temperatura_Sub
	
	Definir tempMin, tempMax, tempMedia Como Real
	Definir i, dias Como Entero
	
	Escribir "ingrese el numero de dias que desea saber la temp Media"
	leer dias
	
	i=1
	mientras i <= dias Hacer
		Escribir "Ingrese la temperatura m�nima del d�a " i
		leer tempMin
		Escribir "Ingrese la temperatura m�xima del d�a " i
		leer tempMax
		
		calcularTempMedia(tempMin, tempMax, tempMedia)
		
		
		Escribir "la temperatura media del d�a ", i, " es de " tempMedia
		Escribir "------------------------------------------------"
		Escribir ""
		
		i = i+1
	FinMientras
	
	
FinAlgoritmo

SubProceso calcularTempMedia(min, max, media Por Referencia)
	media = (min + max ) / 2
FinSubProceso
	