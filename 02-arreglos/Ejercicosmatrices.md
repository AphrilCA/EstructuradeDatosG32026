# Ejercicios con matrices
1. Objetivos: Aplicar la logica de arreglos bidimensionales (matrices en java) utilizando el 
paradigma de programcion orientada a objetos implementando validaciones de dimsnesiones, recorridos de indices 
y encapsulacion.

## Ejercicio 1: Sistema de reserva de asientos

- Diseña un metodo que se llame resevaAsiento(int fila, int columna) y debe recibir fila y columna cono entero, que controle el mapa de ocupacion de un teatro
o sala. La matriz iniciara en cero o sis e usan booleanos es false, y eso significa libre. 
- Si el asiento solicitado contiene 0 cambialo a uno (*ocupado*) y muestre un mesaje de exito.
- Si el asiento ya contiene 1 notifica que esta ocupado
- Validar que las coordenadas ingresadas no excedan los limites de la matriz (aqui antes pedir debemos de saber de que tamaño es la matriz)

## Ejercicio 2: Acumulado dd eventas por sucursal y mes(m*n)

Una empresa registra las ventas enteras de m sucursales en n meses 
- Implementar un metodo que calcule la suma por cada fila (total por sucursal)
- Calcular la suma por cada columna(total por mes )
- Genera un reporte formateado(con un determinado formato) que muestre ambos totales en un solo panel de texto


## Ejercicio 3: Diagnostico de matriz identidad diagonal principal (n*n)

- Implementa un modulo para analisis algebraico:
- *Validacion previa*: comprueba si la matriz es cuadrada. Si no lo es, cancela la operacion y muestra un mesnaje de advertencia
- Si es cuadrada, evalua si es una matriz *identidad* (unos en la diagonal principal y ceros en el resto)
- Calcula e imprime la suma de los elementos de la diagonal principal 


## Ejercicio 4: Transpocicion dinamica de matriz (M * N -> N * M)

- Crea el metodo obtener transpuesta que invierta la orientacion de los datos 
- La funcion debe retornar una nueva instancia de la clase matriz con dimesiones invertidas N * N
- Copia cada elemento siguiendo la regla de transposicion  transpuesta[j][i]= original [i][j]

## Ejercicio 5: Rotacion de la matriz a 90° en sentido horario N*N


- Simula el giro de una traiz cuadrada de pixeles o mapa:
- Validacion previa: verfifica que la matrzi sea estrictamente cuadrada
- Retorna una nueva instancia de matriz rotada a 90° a la derecha