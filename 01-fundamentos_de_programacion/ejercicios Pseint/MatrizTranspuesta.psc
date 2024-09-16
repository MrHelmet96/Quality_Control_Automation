Algoritmo MatrizTranspuesta
    // Declaración de variables
    Definir n, m, i, j Como Entero
    Definir matriz, matrizT Como Entero
    
    Escribir "Ingrese el número de filas (n): "
    Leer n
    Escribir "Ingrese el número de columnas (m): "
    Leer m
    
    // Dimensionando
    Dimension matriz[n,m], matrizT[m,n]
    
    // Llenado de la matriz
    Para i <- 0 Hasta n -1 Hacer
        Para j <- 0 Hasta m -1 Hacer
            matriz[i,j] = Aleatorio(1, 100)
        FinPara
    FinPara
    
    // matriz traspuesta
    Para i <- 0 Hasta m -1 Hacer
        Para j <- 0 Hasta n -1 Hacer
            matrizT[i,j] = matriz[j,i]
        FinPara
    FinPara
    
    // muestra la original
    Escribir "Matriz original:"
    Para i <- 0 Hasta n -1 Hacer
        Para j <- 0 Hasta m -1 Hacer
            Escribir Sin Saltar matriz[i,j], " "
        FinPara
        Escribir ""
    FinPara
    
    // Mostrar la traspuesta
    Escribir "Matriz traspuesta:"
    Para i <- 0 Hasta m -1 Hacer
        Para j <- 0 Hasta n -1 Hacer
            Escribir Sin Saltar matrizT[i,j], " "
        FinPara
        Escribir ""
    FinPara
FinAlgoritmo