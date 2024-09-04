Algoritmo Complicado
	// parametros
	Definir usuario, contrasena, aceptar Como Caracter
	Definir usu_input, contr_input Como Caracter
	Definir Login Como Logico
	Definir intento, opc, botellas, pesoi, sumai, saldo, i Como Entero
	
	usuario = "Albus_D"
	contrasena = "caramelosDeLimon"
	Login = falso
	intento = 1
	opc=0
	sumai=0
	saldo=0
	
	Repetir
		Escribir "Ingrese usuario: "
		Leer usu_input
		Si usu_input == usuario Entonces
			Repetir
				Escribir "Intento: " intento
				Escribir "Ingrese contraseña: "
				Leer contr_input
				Si contr_input == contrasena Entonces
					Login = Verdadero
				FinSi
				intento = intento + 1
			Hasta Que Login == Verdadero o intento > 3
		FinSi
		intento = 1
	Hasta Que Login == verdadero
	
	Mientras opc <> 3 Hacer
		Escribir "Menú del programa. Marque el número para realizar la acción"
		Escribir "1 -Ingresar Botellas"
		Escribir "2 -Consultar saldo"
		Escribir "3 -Salir"
		Leer opc
		Segun opc Hacer
			1:
				Escribir "Ingrese la cantidad de botellas que desea reciclar"
				leer botellas
				sumai=0
				Para i=1 Hasta botellas Hacer
					pesoi= azar(2900) +100
					Si pesoi<=500 Entonces
						sumai=sumai+50
					FinSi
					Si (pesoi>500) Y (pesoi<=1500) Entonces
						sumai=sumai+125
					FinSi
					Si pesoi>1500 Entonces
						sumai=sumai+200
					FinSi
				FinPara
				Escribir "El valor que se le dará por las botellas es de $" sumai
				Escribir ""
				aceptar=""
				Mientras aceptar<>"S" y aceptar<>"N" Hacer
					Escribir "¿Desea aceptar este monto? S/N"
					LEER aceptar
					Si aceptar="S" Entonces
						Escribir "El monto ha sido cargado a su saldo"
						saldo=saldo+sumai
					SiNo
						Escribir "Devolviendo el material..."
					FinSi
				Fin Mientras
				
			2:
				Escribir "Su saldo es de $" saldo
			3:
				Escribir "Saliendo del programa..."
				
			De Otro Modo:
				Escribir "Opción incorrecta. Ingrese un número válido"
		Fin Segun
	Fin Mientras
	
	FinAlgoritmo