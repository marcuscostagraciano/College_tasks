import time, os
from threading import Thread, current_thread
from multiprocessing import Process, current_process, cpu_count

COUNT = 200000000
SLEEP = 10

def io_bound(sec):
    pid = os.getpid() #pega o numero do process ID

    threadName = current_thread().name
    processName = current_process().name


    print(f"{pid} * {processName} * {threadName} \     ---> Start sleeping...")
    time.sleep(sec)
    
    print(f"{pid} * {processName} * {threadName} \     ---> Finished sleeping...")

  

def cpu_bound(n):
    pid = os.getpid()

    threadName = current_thread().name
    processName = current_process().name

    print(f"{pid} * {processName} * {threadName} \     ---> Start counting...")    
    while n>0:
        n -= 1

    print(f"{pid} * {processName} * {threadName} \     ---> Finished counting...",n)

  

if __name__=="__main__":
    print("Qtd de cpu no sistema: ", cpu_count())
    print('----------------- Sem multiprocessamento (processos tipo I/O bound)')
    start = time.time()

    io_bound(SLEEP)
    io_bound(SLEEP)

    end = time.time()
    print(f'Duracao em segundos = {end - start:.5f}\n')

    # print('----------------- Com 2 processos (processos tipo I/O bound)')

    # start = time.time()

    # p1 = Process(target = io_bound, args =(SLEEP, ))
    # p2 = Process(target = io_bound, args =(SLEEP, ))

    # p1.start()
    # p2.start()

    # p1.join()
    # p2.join()
    
    print('----------------- Com 1 processo e 2 threads (processos tipo I/O bound)')
    start = time.time()
    
    t1 = Thread(target = io_bound, args =(SLEEP, ))
    t2 = Thread(target = io_bound, args =(SLEEP, ))
    
    t1.start()
    t2.start()

    t1.join()
    t2.join()

    end = time.time()
    
    print(f'Duracao em segundos = {end - start:.5f}')
