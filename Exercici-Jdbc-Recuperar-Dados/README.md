# Exercicio - Fixação JDBC 

O que é JDBC? É uma API padrão do Java para acesso a dados.

Pacotes: java.sql e javax.sql;

Nesse exercício tive meu primeiro contato com JDBC, pude entender sobre as funções Statement e ResultSet;

API:

•  Statement
•  ResultSet

	o first() [move para posição 1, se houver]
	o beforeFirst() [move para posição 0]
	o next() [move para o próximo, retorna false se já estiver no último]
	o absolute(int) [move para a posição dada, lembrando que dados reais começam em 1]

Checklist:

• Usar o script SQL para criar a base de dados "coursejdbc"
• Fazer um pequeno programa para recuperar os departamentos
• Na classe DB, criar métodos auxiliares estáticos para fechar ResultSet e Statement