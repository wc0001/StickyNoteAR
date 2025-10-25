import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StickyNoteDatabase {

    public static void main(String[] args) {
        try {
            // load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // establish connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "password");
            if (con != null) {
                // SQL query to retrieve data from the 'book' table
                String selectQuery = "SELECT * FROM book";
                Statement statement = con.createStatement();

                // execute the query and get the result set
                ResultSet resultSet = statement.executeQuery(selectQuery);
                System.out.println("The Available Data\n");

                // iterate through the result set and print the data
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String author_name = resultSet.getString("author");
                    String book_name = resultSet.getString("name");
                    String book_price = resultSet.getString("price");

                    // print the retrieved data
                    System.out.println("ID: " + id + ", Author_Name: " + author_name + ", Book_Name: " + book_name
                            + ", Book_Price " + book_price);
                }
            } else {
                System.out.println("Not Connected...");
            }
        } catch (Exception e) {
            // handle any exceptions that occur
            System.out.println("Exception is " + e.getMessage());
        }
    }
}
