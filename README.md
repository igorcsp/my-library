# Projeto MyLibrary

### Database sample:

```
CREATE DATABASE db_library;

USE db_library;

CREATE TABLE tb_usuariosa (
  id INTEGER  NOT NULL   AUTO_INCREMENT,
  cpf VARCHAR(15)  NOT NULL  ,
  nome VARCHAR(45)  NOT NULL  ,
  senha VARCHAR(10)  NOT NULL  ,
  telefone VARCHAR(11)  NOT NULL  ,
  email VARCHAR(45)  NOT NULL  ,
  endereco VARCHAR(50)  NOT NULL  ,
  complemento VARCHAR(15) NULL  ,
  PRIMARY KEY(id));

INSERT INTO tb_usuariosa (cpf, nome, senha, telefone, email, endereco, complemento)
VALUES ('admin', 'admin', 'admin', 'admin', 'admin', 'admin', '');
INSERT INTO tb_usuariosa (cpf, nome, senha, telefone, email, endereco, complemento)
VALUES ('12345678912', 'Nome Usuario', 'senha', '11985212161', 'usuario@email.com', 'Rua Usuario, 1000', 'ap 112');

CREATE TABLE tb_livrosa (
  id INTEGER  NOT NULL   AUTO_INCREMENT,
  titulo VARCHAR(45)  NOT NULL  ,
  autor VARCHAR(45)  NOT NULL  ,
  disponivel BIT(1)  NOT NULL  ,
  reservado BIT(1)  NOT NULL    ,
  emprestado_para VARCHAR(45) NOT NULL  ,
PRIMARY KEY(id));

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para) VALUES ('Visual J++ Java programming', 'FLYNN, Jeff', 1, 0, '');
INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para) VALUES ('Ainda moderno', 'Lauro Pereira', 1, 0, '');
INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para) VALUES ('Agile estimating and planning', 'COHN, Mike', 1, 0, '');
INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para) VALUES ('Livro Legal', 'Autor Firmeza', 1, 0, '');
INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para) VALUES ('Vida', 'Autor Vida', 1, 0, '');
INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para) VALUES ('UML', 'Autor UML', 1, 0, '');

CREATE TABLE tb_livrosDeInteresseA ( id INTEGER NOT NULL AUTO_INCREMENT, usuario_id INTEGER NOT NULL , titulo VARCHAR(60) NOT NULL , autor VARCHAR(45) NOT NULL , PRIMARY KEY(id), FOREIGN KEY(usuario_id) REFERENCES tb_usuariosA(id)
 );

CREATE TABLE tb_historico ( id INTEGER NOT NULL AUTO_INCREMENT, usuario_id INTEGER NOT NULL , titulo VARCHAR(60) NOT NULL , autor VARCHAR(45) NOT NULL , PRIMARY KEY(id), FOREIGN KEY(usuario_id) REFERENCES tb_usuariosa(id)
 );
```
