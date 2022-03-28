CREATE DATABASE corretor;
USE corretor;


CREATE TABLE pessoa
(
    cod_pessoa INT         NOT NULL,
    p_nome     VARCHAR(40) NOT NULL,
    m_inicial  VARCHAR(40) NOT NULL,
    u_nome     VARCHAR(40) NOT NULL,
    PRIMARY KEY (cod_pessoa)
);

CREATE TABLE telefone
(
    telefone   varchar(11),
    cod_pessoa INT NOT NULL,
    CONSTRAINT fk_cod_pessoa FOREIGN KEY (cod_pessoa) REFERENCES pessoa (cod_pessoa)
);

CREATE TABLE locador
(
    cod_lcd    INT         NOT NULL PRIMARY KEY,
    e_parceiro VARCHAR(50) NOT NULL,
    CONSTRAINT fk_cod_lcd FOREIGN KEY (cod_lcd) REFERENCES pessoa (cod_pessoa)
);

CREATE TABLE corretor
(
    cod_crt   INT NOT NULL PRIMARY KEY,
    avaliacao VARCHAR(10),
    CONSTRAINT fk_cod_crt FOREIGN KEY (cod_crt) REFERENCES pessoa (cod_pessoa)
);

CREATE TABLE corretor_locador
(
    cod_lcd  INT   NOT NULL,
    cod_crt  INT   NOT NULL,
    comissao FLOAT NOT NULL,
    CONSTRAINT fk_cod_lcd_locador FOREIGN KEY (cod_lcd) REFERENCES locador (cod_lcd),
    CONSTRAINT fk_cod_crt_locador FOREIGN KEY (cod_crt) REFERENCES corretor (cod_crt)
);


CREATE TABLE locatario
(
    cod_lct   INT  NOT NULL,
    data_nasc DATE NOT NULL,
    CONSTRAINT fk_cod_lct FOREIGN KEY (cod_lct) REFERENCES pessoa (cod_pessoa)
);

CREATE TABLE associado
(
    nome            VARCHAR(255) NOT NULL,
    data_nasc       DATE         NOT NULL,
    tipo_associacao VARCHAR(10)  NOT NULL,
    cod_lcd         INT          NOT NULL,
    CONSTRAINT fk_cod_lcd_associado FOREIGN KEY (cod_lcd) REFERENCES locador (cod_lcd)
);

CREATE TABLE imovel
(
    cod_imv     INT          NOT NULL PRIMARY KEY,
    cod_lcd     INT          NOT NULL,
    mensalidade FLOAT        NOT NULL,
    nQuartos    INT          NOT NULL,
    nBanheiros  INT          NOT NULL,
    dimensao    INT          NOT NULL,
    temSuite    BOOL         NOT NULL,
    rua         VARCHAR(255) NOT NULL,
    numero      INT          NOT NULL,
    bairro      VARCHAR(30)  NOT NULL,
    num_apart   INT          NOT NULL,
    tem_garagem BOOL         NOT NULL,
    tipo        VARCHAR(15)  NOT NULL,
    CONSTRAINT fk_cod_lcd_imovel FOREIGN KEY (cod_lcd) REFERENCES locador (cod_lcd)
);

CREATE TABLE regras_condominio
(
    cod_imv INT NOT NULL,
    regra   VARCHAR(255),
    CONSTRAINT fk_cod_imv_condominio FOREIGN KEY (cod_imv) REFERENCES imovel (cod_imv)
);

CREATE TABLE aluga
(
    cod_crt          INT  NOT NULL,
    cod_lct          INT  NOT NULL,
    cod_imv          INT  NOT NULL,
    data_inicio_alug DATE NOT NULL,
    data_fim_alug    DATE NOT NULL,
    CONSTRAINT fk_cod_lct_aluga FOREIGN KEY (cod_lct) REFERENCES pessoa (cod_pessoa),
    CONSTRAINT fk_cod_crt_aluga FOREIGN KEY (cod_crt) REFERENCES corretor (cod_crt),
    CONSTRAINT fk_cod_imv_aluga FOREIGN KEY (cod_imv) REFERENCES imovel (cod_imv)
);




