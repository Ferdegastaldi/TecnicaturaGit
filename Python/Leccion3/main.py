# ciclo while
'''
condicion = True
while condicion:
    print ("Ejecutando el while")
else:
    print("Fin del while")
'''

'''contador = 0
while contador < 3:
    print("Ejecutamos el while", contador)
    contador += 1
else:
    print("Fin del ciclo while")'''

'''maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1'''

'''minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1'''

#ciclo for
'''cadena = "Hello"
for letra in cadena:#imprime cada letra en la cadena declarada
    print(letra)
else:
    print("Fin for")'''

#palabra reservada break

'''for letra in "Alemania":
    if letra == "a":
        print(f"Letra encontrada: {letra}")
        break#rompe el ciclo
else:
    print("Fin for")'''

#palabra reservada continue

for i in range(6): #funcion rango
    if i%2 == 0:
        print(f"valor: {i}")

for i in range(6):
    if i%2 != 0:
        continue#Anula los numero impares
    print(f"valor: {i}")
