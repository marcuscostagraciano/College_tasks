# Capitulo 5 multiprocessamento (com e sem join)
import time, os
from multiprocessing import Process

def add(num, value):
    pid = os.getpid()
    print(f"(iniciou processo ID {pid} contagem {num})")
    for i in range(0, 2):
        num += value
        print(f"(processo ID {pid} contagem {num})")
    for j in range(100000000):
        pass    
    print(f"(encerrou processo ID {pid} contagem {num})")

if __name__ == '__main__':
    start = time.time()

    num = 0

    add(0,1)
    add(0,1)
    add(0,1)

    
    p1 = Process(target=add, args=(num, 1 ))
    p2 = Process(target=add, args=(num, 1 ))
    p3 = Process(target=add, args=(num, 1 ))

    p1.start()
    p2.start()
    p3.start()

    p1.join()
    p2.join()
    p3.join()
    
    print('(concluidos)')
    end = time.time()
    print(f'Duracao em segundos = {end - start:.5f}')
    for j in range(900000000):
        pass  
