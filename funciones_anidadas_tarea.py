def calculadora(num1, num2, operacion='suma'):
    
    def suma():
        return num1+num2
    def resta():
        return num1-num2
    def multiplicacion():
        return num1*num2
    def division():
        return num1/num2
    if operacion == 'suma':
        print(f'{num1} + {num2} = {suma()}')
    elif operacion == 'resta':
        print(f'{num1} - {num2} = {resta()}')
    elif operacion == 'multiplicacion':
        print(f'{num1} x {num2} = {multiplicacion()}') 
    elif operacion == 'division':
        if num2!=0:
            print(f'{num1} / {num2} = {division()}')
        else:
            print(f'{num1} / {num2} = no esta definido')

calculadora(5, 3, 'multiplicacion')
calculadora(5, 3, 'resta') 
calculadora(5, 3) 
calculadora(-5, -5, 'division')
calculadora(5, -5, 'division')
calculadora(5, 0, 'division')
calculadora(5, 3, 'suma')
#print(suma(2,2))               