import os
from progress_bar_simple import progress_bar
from file import add_lines_file, count_lines_file
import requests
import json



name_file = ('Numeros Megasena.txt')

numero_total_concursos = numero_total_concursos = json.loads(requests.get(
    'http://loterias.caixa.gov.br/wps/portal/loterias/landing/megasena/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOLNDH0MPAzcDbwMPI0sDBxNXAOMwrzCjA0sjIEKIoEKnN0dPUzMfQwMDEwsjAw8XZw8XMwtfQ0MPM2I02-AAzgaENIfrh-FqsQ9wNnUwNHfxcnSwBgIDUyhCvA5EawAjxsKckMjDDI9FQE-F4ca/dl5/d5/L2dBISEvZ0FBIS9nQSEh/pw/Z7_HGK818G0KO6H80AU71KG7J0072/res/id=buscaResultado//p=concurso=?timestampAjax=').content)['numero']
numero_concurso = 1
if(os.path.exists(name_file)):
    numero_concurso = count_lines_file(name_file)+ 1
afimative = True

while(afimative):
    progress_bar(numero_concurso-1, numero_total_concursos, 50)
    if(numero_concurso <= numero_total_concursos):
        try:
            request = json.loads(requests.get(
            f'http://loterias.caixa.gov.br/wps/portal/loterias/landing/megasena/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOLNDH0MPAzcDbwMPI0sDBxNXAOMwrzCjA0sjIEKIoEKnN0dPUzMfQwMDEwsjAw8XZw8XMwtfQ0MPM2I02-AAzgaENIfrh-FqsQ9wNnUwNHfxcnSwBgIDUyhCvA5EawAjxsKckMjDDI9FQE-F4ca/dl5/d5/L2dBISEvZ0FBIS9nQSEh/pw/Z7_HGK818G0KO6H80AU71KG7J0072/res/id=buscaResultado//p=concurso={numero_concurso}?timestampAjax=').content)['listaDezenas']
            add_lines_file(name_file,request)
            numero_concurso += 1
        except Exception as e:
            pass

    else:
        print('\nUpdate List')
        afimative = False
