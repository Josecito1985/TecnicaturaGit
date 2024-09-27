# Leer 10 números e imprimir cuantos son poritivos
# cuantos negativos y cuantos neutros.
positivos = 0
negativos = 0
neutros = 0

for i in range(10):
    numero = int(input(f"Ingrese el número {i + 1}: "))
    if numero > 0:
        positivos += 1
    elif numero < 0:
        negativos += 1
    else:
        neutros += 1

print(f"Cantidad de números positivos: {positivos}")
print(f"Cantidad de números negativos: {negativos}")
print(f"Cantidad de números neutros: {neutros}")
