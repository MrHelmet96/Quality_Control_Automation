Algoritmo Frase100
	Definir frase Como Cadena
	Definir i, totalVocales, totalConsonantes, intentos Como Entero
	Definir vocales, consonantes Como Caracter
	
	
	totalVocales = 0
	totalConsonantes = 0
	intentos = 0
	
	Repetir
		Escribir "Ingrese una frase (máximo 100 caracteres): "
		Leer frase
		
		Si Longitud(frase) >= 100 Entonces
			Escribir "Te pasaste de los 100!! Intenta nuevamente."
			intentos = intentos + 1
		FinSi
		
		Si intentos = 3 Entonces
			Escribir "Uy creo que es hora de una siesta, regresa más tarde."
		finsi
	Hasta Que Longitud(frase) <= 100
	
	// Dimensión de los vectores (máximo longitud de la frase)
	Dimension vocales(Longitud(frase))
	Dimension consonantes(Longitud(frase))
	
	// Separar vocales y consonantes, caracteres especiales o espacios
	Para i = 1 Hasta Longitud(frase) Con Paso 1
		Segun SubCadena(frase, i, i) Hacer
				// Verificar si es vocal
			caso "A", "E", "I", "O", "U", "a", "e", "i", "o", "u":
				vocales[totalVocales] = SubCadena(frase, i, i)
				totalVocales = totalVocales + 1
				
			De Otro Modo:// En otro caso es consonante, espacio o caracter especial
				consonantes[totalConsonantes] = SubCadena(frase, i, i)
				totalConsonantes = totalConsonantes + 1
		FinSegun
	FinPara
	
	
	// Imprimir resultados
	Escribir "Vocales encontradas:"
	imprimirVector(vocales, totalVocales)
	
	Escribir "Consonantes, espacios y caracteres especiales encontrados:"
	imprimirVector(consonantes, totalConsonantes)
	
	Escribir "Total de vocales: ", totalVocales
	Escribir "Total de consonantes, espacios y caracteres especiales: ", totalConsonantes
	
FinAlgoritmo


SubProceso imprimirVector(vector, totalElementos)
	Definir i Como Entero
	Para i = 0 Hasta totalElementos-1 Con Paso 1
		Escribir Sin Saltar vector[i], " "
	FinPara
	Escribir ""
FinSubProceso
