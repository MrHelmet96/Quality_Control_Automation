Algoritmo CalcularPorcentajeJugador
	
    // Declaraci�n de variables
    Definir numeroJugador, porcentaje Como Real
	
    // Solicitar el n�mero de jugador
    Escribir "Ingrese el n�mero de jugador: "
    Leer numeroJugador
	
    Si numeroJugador > 10 Entonces
        // Calcular el 18%
        porcentaje <- numeroJugador * 0.18
		
        Escribir "El 18% de ", numeroJugador, " es: ", porcentaje
    FinSi
	
FinAlgoritmo