//Crea una funci�n esMultiplo que reciba dos n�meros proporcionados por el usuario
// y valide si el primer n�mero es m�ltiplo del segundo.
// La funci�n debe devolver True si el primer n�mero es m�ltiplo del segundo,
// y False en caso contrario. Recuerda nombrar y guardar tu algoritmo.

Algoritmo esMultiplo_Funciones
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese dos n�meros enteros"
	Leer num1, num2
	
	si esMultiplo(num1, num2) == Verdadero Entonces
		Escribir num1, " es multiplo de ", num2
	SiNo
		Escribir num1, " no es multiplo de ", num2
	FinSi
	
FinAlgoritmo

Funcion multi <- esMultiplo ( n1, n2 )
	
	Definir multi Como Logico
	multi=Falso
	si n2 mod n1==0
		multi=Verdadero
	FinSi
	
Fin Funcion
