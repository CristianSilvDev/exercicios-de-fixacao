# Exercicio - Fixação JDBC -> Atualização de Dados

O que é JDBC? É uma API padrão do Java para acesso a dados.

Pacotes: java.sql e javax.sql;

Nesse exercício utilizando prepareStatemente e executeUpdate pude realizar a atualização dos dados;

Código:

	Connection conn = null;
	PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");
					
			
			st.setDouble(1, 200.00);
			st.setInt(2, 2);
			
			int rowsAffected = st.executeUpdate();

Checklist:

	• Atualização simples com preparedStatement
