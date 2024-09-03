Algoritmo diasDeLaSemana
	// definir variables
	Definir dia Como Entero
	
	//Solicitar num
	Escribir "Por favor, ingrese un número entre 1 y 7:"
	Leer dia
	
	Segun dia Hacer
		1: 
			Escribir "El día numero ", dia, " es el Lunes"
		2: 
			Escribir "El día numero ", dia, " es el Martes"
		3: 
			Escribir "El día numero ", dia, " es el Miercoles"
		4: 
			Escribir "El día numero ", dia, " es el Jueves"
		5: 
			Escribir "El día numero ", dia, " es el Vieres"
		6: 
			Escribir "El día numero ", dia, " es el Sábado"
		7: 
			Escribir "El día numero ", dia, " es el Domingo"
		De Otro Modo:
			Escribir "Ingresó un numero no valido"
	FinSegun
	
FinAlgoritmo
