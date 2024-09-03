Algoritmo CapicuaFormacion
	
    // Declaración de variables
    Definir formacion, centena, unidad Como Entero
	
    // Solicitar la formación táctica
    Escribir "Ingrese la formación táctica (3 cifras): "
    Leer formacion
	
    // Descomponer el número en centenas, decenas y unidades
    centena <- trunc(formacion / 100)
    unidad <- formacion MOD 10
	
    // Verificar si es capicúa
    Si (centena = unidad) Entonces
        Escribir "La formación ", formacion, " es capicúa."
    SiNo
        Escribir "La formación ", formacion, " no es capicúa."
    FinSi
	
FinAlgoritmo