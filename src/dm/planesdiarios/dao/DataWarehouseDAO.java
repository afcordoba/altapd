package dm.planesdiarios.dao;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.*;


public class DataWarehouseDAO {
	private java.sql.Connection con = null;
	private static DataWarehouseDAO connect;
	static Logger log = Logger.getLogger(DataWarehouseDAO.class);
	//LOGIN LEVELS DEBUG < INFO < WARNING < ERROR < FATAL
	public static DataWarehouseDAO getInstance() {
		if (connect == null) {
			connect = new DataWarehouseDAO();
		}
		return connect;
	}

	public static void main(String[] args) {
		log.debug("INIT APPLICATION");
		DataWarehouseDAO con = DataWarehouseDAO.getInstance();
	}

	public java.sql.Connection getConnection() {
		try {
			if (con == null) {
//Data Source=tcp:donmario.database.windows.net,1433;Initial Catalog=PRODUCCION;User ID=admin_donmario@donmario;Password=123@QserTZX

				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = java.sql.DriverManager.getConnection("jdbc:sqlserver://donmario.database.windows.net:1433;database=PRODUCCION;user=admin_donmario@donmario;password=123@QserTZX;encrypt=true;trustServerCertificate=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error de seguimiento en getConnection() : " + e.getMessage());
		}
		return con;
	}

	/*
	 * Mostrar las propiedades del controlador y los detalles de la base de datos
	 */

	

	private void closeConnection() {
		try {
			if (con != null)
				con.close();
			con = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario getLogin(String clave) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = null;
		int lote = 0;
		con = this.getConnection();
		String queryUser = "select top 1 * from dbo.T_MOB_USUARIOS where clave = '" + clave.trim() + "'";
		con = this.getConnection();
		if (con != null) {
			ps = null;
			rs = null;
			try {
				ps = con.prepareStatement(queryUser);
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
			e.printStackTrace();
		}
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;
	}

	public List<PlantaPorEncargado> getPlantasUsuario(int id_encargado, String campaña) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = null;
		List<PlantaPorEncargado> plantas = new ArrayList<PlantaPorEncargado>();
		int lote = 0;
		con = this.getConnection();
		String query = "SELECT id_encargado, campaña, cod_planta, desc_planta " + "FROM PRODUCCION.dbo.T_MOB_PLANTAS_X_ENCARG where id_encargado ='"+id_encargado+"' " + "and campaña = '"
				+ campaña.trim() + "'";
		con = this.getConnection();
		if (con != null) {
			ps = null;
			rs = null;
			try {
				ps = con.prepareStatement(query);
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
		return plantas;
	}
	
	public List<RegistroLluvia> getRegistroLluviaEncargado(int id_encargado, String fecha) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = null;
		List<RegistroLluvia> registros = new ArrayList<RegistroLluvia>();
		int lote = 0;
		con = this.getConnection();
		String query = "select * from T_MOB_REGISTRO_LLUVIAS where id_encargado = "+ id_encargado + " and Fecha= '" + fecha.trim() + "'";
		con = this.getConnection();
		if (con != null) {
			ps = null;
			rs = null;
			try {
				ps = con.prepareStatement(query);
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
	
	
	
	public int saveRegistroLluvia(String idEncargado, String provincia, String ciudad, BigDecimal mm, String fecha,int exitoso) {
		
		con = this.getConnection();
		try {
			con.setAutoCommit(false);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		String sql = "INSERT INTO [PRODUCCION].[dbo].[T_MOB_REGISTRO_LLUVIAS]([ID_ENCARGADO],[FECHA],[MILIMITROS],[LOTE],[CAMPO],[LOCALIDAD],[ZONA],[GEO_LATITUD],[GEO_LONGITUD])";
		       sql = sql + " VALUES('" + idEncargado + "','" + fecha + "'," + mm + ",null,null,'" + ciudad + "','" + provincia + "',null,null)";

			
		if (con != null) {
			Statement ps = null;
			try {
				ps = con.createStatement();
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
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {

			}
			e.printStackTrace();
			return 0;
		} finally {
			try {
				con.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}
public int updateRegistroLluvia(String idEncargado, String ciudad, BigDecimal mm, String fecha,int exitoso) {
		
		con = this.getConnection();
		try {
			con.setAutoCommit(false);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		String sql = "UPDATE [PRODUCCION].[dbo].[T_MOB_REGISTRO_LLUVIAS]" + " SET [MILIMITROS] = "+ mm + " WHERE [ID_ENCARGADO] = '"+ idEncargado + "' AND LOCALIDAD = '" + ciudad + "' AND [FECHA] = '" + fecha +"'";
		if (con != null) {
			Statement ps = null;
			try {
				ps = con.createStatement();
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
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {

			}
			e.printStackTrace();
			return 0;
		} finally {
			try {
				con.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}

	
}
