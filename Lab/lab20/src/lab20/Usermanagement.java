package lab20;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class Usermanagement {
	static int choice;
	

	public void createUser() {
           
		
	}

	public void updatePassword() {

	}

	public void deleteUser() {

	}

	public void retrieveUser() {

	}

	public void allUser() {

	}

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_management", "root", "admin");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter your choice: ");
			System.out.println("1.Create a User");
			System.out.println("2.Update password");
			System.out.println("3.Delete a User");
			System.out.println("4.Retrieve a User");
			System.out.println("5.List of all User");
			System.out.println("6.Exit");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter username: ");
				String uname=sc.next();
				System.out.println("Enter password: ");
				String password=sc.next();
				PreparedStatement ps=con.prepareStatement("insert into users values (?,?)");
				ps.setString(1, uname);
				ps.setString(2, password);
				try {
					
					int rows = ps.executeUpdate();
					if(rows>0)
					{
						System.out.println("User Created Successfully......");
					}
				}catch(Exception SQLIntegrityConstraintViolationException)
				{
					System.out.println("user already exist.Create a unique user name.");
				}
				break;
			case 2:
				System.out.println("Enter username whose password is to be updated: ");
				String uname1=sc.next();
				System.out.println("Enter new password: ");
				String password1=sc.next();
				PreparedStatement ps1=con.prepareStatement("update users set password=? where uname=?");
				ps1.setString(2, uname1);
				ps1.setString(1, password1);

				int rows1 = ps1.executeUpdate();
				if(rows1>0)
				{
					System.out.println("User Updated Successfully......");
				}
				break;
			case 3:
				System.out.println("Enter username: ");
				String uname11=sc.next();
				PreparedStatement ps11=con.prepareStatement("delete from users where uname=?");
				ps11.setString(1, uname11);
				int rows11 = ps11.executeUpdate();
				if(rows11>0)
				{
					System.out.println("User Deleted Successfully......");
				}
				break;
			case 4:
				System.out.println("Enter username: ");
				String uname111=sc.next();
				PreparedStatement ps111=con.prepareStatement("select * from users where uname=?");
				ps111.setString(1, uname111);
				ResultSet rs1 = ps111.executeQuery();
				if(rs1.next())
				{
					System.out.println("uname: "+rs1.getString(1)+"\npassword: "+rs1.getString(2));
					}
				
				break;
			case 5:
				Statement st=con.createStatement();
				ResultSet rs = st.executeQuery("select * from users");
				if(rs.next())
				{
					System.out.println("uname"+"\t"+"password");
					while(rs.next())
					{
						
						System.out.println(rs.getString(1)+"\t"+rs.getString(2));
					}
				}
				
				
				break;
			case 6:
				System.out.println("Exiting..............");
				break;
			default:
				System.out.println("Invalid choice. Try again.........");

			}
		} while (choice != 6);

	}

}
