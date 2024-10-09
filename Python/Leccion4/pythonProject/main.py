# Lista jose Gabriela
nombres = ['Nathy', 'Osvaldo', 'Lily', 'Arielao']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])
print(nombres[0: 2])
print(nombres[: 3])
print(nombres[1:])
# modificar un valor
nombres[3] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
# Iterar una lista
#for nombres in nombres:
#   print(nombres)
#else:
#   print('Se acabaron los elementos de los lista')


print(len(nombres))
# Agregamos un elemento
nombres.append('Marcelo')
print(nombres)

# Insertamos un elemento en un indice especifico
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)
# Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)
#eliminar ultimo elemnto
nombres.pop()
print(nombres)
#eliminar indice especifico
del nombres[2]
print(nombres)
#Eliminar, borrar, limpiar listas
nombres.clear()
print(nombres)
#Eliminar lista
del nombres