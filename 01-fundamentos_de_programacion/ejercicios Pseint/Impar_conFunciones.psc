Algoritmo Impar_conFunciones
	Definir num Como real
	Definir nroCorrecto como Entero
	
	Repetir
		Escribir "Escriba un numero entero:"
		leer num
	Hasta Que num = trunc(num)
	
	nroCorrecto = trunc(num)
	
	Si esImpar(nroCorrecto) == verdadero Entonces
		Escribir num, " es impar"
	SiNo
		Escribir num, " es par"
	FinSi
FinAlgoritmo

Funcion impar <- EsImpar(nro)
	Definir impar Como Logico
	
	si abs(nro) mod 2 = 1 Entonces
		impar = Verdadero
	FinSi
	
FinFuncion
	