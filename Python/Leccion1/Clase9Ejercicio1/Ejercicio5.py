#suponga q se tiene un conjunto de calificaciones de un grupo de 10 alumnos.
# Realizar un algoritmo para calcular la calificacion promedio y la calificacion
# mas baja d tod
# Inicializamos variables para la suma de calificaciones y la calificación más baja
suma_calificaciones = 0
calificacion_mas_baja = float('inf')  # Inicializamos con infinito positivo para encontrar la calificación más baja

# Leemos las calificaciones de los 10 alumnos
for i in range(10):
    calificacion = float(input(f"Ingrese la calificación del alumno {i + 1}: "))
    suma_calificaciones += calificacion
    if calificacion < calificacion_mas_baja:
        calificacion_mas_baja = calificacion

# Calculamos el promedio de las calificaciones
calificacion_promedio = suma_calificaciones / 10

# Imprimimos los resultados
print(f"La calificación promedio del grupo es: {calificacion_promedio}")
print(f"La calificación más baja del grupo es: {calificacion_mas_baja}")
