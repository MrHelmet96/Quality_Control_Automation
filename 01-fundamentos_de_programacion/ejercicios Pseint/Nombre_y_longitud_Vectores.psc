//Crea un programa que solicite al usuario ingresar el tama�o deseado para dos vectores.
// El primero almacenar� nombres de personas como cadenas, mientras que el segundo 
// vector contendr� la longitud de cada uno de los nombres. Luego, se mostrar�n en pantalla
// los nombres junto con su respectiva longitud.

Algoritmo Nombre_y_longitud_Vectores
	
	Definir i, n, longVector Como Entero
	definir nombreVector Como Caracter
	
	Escribir "Ingrese el tama�o que desea para su vector"
	leer n
	
	Dimension nombreVector[n]
	Dimension longVector[n]
	
	Para i=0 Hasta n -1 Hacer
		Escribir "Ingrese el nombre para la posici�n ", i+1, " de ", n
		leer nombreVector[i]
		
		longVector[i] = Longitud(nombreVector[i])
		
	FinPara
	
	Para i=0 Hasta n -1 Hacer
		Escribir "el nombre para la posici�n ", i+1 , " de ", n
		Escribir "es: ", nombreVector[i], "y su Longitud es de ", longVector[i], " letras"
		
	FinPara
FinAlgoritmo
