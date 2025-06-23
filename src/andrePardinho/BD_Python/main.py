from sqlalchemy import create_engine, Column, Integer, String, Boolean, ForeignKey
from sqlalchemy.orm import sessionmaker, declarative_base

db = create_engine('sqlite:///src/andrePardinho/BD_Python/database.db')

Session = sessionmaker(bind=db)
session = Session()

Base = declarative_base()

# Tabelas:
# Exemplo: Sistema de biblioteca (Tabela de Usuarios e Livros)

class Usuario(Base):
    __tablename__ = "usuarios"  # Nome da tabela no banco de dados

    id = Column("id", Integer, primary_key=True, autoincrement=True, nullable=False)
    nome = Column("nome", String)
    email = Column("email", String)
    senha =  Column("senha", String)
    ativo = Column("ativo", Boolean)

    def __init__(self, nome, email, senha, ativo=True):
        self.nome = nome
        self.email = email
        self.senha = senha
        self.ativo = ativo


class Livro(Base):
    __tablename__ = "livros"

    id =  Column("id", Integer, primary_key=True, autoincrement=True, nullable=False)
    titulo =  Column("titulo", String)
    paginas = Column("paginas", Integer)
    autor =   Column("autor", String)
    dono_id = Column("dono_id", Integer, ForeignKey("usuarios.id"))

    def __init__(self, titulo, paginas, autor, dono_id):
        self.titulo = titulo
        self.paginas = paginas
        self.autor = autor
        self.dono_id = dono_id


Base.metadata.create_all(bind=db)

# Exemplo de inserção de dados
# CRUD

# Create - C
# usuario = Usuario(nome="Jones", email="jones@email.com", senha="6543221")
# session.add(usuario)
# session.commit()

# Read - R
#lista_usuarios = session.query(Usuario).all()
usuario_exemplo2 = session.query(Usuario).filter_by(email="jones@email.com").first()
print(usuario_exemplo2)
print("Nome: " + usuario_exemplo2.nome)
print("Email: " + usuario_exemplo2.email)


# livro = Livro(titulo = "Fogo e Sangue", paginas = 800, autor = "George R. R. Martin", dono_id = usuario_exemplo.id)
# session.add(livro)
# session.commit()

# Update - U
# usuario_exemplo.nome = "André Pardinho"
# session.add(usuario_exemplo)
# session.commit()

# Delete - D
session.delete(usuario_exemplo2)
session.commit()
