//Crea un programa que solicite al usuario ingresar el tamaño deseado para dos vectores.
// El primero almacenará nombres de personas como cadenas, mientras que el segundo 
// vector contendrá la longitud de cada uno de los nombres. Luego, se mostrarán en pantalla
// los nombres junto con su respectiva longitud.

Algoritmo Nombre_y_longitud_Vectores
	
	Definir i, n, longVector Como Entero
	definir nombreVector Como Caracter
	
	Escribir "Ingrese el tamaño que desea para su vector"
	leer n
	
	Dimension nombreVector[n]
	Dimension longVector[n]
	
	Para i=0 Hasta n -1 Hacer
		Escribir "Ingrese el nombre para la posición ", i+1, " de ", n
		leer nombreVector[i]
		
		longVector[i] = Longitud(nombreVector[i])
		
	FinPara
	
	Para i=0 Hasta n -1 Hacer
		Escribir "el nombre para la posición ", i+1 , " de ", n
		Escribir "es: ", nombreVector[i], "y su Longitud es de ", longVector[i], " letras"
		
	FinPara
FinAlgoritmo
