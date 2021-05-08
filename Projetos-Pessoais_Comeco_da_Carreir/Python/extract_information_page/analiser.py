import os
import os
from analiser_functions import decrease_order, verify_amount_occurrence
from file import create_file_overwrite_dict, get_context_arquivo_dict, get_context_arquivo_list

name_file_list_number_megasena = 'Numeros Megasena.txt'
name_file_dict_ordained = 'lista ordenada.txt'


if(os.path.isfile(name_file_dict_ordained)!=True):
    list = get_context_arquivo_list(name_file_list_number_megasena)
    qnt_occorrence= verify_amount_occurrence(list, ';')
    list_order = decrease_order(qnt_occorrence,1)
    create_file_overwrite_dict(name_file_dict_ordained, list_order)


list_ordained = get_context_arquivo_dict(name_file_dict_ordained)
