Algoritmo devolverCantidadNumeros
	
	Definir num, cant_digitos Como Entero
	
	Escribir "Ingrese un n�mero entero"
	leer num
	
	Mientras num < 0 Hacer
		Escribir "El n�mero no es v�lido, debe ser 0 o mayor"
		Leer num
	FinMientras
	
	cant_digitos = Longitud(ConvertirATexto(num))
	Escribir "El n�mero que ingres� tiene ", cant_digitos, " digitos"
FinAlgoritmo
