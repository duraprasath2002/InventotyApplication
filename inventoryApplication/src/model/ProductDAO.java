package model;

	import java.sql.Connection;

	import java.sql.PreparedStatement;

	import java.sql.SQLException;



	import connectionManager.ConnectionManager;

	import connectionManager.Product;



	public class ProductDAO {

		public static void addProduct(Product product) throws SQLException, ClassNotFoundException {

			int id=product.getPRODUCTID();

			String name=product.getPRODUCTNAME();

			int minsell=product.getMINSELL();

			int price=product.getPRICE();

			int quantity=product.getQUANTITY();

			

			ConnectionManager conn=new ConnectionManager();

			Connection con=conn.establishConnection();

			String query="insert into  "+ "PRODUCT(PRODUCTID,PRODUCTNAME,MINSELL,PRICE,QUANTITY)"+"values(?,?,?,?,?)";

			PreparedStatement ps=con.prepareStatement(query);

			ps.setInt(1,id);

			ps.setString(2, name);

			ps.setInt(3,minsell);

			ps.setInt(4,price);

			ps.setInt(5,quantity);

			ps.executeUpdate();

			conn.closeConnection();

			



		}



	}


