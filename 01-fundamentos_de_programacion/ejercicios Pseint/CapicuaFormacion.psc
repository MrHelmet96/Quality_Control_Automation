Algoritmo CapicuaFormacion
	
    // Declaraci�n de variables
    Definir formacion, centena, unidad Como Entero
	
    // Solicitar la formaci�n t�ctica
    Escribir "Ingrese la formaci�n t�ctica (3 cifras): "
    Leer formacion
	
    // Descomponer el n�mero en centenas, decenas y unidades
    centena <- trunc(formacion / 100)
    unidad <- formacion MOD 10
	
    // Verificar si es capic�a
    Si (centena = unidad) Entonces
        Escribir "La formaci�n ", formacion, " es capic�a."
    SiNo
        Escribir "La formaci�n ", formacion, " no es capic�a."
    FinSi
	
FinAlgoritmo