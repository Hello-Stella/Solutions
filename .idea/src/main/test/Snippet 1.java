public class LastName {
    public static void lastname(Statement stmt) throws SQLException { Label label = new Label();
        ResultSet rs;
        rs = stmt.executeQuery("SELECT * FROM Customers WHERE UserName = Mickey"); String lastNames = "";
        while (rs.next()) {
            lastNames += rs.getString("Lname") + ", ";
            label.setText("Mickey last names are: " + lastNames + " ");
        }
