package myapp.db;

//import myapp.util.SqlConn;


public class UsersDb {

/*
    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        Connection conn = null;
        try {
            conn = new SqlConn().getConn();
            Statement stmt = conn.createStatement();
            String query = String.format("SELECT * FROM users");
            ResultSet queryResult = stmt.executeQuery(query);

            while (queryResult.next()) {
                User currentUser = new User();
                currentUser.setFirstName(queryResult.getString("FirstName"));
                currentUser.setLastName(queryResult.getString("LastName"));
                currentUser.setAge(queryResult.getInt("Age"));
                currentUser.setEmail(queryResult.getString("Email"));
                users.add(currentUser);
            }

            conn.close();

        } catch (SQLException exc) {
            System.out.println("There was a problem  with the query");
            System.out.println(exc.toString());
        } finally {
            try {
                conn.close();
            } catch (SQLException exc) {
                exc.printStackTrace();
            }

        }
        return users;
    }

    public User getUserByEmail(String email) {
        User currentUser = new User();
        Connection conn = null;
        try {
            conn = new SqlConn().getConn();
            String query = "SELECT * FROM users WHERE Email=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            ResultSet queryResult = stmt.executeQuery();

            while (queryResult.next()) {
                currentUser.setId(queryResult.getInt("ID"));
                currentUser.setFirstName(queryResult.getString("FirstName"));
                currentUser.setLastName(queryResult.getString("LastName"));
                currentUser.setAge(queryResult.getInt("Age"));
                currentUser.setEmail(queryResult.getString("Email"));
            }
        } catch
        (SQLException exc) {
            System.out.println("There was a problem  with the query");
            exc.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException exc) {
                exc.printStackTrace();
            }

        }
        return currentUser;
    }

    public String insertNewUser(User newUser) throws SQLException {
        String queryDetails = "";
        Connection conn = null;
        try {
            conn = new SqlConn().getConn();
            String query = " INSERT INTO users (FirstName, LastName, Age, Email) VALUES(?, ?,?, ?);";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newUser.getFirstName());
            stmt.setString(2, newUser.getLastName());
            stmt.setInt(3, newUser.getAge());
            stmt.setString(4, newUser.getEmail());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                queryDetails = "Query inserted succesfully";
            } else {
                queryDetails = "No data affected";
            }

        } finally {
            try {
                conn.close();
            } catch (SQLException exc) {
                exc.printStackTrace();
            }

        }
        return queryDetails;
    }*/


}
