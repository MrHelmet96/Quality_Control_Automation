Algoritmo VerificacionUsuarioContrasena
	
    Definir codigoUsuario, contrase Como Entero
	
    Repetir		
        Escribir "Ingrese su c�digo de usuario (n�mero entero mayor que cero): "
        Leer codigoUsuario
        Escribir "Ingrese su contrase�a (n�mero entero positivo): "
        Leer contrase
		
        Si (codigoUsuario == 1024) Y (contrase == 4567) Entonces
            Escribir "Datos correctos. �Acceso concedido!"
        SiNo
            Escribir "Datos incorrectos. Intente nuevamente."
        FinSi
    Mientras Que (codigoUsuario <> 1024) Y (contrase <> 4567) 
	
FinAlgoritmo