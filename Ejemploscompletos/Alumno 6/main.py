if __name__ == '__main__':
    resultados = []
    while True:        
        numero_casos = input("Introduce el número de casos de prueba: ")
        if numero_casos.isnumeric() is True:
            break
        print("ATENCIÓN: ¡Debe introducir un número positivo!")
    for i in range(int(numero_casos)):
        parejas = 0
        while True:
            try:
                burros, sacos = [int(x) for x in input("Introduzca el número de burros y sacos [1 - 1.000.000]: ").split(' ')]
                
                break
            except ValueError:
                print ("ATENCIÓN: Debe ingresar dos números enteros.")
        while True:
            try:  
                lista_sacos = [int(x) for x in input("Introduzca los pesos de los sacos [1 - 20.000]: ").split(' ')]
                break
            except ValueError:
                print ("ATENCIÓN: Debe ingresar cantidades enteras.")
        while lista_sacos:
            peso = lista_sacos[0]
            ocurrencias = lista_sacos.count(peso)
            parejas += ocurrencias // 2
            lista_sacos = [saco for saco in lista_sacos if saco != peso]            
        if parejas < burros:
            resultados.append(parejas)
        else:
            resultados.append(burros)
    for solucion in resultados:
        print(solucion)
