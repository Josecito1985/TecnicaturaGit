# Calcular la suma de "N" primeros números.
repetir = 's'
while repetir == 's':
    n = int(input("Ingresa un número entero positivo: "))

    while n <= 0:
        print("Por favor, ingresa un número entero positivo.")
        n = int(input("Ingresa un número entero positivo: "))

    suma = 0
    for i in range(1, n + 1):
        suma += i

    print(f"La suma de los primeros {n} números es: {suma}")

    repetir = input("¿Quieres calcular otra suma? (s/n): ").lower()

print("Gracias por usar el programa. ¡Adiós!")
