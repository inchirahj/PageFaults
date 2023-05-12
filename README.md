# PageReplacementAlgorithms

Assignment 
------------
Write a simulator to test a page replacement algorithm. Select one of the following algorithms: OPT, FIFO, SC, LRU, or RAND (random replacement) and implement it.

Your program should behave in the following manner:
- Welcome the user to your program, and inform the user of your algorithm(s).
- Prompt the user to enter how many pages the process will have in its virtual address space.
- Prompt the user to choose how many frames of physical memory are allocated.
- Prompt the user to indicate how many page references they would like to simulate.
- Generate a random sequence of page references of the desired length. You should allow repeated references if they occur.
- Simulate your algorithm on the sequence of page references.
- Report the number of page faults generated during the simulation, as a total number and as a percentage of total page references.

When generating your sequence of page references, simply generate a random page number for each page reference – use the number of virtual pages to randomly select a number. You can generate the entire sequence in advance, or handle the pages as they are generated, depending on choice or the algorithm implemented.
