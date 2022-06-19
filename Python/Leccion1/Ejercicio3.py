mes = int(input("Ingrese un mes del año: \n"))
if mes>=1 and mes<=12:
    if mes>=1 and mes<=3:
        print("Está en verano")
    elif mes>=4 and mes<=6:
        print("Está en otoño")
    elif mes>=7 and mes<=9:
        print("Está en invierno")
    else:
        print("Está en primavera")
else:
    print("Mes ingresado no válido")
