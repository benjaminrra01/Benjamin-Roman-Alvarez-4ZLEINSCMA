Algoritmo Sumatoria_Numeros
	Definir n, suma, contador Como Entero
	Escribir "Programa que realiza la suma de numeros iniciando del 1 hasta el 10"
	Escribir "Teclea hasta que numero quiere sumar"
	leer n 
	suma <- 0
	contador <-1
	Mientras contador<=n Hacer
		suma <- suma + contador 
		contador <- contador + 1
	FinMientras
	Escribir "El resultado de la sumatoria es ", suma
FinAlgoritmo
