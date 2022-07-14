a = 3
b = 2 


#Você irá perceber que ao compilar, estará false/true, o programa está informando o resultado dessas análises que estão sendo feitas

#Igual que
if print(a == b):
    print("true")
else:
    print("false")

#Diferente que
if(a != b):
    print("true")
else:
    print("false")

#Maior que
if(a >= b):
    print("true")
else:
    print("false")

#Menor que
if(a <= b):
    print("true")
else:
    print("false")

#Comparar as duas condições: "e"
if(a and b):
    print("true")
else:
    print("false")

#Comparar as duas condições: "ou"
if(a or b):
    print("true")
else:
    print("false")


#Vamos testar outra condição que faz parte do if, o elif
if (a == b):
    print ("São iguais")
elif (a < b):
    print ("b é maior que a")
else:
    print ("a é maior que b")
