def create_stack():
     stack=[]
     return stack
def check_stack(stack):
    if len(stack)==0:
        print("Stack is Empty")

def push_stack(stack,item):
    stack.append(item)
    print("Show Pushed Items",item)
    return stack
def pop_stack(stack):
    if check_stack(stack)==0:
        print("Stack is Empty, So Wont Remove")
    stack.pop()
    print(stack)
    return stack

stackarr=create_stack()
check_stack(stackarr)
push_stack(stackarr,"Hello")
push_stack(stackarr,"Hello World")
push_stack(stackarr,"Stack Code")
pop_stack(stackarr)
