package ClasseConexao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class produto {
	private int IDProduto;
	private int TipoAcervo;
	private String NomeLivro;
	private String AutoresLivro;
	private Date AnoEdicao;
	private int Setor;
	private int Fileira;
	private int Prateleira;
	private String TipoProduto;
	private String Editora;
	private String DescricaoProd;
	private byte[] ImagemProd;
	
	public int getIDProduto() {
		return IDProduto;
	}
	
	public void setIDProduto(int iDProduto) {
		IDProduto = iDProduto;
	}
	
	public int getTipoAcervo() {
		return TipoAcervo;
	}
	
	public void setTipoAcervo(int tipoAcervo) {
		TipoAcervo = tipoAcervo;
	}
	
	public String getNomeLivro() {
		return NomeLivro;
	}
	
	public void setNomeLivro(String nomeLivro) {
		NomeLivro = nomeLivro;
	}
	
	public String getAutoresLivro() {
		return AutoresLivro;
	}
	
	public void setAutoresLivro(String autoresLivro) {
		AutoresLivro = autoresLivro;
	}
	
	public int getSetor() {
		return Setor;
	}
	
	public void setSetor(int setor) {
		Setor = setor;
	}
	
	public int getFileira() {
		return Fileira;
	}
	
	public void setFileira(int fileira) {
		Fileira = fileira;
	}
	
	public String getTipoProduto() {
		return TipoProduto;
	}
	
	public void setTipoProduto(String tipoProduto) {
		TipoProduto = tipoProduto;
	}
	
	public int getPrateleira() {
		return Prateleira;
	}
	
	public void setPrateleira(int prateleira) {
		Prateleira = prateleira;
	}
	
	public String getDescricaoProd() {
		return DescricaoProd;
	}
	
	public void setDescricaoProd(String descricaoProd) {
		DescricaoProd = descricaoProd;
	}
	
	public String getEditora() {
		return Editora;
	}
	
	public void setEditora(String editora) {
		Editora = editora;
	}
	
	public byte[] getImagemProd() {
		return ImagemProd;
	}
	
	public void setImagemProd(byte[] imagemProd) {
		ImagemProd = imagemProd;
	}
	
	public Date getAnoEdicao() {
		return AnoEdicao;
	}
	
	public void setAnoEdicao(Date anoEdicao) {
		AnoEdicao = anoEdicao;
	}
	
	public static produto getProduto(int id) throws Exception {
		ClasseConexao con = new ClasseConexao(); //instanciando
		boolean su = con.conectar(); //conecta no banco
		if (su == false) {
			throw new Exception("Falha na conex�o"); //se a conecao der errado
		}
		PreparedStatement pstmt = con.getConn().prepareStatement("select * from tblProduto where IDProduto = ?"); //mensagem que eu vou mandar pro sql
		pstmt.setInt(1, id); //o primeiro "?"
		ResultSet rs = pstmt.executeQuery(); //o resultado do banco
		if (rs.next()) { // se tiver um pra continuar, ou seja, se existir o produto
			produto ow = new produto(); //instanciando
			ow.setIDProduto(rs.getInt("IDProduto")); //fica com o valor dessa tabela
			ow.setTipoAcervo(rs.getInt("TipoAcervo")); //fica com o valor dessa tabela
			ow.setNomeLivro(rs.getString("NomeLivro")); //fica com o valor dessa tabela
			ow.setAutoresLivro(rs.getString("AutoresLivro")); //fica com o valor dessa tabela
			ow.setAnoEdicao(rs.getDate("AnoEdicao")); //fica com o valor dessa tabela
			ow.setSetor(rs.getInt("Setor")); //fica com o valor dessa tabela
			ow.setFileira(rs.getInt("Fileira")); //fica com o valor dessa tabela
			ow.setPrateleira(rs.getInt("Prateleira")); //fica com o valor dessa tabela
			ow.setTipoProduto(rs.getString("TipoProduto")); //fica com o valor dessa tabela
			ow.setEditora(rs.getString("Editora")); //fica com o valor dessa tabela
			ow.setDescricaoProd(rs.getString("DescricaoProd")); //fica com o valor dessa tabela
			ow.setImagemProd(rs.getBytes("ImagemProd")); //fica com o valor dessa tabela
			return ow; //retorna o valor de ow
		}
		return null; 
	}
	
	public static produto[] getPesquisa(String nome) throws Exception {
		ClasseConexao con = new ClasseConexao(); //instanciando
		boolean su = con.conectar(); //conecta no banco
		if (su == false) {
			throw new Exception("Falha na conex�o"); //se a coneccao der errado
		}
		PreparedStatement pstmt = con.getConn().prepareStatement("select * from tblProduto where lower(NomeLivro) like ? or lower(AutoresLivro) like ? or Editora like ? order by NomeLivro"); //mensagem que eu vou mandar pro sql
		pstmt.setString(1, "%" + nome.toLowerCase() + "%"); //o primeiro "?"
		pstmt.setString(2, "%" + nome.toLowerCase() + "%");
		pstmt.setString(3, "%" + nome.toLowerCase() + "%");
		ResultSet rs = pstmt.executeQuery(); //o resultado do banco
		ArrayList<produto> lista = new ArrayList<produto>();
		while (rs.next()) { // se tiver um pra continuar, ou seja, se existir o produto
			produto ow = new produto(); //instanciando
			ow.setIDProduto(rs.getInt("IDProduto")); //fica com o valor dessa tabela
			ow.setTipoAcervo(rs.getInt("TipoAcervo")); //fica com o valor dessa tabela
			ow.setNomeLivro(rs.getString("NomeLivro")); //fica com o valor dessa tabela
			ow.setAutoresLivro(rs.getString("AutoresLivro")); //fica com o valor dessa tabela
			ow.setAnoEdicao(rs.getDate("AnoEdicao")); //fica com o valor dessa tabela
			ow.setSetor(rs.getInt("Setor")); //fica com o valor dessa tabela
			ow.setFileira(rs.getInt("Fileira")); //fica com o valor dessa tabela
			ow.setPrateleira(rs.getInt("Prateleira")); //fica com o valor dessa tabela
			ow.setTipoProduto(rs.getString("TipoProduto")); //fica com o valor dessa tabela
			ow.setEditora(rs.getString("Editora")); //fica com o valor dessa tabela
			ow.setDescricaoProd(rs.getString("DescricaoProd")); //fica com o valor dessa tabela
			ow.setImagemProd(rs.getBytes("ImagemProd")); //fica com o valor dessa tabela
			lista.add(ow); //adiciona o valor de ow em uma lista
		}
		return lista.toArray(new produto[lista.size()]);
	}
	
	public static String[] getGenero(int g) throws Exception {
		ClasseConexao con = new ClasseConexao(); //instanciando
		boolean su = con.conectar(); //conecta no banco
		if (su == false) {
			throw new Exception("Falha na conex�o"); //se a coneccao der errado
		}
		PreparedStatement pstmt = con.getConn().prepareStatement("select NomeGenero from tblGenero where IDGenero in (select IDGenero from tblGeneroProduto where IDProduto = ?)"); //mensagem que eu vou mandar pro sql
		pstmt.setInt(1, g); //o primeiro "?"
		ResultSet rs = pstmt.executeQuery(); //o resultado do banco
		ArrayList<String> generos = new ArrayList<String>();
		while (rs.next()) {
			generos.add(rs.getString("NomeGenero"));
		}
		return generos.toArray(new String[generos.size()]);
	}
	
	public static produto[] getGeneros(String genero) throws Exception {
		ClasseConexao con = new ClasseConexao(); //instanciando
		boolean su = con.conectar(); //conecta no banco
		if (su == false) {
			throw new Exception("Falha na conex�o"); //se a coneccao der errado
		}
		PreparedStatement pstmt = con.getConn().prepareStatement("select top 7 * from tblProduto where IDProduto in (select IDProduto from tblGeneroProduto where IDGenero in (select IDGenero from tblGenero where NomeGenero = ?))"); //mensagem que eu vou mandar pro sql
		pstmt.setString(1, genero); //o primeiro "?"
		ResultSet rs = pstmt.executeQuery(); //o resultado do banco
		ArrayList<produto> listaGeneros = new ArrayList<produto>();
		while (rs.next()) { //se tiver um pra continuar, ou seja, se existir o produto
			produto ow = new produto(); //instanciando
			ow.setIDProduto(rs.getInt("IDProduto")); //fica com o valor dessa tabela
			ow.setTipoAcervo(rs.getInt("TipoAcervo")); //fica com o valor dessa tabela
			ow.setNomeLivro(rs.getString("NomeLivro")); //fica com o valor dessa tabela
			ow.setAutoresLivro(rs.getString("AutoresLivro")); //fica com o valor dessa tabela
			ow.setAnoEdicao(rs.getDate("AnoEdicao")); //fica com o valor dessa tabela
			ow.setSetor(rs.getInt("Setor")); //fica com o valor dessa tabela
			ow.setFileira(rs.getInt("Fileira")); //fica com o valor dessa tabela
			ow.setPrateleira(rs.getInt("Prateleira")); //fica com o valor dessa tabela
			ow.setTipoProduto(rs.getString("TipoProduto")); //fica com o valor dessa tabela
			ow.setEditora(rs.getString("Editora")); //fica com o valor dessa tabela
			ow.setDescricaoProd(rs.getString("DescricaoProd")); //fica com o valor dessa tabela
			ow.setImagemProd(rs.getBytes("ImagemProd")); //fica com o valor dessa tabela
			listaGeneros.add(ow); //adiciona o valor de ow em uma lista
		}
		return listaGeneros.toArray(new produto[listaGeneros.size()]);
	}
	
	public static produto[] getAdicionadosRecentemente() throws Exception {
		ClasseConexao con = new ClasseConexao(); //instanciando
		boolean su = con.conectar(); //conecta no banco
		if (su == false) {
			throw new Exception("Falha na conex�o"); //se a coneccao der errado
		}
		PreparedStatement pstmt = con.getConn().prepareStatement("select top 7 * from tblProduto order by IDProduto desc"); //mensagem que eu vou mandar pro sql
		ResultSet rs = pstmt.executeQuery(); //o resultado do banco
		ArrayList<produto> listaAdicionados = new ArrayList<produto>();
		while (rs.next()) { //se tiver um pra continuar, ou seja, se existir o produto
			produto ow = new produto(); //instanciando
			ow.setIDProduto(rs.getInt("IDProduto")); //fica com o valor dessa tabela
			ow.setTipoAcervo(rs.getInt("TipoAcervo")); //fica com o valor dessa tabela
			ow.setNomeLivro(rs.getString("NomeLivro")); //fica com o valor dessa tabela
			ow.setAutoresLivro(rs.getString("AutoresLivro")); //fica com o valor dessa tabela
			ow.setAnoEdicao(rs.getDate("AnoEdicao")); //fica com o valor dessa tabela
			ow.setSetor(rs.getInt("Setor")); //fica com o valor dessa tabela
			ow.setFileira(rs.getInt("Fileira")); //fica com o valor dessa tabela
			ow.setPrateleira(rs.getInt("Prateleira")); //fica com o valor dessa tabela
			ow.setTipoProduto(rs.getString("TipoProduto")); //fica com o valor dessa tabela
			ow.setEditora(rs.getString("Editora")); //fica com o valor dessa tabela
			ow.setDescricaoProd(rs.getString("DescricaoProd")); //fica com o valor dessa tabela
			ow.setImagemProd(rs.getBytes("ImagemProd")); //fica com o valor dessa tabela
			listaAdicionados.add(ow); //adiciona o valor de ow em uma lista
		}
		return listaAdicionados.toArray(new produto[listaAdicionados.size()]);
	}

}
