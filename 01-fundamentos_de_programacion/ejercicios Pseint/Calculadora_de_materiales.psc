Algoritmo Calculadora_de_materiales
	
	invocarMenu
	
FinAlgoritmo

// MENU de opciones
SubProceso invocarMenu
	Definir opc Como Entero
	
	Repetir
		Escribir "=== Calculara de Materiales de Construccion ==="
		Escribir "1. Calcular muro de ladrillo"
		Escribir "2. Calcular viga de hormigón"
		Escribir "3. Calcular columna de hormigón"
		Escribir "4. Calcular contrapisos"
		Escribir "5. Calcular techo"
		Escribir "6. Calcular pisos"
		Escribir "7. Calcular pintura"
		Escribir "8. Calcular iluminación"
		Escribir "9. Salir"
		leer opc
		
		Segun opc Hacer
			1:calcularMuro
			2:calcularViga
			3:calcularColumna
			4:calcularContrapiso
				//5: calcularTecho
				//6: calcularPisos
				//7: calcularPintura
			//8: calcularIluminacion
			9: Escribir "Saliste..."
		FinSegun
	hasta Que opc = 9
	
FinSubProceso


//
SubProceso calcularMuro
	Definir espesorMuro, largoMuro, altoMuro, cemento, arena, ladrillo, superficie Como Real
	
	Repetir
		Escribir "¿Cual es el espesor del muro? (20 o 30)"
		Leer espesorMuro
	hasta Que espesorMuro == 20 o espesorMuro == 30
	
	
	Escribir "¿Cual es el largo del muro (en mts)?"
	leer largoMuro
	
	Escribir "¿Cual es la altura del muro (en mts)?"
	leer altoMuro
	
	superficie = calcularSuperficie(altoMuro, largoMuro)
	
	si espesorMuro == 30 Entonces
		cemento = 15.2 * superficie
		arena = 0.115 * superficie
		ladrillo = 120 * superficie
	SiNo
		cemento = 10.9 * superficie
		arena = .09 * superficie
		ladrillo = 90 * superficie
	FinSi
	
	Escribir "superficie del muro: ", superficie, " m2"
	Escribir "Materiales necesarios:"
	Escribir "Cemento: ", cemento, " kg"
	Escribir "Arena: ", arena, " m3"
	Escribir "Ladrillos: ", ladrillo, " unidades"
FinSubProceso

//
SubProceso calcularViga
	Definir largoViga, cemento, arena, piedra, hierro8, hierro4 Como Real
	
	Escribir "Ingrese el largo de la viga (en mts):"
	leer largoViga
	
	cemento = 9 * largoViga
	arena = 0.02 * largoViga
	piedra = 0.02 * largoViga
	hierro8 = 4 * largoViga
	hierro4 = 3 * largoViga
	
	Escribir "Materiales necesarios para la viga de ", largoViga, " m:"
	Escribir "Cemento: ", cemento, " kg"
	Escribir "Arena: ", arena, " m3"
	Escribir "piedra: ", piedra, " m2"
	Escribir "Hierro del 8: ", hierro8, " m"
	Escribir "Hierro del 4: ", hierro4, " m"
	
FinSubProceso

//
SubProceso calcularColumna
	Definir largoColumna, cemento, arena, piedra, hierro10, hierro4 Como Real
	
	Escribir "Ingrese el largo de la columna (en mts):"
	leer largoColumna
	
	cemento = 7.5 * largoColumna
	arena = 0.016 * largoColumna
	piedra = 0.016 * largoColumna
	hierro10 = 6 * largoColumna
	hierro4 = 3 * largoColumna
	
	Escribir "Materiales necesarios para la columna de ", largoColumna, " m:"
	Escribir "Cemento: ", cemento, " kg"
	Escribir "Arena: ", arena, " m3"
	Escribir "piedra: ", piedra, " m2"
	Escribir "Hierro del 10: ", hierro10, " m"
	Escribir "Hierro del 4: ", hierro4, " m"
FinSubProceso

//
SubProceso calcularContrapiso
	Definir espesorContra, anchoContra, largoContra, cemento, arena, piedra, m3 Como Real
	
	Escribir "Ingrese el espesor del contrapiso"
	leer espesorContra
	
	Escribir "Ingrese el ancho del contrapiso"
	leer anchoContra
	
	Escribir "Ingrese el largo del contrapiso"
	leer largoContra
	
	m3 = espesorContra * anchoContra * largoContra
	
	cemento = 105 * m3
	arena = 0.45 * m3
	piedra = 0.9 * m3
	
	Escribir "Materiales necesarios para el Contrapiso:"
	Escribir "Cemento: ", cemento, " kg"
	Escribir "Arena: ", arena, " m3"
	Escribir "piedra: ", piedra, " m3"
	
FinSubProceso

// 
Funcion superficie <- calcularSuperficie(ancho, largo)
	Definir superficie Como Real
	superficie = ancho * largo
FinFuncion

//
Funcion volumen <- calcularVolumen(espesor, ancho, largo)
	definir volumen Como Real
	volumen = espesor * ancho * largo
FinFuncion

	