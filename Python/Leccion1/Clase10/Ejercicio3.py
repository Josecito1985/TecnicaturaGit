# Dadas las horas trabajadas de 5 personas y la
# tarifa de pago, calcular el salario, y la sumatoria de
# todos los salarios.
# Inicializar la sumatoria de todos los salarios
sumatoria_salarios = 0

# Leer las horas trabajadas y la tarifa de pago para 5 personas
for i in range(5):
    horas_trabajadas = float(input(f"Ingrese las horas trabajadas por la persona {i + 1}: "))
    tarifa_pago = float(input(f"Ingrese la tarifa de pago por hora para la persona {i + 1}: "))
    salario = horas_trabajadas * tarifa_pago
    sumatoria_salarios += salario
    print(f"El salario de la persona {i + 1} es: {salario}")

# Imprimir la sumatoria de todos los salarios
print(f"La sumatoria de todos los salarios es: {sumatoria_salarios}")
