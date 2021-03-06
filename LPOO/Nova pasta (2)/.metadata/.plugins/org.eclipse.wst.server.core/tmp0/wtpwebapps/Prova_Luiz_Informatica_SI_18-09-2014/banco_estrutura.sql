USE [master]
GO
/****** Object:  Database [si_tarde]    Script Date: 18/09/2014 17:00:04 ******/
CREATE DATABASE [si_tarde]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'si_tarde', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\si_tarde.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'si_tarde_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\si_tarde_log.ldf' , SIZE = 2048KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [si_tarde] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [si_tarde].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [si_tarde] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [si_tarde] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [si_tarde] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [si_tarde] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [si_tarde] SET ARITHABORT OFF 
GO
ALTER DATABASE [si_tarde] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [si_tarde] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [si_tarde] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [si_tarde] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [si_tarde] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [si_tarde] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [si_tarde] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [si_tarde] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [si_tarde] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [si_tarde] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [si_tarde] SET  DISABLE_BROKER 
GO
ALTER DATABASE [si_tarde] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [si_tarde] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [si_tarde] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [si_tarde] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [si_tarde] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [si_tarde] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [si_tarde] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [si_tarde] SET RECOVERY FULL 
GO
ALTER DATABASE [si_tarde] SET  MULTI_USER 
GO
ALTER DATABASE [si_tarde] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [si_tarde] SET DB_CHAINING OFF 
GO
ALTER DATABASE [si_tarde] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [si_tarde] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [si_tarde]
GO
/****** Object:  Table [dbo].[bancario]    Script Date: 18/09/2014 17:00:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[bancario](
	[numero] [int] IDENTITY(1,1) NOT NULL,
	[cliente] [int] NOT NULL,
	[operacao] [char](7) NOT NULL,
	[valor] [float] NOT NULL,
 CONSTRAINT [PK_bancario] PRIMARY KEY CLUSTERED 
(
	[numero] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[enquete]    Script Date: 18/09/2014 17:00:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[enquete](
	[canditado1] [varchar](50) NOT NULL,
	[canditado2] [varchar](50) NOT NULL,
	[canditado3] [varchar](50) NOT NULL,
	[canditado4] [varchar](50) NOT NULL,
	[voto1] [int] NOT NULL,
	[voto2] [int] NOT NULL,
	[voto3] [int] NOT NULL,
	[voto4] [int] NOT NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[operador]    Script Date: 18/09/2014 17:00:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[operador](
	[num01] [int] NOT NULL,
	[num02] [int] NOT NULL,
	[operador] [char](5) NOT NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
USE [master]
GO
ALTER DATABASE [si_tarde] SET  READ_WRITE 
GO
