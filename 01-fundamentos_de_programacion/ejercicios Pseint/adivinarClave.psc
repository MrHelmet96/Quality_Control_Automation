Algoritmo adivinarClave
	
	definir clave Como Caracter
	definir intento Como Entero
	
	intento = 3
	
	Repetir
		
		Escribir "Escriba la clave. Usted tiene " intento " intentos"
		leer clave
		intento = intento -1
	Mientras Que intento > 0 Y clave <> "EUREKA"
	
	Si clave == "EUREKA"
		Escribir "Bienvenido, usuario"
	sino
		Escribir "Se ha quedado sin intentos"
	FinSi
	
FinAlgoritmo
