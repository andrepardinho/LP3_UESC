class Funcionario:
    def __init__(self, nome, salarioBase):
        self.nome = nome
        self.salario = salarioBase

    def exibirDados(self):
        print("Nome:", self.nome)
        print("Salario:", self.salario)

class Gerente(Funcionario):
    def __init__(self, nome, salarioBase, bonusGerencial):
        super().__init__(nome, salarioBase)
        self.bonusGerencial = bonusGerencial

    def exibirDados(self):
        super().exibirDados()
        print("Bonus Gerencial:", self.bonusGerencial)
        print("Salario Total:", self.salario + self.bonusGerencial)


if __name__ == "__main__":

    funcionario = Funcionario("Andre", 1000)
    funcionario.exibirDados()
    print()
    gerente = Gerente("Maria", 2000, 500)
    gerente.exibirDados()