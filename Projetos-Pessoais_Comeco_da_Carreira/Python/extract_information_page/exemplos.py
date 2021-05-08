from file import get_context_arquivo

list = get_context_arquivo('oi.txt').split('\n')
lista = []
for x in list:
    for y in x.split(';'):
        if(lista == []):
            lista += [y]
        elif(y == ''):
            pass
        else:
            lista += [y]


print(lista)