Algoritmo Numero_Menor 
	Definir a,b,c Como Entero
	escribir "Ingresa tres numeros"
	leer a,b,c
	
	si a<b Entonces
		si a<c Entonces
			escribir "El numero ",a," es el menor de los tres"
		SiNo
			escribir "El numero ",c," es el menor de los tres"
			
		FinSi
	SiNo
		si b<c entonces 
			escribir "El numero ",b," es el menor de los tres"
		SiNo
			escribir "El numero ",c," es el menor de los tres"
		FinSi
	FinSi
	
	
FinAlgoritmo
