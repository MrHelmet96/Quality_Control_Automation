Algoritmo VerificacionUsuario
	
    // Declaración de variables
    Definir usuario, contrasena Como Caracter
	
    // Solicitar datos al usuario
    Escribir "Ingrese su nombre de usuario: "
    Leer usuario
    Escribir "Ingrese su contraseña: "
    Leer contrasena
	
    // Verificar usuario y contraseña
    Si usuario = "admin" Y contrasena = "1234" Entonces
		// Mensaje de bienvenida
        Escribir "Bienvenido al sistema, ", usuario
    FinSi
	
FinAlgoritmo