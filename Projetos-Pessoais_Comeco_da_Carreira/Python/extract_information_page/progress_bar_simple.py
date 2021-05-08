import time
from tkinter.constants import N


def progress_bar(min,max,tamanho_barra):
    
    strbarwidth = '[{}{}] - {}\r'.format(
        (int(min/tamanho_barra) * '#'),
        (int((max - min)/tamanho_barra) * '-'),
        (('{:0.2f}'.format(((min) * ((tamanho_barra/max)*2))) + '%'))
    )
    
    print(strbarwidth, end='')
print()