Algoritmo frase_Espaciada_subproceso
	Definir frase Como Caracter
    
    Escribir "Ingrese el texto: "
    Leer frase
    
    convertirEspaciado(frase)
    
FinAlgoritmo

SubProceso convertirEspaciado(frase Por Referencia)
	Definir espaciar Como Caracter
	Definir i como entero
	espaciar = ""
	para i = 0 Hasta Longitud(frase) - 1 Hacer
		espaciar = espaciar + Subcadena(frase, i, i) + " "
	FinPara
	
	Escribir espaciar
FinSubProceso