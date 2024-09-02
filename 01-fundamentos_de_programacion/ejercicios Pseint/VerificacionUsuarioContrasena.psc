Algoritmo VerificacionUsuarioContrasena
	
    Definir codigoUsuario, contrase Como Entero
	
    Repetir		
        Escribir "Ingrese su código de usuario (número entero mayor que cero): "
        Leer codigoUsuario
        Escribir "Ingrese su contraseña (número entero positivo): "
        Leer contrase
		
        Si (codigoUsuario == 1024) Y (contrase == 4567) Entonces
            Escribir "Datos correctos. ¡Acceso concedido!"
        SiNo
            Escribir "Datos incorrectos. Intente nuevamente."
        FinSi
    Mientras Que (codigoUsuario <> 1024) Y (contrase <> 4567) 
	
FinAlgoritmo