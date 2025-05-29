class Animal:
    def __init__(self, nome):
        self.nome = nome

    #Método abstrato
    def emitirSom(self):
        raise NotImplementedError
    
class Cachorro(Animal):
    def emitirSom(self):
        print(f"{self.nome} diz: Au Au!")
    
class Gato(Animal):
    def emitirSom(self):
        print(f"{self.nome} diz: Miau Miau!")

# Classe CatDog que herda de Gato e Cachorro
## A ordem de herança é importante, pois o método emitirSom de Gato
## será sobrescrito pelo método de Cachorro
class CatDog(Gato, Cachorro):
    def emitirSom(self):
        super().emitirSom()

class Mutante(CatDog):
    pass

x = Mutante("Bob")
x.emitirSom()  # Chama o método de CatDog, que chama o método de Cachorro

for animal in [Cachorro("Rex"), Gato("Mia"), CatDog("Fido")]:
    animal.emitirSom()