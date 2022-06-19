'''
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

a = 8
b = 2

resultado = a + b
print("El resultado de la suma es: ", resultado)

resultado = a - b
print("El resultado de la resta es: ", resultado)

resultado = a/b
print("El resultado de la division es: ", resultado)

resultado = a*b
print("El resultado de la multiplicacion es: ", resultado)

resultado = a%b
print("El resto de la division entre a y b es: ", resultado)
'''
'''
base = int(input("Ingrese la base del rectángulo:\n"))
altura =  int(input("Ingrese la altura del rectángulo:\n"))

area = base*altura
perimetro = (altura + base) * 2

print ("El área del rectángulo es:\n", area)
print ("El perímetro del rectángulo es:\n", perimetro)
'''
'''
numero = int(input("Ingrese un numero"))

if numero % 2 == 0:
    print("El numero ingresado es par")
else:
    print("El numeor ingresado es impar")

edad = int(input("Ingrese edad: \n"))

if edad >= 18:
    print ("Es mayor de edad")
else:
    print ("Es menor de edad")
'''
'''
edad = int(input("Ingrese edad:\n"))

if edad > 20 and edad < 30:
    print("La persona está dentro del rango")
else:
    print("La persona no está dentro del rango")
'''

'''numero1 = int(input("Ingrese el primer numero:\n"))
numero2 = int(input("Ingrese el segundo numero:\n"))

if numero1 < numero2:
    print(f"El numero {numero2} es mayor al {numero1}")
else:
    print(f"El numero {numero1} es mayor al {numero2}")'''



























































































































    #Ejercicio: el mayor de 2 numeros
'''numero1 = int(input("Ingrese un numero: "))
numero2 = int(input("Ingrese otro numero: "))

if numero1>numero2:
    print("El primer numero es mayor al segundo")
else:
    print("El segundo numero es mayor al primero")'''

#tienda de libros

nombre = input("Nombre del libro: ")
id = int(input("ID del libro: "))
precio = float(input("Precio del libro: "))
envioGratis = input("Envio gratis (True o False): ")

if envioGratis == "True":
    envioGratis = True
elif envioGratis == "False":
    envioGratis = False
else:
    envioGratis = "Valor incorrecto"

print(f" Nombre del libro : {nombre}\n ID del libro: {id}\n Precio: {precio}\n Envio gratis: {envioGratis}")