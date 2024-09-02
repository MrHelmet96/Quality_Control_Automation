Algoritmo sin_titulo
	Definir numero_dosCifras, decena, unidad, numero_invertido Como Entero
	
	Escribir "Ingrese un número de dos cifras"
	leer numero_dosCifras
	
	decena <- trunc(numero_dosCifras / 10)
	unidad <- numero_dosCifras MOD 10
	
	numero_invertido <- unidad * 10 + decena
	
	Escribir "El número invertido es: " numero_invertido
	
FinAlgoritmo
