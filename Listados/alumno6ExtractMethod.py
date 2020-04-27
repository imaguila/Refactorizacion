parejas = 0

...

while lista_sacos:
            peso = lista_sacos[0]
            ocurrencias = lista_sacos.count(peso)
            parejas += ocurrencias // 2
            lista_sacos = [saco for saco in lista_sacos if saco != peso]            
        if parejas < burros:
            resultados.append(parejas)
        else:
            resultados.append(burros)