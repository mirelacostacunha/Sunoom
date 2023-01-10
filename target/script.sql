CREATE TABLE produtos_tca(
    id INTEGER AUTO_INCREMENT,
    nome  varchar (255) NOT NULL,
    descricao varchar (255) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE listas_tca(
    id INTEGER AUTO_INCREMENT,
    titulo varchar (255) NOT NULL,
    descricao varchar (255) NOT NULL,
    dataHora TIMESTAMP NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE itenslista_tca(
    id INTEGER AUTO_INCREMENT,
    idProduto INTEGER,
    idLista INTEGER,
    quantidade double NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT itens_FK_listas FOREING KEY (idLista) REFERENCES listas(listas_tca,)
    CONSTRAINT itens_FK_produtos FOREING KEY (idProduto) REFERENCES produtos(produtos_tca)
);