Algoritmo validarPrimeraLetra
	
	Definir nombreEquipo Como Caracter
	
	Escribir "Ingrese el nombre de su equipo:"
	leer nombreEquipo
	
	si Mayusculas(Subcadena(nombreEquipo, 0, 0)) == "A" Entonces
		Escribir "Correcto"
	SiNo
		Escribir  "Incorrecto"
	FinSi
FinAlgoritmo
