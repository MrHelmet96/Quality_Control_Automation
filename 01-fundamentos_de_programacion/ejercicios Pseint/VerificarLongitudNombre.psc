Algoritmo VerificarLongitudNombre
	
    // Declaración de variables
    Definir nombreCompetencia Como Caracter
	
    // Solicitar el nombre de la competencia
    Escribir "Ingrese el nombre de su competencia (6 caracteres): "
    Leer nombreCompetencia
	
    // Verificar la longitud del nombre
    Si Longitud(nombreCompetencia) = 6 Entonces
        Escribir "LONGITUD CORRECTA"
    SiNo
        Escribir "LONGITUD INCORRECTA"
    FinSi
	
FinAlgoritmo
