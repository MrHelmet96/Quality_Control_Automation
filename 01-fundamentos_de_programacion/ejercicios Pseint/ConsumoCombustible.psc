Algoritmo ConsumoCombustible
    // Declaración de variables
    Definir litrosCargados, kilometrosRecorridos, consumo Como Real
	
    // Entrada de datos
    Escribir "Ingrese la cantidad de litros cargados en la estación: "
    Leer litrosCargados
	
    Escribir "Ingrese la cantidad de kilómetros recorridos: "
    Leer kilometrosRecorridos
	
    // Cálculo del consumo
    consumo <- kilometrosRecorridos / litrosCargados
	
    // Salida de resultados
    Escribir "El consumo de combustible es de ", consumo, " km/lt"
	
FinAlgoritmo