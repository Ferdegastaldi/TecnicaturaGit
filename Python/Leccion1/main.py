miVariable = 3
print("El dato guardado en miVariable es:", miVariable)
miVariable = "Fernanda Degastaldi"
print("El nuevo dato guardado en variable es:", miVariable)
miVariable = 2.5
print("Ahora miVariable es tipo real:", miVariable)
x = 10
y = 18
z = x + y
print(z)
print(id(z))#dirección de memoria. Las literales de escriben como x123 (siendo 123 los últimos 3 numeros de la dirección)
#Tipos de datos

a: int = 5.0 #el :int es SOLO UNA REFERENCIA

print(type(a))

a = "Fer es la mejor"

print(type(a))

a = True

print(type(a))

if x > y:
    print("X es mayor a y")
else:
    print("y es mayor a x")

resultado = input("Escriba algo: ")#Regresa un string
print(resultado)

