Algoritmo DiasDeEntrenamiento
	
    // Declaraci�n de variables
    Definir diaSemana Como Caracter
	
    // Solicitar el d�a de la semana
    Escribir "Ingrese el d�a de la semana (LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO): "
    Leer diaSemana
	
    // Verificar si es d�a de entrenamiento
    Si (diaSemana = "LUNES") O (diaSemana = "MARTES") O (diaSemana = "MIERCOLES") O (diaSemana = "JUEVES") Entonces
        Escribir "Es d�a de entrenamiento."
    SiNo
        Escribir "No es d�a de entrenamiento."
    FinSi
	
FinAlgoritmo
