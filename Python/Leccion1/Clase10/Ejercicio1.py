# Calcular el factorial de un número mayor o igual a 0
# Solicitar al usuario que ingrese un número entero mayor o igual a 0
numero = int(input("Ingresa un número entero mayor o igual a 0: "))

# Asegurarse de que el número ingresado es mayor o igual a 0
while numero < 0:
    print("Por favor, ingresa un número entero mayor o igual a 0.")
    numero = int(input("Ingresa un número entero mayor o igual a 0: "))

# Calcular el factorial
factorial = 1
for i in range(1, numero + 1):
    factorial *= i

# Imprimir el resultado
print(f"El factorial de {numero} es: {factorial}")
