
import operator


def verify_amount_occurrence(list, separation_strings):
    list = agrup_elements_in_list(list, separation_strings)
    #lista = count_occorrence_one_create_new_list(list)
    lista = count_occorrence_one_create_new_dict(list)
    return lista

def agrup_elements_in_list(list, separator):
    lista = []
    # agrupando algorimito por lista, fica lista dentro de lista, facilita o trabalho.
    for x in list:
        for y in x.split('\n'):
            if(y != ''):
                a = []
                for i in range(len(y.split(separator))):
                    a = y.split(separator)
                    a.pop()
                    i += 1
                lista += [a]
    return lista

def count_occorrence_one_create_new_list(list):
    lista = initializing_matrix(list)
    for x in range(len(list)):
        for y in range(len(list[x])):
            count = 0
            for z in range(len(list)):
                for h in range(len(list[z])):
                    if(list[x][y]==list[z][h]):
                        count +=1
            lista[x][y] = count           

    return lista

def count_occorrence_one_create_new_dict(list):
    lista = {}
    for x in range(len(list)):
        for y in range(len(list[x])):
            count = 0
            for z in range(len(list)):
                for h in range(len(list[z])):
                    if(list[x][y]==list[z][h]):
                        count +=1
            lista.update({list[x][y]:count})   
    return lista

def initializing_matrix(list):
    lista = []
    for x in range(len(list)):
        a = []
        for y in range(len(list[x])):
            a+=[0]
        lista+=[a]
    return lista

def order_grow(list, reference):
    return dict(sorted(list.items(), key=lambda item: item[reference]))

def decrease_order(list, reference):
    return dict(sorted(list.items(), reverse=True,key=lambda item: item[reference]))