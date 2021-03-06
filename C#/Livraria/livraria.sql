USE [master]
GO
/****** Object:  Database [livraria]    Script Date: 10/09/2014 13:26:04 ******/
CREATE DATABASE [livraria]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'livraria', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\livraria.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'livraria_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\livraria_log.ldf' , SIZE = 2048KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [livraria] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [livraria].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [livraria] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [livraria] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [livraria] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [livraria] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [livraria] SET ARITHABORT OFF 
GO
ALTER DATABASE [livraria] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [livraria] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [livraria] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [livraria] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [livraria] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [livraria] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [livraria] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [livraria] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [livraria] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [livraria] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [livraria] SET  DISABLE_BROKER 
GO
ALTER DATABASE [livraria] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [livraria] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [livraria] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [livraria] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [livraria] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [livraria] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [livraria] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [livraria] SET RECOVERY FULL 
GO
ALTER DATABASE [livraria] SET  MULTI_USER 
GO
ALTER DATABASE [livraria] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [livraria] SET DB_CHAINING OFF 
GO
ALTER DATABASE [livraria] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [livraria] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [livraria]
GO
/****** Object:  Table [dbo].[cliente]    Script Date: 10/09/2014 13:26:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[cliente](
	[cod_cliente] [int] IDENTITY(1,1) NOT NULL,
	[nome] [varchar](150) NULL,
	[email] [varchar](70) NULL,
	[telefone] [varchar](50) NULL,
 CONSTRAINT [PK_cliente] PRIMARY KEY CLUSTERED 
(
	[cod_cliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[editoraa]    Script Date: 10/09/2014 13:26:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[editoraa](
	[cod_editora] [int] IDENTITY(1,1) NOT NULL,
	[telefone] [varchar](50) NULL,
	[descricao] [varchar](150) NULL,
	[endereco] [varchar](200) NULL,
	[email] [varchar](70) NULL,
	[responsavel] [varchar](150) NULL,
 CONSTRAINT [PK_editoraa] PRIMARY KEY CLUSTERED 
(
	[cod_editora] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[funcionario]    Script Date: 10/09/2014 13:26:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[funcionario](
	[cod_funcionario] [int] IDENTITY(1,1) NOT NULL,
	[cidade] [varchar](50) NULL,
	[bairro] [varchar](50) NULL,
	[nome] [varchar](150) NULL,
	[endereco] [varchar](200) NULL,
	[uf] [char](2) NULL,
	[cargo] [varchar](100) NULL,
	[email] [varchar](70) NULL,
	[salario] [float] NULL,
	[login] [varchar](50) NULL,
	[senha] [varchar](20) NULL,
 CONSTRAINT [PK_funcionario] PRIMARY KEY CLUSTERED 
(
	[cod_funcionario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[livro]    Script Date: 10/09/2014 13:26:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[livro](
	[cod_livro] [int] IDENTITY(1,1) NOT NULL,
	[titulo] [varchar](50) NULL,
	[ano_lançamento] [int] NULL,
	[autor] [varchar](150) NULL,
	[preco_custo] [float] NULL,
	[preco_venda] [float] NULL,
	[genero] [varchar](50) NULL,
	[cod_editora] [int] NULL,
	[quantidade] [int] NULL,
 CONSTRAINT [PK_livro] PRIMARY KEY CLUSTERED 
(
	[cod_livro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[venda]    Script Date: 10/09/2014 13:26:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[venda](
	[cod_venda] [int] IDENTITY(1,1) NOT NULL,
	[data] [date] NULL,
	[valor_total] [float] NULL,
	[cod_funcionario] [int] NULL,
	[cod_cliente] [int] NULL,
	[cod_livro] [int] NULL,
 CONSTRAINT [PK_venda_1] PRIMARY KEY CLUSTERED 
(
	[cod_venda] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[livro]  WITH CHECK ADD  CONSTRAINT [FK_livro_editoraa] FOREIGN KEY([cod_editora])
REFERENCES [dbo].[editoraa] ([cod_editora])
GO
ALTER TABLE [dbo].[livro] CHECK CONSTRAINT [FK_livro_editoraa]
GO
ALTER TABLE [dbo].[venda]  WITH CHECK ADD  CONSTRAINT [FK_venda_cliente] FOREIGN KEY([cod_cliente])
REFERENCES [dbo].[cliente] ([cod_cliente])
GO
ALTER TABLE [dbo].[venda] CHECK CONSTRAINT [FK_venda_cliente]
GO
ALTER TABLE [dbo].[venda]  WITH CHECK ADD  CONSTRAINT [FK_venda_funcionario] FOREIGN KEY([cod_funcionario])
REFERENCES [dbo].[funcionario] ([cod_funcionario])
GO
ALTER TABLE [dbo].[venda] CHECK CONSTRAINT [FK_venda_funcionario]
GO
ALTER TABLE [dbo].[venda]  WITH CHECK ADD  CONSTRAINT [FK_venda_livro] FOREIGN KEY([cod_livro])
REFERENCES [dbo].[livro] ([cod_livro])
GO
ALTER TABLE [dbo].[venda] CHECK CONSTRAINT [FK_venda_livro]
GO
USE [master]
GO
ALTER DATABASE [livraria] SET  READ_WRITE 
GO
USE [livraria]
GO
SET IDENTITY_INSERT [dbo].[editoraa] ON 

INSERT [dbo].[editoraa] ([cod_editora], [telefone], [descricao], [endereco], [email], [responsavel]) VALUES (1, N'(19) 3120-9870', N'Positivo Editora', N'Rua São Jorge, 66', N'positivo@yahoo.com.br', N'Joaquim da Serra')
INSERT [dbo].[editoraa] ([cod_editora], [telefone], [descricao], [endereco], [email], [responsavel]) VALUES (3, N'(10) 5675-2913', N'Milenio Editora', N'Rua São Pedro,1000', N'contato@seculo.com.br', N'Bernardo da Silva')
INSERT [dbo].[editoraa] ([cod_editora], [telefone], [descricao], [endereco], [email], [responsavel]) VALUES (4, N'(11) 4210-9881', N'Vale Editora', N'Av. Nova Iorque, s/n', N'adm@vale.com.br', N'Mariana da Silva')
INSERT [dbo].[editoraa] ([cod_editora], [telefone], [descricao], [endereco], [email], [responsavel]) VALUES (5, N'(20) 7542-9038', N'Marinho', N'Rua Padre do Carmo,9', N'marinho.editora@gmail.com', N'Felipe Duarte')
INSERT [dbo].[editoraa] ([cod_editora], [telefone], [descricao], [endereco], [email], [responsavel]) VALUES (1005, N'(75) 8752-9723', N'Nova Era Edi', N'Av. Nova Iorque', N'newera_edi@gmail.com', N'Mariano Jorge')
INSERT [dbo].[editoraa] ([cod_editora], [telefone], [descricao], [endereco], [email], [responsavel]) VALUES (1006, N'(12) 9873-1817', N'Lenovo Editora', N'Av. Engenheiro Aranha, 1000', N'contato@lenovo.com.br', N'Elaine de Raquel de Queiroz')
INSERT [dbo].[editoraa] ([cod_editora], [telefone], [descricao], [endereco], [email], [responsavel]) VALUES (1007, N'(19) 3836-4029', N'Santa Clara Editora', N'SP-75', N'cont@clara.com.br', N'Luca de Souza')
SET IDENTITY_INSERT [dbo].[editoraa] OFF
SET IDENTITY_INSERT [dbo].[livro] ON 

INSERT [dbo].[livro] ([cod_livro], [titulo], [ano_lançamento], [autor], [preco_custo], [preco_venda], [genero], [cod_editora], [quantidade]) VALUES (1005, N'Será Apenas um Cemitério?', 2000, N'Fernando da Silva', 20, 50, N'Terror', 3, 10)
INSERT [dbo].[livro] ([cod_livro], [titulo], [ano_lançamento], [autor], [preco_custo], [preco_venda], [genero], [cod_editora], [quantidade]) VALUES (1006, N'Volta ao Mundo em 80 dias', 1996, N'Felipe Duarte Domingues', 10, 20, N'Aventura', 1005, 3)
INSERT [dbo].[livro] ([cod_livro], [titulo], [ano_lançamento], [autor], [preco_custo], [preco_venda], [genero], [cod_editora], [quantidade]) VALUES (1007, N'Alguem Salve o Meu Pai', 2010, N'Mariano de Ameida', 4, 10, N'Drama', 3, 7)
INSERT [dbo].[livro] ([cod_livro], [titulo], [ano_lançamento], [autor], [preco_custo], [preco_venda], [genero], [cod_editora], [quantidade]) VALUES (2007, N'Valores de Um Bom Emprego', 2014, N'Marcio da Silva', 10, 50, N'Administração', 1005, 9)
INSERT [dbo].[livro] ([cod_livro], [titulo], [ano_lançamento], [autor], [preco_custo], [preco_venda], [genero], [cod_editora], [quantidade]) VALUES (2008, N'Pare de Beber', 2000, N'Manuel de Calos de Alemeida', 12, 15, N'Auto ajuda', 4, 22)
SET IDENTITY_INSERT [dbo].[livro] OFF
SET IDENTITY_INSERT [dbo].[cliente] ON 

INSERT [dbo].[cliente] ([cod_cliente], [nome], [email], [telefone]) VALUES (1, N'Luiz Rubens Ribas Romera', N'luiz.rubens@hotmail.com', N'(19) 3320-9808')
INSERT [dbo].[cliente] ([cod_cliente], [nome], [email], [telefone]) VALUES (3, N'Fernando Pessoa', N'fernandinho@yahoo.com.br', N'(19) 3318-9010 / 98765-9102')
INSERT [dbo].[cliente] ([cod_cliente], [nome], [email], [telefone]) VALUES (4, N'Bruna Creatto', N'bruna.flori@hotmail.com', N'99470-7131')
INSERT [dbo].[cliente] ([cod_cliente], [nome], [email], [telefone]) VALUES (1002, N'Fernando Vallim de Paula', N'vallim@yahoo.com.br', N'(19) 97648-9292')
INSERT [dbo].[cliente] ([cod_cliente], [nome], [email], [telefone]) VALUES (1003, N'Edilaine de Souza', N'edilaine@hotmail.com', N'(19) 3874-9634')
INSERT [dbo].[cliente] ([cod_cliente], [nome], [email], [telefone]) VALUES (1004, N'Diego dos Santos Silva', N'dieg@hotmail.com', N'(19) 3524-4122 / 97243-9642')
INSERT [dbo].[cliente] ([cod_cliente], [nome], [email], [telefone]) VALUES (1005, N'Sara de Menezes', N'sara.mene@gmail.com', N'(19) 98892-7542')
SET IDENTITY_INSERT [dbo].[cliente] OFF
SET IDENTITY_INSERT [dbo].[funcionario] ON 

INSERT [dbo].[funcionario] ([cod_funcionario], [cidade], [bairro], [nome], [endereco], [uf], [cargo], [email], [salario], [login], [senha]) VALUES (1, N'Indaiatuba', N'Oliveira Camargo', N'João José Cardoso', N'Alameda 90', N'SP', N'Gerente Geral', N'joao.jose@yahoo.com.br', 10000, N'joao', N'1234')
INSERT [dbo].[funcionario] ([cod_funcionario], [cidade], [bairro], [nome], [endereco], [uf], [cargo], [email], [salario], [login], [senha]) VALUES (2, N'Indaiatuba', N'Jardim Oliveira Camargo', N'Maria da Silva', N'Rua Valemtim,3200', N'SP', N'Gerente de administrativo', N'mariasilva@gmail.com', 7100, N'silva', N'1234')
INSERT [dbo].[funcionario] ([cod_funcionario], [cidade], [bairro], [nome], [endereco], [uf], [cargo], [email], [salario], [login], [senha]) VALUES (1004, N'Indaiatuba', N'Cidade Nova', N'Carlos da Silva', N'Rua Qualquer, 100', N'SP', N'Vendedor', N'carlinho@hotmail.com', 2000, N'carlos', N'123')
INSERT [dbo].[funcionario] ([cod_funcionario], [cidade], [bairro], [nome], [endereco], [uf], [cargo], [email], [salario], [login], [senha]) VALUES (2004, N'Indaiatuba', N'Morada do Sol', N'Luiz Rubens R. Romera', N'Rua São Bento,293', N'SP', N'Vendedor', N'luiz.rubens@hotmail.com', 2000, N'luiz', N'1234')
INSERT [dbo].[funcionario] ([cod_funcionario], [cidade], [bairro], [nome], [endereco], [uf], [cargo], [email], [salario], [login], [senha]) VALUES (2005, N'Indaiatuba', N'Morada do Sol', N'Alinário de Almeida Campos', N'Av. Marco da Graça, 2500', N'  ', N'Vendedor', N'almeida.alinario@hotmail.com', 2000, N'', N'')
INSERT [dbo].[funcionario] ([cod_funcionario], [cidade], [bairro], [nome], [endereco], [uf], [cargo], [email], [salario], [login], [senha]) VALUES (2006, N'Indaiatuba', N'Itaici', N'Marcio de Souza', N'Rua São Miguel, 200', N'SP', N'Vendedor', N'silva.marcinho@yahoo.com.br', 2000, N'marcio', N'1234')
SET IDENTITY_INSERT [dbo].[funcionario] OFF
SET IDENTITY_INSERT [dbo].[venda] ON 

INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (5, CAST(0x82380B00 AS Date), 50, 2, 3, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (6, CAST(0xFF380B00 AS Date), 20, 2, 3, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (7, CAST(0xFF380B00 AS Date), 50, 2005, 4, 1005)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (8, CAST(0xFF380B00 AS Date), 20, 2, 1002, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1002, CAST(0x02390B00 AS Date), 20, 2, 1002, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1003, CAST(0x02390B00 AS Date), 20, 2, 3, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1004, CAST(0x02390B00 AS Date), 20, 1004, 3, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1005, CAST(0x04390B00 AS Date), 15, 1004, 1002, 2008)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1006, CAST(0x04390B00 AS Date), 20, 2004, 1, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1007, CAST(0x04390B00 AS Date), 50, 2, 3, 2007)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1008, CAST(0x04390B00 AS Date), 20, 2004, 3, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1009, CAST(0x04390B00 AS Date), 15, 2, 3, 2008)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1010, CAST(0x04390B00 AS Date), 50, 2, 4, 2007)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1011, CAST(0x04390B00 AS Date), 20, 2005, 3, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1012, CAST(0x04390B00 AS Date), 20, 2, 3, 1006)
INSERT [dbo].[venda] ([cod_venda], [data], [valor_total], [cod_funcionario], [cod_cliente], [cod_livro]) VALUES (1013, CAST(0x04390B00 AS Date), 50, 2, 3, 2007)
SET IDENTITY_INSERT [dbo].[venda] OFF
