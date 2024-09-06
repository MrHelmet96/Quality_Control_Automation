/// Realiza un procedimiento que permita realizar la división entre dos números y
/// muestre el cociente y el residuo utilizando el método de restas sucesivas. 
/// Este método consiste en restar el divisor del dividendo repetidamente hasta obtener 
/// un resultado menor que el divisor. 
/// El residuo será el resultado final y el número de restas realizadas será el cociente.

Algoritmo divisionPorRestaSucesiva
	Definir num1, num2 Como Entero
	
	
	Escribir "Ingrese dos numeros"
	Leer num1, num2
	
	restasSucesivas(num1,num2)
	
	Escribir "El cociente es: " num2, " el residuo es: " num1
	
FinAlgoritmo


SubProceso restasSucesivas(num1 Por Referencia, num2 Por Referencia)
	
	Definir cont Como Entero
	cont=0
	
	Mientras num1 >= num2 Hacer
		
		num1= num1-num2
		cont= cont+1
		
	FinMientras
	
	num2=cont
	
FinSubProceso
