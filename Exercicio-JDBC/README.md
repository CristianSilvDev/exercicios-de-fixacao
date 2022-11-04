# Exercicio - JDBC 

É uma API padrão do Java para acesso a dados.

Pacotes: java.sql e javax.sql;

Nesse exercício tive meu primeiro contato com JDBC, pude compreender sobre Restrição, Projeção, Produto Cartesiano e Junção;

Checklist:
• Usando o MySQL Workbench, crie uma base de dados chamada "coursejdbc"
• Baixar o MySQL Java Connector
• Caso ainda não exista, criar uma User Library contendo o arquivo .jar do driver do MySQL

	o Window -> Preferences -> Java -> Build path -> User Libraries
	o Dê o nome da User Library de MySQLConnector
	o Add external JARs -> (localize o arquivo jar)

• Criar um novo Java Project
	o Acrescentar a User Library MySQLConnector ao projeto

• Na pasta raiz do projeto, criar um arquivo "db.properties" contendo os dados de conexão:

	user=developer
	password=1234567
	dburl=jdbc:mysql://localhost:3306/coursejdbc
	useSSL=false

• No pacote "db", criar uma exceção personalizada DbException
• No pacote "db", criar uma classe DB com métodos estáticos auxiliares
	o Obter e fechar uma conexão com o banco