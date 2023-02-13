

CREATE TABLE cadastro_tca(
    id INTEGER AUTO_INCREMENT,
    usuario varchar (35) NOT NULL,
    senha varchar (55) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE itens_tca(

    id int AUTO_INCREMENT,
    nome varchar (35) NOT NULL,
    descricao varchar (100) NOT NULL,
    valor int NOT NULL,
    PRIMARY KEY (id)

);

CREATE TABLE compra_tca(
    id int AUTO_INCREMENT,
    usuario varchar(35) NOT NULL,
    itemVenda varchar(100) NOT NULL
    PRIMARY KEY (id),
   FOREING KEY (usuario) REFERENCES usuario(cadastro_tca),
   FOREING KEY (itemVenda) REFERENCES id(itens_tca)

);

INSERT INTO itens_tca VALUES ("2","Dress cristal silver","vestido com fenda em cristais","15.000");
INSERT INTO itens_tca VALUES ("3","Dress Gold fiel","vestido transpassado com fenda","6.000");
INSERT INTO itens_tca VALUES ("4","Gold Yellow curt dress","vestido curto sem alça, contem babados e calda","10.000");
INSERT INTO itens_tca VALUES ("5","Dress fili","vestido com detalhes em fio de ouro, possui fenda e com manga molamanca","9.500");
INSERT INTO itens_tca VALUES ("6","Pink fashoin dress","vestido com fenda, manga molamanca e detalhes em babado","9.700");
INSERT INTO itens_tca VALUES ("7","Limon midi dress","vestido com cut off na cintura, manga molamanca e fenda","6.0000");
INSERT INTO itens_tca VALUES ("8","Green midi dress","vestido acetinado com fenda detalhe torcido na cintura e manga molamanca","6.000");
INSERT INTO itens_tca VALUES ("9","Dress bouti","vestido neon com tetalhe de amarraçao no pescoço e decote em v profundo","8.000");
INSERT INTO itens_tca VALUES ("10","Peach Dress","vestido em veludo com fenda e manga molamanca com decote lateral","5.000");
INSERT INTO itens_tca VALUES ("11","Crepe Blue Dress","vestido crepeado em cetim com designer na manga","11.000");
INSERT INTO itens_tca VALUES ("12","Night Dress","vestido com pedras e paite","12.000");
INSERT INTO itens_tca VALUES ("13","Dress vision","vestido com transparencia e babados em renda e busto personalizado","12.000");
INSERT INTO itens_tca VALUES ("14","Treval dress night","vestido bordado em renda transparente com decote ","11.000"); 
INSERT INTO itens_tca VALUES ("15","Cristal fashion dress","vestido com cristais e bordado, com o busto personalizado e com decote","13.000");
INSERT INTO itens_tca VALUES ("16","Gold night dress","vestido com fundo preto e detalhes em dourado, modelagem sereia","10.000");
INSERT INTO itens_tca VALUES ("","","","");
INSERT INTO itens_tca VALUES ("","","",""); 
INSERT INTO itens_tca VALUES ("","","","");
INSERT INTO itens_tca VALUES ("","","","");
INSERT INTO itens_tca VALUES ("","","","");
INSERT INTO itens_tca VALUES ("","","","");
INSERT INTO itens_tca VALUES ("","","","");
INSERT INTO itens_tca VALUES ("","","","");
INSERT INTO itens_tca VALUES ("","","","");
INSERT INTO itens_tca VALUES ("","","","");
INSERT INTO itens_tca VALUES ("","","","");




