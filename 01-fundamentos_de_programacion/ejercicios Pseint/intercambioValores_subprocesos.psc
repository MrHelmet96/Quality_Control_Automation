Algoritmo intercambioValores
	
	Definir valorA, valorB Como Entero
	valorA = 26
	valorB = 06
	
	intercambiarValores(valorA, valorB)
	Escribir "El valorA antes era 26, ahora es: " valorA
	Escribir "El valorB antes era 06, ahora es: " valorB
	
FinAlgoritmo

SubProceso intercambiarValores(val1 Por Referencia, val2 Por Referencia)
	Definir auxiliarIntercambio Como Entero
	auxiliarIntercambio = val1
	val1 = val2
	val2 = auxiliarIntercambio
	
FinSubProceso
	