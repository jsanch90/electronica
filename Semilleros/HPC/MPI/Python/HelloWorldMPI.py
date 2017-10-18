from mpi4py import MPI # mpi calls

#Simple mpi hello world program
#prints the mpi context of each precess

def main():
    #initialize MPI
    comm = MPI.COMM_WORLD

    #get my rank number
    rank = comm.Get_rank()

    #get the total number of tasks
    size= comm.Get_size()

    #get the hostname of this processor
    hostname = MPI.Get_processor_name()

    #print the mpi context of this process
    print("MPI process on rank",rank,"running on",hostname,"of a total number of tasks",size)

    #end the program
    MPI.Finalize()
    return 0

if __name__=="__main__":
    main()
