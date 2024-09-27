# Bucle principal
repetir = 's'
while repetir == 's':
    # Solicitar al usuario que ingrese un año
    ano = int(input("Ingresa un año: "))

    # Determinar si el año es bisiesto
    if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
        print(f"El año {ano} es bisiesto.")
    else:
        print(f"El año {ano} no es bisiesto.")

    # Preguntar al usuario si desea repetir la acción
    repetir = input("¿Quieres verificar otro año? (s/n): ").lower()

print("Gracias por usar el programa. ¡Adiós!")
