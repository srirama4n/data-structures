# Data Structures

Implementation of Data Structures

1. Stack
1. Queue
1. Linked List


### *_Stack_*

###### Implement stack operations in single array

```
push()
pop()
top()/peek()
size()
```

###### Implement 2 stacks in single array

```
Simple soluition would be divide the 
array but we need to build it in more effective way 
```
###### Implement M stacks in single array

```
Impletement using extra space
```
###### Implement M stacks in single array with out using extra space

```
Space is a constraint
```
###### Implement Stack with following operations

```
push(x)
pop()
peek()/top()
size()
getMax()
getMin()
getAvg()

Opertions : 5,1,7,getMax(),3,getMax(), pop(), getMax(), pop(), getMax()
Output    :          7          7                 7               5
```

###### Give a string of brackets check if it is valid or not

```
1.(){()(){()[](){([])}} - Invalid
2.{[](())[(])}          - Invalid
3.{[[]]({})}            - Valid
```

###### Give a string of single type of brackets check if it is valid or not

```
1.(()(()))  - Invalid
2.((())(    - Invalid
3.(()))(    - InValid
4.((()(())) - Valid
```
> Hint: Use count array

###### Give a sentence, reverse the sentence

```
I/P: This session is awesome
O/P: awesome is session This  
```
###### Find first smaller element on right of each element in given array

```
I/P: 5   2  8  12 17 9 4 7 10 3
O/P: 2 -inf 4  9  9  4 3 3 3 -inf 
```


### *_Queue_*

###### Implement queue in single array

```
enqueue()
dequeue()
rear()/front()
size()
```

###### Implement queue in stack

```
enqueue()
dequeue()
rear()/front()
size()
```

###### For a given array find maximum element in every window of size k

```
Ex  : 10 3 8 7 9 8 5 7 6 3 1 4
K   : 5
O/p : 10 9 ...
```
### *_Linked List_*

### Implement a Linked List with following operations

> _Edge Case : Empty LinkedList, List can be of any size_

```
1. void print(Node h)
2. int length(Node h)
3. void printRev(Node h)
4. Node insert(Node h, int i, int x) 
5. Node insert(Node h, int x)          - SSLL (Sorted Single Linked List)
6. Node delete(Node h, int i)
7. Node deleteAll(Node h, int x)       - Delete all oocurances of x
8. Node distinct(Node h)               - SSLL (Sorted Single Linked List)
    Ex  : 1 -> 1 -> 3 -> 3 -> 3 -> 5 -> 7 -> 10 -> 10 -> 11
        : 1 -> 3 -> 5 -> 7 -> 10 -> 11  
9. Node unique(Node h)                 - SSLL (Sorted Single Linked List)
    Ex  : 1 -> 1 -> 3 -> 3 -> 5 -> 7 -> 10 -> 10 -> 11
        : 5 -> 7 -> 11
10. Node rev(Node h)
    Ex  : 1 -> 3 -> 2 -> 10 -> 5
        : 5 -> 10 -> 2 -> 3 -> 1 
```


