Algoritmo DiasDeEntrenamiento
	
    // Declaración de variables
    Definir diaSemana Como Caracter
	
    // Solicitar el día de la semana
    Escribir "Ingrese el día de la semana (LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO): "
    Leer diaSemana
	
    // Verificar si es día de entrenamiento
    Si (diaSemana = "LUNES") O (diaSemana = "MARTES") O (diaSemana = "MIERCOLES") O (diaSemana = "JUEVES") Entonces
        Escribir "Es día de entrenamiento."
    SiNo
        Escribir "No es día de entrenamiento."
    FinSi
	
FinAlgoritmo
