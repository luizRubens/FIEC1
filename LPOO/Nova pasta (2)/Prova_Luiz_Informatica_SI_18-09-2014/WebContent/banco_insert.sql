USE [si_tarde]
GO
SET IDENTITY_INSERT [dbo].[bancario] ON 

INSERT [dbo].[bancario] ([numero], [cliente], [operacao], [valor]) VALUES (1, 1, N'CREDITO', 50)
INSERT [dbo].[bancario] ([numero], [cliente], [operacao], [valor]) VALUES (2, 2, N'CREDITO', 70)
INSERT [dbo].[bancario] ([numero], [cliente], [operacao], [valor]) VALUES (3, 2, N'DEBITO ', 170)
INSERT [dbo].[bancario] ([numero], [cliente], [operacao], [valor]) VALUES (4, 2, N'DEBITO ', 1700)
INSERT [dbo].[bancario] ([numero], [cliente], [operacao], [valor]) VALUES (5, 1, N'DEBITO ', 100)
INSERT [dbo].[bancario] ([numero], [cliente], [operacao], [valor]) VALUES (6, 3, N'DEBITO ', 500)
INSERT [dbo].[bancario] ([numero], [cliente], [operacao], [valor]) VALUES (7, 4, N'credito', 600)
INSERT [dbo].[bancario] ([numero], [cliente], [operacao], [valor]) VALUES (8, 5, N'debito ', 600)
INSERT [dbo].[bancario] ([numero], [cliente], [operacao], [valor]) VALUES (9, 7, N'CREDITO', 28)
SET IDENTITY_INSERT [dbo].[bancario] OFF
INSERT [dbo].[enquete] ([canditado1], [canditado2], [canditado3], [canditado4], [voto1], [voto2], [voto3], [voto4]) VALUES (N'Monica', N'Fernando', N'Daniel', N'Outros', 2, 4, 5, 2)
INSERT [dbo].[operador] ([num01], [num02], [operador]) VALUES (10, 20, N'+    ')
INSERT [dbo].[operador] ([num01], [num02], [operador]) VALUES (30, 10, N'+    ')
INSERT [dbo].[operador] ([num01], [num02], [operador]) VALUES (10, 40, N'+    ')
INSERT [dbo].[operador] ([num01], [num02], [operador]) VALUES (30, 40, N'-    ')
INSERT [dbo].[operador] ([num01], [num02], [operador]) VALUES (3, 10, N'*    ')
INSERT [dbo].[operador] ([num01], [num02], [operador]) VALUES (2, 3, N'+    ')
INSERT [dbo].[operador] ([num01], [num02], [operador]) VALUES (17, 29, N'*    ')
INSERT [dbo].[operador] ([num01], [num02], [operador]) VALUES (30, 40, N'/    ')
INSERT [dbo].[operador] ([num01], [num02], [operador]) VALUES (100, 10000, N'+    ')
