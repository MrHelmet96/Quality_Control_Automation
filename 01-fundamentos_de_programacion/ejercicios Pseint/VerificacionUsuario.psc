Algoritmo VerificacionUsuario
	
    // Declaraci�n de variables
    Definir usuario, contrasena Como Caracter
	
    // Solicitar datos al usuario
    Escribir "Ingrese su nombre de usuario: "
    Leer usuario
    Escribir "Ingrese su contrase�a: "
    Leer contrasena
	
    // Verificar usuario y contrase�a
    Si usuario = "admin" Y contrasena = "1234" Entonces
		// Mensaje de bienvenida
        Escribir "Bienvenido al sistema, ", usuario
    FinSi
	
FinAlgoritmo