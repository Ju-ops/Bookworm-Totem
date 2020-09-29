package ClasseConexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClasseConexao {
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String caminho = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;"+"DatabaseName=TCCGF";
    private String usuario = "sa";
    private String senha = "12345";
    private Connection conn;
    
    public boolean conectar() {
        try {
            Class.forName(this.driver);
            this.setConn(DriverManager.getConnection(caminho, usuario, senha));
            return true;
        }
        catch (Exception erro) {
            erro.printStackTrace();
        	return false;
        }
    }
    
    public void desconectar() {
        try {
            this.getConn().close();
        }
        catch (Exception ex) {
            
        }
    }
    
    public Connection getConn() {
        return conn;
    }
    
    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
