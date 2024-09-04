Algoritmo devolverCantidadNumeros
	
	Definir num, cant_digitos Como Entero
	
	Escribir "Ingrese un número entero"
	leer num
	
	Mientras num < 0 Hacer
		Escribir "El número no es válido, debe ser 0 o mayor"
		Leer num
	FinMientras
	
	cant_digitos = Longitud(ConvertirATexto(num))
	Escribir "El número que ingresó tiene ", cant_digitos, " digitos"
FinAlgoritmo
