import threading, time
# define variavel global x
x = 0

def incrementa():
    # funcao de incrementar a variavel global x  
    global x
    x = x + 1


def thread_task():
    # tarefa da thread chama a funcao incrementa 100000 vezes.
    
    for _ in range(100000):
        incrementa()


def main_task():
    global x
    # setting global variable x as 0
    x = 0
    
    # cria threads
    t1 = threading.Thread(target=thread_task)
    t2 = threading.Thread(target=thread_task)   
    
    # inicia threads
    t1.start()
    t2.start()
    
    # aguarda ate as threads concluirem suas tarefas
    t1.join()
    t2.join()


if __name__ == "__main__":
    inicio = time.time()
    for i in range(10):
        main_task()
        print(f"Iteration {i}: x = {x}")
        
    fim = time.time()
    print('Duracao em segundos -', fim - inicio)
