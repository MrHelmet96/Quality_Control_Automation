Algoritmo CuadradoDeAsteriscos
    Definir lado, i, j Como Entero
    
    Escribir "Ingresa el tama�o del lado del cuadrado:"
    Leer lado
    
    Para i <- 1 Hasta lado Hacer
        Para j <- 1 Hasta lado Hacer
            Si i = 1 O i = lado O j = 1 O j = lado Entonces
                Escribir Sin Saltar "* "
            Sino
                Escribir Sin Saltar "  "
            FinSi
        FinPara
        Escribir ""  // Saltar a la siguiente l�nea despu�s de imprimir una fila
    FinPara
    
FinAlgoritmo