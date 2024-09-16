Algoritmo MatrizBorde

    Definir filas, columnas, i, j, matriz Como Entero
    Dimension matriz[5,15]
	
    filas = 5
    columnas = 15
	
    // Llenar la matriz con ceros
    Para i = 0 Hasta filas -1 Hacer
        Para j = 0 Hasta columnas -1 Hacer
            matriz[i,j] = 0
        FinPara
    FinPara
	
    // Llenar los bordes
    Para i = 0 Hasta filas -1 Hacer
        matriz[i,0] = 1  // Borde izquierdo
        matriz[i,columnas -1] = 1  // Borde derecho
    FinPara
    Para j = 0 Hasta columnas -1 Hacer
        matriz[0,j] = 1  // Borde superior
        matriz[filas -1,j] = 1  // Borde inferior
    FinPara
	
    // Imprimir la matriz
    Para i = 0 Hasta filas -1 Hacer
        Para j = 0 Hasta columnas -1 Hacer
            Escribir Sin Saltar matriz[i,j], " "
        FinPara
        Escribir ""
    FinPara
FinAlgoritmo