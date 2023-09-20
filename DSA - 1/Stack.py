def create_stack():
     stack=[]
     return stack

def push_stack(stack,item):
    stack.append(item)
    print("Show Pushed Items",item)
    return stack
def check_stack():
    if len(stack)=0:
        print("Stack is Empty")

def pop_stack():
    if check_stack(stack)==0:
        print("Stack is Empty, So Wont Remove")
    return stack.pop()

stackarr=create_stack()
check_stack()
push_stack(stackarr,"Hello")
push_stack(stackarr,"Hello World")
push_stack(stackarr,"Stack Code")
pop_stack()