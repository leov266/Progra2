class Triangulo:
    def __init__(self, lado1, lado2, lado3):
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3
#Funcion para imprimir el lado mayor     
    def lado_mayor(self):
        lado_mayor = max(self.lado1, self.lado2, self.lado3)
        print("El lado con tamaño mayor es:", lado_mayor)
#Funcion para imprimir el tipo de triangulo      
    def tipo_de_triangulo(self):
        if self.lado1 == self.lado2 == self.lado3:
            tipo = "equilátero"
        elif self.lado1 == self.lado2 or self.lado1 == self.lado3 or self.lado2 == self.lado3:
            tipo = "isósceles"
        else:
            tipo = "escaleno"
        
        print("El triángulo es de tipo:", tipo)


#Pedir al usuario el valor de los lados del triangulo
lado1 = float(input("Ingrese el lado 1 del triángulo: "))
lado2 = float(input("Ingrese el lado 2 del triángulo: "))
lado3 = float(input("Ingrese el lado 3 del triángulo: "))

# Instancia de la clase Triangulo
triangulo = Triangulo(lado1, lado2, lado3)

# Usar la funcion para imprimir el lado mayor
triangulo.lado_mayor()

# Determinar el tipo de triángulo
triangulo.tipo_de_triangulo()