Algoritmo CalcularPorcentajeJugador
	
    // Declaración de variables
    Definir numeroJugador, porcentaje Como Real
	
    // Solicitar el número de jugador
    Escribir "Ingrese el número de jugador: "
    Leer numeroJugador
	
    Si numeroJugador > 10 Entonces
        // Calcular el 18%
        porcentaje <- numeroJugador * 0.18
		
        Escribir "El 18% de ", numeroJugador, " es: ", porcentaje
    FinSi
	
FinAlgoritmo