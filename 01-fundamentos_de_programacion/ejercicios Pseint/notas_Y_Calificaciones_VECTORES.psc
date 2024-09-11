Algoritmo act_2
	Definir arrNotas, i ,contDef, contReg, contBn, contExc, n Como Entero
	contReg=0;contDef=0;contBn=0;contExc=0; n=10
	Dimension arrNotas(n)
	Para i=0 Hasta n-1 Hacer
		arrNotas(i)=Aleatorio(0,10)
		Si arrNotas(i)<4 Entonces
			contDef=contDef+1
		SiNo
			Si arrNotas(i)<7 Entonces
				contReg=contReg+1
			SiNo
				Si arrNotas(i)<9 Entonces
					contBn=contBn+1
				SiNo
					contExc=contExc+1
				FinSi
			FinSi
		FinSi
	FinPara
	Para i=0 Hasta n-1 Hacer
		Si i==n-1 Entonces
			Escribir arrNotas(i) "."
		SiNo
			Escribir Sin Saltar arrNotas(i) "-"
		FinSi
	FinPara
	Escribir "Cantidad notas deficientes: " contDef
	Escribir "Cantidad notas regulares: " contReg
	Escribir "Cantidad notas buenas: " contBn
	Escribir "Cantidad notas excelentes: " contExc
FinAlgoritmo