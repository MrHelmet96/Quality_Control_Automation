Algoritmo Vector_tamanio_N
	Definir vectorCustom, cantidad, i, adivinanza Como Entero
	Definir encontrado como logico

	Escribir "Cuantos espacios quiere que tenga su vector?"
	leer cantidad
	
	Dimension vectorCustom[cantidad]
	
	para i=0 Hasta cantidad -1 Hacer
		vectorCustom[i] = azar(25)
		Escribir "El n�mero en la posici�n ", i+1, " de ", cantidad, " es: " vectorCustom[i]
	FinPara
	
	Escribir "Escriba un n�mero para saber si existe dentro del arreglo"
	Leer adivinanza
	
	encontrado = falso
	
	para i=0 Hasta cantidad - 1 Hacer
		si vectorCustom[i] == adivinanza Entonces
			Escribir "El n�mero se encuentra en la posici�n: ", i
            encontrado = Verdadero
		FinSi
	FinPara
	
	Si encontrado = Falso Entonces
        Escribir "El n�mero no se encuentra en el arreglo."
    Fin Si
	
	
FinAlgoritmo
