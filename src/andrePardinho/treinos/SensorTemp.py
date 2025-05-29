class SensorBase:
    def coletar_dados(self):
        return "Coletando dados genéricos"

class SensorTemperatura(SensorBase):
    def coletar_dados(self):
        dados = super().coletar_dados()
        return "Temperatura: 25°C\n" + dados

class SensorUmidade(SensorBase):
    def coletar_dados(self):
        dados = super().coletar_dados()
        return "Umidade: 60%\n" + dados



class SensorComposto(SensorTemperatura, SensorUmidade):
    def coletar_dados(self):
        dados_temp = super().coletar_dados()
        partes = dados_temp.split("\n")

        return (
            "\nDados do Sensor Composto:\n"
            f"{partes[0]}\n"
            f"{partes[1]}\n"
        )


sensor_temp = SensorTemperatura()
sensor_umidade = SensorUmidade()

print(sensor_temp.coletar_dados())
print(sensor_umidade.coletar_dados())

sensor_composto = SensorComposto()
print(sensor_composto.coletar_dados())