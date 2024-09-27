# Ingresar "N" enteros, visualizar la suma de los
# números pares de la lista, cuántos números pares
# existen y cuál es el promedio de los números
# impares.
# Solicitar al usuario la cantidad de números a ingresar
n = int(input("¿Cuántos números enteros deseas ingresar? "))

# Inicializar variables
suma_pares = 0
cantidad_pares = 0
suma_impares = 0
cantidad_impares = 0

# Leer los números y realizar los cálculos necesarios
for i in range(n):
    numero = int(input(f"Ingrese el número {i + 1}: "))
    if numero % 2 == 0:
        suma_pares += numero
        cantidad_pares += 1
    else:
        suma_impares += numero
        cantidad_impares += 1

# Calcular el promedio de los números impares
if cantidad_impares > 0:
    promedio_impares = suma_impares / cantidad_impares
else:
    promedio_impares = 0

# Imprimir los resultados
print(f"La suma de los números pares es: {suma_pares}")
print(f"Cantidad de números pares: {cantidad_pares}")
print(f"Promedio de los números impares: {promedio_impares}")
