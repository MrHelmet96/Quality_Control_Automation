Algoritmo EscaleraRecursiva
	Definir longitudEscalera Como Entero
	
	Repetir
		Escribir "Ingrese un número entero positivo, este determinará la altitud de su escalera"
		leer longitudEscalera
	Mientras Que longitudEscalera < 0
	
	DibujarEscalera(longitudEscalera)
	
FinAlgoritmo

Funcion DibujarEscalera(n)
    Si n > 0 Entonces
        DibujarEscalera(n - 1)
        ImprimirLinea(1, n)
    FinSi
FinFuncion

Funcion ImprimirLinea(inicio, final)
    Si inicio <= final Entonces
        Escribir Sin Saltar inicio
        ImprimirLinea(inicio + 1, final)
    Sino
        Escribir ""  // Para pasar a la siguiente línea
    FinSi
FinFuncion
	