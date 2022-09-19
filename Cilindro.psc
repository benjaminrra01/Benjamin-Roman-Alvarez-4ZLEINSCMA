Algoritmo Cilindro_area_vol
	Definir r,h,a,v Como Real
	Escribir "Introduzca el valor del radio en cm:"
	Leer r
	Escribir "Introduzca el valor de la altura en cm:"
	Leer h
	
	//Proceso:
	a=2*pi*r*(r+h)
	v=pi*(r^2)*h
	
	Escribir "El valor del area del cilindro es:",a
	Escribir "El valor del volumen del cilindro es:",v 
	
FinAlgoritmo
