//Diseña un programa que trabaje con un vector de cadenas de caracteres de dimensión 10,
//donde cada cadena representa un nombre ingresado por el usuario. El programa debe realizar las siguientes tareas:

// 1- Llenar el vector con nombres ingresados por el usuario.
// 2- Mostrar el vector original en pantalla.
// 3- Contar y mostrar cuántas veces se repite cada vocal en todos los nombres del vector. Es decir el total de A-E-I-O-U utilizadas en todo el vector.
// 4- Encontrar y mostrar el nombre más largo y el nombre más corto del vector.
// 5- Crear un nuevo vector que contenga solo los nombres que comiencen con una letra específica ingresada por el usuario.
Algoritmo Actividad_4
	Definir arrNombres, arrNomLetra Como Caracter
	Definir n, i, j, largo, corto, arrContVocales, m Como Entero
	n=10; largo=0; corto=0
	Dimension arrNombres[n], arrContVocales[5]
	
	//Punto 1
	Para i=0 Hasta n-1 Hacer
		Escribir "Ingrese Nombre"
		Leer arrNombres[i]
	FinPara
	//Punto 2
	Para i=0 Hasta n-1 Hacer
		Si i==n-1 Entonces
			Escribir arrNombres[i] "."
		SiNo
			Escribir Sin Saltar arrNombres[i] ", "
		FinSi
	FinPara
	//Punto 3
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta Longitud(arrNombres[i])-1 Hacer
			Segun Subcadena(arrNombres[i],j,j) Hacer
				'A' o 'a':
					arrContVocales[0]=arrContVocales[0]+1
				'E' o 'e':
					arrContVocales[1]=arrContVocales[1]+1
				'I' o 'i':
					arrContVocales[2]=arrContVocales[2]+1
				'O' o 'o':
					arrContVocales[3]=arrContVocales[3]+1
				'U' o 'u':
					arrContVocales[4]=arrContVocales[4]+1
				De Otro Modo:
					Escribir "No"
			Fin Segun
		FinPara
		
		
		
	FinPara
	
FinAlgoritmo