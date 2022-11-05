# Exercicio - Fixação JDBC -> Deletar Dados

O que é JDBC? É uma API padrão do Java para acesso a dados.

Pacotes: java.sql e javax.sql;

Nesse exercício utilizando prepareStatemente e executeUpdate pude realizar a deletar os dados;

Código:

		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");
			
			st.setInt(1, 2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
			
			int rowsAffected = st.executeUpdate();

Checklist:

	• Criar DbIntegrityException
	• Tratar a exceção de integridade referencial
