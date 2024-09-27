'''
miVariable = 3
print(miVariable)

miVariable = "Buenas noches a todos los alumnos de Tecnicatura"
print(miVariable)

miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(z)
print(id(x))
# Las literales se escriben x584, x576, y320, z640
print(id(y))
print(id(z))

# Tipos int, float, String, bool

a = "Hola Profe"
print(type(a))

a = 10
print(type(a))

a = 10.78
print(type(a))

a = True
print(type(a))

X = 10.45
print(X)
print(type(x))
x = "Hola Profes"
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(type(x))

# Manejo de cadenas
miGrupoFavorito = "Divididos"
print(miGrupoFavorito)

miGrupoFavorito = "Divididos"
caracteristicas = "Rata Blanca"
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(numero1 + numero2)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos Booleanos (bool)
miBooleano = True
print(miBooleano)

miBooleano = 1 > 2
print(miBooleano)

if miBooleano:
    print("Mi booleano es  verdadero")
else:
    print("Mi booleano no es verdadero")

# Procesar la entrada del usuario
# Funcion input
resultado  = input("Digite un numero: ") # regresa un dato del tipo string
print(resultado)

# Conversion de la entrada de datos

numero1 = int(input("Digite primer numero: "))
numero2 = int(input("Digite segundo numero: "))
resultado = numero1 + numero2
print("El resultado es: ", resultado)

'''
"""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("Resultado de la suma: ", suma)
print(f'El resultado de la suma es: {suma}')

resta = operandoA - operandoB
print(f"El resultado de resta: {resta}")

multiplicacion = operandoA * operandoB
print(f'El resultado de la multiplicacion es : {multiplicacion}' )

division = operandoA / operandoB
print(f'El resultado de la division es: {division}')

division = operandoA // operandoB
print(f'El resultado de la division (int) es: {division}')

modulo = operandoA % operandoB
print(f'El resultado de la division o resto es: {modulo}')

exponente = operandoA ** operandoB
print(f'El resultado de la division (int) es: {exponente}')
"""
"""
alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
area  = alto * ancho
perimetro = (alto + ancho) * 2
print("Area: ", area)
print("Perimetro: ", perimetro)

miVariable3 = 10
print(miVariable3)

# Operadores de reasignacion
miVariable3 = miVariable3 +1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

miVariable3 -= 2
print(miVariable3)

miVariable3 *= 3
print(miVariable3)

miVariable3 /= 2
print(miVariable3)

# Operadores de comparacion
d = 4
b = 2
resultado = d == b  # comprobamos si son iguales
print(resultado)

# operador diferente
resultado = d!= b
print(resultado)

# operador mayor que
resultado = d > b
print(resultado)

# operador menor que
resultado = d < b
print(resultado)

# operador mayor o igual que
resultado = d >= b
print(resultado)

# operador menor o igual que
resultado = d <= b
print(resultado)
"""
"""
# Ejercicio 4 Numero par impar
a = int(input("Digite un numero: "))
print(f"El valor de a es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un numero PAR")
else:
    print(f"El valor de a es: {a} es un numero IMPAR")
"""
"""
# Ejercicio 4 2  es mayor o menor de edad

edadAdulto = 18
edadPersona = int(input("Digite su edad: "))

if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} es mayor de edad")
else:
    print(f"Su edad es: {edadPersona} es menor de edad")
"""
"""
# Año Bisiesto
def es_bisiesto(ano):
    """Determina si un año es bisiesto."""
    if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
        return True
    else:
        return False


def main():
    while True:
        try:
            ano = int(input("Ingresa un año: "))
            if es_bisiesto(ano):
                print(f"{ano} es un año bisiesto.")
            else:
                print(f"{ano} no es un año bisiesto.")
        except ValueError:
            print("Por favor, ingresa un año válido.")

        repetir = input("¿Quieres ingresar otro año? (s/n): ").lower()
        if repetir != 's':
            print("Gracias por usar el programa. ¡Adiós!")
            break


if __name__ == "__main__":
    main()
"""








