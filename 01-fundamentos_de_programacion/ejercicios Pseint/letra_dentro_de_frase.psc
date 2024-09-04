Algoritmo letra_dentro_de_frase
	
	Definir frase , letra Como Caracter
	
	Escribir "Ingrese una frase y una letra para saber si la contiene"
	Leer frase , letra
	Escribir "la frase: " frase " contiene " contarLetras(frase , letra) " veces la letra " letra
	
FinAlgoritmo

Funcion cant <- contarLetras (fra , let)
	Definir cant Como Entero
	cant = 0
	Definir i Como Entero
	fra = Mayusculas(fra)
	let = Mayusculas(let)
	Para i = 0 Hasta Longitud(fra) - 1 Hacer
		si Subcadena(fra , i , i) == let Entonces
			cant = cant + 1
		FinSi
	FinPara
	
FinFuncion