import json

def get_context_arquivo_list(namefile):
    try:
        # fazendo leitura de arquivos txt em list
        file = open(namefile, 'r', encoding="utf-8")
        return_file = file.read()
        file.flush()
        file.close()
        return return_file.split('\n')
    except:
            print('erro, file not found')
            return None

def get_context_arquivo_dict(namefile):
    try:
        # fazendo leitura de arquivos txt em dict
        file = open(namefile, 'r', encoding="utf-8")
        return_file = file.read()
        json_data = json.loads(return_file)
        file.flush()
        file.close()
        return json_data
    except:
        print('erro, file not found')
        return None

def count_lines_file(namefile):
    count = 0
    file = open(namefile, 'r', encoding="utf-8")
    return_file = file.read().split('\n')
    for i in return_file:
        if i:
            count += 1
    file.flush()
    file.close()
    return count

# fazendo gravacao de dados
# se executar existindo o arquivo ele e subscrito
def create_file_overwrite_list(namefile, list_string):
    try:
        file = open(namefile, 'w', encoding="utf-8")
        for x in list_string:
            file.write(x+'\n')
        file.flush()
        file.close()
        return 'sucess'
    except:
        return 'error'

def create_file_overwrite_dict(namefile, dict):
    try:
        file = open(namefile, 'w', encoding="utf-8")
        file.write(json.dumps(dict))
        file.flush()
        file.close()
        return 'sucess'
    except Exception as e:
        print(e)
        return 'error'

# fazendo gravacao de dados
# se executar existindo ele vai adicionar se nao vai criar
def add_lines_file(namefile, list_string):
    try:
        file = open(namefile, 'a', encoding="utf-8")
        for x in list_string:
            file.write(x+';')
        file.write('\n')
        file.flush()
        file.close()
        return 'sucess'
    except:
        return 'error'
