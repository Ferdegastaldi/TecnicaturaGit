edad = int(input("Ingrese su edad: \n"))
if edad>=0 and edad<=99:
    if edad>=0 and edad<=10:
        print("La infancia es increible y bella")
    elif edad>=11 and edad<=19:
        print("Tienes muchos cambios, mucho que estudiar")
    elif edad>=20 and edad<=29:
        print("Amor y comienza el trabajo")
    elif edad>=30 and edad<=39:
        print("Ya tas grande(?")
    elif edad>=40 and edad<=49:
        print("Cerca de la jubilación")
    elif edad>=50 and edad<=59:
        print("Anda a un crucero")
    elif edad>=60 and edad<=69:
        print("Festeja con los nietos")
    else:
        print("Ya fue")
else:
    print("Edad ingresada no válida")