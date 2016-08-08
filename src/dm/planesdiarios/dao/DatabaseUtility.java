package dm.planesdiarios.dao;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class DatabaseUtility {
	private DataSource dataSource = null;
	private BasicDataSource basicDataSource= null;
	private Connection connection = null;
	
	static Logger log = Logger.getLogger(DatabaseUtility.class);
	
	public static void main (String[]args){
		DatabaseUtility db = new DatabaseUtility();
		PropertyConfigurator.configure("log4j.properties");
		//System.out.println("Connection established");
		db.closeConnection();
		log.info("Connection returned");
		//System.out.println("Connection returned");
	}
	public DatabaseUtility() {
		try {
		BasicConfigurator.configure();
		basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//jdbc:sqlserver://donmario.database.windows.net:1433;database=PRODUCCION;user=admin_donmario@donmario;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;
	//	basicDataSource.setUrl("jdbc:sqlserver://192.168.100.111:1433;database=PRODUCCION;");;user=admin_donmario@donmario;password=123@QserTZX;
		basicDataSource.setUrl("jdbc:sqlserver://donmario.database.windows.net:1433;database=PRODUCCION;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
		basicDataSource.setUsername("admin_donmario@donmario");
		basicDataSource.setPassword("123@QserTZX");
		basicDataSource.setMaxActive(50);
		basicDataSource.setMaxIdle(50);
		basicDataSource.setRemoveAbandoned(true);//Remove connection who wasn´t closed correctly
		basicDataSource.setRemoveAbandonedTimeout(5000);// Time to close the connection iddle
		basicDataSource.setMaxWait(6000);
		dataSource = basicDataSource;
		connection = dataSource.getConnection();
		log.info("Connection established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			StringWriter stack = new StringWriter();
			e.printStackTrace(new PrintWriter(stack));
			log.info("Caught exception:" + stack.toString());
			
			//log.info(e.getMessage());
			
			
		}
		
	}
	public void closeConnection(){
		if(connection != null){
			try{
				connection.close();
				connection = null;
				log.info("connection returned");
				System.out.println("connection returned");
			}catch(Exception e){
				log.info("Error when try to close connection");
				System.out.println("Error when try to close connection");
			}
			
		}
	}


	public Usuario getLogin(String clave) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = null;
		log.info("INIT FUNCTION LOGIN");
		int lote = 0;
		
		connection = dataSource.getConnection();
		String queryUser = "select top 1 * from dbo.T_MOB_USUARIOS where clave = '" + clave.trim() + "'";
		if (connection != null) {
			ps = null;
			rs = null;
			try {
				ps = connection.prepareStatement(queryUser);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				rs = ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				while (rs.next()) {
					usuario = new Usuario();
					usuario.setNombre(rs.getString("nombre"));
					usuario.setCampaña(rs.getString("campaña"));
					usuario.setId_encargado(rs.getInt("id_encargado"));
					usuario.setSector(rs.getString("sector"));
					usuario.setSociedad(rs.getString("sociedad"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.info("CONNECTION ERROR IN LOGIN FUNCTION");
			e.printStackTrace();
		}
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("User logged:" + usuario.getNombre() +"Campania:"+ usuario.getCampaña());
		return usuario;
	}

	public List<PlantaPorEncargado> getPlantasUsuario(int id_encargado, String campaña) throws  SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = null;
		log.info("INIT FUNCTION GetPlantasPorUsuario");
		List<PlantaPorEncargado> plantas = new ArrayList<PlantaPorEncargado>();
		int lote = 0;
		
		connection = dataSource.getConnection();

		String query = "SELECT id_encargado, campaña, cod_planta, desc_planta "
				+ "FROM PRODUCCION.dbo.T_MOB_PLANTAS_X_ENCARG where id_encargado ='" + id_encargado + "' "
				+ "and campaña = '" + campaña.trim() + "'";
		
		if (connection != null) {
			ps = null;
			rs = null;
			try {
				ps = connection.prepareStatement(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				rs = ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				while (rs.next()) {
					PlantaPorEncargado planta = new PlantaPorEncargado();
					planta.setId_encargado(id_encargado);
					planta.setCampania(rs.getString("campaña"));
					planta.setCod_planta(rs.getString("cod_planta"));
					planta.setDesc_planta(rs.getString("desc_planta"));
					plantas.add(planta);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("User with data in Plantas por Encargado Cantidad de plantas:" + plantas.size());

		return plantas;
	}

	public List<RegistroLluvia> getRegistroLluviaEncargado(int id_encargado, String fecha) throws  SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = null;
		List<RegistroLluvia> registros = new ArrayList<RegistroLluvia>();
		int lote = 0;
		
		connection = dataSource.getConnection();
		String query = "select * from T_MOB_REGISTRO_LLUVIAS where id_encargado = " + id_encargado + " and Fecha= '"
				+ fecha.trim() + "'";
		
		if (connection != null) {
			ps = null;
			rs = null;
			try {
				ps = connection.prepareStatement(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				rs = ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				while (rs.next()) {
					RegistroLluvia reg = new RegistroLluvia();
					reg.setId_encargado(rs.getInt("ID_ENCARGADO"));
					reg.setMilimetros(rs.getBigDecimal("MILIMITROS"));
					reg.setLocalidad(rs.getString("LOCALIDAD"));
					registros.add(reg);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return registros;
	}

	public int saveRegistroLluvia(String idEncargado, String provincia, String ciudad, BigDecimal mm, String fecha,
			int exitoso) throws  SQLException {

	
		connection = dataSource.getConnection();
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}

		String sql = "INSERT INTO [PRODUCCION].[dbo].[T_MOB_REGISTRO_LLUVIAS]([ID_ENCARGADO],[FECHA],[MILIMITROS],[LOTE],[CAMPO],[LOCALIDAD],[ZONA],[GEO_LATITUD],[GEO_LONGITUD])";
		sql = sql + " VALUES('" + idEncargado + "','" + fecha + "'," + mm + ",null,null,'" + ciudad + "','" + provincia
				+ "',null,null)";

		if (connection != null) {
			Statement ps = null;
			try {
				ps = connection.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}

			try {
				ps.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
		}

		try {
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {

			}
			e.printStackTrace();
			return 0;
		} finally {
			try {
				connection.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}

	public int updateRegistroLluvia(String idEncargado, String ciudad, BigDecimal mm, String fecha, int exitoso) throws SQLException {

		
		connection = dataSource.getConnection();
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		String sql = "UPDATE [PRODUCCION].[dbo].[T_MOB_REGISTRO_LLUVIAS]" + " SET [MILIMITROS] = " + mm
				+ " WHERE [ID_ENCARGADO] = '" + idEncargado + "' AND LOCALIDAD = '" + ciudad + "' AND [FECHA] = '"
				+ fecha + "'";
		if (connection != null) {
			Statement ps = null;
			try {
				ps = connection.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
			try {
				ps.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
		}
		try {
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {

			}
			e.printStackTrace();
			return 0;
		} finally {
			try {
				connection.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}

	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public BasicDataSource getBasicDataSource() {
		return basicDataSource;
	}
	public void setBasicDataSource(BasicDataSource basicDataSource) {
		this.basicDataSource = basicDataSource;
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
