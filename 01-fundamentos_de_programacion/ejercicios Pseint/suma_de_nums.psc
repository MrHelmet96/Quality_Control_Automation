Algoritmo suma_de_nums
	
	Definir num, suma Como Entero
	Definir decision Como Caracter
	
	suma =0
	
	Repetir
		Escribir "Ingrese numero entero positivo"
		Leer num
		
		suma = suma + num
		
		Escribir "Desea ingresar otro numero? (s/n)"
		Leer decision
	Hasta Que Minusculas(decision) == 'n'
	
	Escribir "El resultado de los n ingresados es: " suma
	
FinAlgoritmo