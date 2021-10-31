
import java.sql.*;
import java.util.*;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
 */

//import java.util.*;

public class DMP1A{

    public class box{
        public int amount;
        public String[] arr;
        public int inter1;
        public int inter2;

        public box(){
            amount = 0;
            arr = new String[10];
            inter1 = -1111;
            inter1 = -1111;
        }
    }

    //Insert to table
    public static String insertOwner(String ownerID,String first_nameowner,String last_nameowner) {

        ResultSet rs = null;
        String sql = "INSERT INTO owner(ownerID,first_nameowner,last_nameowner) "
                + "VALUES(?,?,?)";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            // set parameters for statement
            pstmt.setString(1, ownerID);
            pstmt.setString(2, first_nameowner);
            pstmt.setString(3, last_nameowner);

            int rowAffected = pstmt.executeUpdate();
            /*
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    candidateId = rs.getInt(1);

            }
            */
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        if(rs!= null)
            System.out.println("An owner with ownerID: " + ownerID + " was added successfully\n");
        return ownerID;
    }
    public static String insertComplex(String complexID,String complexName,String complexServices, String address, String city, String ownerID){
    //6

        ResultSet rs = null;
        String sql = "INSERT INTO complex(complexID,complexName,complexServices,address,city,ownerID) "
                + "VALUES(?,?,?,?,?,?)";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            // set parameters for statement
            pstmt.setString(1, complexID);
            pstmt.setString(2, complexName );
            pstmt.setString(3, complexServices);
            pstmt.setString(4, address);
            pstmt.setString(5, city);
            pstmt.setString(6, ownerID);

            int rowAffected = pstmt.executeUpdate();
            /*
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    candidateId = rs.getInt(1);

            }
            */
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        if(rs!= null)
            System.out.println("A complex with complexID: " + complexID + " was added successfully\n");
        return complexID;
    }
    public static String insertManager(String managerID,String first_namemanager,String last_namemanager) {
        // for insert a new manager
        ResultSet rs = null;
        String sql = "INSERT INTO manager(managerID,first_namemanager,last_namemanager) "
                + "VALUES(?,?,?)";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            // set parameters for statement
            pstmt.setString(1, managerID);
            pstmt.setString(2, first_namemanager);
            pstmt.setString(3, last_namemanager);

            int rowAffected = pstmt.executeUpdate();
            /*
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    candidateId = rs.getInt(1);

            }
            */
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        if(rs!= null)
            System.out.println("A manager with managerID: " + managerID + " was added successfully\n");
        return managerID;
    }
    public static String insertApartment(String apartmentID, int apartmentNo,int floor, String section, String furnishedState, String complexID, String managerID){
    //7
        ResultSet rs = null;
        String sql = "INSERT INTO apartment(apartmentID,apartmentNo,floor,section,furnished,complexID,managerID) "
                + "VALUES(?,?,?,?,?,?,?)";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            // set parameters for statement
            pstmt.setString(1, apartmentID);
            pstmt.setInt(2, apartmentNo);
            pstmt.setInt(3, floor);
            pstmt.setString(4, section);
            pstmt.setString(5, furnishedState);
            pstmt.setString(6, complexID);
            pstmt.setString(7, managerID);

            int rowAffected = pstmt.executeUpdate();
            /*
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    candidateId = rs.getInt(1);

            }
            */
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        if(rs!= null)
            System.out.println("An apartment with apartmentID: " + apartmentID + " was added successfully\n");
        return apartmentID;
    }
    public static String insertApartment(String apartmentID, String apartmentNo,String floor, String section, String furnishedState, String complexID, String managerID){
        //7
        ResultSet rs = null;
        String sql = "INSERT INTO apartment(apartmentID,apartmentNo,floor,section,furnished,complexID,managerID) "
                + "VALUES(?,?,?,?,?,?,?)";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            // set parameters for statement
            pstmt.setString(1, apartmentID);
            pstmt.setString(2, apartmentNo);
            pstmt.setString(3, floor);
            pstmt.setString(4, section);
            pstmt.setString(5, furnishedState);
            pstmt.setString(6, complexID);
            pstmt.setString(7, managerID);

            int rowAffected = pstmt.executeUpdate();
            /*
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    candidateId = rs.getInt(1);

            }
            */
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        if(rs!= null)
            System.out.println("An apartment with apartmentID: " + apartmentID + " was added successfully\n");
        return apartmentID;
    }
    public static String insertTenant(String tenantID,String first_nametenant,String last_nametenant, String leaseNo){
    //4
        ResultSet rs = null;
        String sql = "INSERT INTO tenant(tenantID,first_nametenant,last_nametenant,leaseNo) "
                + "VALUES(?,?,?,?)";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            // set parameters for statement
            pstmt.setString(1, tenantID);
            pstmt.setString(2, first_nametenant);
            pstmt.setString(3, last_nametenant);
            pstmt.setString(4,leaseNo);

            int rowAffected = pstmt.executeUpdate();
            /*
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    candidateId = rs.getInt(1);

            }
            */
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        if(rs!= null)
            System.out.println("A tenant with tenantID: " + tenantID + " was added successfully\n");
        return tenantID;
    }
    public static String insertLease(String leaseNo, String contractDetails,String start_date, String end_date, int rent, String apartmentID){
    //6
        ResultSet rs = null;
        String sql = "INSERT INTO lease(leaseNo,contractDetails,start_date,end_date,rentMonthly,apartmentID) "
                + "VALUES(?,?,?,?,?,?)";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            // set parameters for statement
            pstmt.setString(1, leaseNo);
            pstmt.setString(2, contractDetails);
            pstmt.setString(3, start_date);
            pstmt.setString(4, end_date);
            pstmt.setInt(5, rent);
            pstmt.setString(6, apartmentID);

            int rowAffected = pstmt.executeUpdate();
            /*
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    candidateId = rs.getInt(1);

            }
            */
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        if(rs!= null)
            System.out.println("A lease with leaseNo: " + leaseNo + " was added successfully\n");
        return leaseNo;
    }
    public static String insertLease(String leaseNo, String contractDetails,String start_date, String end_date, String rent, String apartmentID){
        //6
        ResultSet rs = null;
        String sql = "INSERT INTO lease(leaseNo,contractDetails,start_date,end_date,rentMonthly,apartmentID) "
                + "VALUES(?,?,?,?,?,?)";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            // set parameters for statement
            pstmt.setString(1, leaseNo);
            pstmt.setString(2, contractDetails);
            pstmt.setString(3, start_date);
            pstmt.setString(4, end_date);
            pstmt.setString(5, rent);
            pstmt.setString(6, apartmentID);

            int rowAffected = pstmt.executeUpdate();
            /*
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    candidateId = rs.getInt(1);

            }
            */
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        if(rs!= null)
            System.out.println("A lease with leaseNo: " + leaseNo + " was added successfully\n");
        return leaseNo;
    }


    //Delete from table
    public void deleteManager(String managerID){
        String sqlDelete = "DELETE FROM manager "
                + "WHERE managerID = ?";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlDelete)) {

            // prepare data for update
            pstmt.setString(1, managerID);
            pstmt.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Successfully deleted the manager with managerID: " + managerID + "\n");

    }
    public void delete(String table, String IDtype, String ID){
        boolean print = true;
        String sqlDelete = "DELETE FROM " + table + " "
                + "WHERE " + IDtype + " = ?";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlDelete)) {

            // prepare data for update
            pstmt.setString(1, ID);
            pstmt.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            print = false;
        }
        if(print)
            System.out.println("Successfully deleted " + table + " with " + IDtype + " = " + ID + "\n");

    }
    public void silentDelete(String table, String IDtype, String ID){
        String sqlDelete = "DELETE FROM " + table + " "
                + "WHERE " + IDtype + " = ?";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlDelete)) {

            // prepare data for update
            pstmt.setString(1, ID);
            pstmt.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    //Update tables
    public void update(String table, String IDtype, String ID, String field, String value) {
        boolean print = true;
        String sqlUpdate = "UPDATE " + table + " "
                + "SET " + field + " = ? "
                + "WHERE " + IDtype + " = ?";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

            // prepare data for update
            pstmt.setString(1, value);
            pstmt.setString(2, ID);

            int rowAffected = pstmt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            print = false;
        }
        if(print)
            System.out.println("Successfully updated " + table + " with " + IDtype + " = " + ID + "\n");

    }
    public void updateOwner(String ownerID, String firstname) {

        String sqlUpdate = "UPDATE owner "
                + "SET first_nameowner = ? "
                + "WHERE ownerID = ?";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

            // prepare data for update
            pstmt.setString(1, firstname);
            pstmt.setString(2, ownerID);

            int rowAffected = pstmt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Successfully updated the first name of the owner with ownerID = " + ownerID + "\n");

    }
    public void updateOwner(String ownerID, String firstname, String lastname) {

        String sqlUpdate = "UPDATE owner "
                + "SET first_nameowner = ?, last_nameowner = ? "
                + "WHERE ownerID = ?";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

            // prepare data for update
            pstmt.setString(1, firstname);
            pstmt.setString(2, lastname);
            pstmt.setString(3, ownerID);


            int rowAffected = pstmt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Successfully updated the full name of the owner with ownerID = " + ownerID + "\n");

    }
    public void updateTest() {

        String sqlUpdate = "UPDATE manager "
                + "SET last_namemanager = ? "
                + "WHERE managerID = ?";

        try (Connection conn = ManagerCoUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

            // prepare data for update
            String last_namemanager = "Baumiiiin";
            String managerID = "FB9737";
            pstmt.setString(1, last_namemanager);
            pstmt.setString(2, managerID);

            int rowAffected = pstmt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));

            // reuse the prepared statement
            last_namemanager = "Orchaand";
            managerID = "HO8252";
            pstmt.setString(1, last_namemanager);
            pstmt.setString(2, managerID);

            rowAffected = pstmt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Queries
    public boolean getApartment(String tenantfirst_name) {
        //
        boolean ret = false;
        String query = "{call get_apartment(?) }";
        ResultSet rs;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            stmt.setString(1, tenantfirst_name);

            rs = stmt.executeQuery();
            if(rs.next()) {
                System.out.println("Apartment details for " +tenantfirst_name);
                System.out.println("apartmentID: (" +rs.getString("apartmentID") + "), "
                                + "apartmentNo: (" +rs.getString("apartmentNo") + "), "
                                + "floor: (" + rs.getString("floor")+")");
                ret = true;

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ret = false;
        }
        return ret;
    }
    public boolean whoLivesIn(String city) {
        //
        boolean ret = false;
        String query = "{call who_lives_in(?) }";
        ResultSet rs;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            stmt.setString(1, city);

            rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("first_nametenant") + " "
                        + rs.getString("last_nametenant"));
                ret = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ret = false;
        }
        return ret;
    }
    public boolean earnings() {
        //
        boolean ret = false;
        String query = "{call earnings}";
        ResultSet rs;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("Sum") + " " + rs.getString("first_nameowner") + " "
                        + rs.getString("last_nameowner"));
            ret = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ret = false;
        }
        return ret;
    }
    public boolean countApartments(String city) {
        //
        boolean ret = false;
        String query = "{call count_apartments_in(?) }";
        ResultSet rs;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            stmt.setString(1, city);

            rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Number of apartments in " + city + ":");
                System.out.println(rs.getString("City"));
            ret = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ret = false;
        }
        return ret;
    }
    public boolean cheapest() {
        //c.city, c.address, a.apartmentID, l.rentMonthly
        boolean ret = false;
        String query = "{Call cheap_apartment}";
        ResultSet rs;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {


            rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("c.city") + "\t"
                        + rs.getString("c.address") + "\t"
                        + rs.getString("a.apartmentID") + "\t"
                        + rs.getString("l.rentMonthly"));
                ret = true;

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ret = false;
        }
        return ret;
    }
    public boolean mostExpensive() {
        //
        boolean ret = false;
        String query = "{Call expensive_apartment}";
        ResultSet rs;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {


            rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("c.city") + "\t"
                        + rs.getString("c.address") + "\t"
                        + rs.getString("a.apartmentID") + "\t"
                        + rs.getString("l.rentMonthly"));
                ret = true;

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ret = false;
        }
        return ret;
    }
    public void resetDatabase(){
        String query = "{Call resetDatabase}";

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void insertDummies(){
        String query = "{Call insertDummies}";

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }


    public static boolean fetchOwnerID(String checker) {
        //
        String query = "{call fetchOwnerID}";
        ResultSet rs;
        String temp;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            rs = stmt.executeQuery();
            while (rs.next()) {
                temp = rs.getString("ownerID");
                if(checker.equals(temp))
                    return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean fetchComplexID(String checker) {
        //
        String query = "{call fetchComplexID}";
        ResultSet rs;
        String temp;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            rs = stmt.executeQuery();
            while (rs.next()) {
                temp = rs.getString("complexID");
                if(checker.equals(temp))
                    return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean fetchManagerID(String checker) {
        //
        String query = "{call fetchManagerID}";
        ResultSet rs;
        String temp;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            rs = stmt.executeQuery();
            while (rs.next()) {
                temp = rs.getString("managerID");
                if(checker.equals(temp))
                    return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean fetchApartmentID(String checker) {
        //
        String query = "{call fetchApartmentID}";
        ResultSet rs;
        String temp;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            rs = stmt.executeQuery();
            while (rs.next()) {
                temp = rs.getString("apartmentID");
                if(checker.equals(temp))
                    return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean fetchLeaseNo(String checker) {
        //
        String query = "{call fetchLeaseNo}";
        ResultSet rs;
        String temp;

        try (Connection conn = ManagerCoUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            rs = stmt.executeQuery();
            while (rs.next()) {
                temp = rs.getString("leaseNo");
                if(checker.equals(temp))
                    return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean ownerIDchecker(String id){
        boolean found = false;
        String sql = "SELECT *" +
                " FROM owner" +
                " WHERE ownerID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if(rs.next()) {
                System.out.println(rs.getString("ownerID"));
                found = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        return found;
    }
    public boolean managerIDchecker(String id){
        boolean found = false;
        String sql = "SELECT *" +
                " FROM manager" +
                " WHERE managerID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if(rs.next()) {
                System.out.println(rs.getString("managerID"));
                found = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        return found;
    }
    public boolean complexIDchecker(String id){
        boolean found = false;
        String sql = "SELECT *" +
                " FROM complex" +
                " WHERE complexID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if(rs.next()) {
                System.out.println(rs.getString("complexID"));
                found = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        return found;
    }
    public boolean apartmentIDchecker(String id){
        boolean found = false;
        String sql = "SELECT *" +
                " FROM apartment" +
                " WHERE apartmentID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if(rs.next()) {
                System.out.println(rs.getString("apartmentID"));
                found = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        return found;
    }
    public boolean leaseIDchecker(String id){
        boolean found = false;
        String sql = "SELECT *" +
                " FROM lease" +
                " WHERE leaseNo = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if(rs.next()) {
                System.out.println(rs.getString("leaseNo"));
                found = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        return found;

    }
    public boolean tenantIDchecker(String id){
        boolean found = false;
        String sql = "SELECT *" +
                " FROM tenant" +
                " WHERE tenantID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if(rs.next()) {
                System.out.println(rs.getString("tenantID"));
                found = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        return found;
    }

    //Select everything statement for tables, to show that the queries work
    public void selectOwner() {
        String sql = "SELECT *" +
                "FROM owner";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("------------------------------------------------------------");
            System.out.println("* Owner table *");
            System.out.println("------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString("ownerID") + "\t"
                        + rs.getString("first_nameowner") + " "
                        + rs.getString("last_nameowner"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("------------------------------------------------------------");
    }
    public void selectComplex() {
        String sql = "SELECT *" +
                "FROM complex";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("------------------------------------------------------------");
            System.out.println("* Complex table *");
            System.out.println("------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString("complexID") + "\t"
                        + rs.getString("complexName") + "\t\t"
                        + rs.getString("address") + "\t\t"
                        + rs.getString("City") + " \t\t"
                        + rs.getString("ownerID"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("------------------------------------------------------------");
    }
    public void selectManager() {
        String sql = "SELECT *" +
                "FROM manager";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("------------------------------------------------------------");
            System.out.println("* Manager table *");
            System.out.println("------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString("managerID") + "\t"
                        + rs.getString("first_namemanager") + " "
                        + rs.getString("last_namemanager"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("------------------------------------------------------------");
    }
    public void selectApartment() {
        String sql = "SELECT *" +
                "FROM apartment";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("------------------------------------------------------------");
            System.out.println("* Apartment table *");
            System.out.println("------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString("apartmentID") + "\t"
                        + rs.getString("apartmentNo") + " \t"
                        + rs.getString("floor") + " \t"
                        + rs.getString("section") + " \t"
                        + rs.getString("furnished") + "  \t"
                        + rs.getString("complexID") + " \t"
                        + rs.getString("managerID"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("------------------------------------------------------------");
    }
    public void selectTenant() {
        String sql = "SELECT *" +
                "FROM tenant";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("------------------------------------------------------------");
            System.out.println("* Tenant table *");
            System.out.println("------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString("tenantID") + "\t"
                        + rs.getString("first_nametenant") + " "
                        + rs.getString("last_nametenant") + "\t\t\t"
                        + rs.getString("leaseNo"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("------------------------------------------------------------");
    }
    public void selectLease() {
        String sql = "SELECT *" +
                "FROM lease";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("------------------------------------------------------------");
            System.out.println("* Lease table *");
            System.out.println("------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString("leaseNo") + "\t"
                        + rs.getString("start_date") + "\t"
                        + rs.getString("end_date") + "\t"
                        + rs.getString("rentMonthly") + "\t"
                        + rs.getString("apartmentID"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("------------------------------------------------------------");
    }
    public void selectAll(){
        selectOwner();
        selectComplex();
        selectManager();
        selectApartment();
        selectTenant();
        selectLease();
    }

    public void fullSelectComplex() {
        String sql = "SELECT *" +
                "FROM complex";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("------------------------------------------------------------");
            System.out.println("* Complex table *");
            System.out.println("------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString("complexID") + "\t"
                        + rs.getString("complexName") + "\t\t"
                        + rs.getString("complexServices") + "\t\t"
                        + rs.getString("address") + "\t\t"
                        + rs.getString("City") + " \t\t"
                        + rs.getString("ownerID"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("------------------------------------------------------------");
    }
    public void fullSelectLease() {
        String sql = "SELECT *" +
                "FROM lease";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("------------------------------------------------------------");
            System.out.println("* Lease table *");
            System.out.println("------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString("leaseNo") + "\t"
                        + rs.getString("contractDetails") + "\t"
                        + rs.getString("start_date") + "\t"
                        + rs.getString("end_date") + "\t"
                        + rs.getString("rentMonthly") + "\t"
                        + rs.getString("apartmentID"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("------------------------------------------------------------");
    }

    public box checkOwner(String id){
        box OWNERBOX = new box();
        String thing;
        String sql = "SELECT *" +
                " FROM owner" +
                " WHERE ownerID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                OWNERBOX.arr[0] = (rs.getString("ownerID"));
                OWNERBOX.arr[1] = (rs.getString("first_nameowner"));
                OWNERBOX.arr[2] = (rs.getString("last_nameowner"));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        OWNERBOX.amount = 3;
        return OWNERBOX;
    }
    public box checkManager(String id){
        box MANAGERBOX = new box();
        String thing;
        String sql = "SELECT *" +
                " FROM manager" +
                " WHERE managerID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                MANAGERBOX.arr[0] = (rs.getString("managerID"));
                MANAGERBOX.arr[1] = (rs.getString("first_namemanager"));
                MANAGERBOX.arr[2] = (rs.getString("last_namemanager"));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        MANAGERBOX.amount = 3;
        return MANAGERBOX;
    }
    public box checkComplex(String id){
        box COMPLEXBOX = new box();
        String thing;
        String sql = "SELECT *" +
                " FROM complex" +
                " WHERE complexID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                COMPLEXBOX.arr[0] = (rs.getString("complexID"));
                COMPLEXBOX.arr[1] = (rs.getString("complexName"));
                COMPLEXBOX.arr[2] = (rs.getString("complexServices"));
                COMPLEXBOX.arr[3] = (rs.getString("address"));
                COMPLEXBOX.arr[4] = (rs.getString("city"));
                COMPLEXBOX.arr[5] = (rs.getString("ownerID"));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        COMPLEXBOX.amount = 6;
        return COMPLEXBOX;
    }
    public box checkApartment(String id){
        box APARTMENTBOX = new box();
        String thing;
        String sql = "SELECT *" +
                " FROM apartment" +
                " WHERE apartmentID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                APARTMENTBOX.arr[0] = (rs.getString("apartmentID"));
                APARTMENTBOX.inter1 = (rs.getInt("apartmentNo"));
                APARTMENTBOX.inter2 = (rs.getInt("floor"));
                APARTMENTBOX.arr[1] = (rs.getString("section"));
                APARTMENTBOX.arr[2] = (rs.getString("furnished"));
                APARTMENTBOX.arr[3] = (rs.getString("complexID"));
                APARTMENTBOX.arr[4] = (rs.getString("managerID"));


            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        APARTMENTBOX.amount = 5;
        return APARTMENTBOX;
    }
    public box checkLease(String id){
        box LEASEBOX = new box();
        String thing;
        String sql = "SELECT *" +
                " FROM lease" +
                " WHERE leaseNo = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                LEASEBOX.arr[0] = (rs.getString("leaseNo"));
                LEASEBOX.arr[1] = (rs.getString("contractDetails"));
                LEASEBOX.arr[2] = (rs.getString("start_date"));
                LEASEBOX.arr[3] = (rs.getString("end_date"));
                LEASEBOX.inter1 = (rs.getInt("rentMonthly"));
                LEASEBOX.arr[4] = (rs.getString("apartmentID"));


            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        LEASEBOX.amount = 5;
        return LEASEBOX;
    }
    /*public box checkTenant(){

    }*/


    public box selectForeignkeyOwner(String id){
        int count = 0;
        box OWNERBOX = new box();
        String thing;
        String sql = "SELECT complexID" +
                " FROM complex" +
                " WHERE ownerID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("* Complexes that must be updated *");
            while (rs.next()) {
                thing = (rs.getString("complexID"));
                System.out.println(thing);
                OWNERBOX.arr[count] = thing;
                count++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        OWNERBOX.amount = count;
        return OWNERBOX;
    }
    public box selectForeignkeyComplex(String id){
        int count = 0;
        box COMPLEXBOX = new box();
        String thing;
        String sql = "SELECT apartmentID" +
                " FROM apartment" +
                " WHERE complexID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("* Apartments that must be updated *");
            while (rs.next()) {
                thing = (rs.getString("apartmentID"));
                System.out.println(thing);
                COMPLEXBOX.arr[count] = thing;
                count++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        COMPLEXBOX.amount = count;
        return COMPLEXBOX;

    }
    public box selectForeignkeyManager(String id){
        int count = 0;
        box MANAGERBOX = new box();
        String thing;
        String sql = "SELECT apartmentID" +
                " FROM apartment" +
                " WHERE managerID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("* Apartments that must be updated *");
            while (rs.next()) {
                thing = (rs.getString("apartmentID"));
                System.out.println(thing);
                MANAGERBOX.arr[count] = thing;
                count++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        MANAGERBOX.amount = count;
        return MANAGERBOX;
    }
    public box selectForeignkeyApartment(String id){
        int count = 0;
        box APARTMENTBOX = new box();
        String thing;
        String sql = "SELECT leaseNo" +
                " FROM lease" +
                " WHERE apartmentID = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("* Leases that must be updated *");
            while (rs.next()) {
                thing = (rs.getString("leaseNo"));
                System.out.println(thing);
                APARTMENTBOX.arr[count] = thing;
                count++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        APARTMENTBOX.amount = count;
        return APARTMENTBOX;
    }
    public box selectForeignkeyLease(String id){
        int count = 0;
        box LEASEBOX = new box();
        String thing;
        String sql = "SELECT tenantID" +
                " FROM tenant" +
                " WHERE leaseNo = \"" + id + "\";";

        try (Connection conn = ManagerCoUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("* Tenants that must be updated *");
            while (rs.next()) {
                thing = (rs.getString("tenantID"));
                System.out.println(thing);
                LEASEBOX.arr[count] = thing;
                count++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        println("");
        LEASEBOX.amount = count;
        return LEASEBOX;
    }




    public String dummyIDOwner = "OWNE";
    public String dummyIDManager = "MANAGE";
    public String dummyIDComplex = "COMP";
    public String dummyIDApartment = "APART0";
    public String dummyIDLease = "LEASE0";

    public String ownerIdentifier = "ownerID";
    public String managerIdentifier = "managerID";
    public String complexIdentifier = "complexID";
    public String apartmentIdentifier = "apartmentID";
    public String leaseIdentifier = "leaseNo";

    public String complexForeign = ownerIdentifier;
    public String apartmentForeign1 = managerIdentifier;
    public String apartmentForeign2 = complexIdentifier;
    public String leaseForeign = apartmentIdentifier;
    public String tenantForeign = leaseIdentifier;

    public String ownerFields = "The fields for the owner table are :\n" +
                                "ownerID, first_nameowner and last_nameowner";
    public String managerFields = "The fields for the manager table are :\n" +
                                  "managerID, first_namemanager and last_namemanager";
    public String complexFields = "The fields for the complex table are :\n" +
                                   "complexID, complexName, complexServices, address, city and ownerID";
    public String apartmentFields = "The fields for the apartment table are :\n" +
                                    "apartmentID, apartmentNo, floor, section, furnished, complexID and managerID";
    public String leaseFields = "The fields for the lease table are :\n" +
                                "leaseNo, contractDetails, start_date, end_date, rentMonthly and apartmentID";
    public String tenantFields = "The fields for the tenant table are:\n" +
                                 "tenantID, first_nametenant and last_nametenant";


    public void printNarrative(){
        System.out.println("This database is for an apartment managing firm."
                + "\nThe company helps manage apartment complexes owned by someone else,"
                + " they both maintain and rent out the apartments on the owners’ behalf."
                + "\nIf a tenant wishes to stay in one of the apartments, they make the lease and rent it out.");
    }
    public void tester(){
        resetDatabase();

        println("Here are the tables as they were initiated: \n");
        selectAll();
        //Run 1
        // /*
        //Insertions for every table
        //----------------------------------------------------------------------------------------------------
        println("Now we will perform an insertion for every table:\n");
        insertOwner("BB19","Bob","Bobby");
        insertComplex("NY01","New World complex","Services","Main street 3", "New York","TL93");
        insertManager("JJ1884","Jimmy","Johns");
        insertApartment("AKA112",11,2,"A","Yes","LO01","PB0911");
        insertTenant("DJ77","Davy","Jones","Shin77");
        insertLease("LEASE1","Details","2018-02-01","2020-02-01",1500,"AEJ020");
        println("All the tables should now have an extra row");
        //----------------------------------------------------------------------------------------------------
        println("Here are the tables printed after the insertions");
        selectAll();
        // */
        //End Run 1

        //Run 2
        // /*
        //Deletions for every table
        //----------------------------------------------------------------------------------------------------
        println("As you can see, all tables have an extra row, the one that was just inserted. "
                + "Now we will delete all the insertions we did previously.\n");
        delete("owner","ownerID","BB19");
        delete("complex", "complexID", "NY01");
        deleteManager("JJ1884");
        delete("apartment", "apartmentID", "AKA112");
        delete("tenant", "tenantID", "DJ77");
        delete("lease", "leaseNo", "LEASE1");
        println("All tables should now have been reverted back to how they were originally.");
        //----------------------------------------------------------------------------------------------------
        println("The tables should now be the same as they were before the insertions.");
        selectAll();
        // */
        //End run 2

        //Run 3
        // /*
        //Updates for every table
        //----------------------------------------------------------------------------------------------------
        println("Now we will perform some updates, first the owner table will be updated:\n");
        updateOwner("TL93","Henriette");
        updateOwner("CE85","Eric", "LostMyLastName");
        selectOwner();
        println("As you can see, the owner table was updated, from Theodora to Henriette,"
                + "and Eric lost his last name\n");
        println("This doesn't quite add up so we will revert the changes");
        update("Owner", "ownerID", "TL93", "first_nameowner", "Theodora");
        update("Owner", "ownerID", "CE85", "last_nameowner", "Ericson");
        selectOwner();
        println("Now the changes have been reverted.\n\n");

        println("We will now re-insert the complex from earlier and update the entire row."
                + "\nThe complex will be changed into my house\n");
        //Updating an entire complex table
        insertComplex("NY01","New World complex","Services","Main street 3", "New York","TL93");
        update("Complex", "complexID", "NY01", "complexID", "OS01");
        update("Complex", "complexID", "OS01", "city", "Oslo");
        update("Complex", "complexID", "OS01", "complexName", "House of the Berglunds");
        update("Complex", "complexID", "OS01", "complexServices", "Whatever the house has to offer");
        update("Complex", "complexID", "OS01", "address", "Hubroveien 9");
        update("Complex", "complexID", "OS01", "ownerID", "EA70");
        selectComplex();
        println("As you can see, the updates were successful."
                + "\nBefore we continue we will delete this row so that everything is back to normal.\n\n");

        //----------------------------------------------------------------------------------------------------
        // */
        //End run 3

        //Rund 4
        // /*
        println("Finally we will execute 6 queries, these queries are prepacked as procedures in the DML."
                + "\nTherefore they will be called and not sent as a full query, as requested in the project text." );
        //Queries to be executed, 6 in total
        //Number 1
        println("\n\n------------------------------------------------------------");
        println("This first query will get the apartment info of the tenant with first name: Maria");
        println("------------------------------------------------------------");
        getApartment("Maria");
        println("------------------------------------------------------------");
        //Number 2
        println("\n------------------------------------------------------------");
        println("This query will list all the people who live in Louisville");
        println("------------------------------------------------------------");
        whoLivesIn("Louisville");
        println("------------------------------------------------------------");

        //Number 3
        println("\n------------------------------------------------------------");
        println("This query prints all the owners and their monthly earnings");
        println("------------------------------------------------------------");
        earnings();
        println("------------------------------------------------------------");
        //Number 4
        println("\n------------------------------------------------------------");
        println("This query counts the apartments in Louisville");
        println("------------------------------------------------------------");
        countApartments("Louisville");
        println("------------------------------------------------------------");
        //Number 5
        println("\n------------------------------------------------------------");
        println("This query returns the apartment info on the cheapest apartment");
        println("------------------------------------------------------------");
        cheapest();
        println("------------------------------------------------------------");
        //Number 6
        println("\n------------------------------------------------------------");
        println("And finally, this last query returns the apartment info on the most expensive apartment");
        println("------------------------------------------------------------");
        mostExpensive();
        println("------------------------------------------------------------");
        // */
        //End run 4

        //thing.selectAll();
        //thing.selectOwner();
        //thing.selectComplex();
        //thing.selectManager();
        //thing.selectApartment();
        //thing.selectTenant();
        //thing.selectLease();
        System.out.println("\n----END----");
        //reset the database:
        silentDelete("complex","complexID","OS01");


    }

    public boolean yesOrNo(String answer){
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        boolean ret = true;
        while(loop) {
            if (answer.length() == 3) {
                if ((answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') && (answer.charAt(1) == 'E' || answer.charAt(1) == 'e')
                        && (answer.charAt(2) == 'S' || answer.charAt(2) == 's')){
                   //println("You answered yes!");
                    loop = false;
                }
                else {
                    println("Please type 'yes' or 'no', upper or lower case:");
                    answer = scan.nextLine();
                }
            } else if (answer.length() == 2) {
                if (answer.charAt(0) == 'N' || answer.charAt(0) == 'n' && answer.charAt(1) == 'O' || answer.charAt(1) == 'o') {
                    //println("You answered no!");
                    ret = false;
                    loop = false;
                }
                else{
                    println("Please type 'yes' or 'no', upper or lower case:");
                    answer = scan.nextLine();
                }
            } else {
                println("Please type 'yes' or 'no', upper or lower case:");
                answer = scan.nextLine();
            }
        }
        return ret;
    }

    public void mainProgram() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Boolean CONTINUE = true;
        String answer;
        println("Hello there...");
        println("I heard you wanted to play around with a database that my creator has made.");
        println("Is this true? Please type 'Yes' or 'No");
        answer = scan.nextLine();
        boolean skip = false;
        boolean bool;
        boolean smallerloop;
        String stringEntry1;
        String stringEntry2;
        String stringEntry3;
        String stringEntry4;
        String stringEntry5;
        String stringEntry6;
        String stringEntry7;
        String answer2;
        String answer3;
        String table;
        int counter;
        int counterExtra;
        String reply;
        String reply2;
        String intEntry1;
        String intEntry2;
        String intEntry3;
        //Do you want to proceed?
        while (CONTINUE) {
            if(answer.length() > 0) {
                System.out.println("\nThis was your answer: '" + answer + "'");

                if (answer.length() == 2)
                    if (answer.charAt(0) == 'N' || answer.charAt(0) == 'n' && answer.charAt(1) == 'O' || answer.charAt(1) == 'o') {
                        println("Alright, I'll see you later then. Have a great day!");
                        return;
                    }
                if (answer.length() == 3)
                   if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y' && answer.charAt(1) == 'E' || answer.charAt(1) == 'e' && answer.charAt(2) == 'S' || answer.charAt(2) == 's') {
                        CONTINUE = false;
                        skip = true;
                    }
            }
            if(!skip){
                println("I didn't quite get that, please type 'yes' or 'no', either lower case or upper case");
                answer = scan.nextLine();
            }
        }

        //Intro
            println("Alright, great! Lets continue!\n\n");

            println("So here is a quick explanation of what this application does:");
            println("This application is connected to a database in MySQL");
            println("You will be able to interact with this database by inserting records into a table, " +
                    "deleting a record from a table, \nupdating a record in a table, "
                    + "or running queries from a set of already defined queries.");
            println("My creator has also been so awesome as to make a showcase of what this application can do!"
            + "\nYou may also choose to do this full demonstration, if you want.\n");
            CONTINUE = true;
            Boolean loop;
            boolean temploop;
            boolean miniloop;
            answer = "";

            while(CONTINUE) {
                //skip = false;
                //loop = true;
                println("\nHere are your interaction options: ");
                println("1. Insert a record into a table.");
                println("2. Delete a record from a table.");
                println("3. Update a record from a table.");
                println("4. Choose a query to run.");
                println("5. View a table");
                println("6. Run the full demonstration.");
                println("7. Reset the database to its original state.");
                println("8. Read the narrative for the database");
                println("If you don't want to continue, type 'END' in all caps.\n");

                print("Please type the number corresponding to the option you want to choose, or type 'END': ");
                answer = scan.nextLine();
                println("You chose option: " + answer);
                println();
                switch(answer){
                    case "1": {
                        loop = true;
                        println("Alright, let's insert a record into a table!");
                        while (loop) {
                            println("Which table do you want to insert into?");
                            println("1. Owner\n" +
                                    "2. Manager\n" +
                                    "3. Complex\n" +
                                    "4. Apartment\n" +
                                    "5. Lease\n" +
                                    "6. Tenant");
                            println("If you want to change interaction option and do something else, please type 0");
                            println("Please type the number corresponding to the option you want to choose: ");
                            reply2 = scan.nextLine();
                            println("\nYou chose option " + reply2);
                            println();
                            switch (reply2) {
                                case "0": {
                                    loop = false;
                                    println("Sounds good, we will return to interaction options menu!\n\n");
                                    break;
                                }
                                case "1": {
                                    println("You chose the owner table");
                                    print("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        println("\nPlease type in the entries exactly as prompted to insert into database:");

                                        println("First, type in the ownerID.");
                                        stringEntry1 = scan.nextLine();
                                        temploop = true;
                                        while(temploop) {
                                            while (stringEntry1.length() != 4) {
                                                println("The ownerID must be 4 characters.");
                                                println("Please type in an ID: ");
                                                stringEntry1 = scan.nextLine();
                                            }

                                            if(ownerIDchecker(stringEntry1)){
                                                println("An owner with this ownerID already exists in the database.");
                                                println("Please type in another ownerID:");
                                                stringEntry1 = scan.nextLine();
                                            } else {
                                                temploop = false;
                                            }
                                        }
                                        println("Secondly, type in the first name of the owner: ");
                                        stringEntry2 = scan.nextLine();
                                        while (stringEntry2.length() > 20 || stringEntry2.length() == 1) {
                                            println("The first name cannot exceed 20 characters, but must at least be 1 character");
                                            println("Please type in the first name again: ");
                                            stringEntry2 = scan.nextLine();
                                        }
                                        println("Finally, type in the last name of the owner: ");
                                        stringEntry3 = scan.nextLine();
                                        while (stringEntry3.length() > 50 || stringEntry3.length() == 1) {
                                            println("The last name cannot exceed 50 characters, but must at least be 1 character");
                                            println("Please type in the last name again: ");
                                            stringEntry3 = scan.nextLine();
                                        }
                                        println("Do you want to insert this owner with entries: ");
                                        println("OwnerID = " + stringEntry1);
                                        println("First name = " + stringEntry2);
                                        println("Last name = " + stringEntry3);
                                        println("into the owner table? Type 1 to insert or 0 to abort");
                                        reply = scan.nextLine();
                                        if(reply.equalsIgnoreCase("1")) {
                                            insertOwner(stringEntry1, stringEntry2, stringEntry3);
                                            loop = false;
                                            println("Great! You inserted an owner into the table! What do you want to do next?");
                                        }
                                        else {
                                            println("The insertion has been aborted. Going back to table menu.\n");
                                        }
                                    } else {
                                        println("\nAlright, we'll return to table selection.\n");
                                        //skip = true;
                                    }
                                    break;
                                }
                                case "2": {
                                    println("You chose the manager table");
                                    print("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        println("\nPlease type in the entries exactly as prompted to insert into database:");
                                        println("First, type in the managerID.");
                                        stringEntry1 = scan.nextLine();
                                        temploop = true;
                                        while(temploop) {
                                            while (stringEntry1.length() != 6) {
                                                println("The managerID must be 6 characters.");
                                                println("Please type in an ID: ");
                                                stringEntry1 = scan.nextLine();
                                            }

                                            if(managerIDchecker(stringEntry1)){
                                                println("A manager with this managerID already exists in the database.");
                                                println("Please type in another managerID:");
                                                stringEntry1 = scan.nextLine();
                                            } else {
                                                temploop = false;
                                            }
                                        }
                                        println("Secondly, type in the first name of the manager: ");
                                        stringEntry2 = scan.nextLine();
                                        while (stringEntry2.length() > 20 || stringEntry2.length() == 1) {
                                            println("The first name cannot exceed 20 characters, but must at least be 1 character");
                                            println("Please type in the first name again: ");
                                            stringEntry2 = scan.nextLine();
                                        }
                                        println("Finally, type in the last name of the manager: ");
                                        stringEntry3 = scan.nextLine();
                                        while (stringEntry3.length() > 50 || stringEntry3.length() == 1) {
                                            println("The last name cannot exceed 50 characters, but must at least be 1 character");
                                            println("Please type in the last name again: ");
                                            stringEntry3 = scan.nextLine();
                                        }
                                        println("Do you want to insert this owner with entries: ");
                                        println("managerID = " + stringEntry1);
                                        println("First name = " + stringEntry2);
                                        println("Last name = " + stringEntry3);
                                        println("into the manager table? Type 1 to insert or 0 to abort");
                                        reply = scan.nextLine();
                                        if(reply.equalsIgnoreCase("1")) {
                                            insertManager(stringEntry1, stringEntry2, stringEntry3);
                                            loop = false;
                                            println("Great! You inserted a manager into the table! What do you want to do next?");
                                        }
                                        else {
                                            println("The insertion has been aborted. Going back to table menu.\n");
                                        }
                                    } else {
                                        println("\nAlright, we'll return to table selection.\n");
                                        //skip = true;
                                    }
                                    break;

                                }
                                case "3": {
                                    println("You chose the complex table");
                                    print("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")){
                                        println("\nPlease type in the entries exactly as prompted to insert into database:");
                                        println("First, type in the complexID.");
                                        stringEntry1 = scan.nextLine();
                                        temploop = true;
                                        while(temploop) {
                                            while (stringEntry1.length() != 4) {
                                                println("The complexID must be 4 characters.");
                                                println("Please type in the ID: ");
                                                stringEntry1 = scan.nextLine();
                                            }
                                            if(complexIDchecker(stringEntry1)){
                                                println("A complex with this complexID already exists in the database.");
                                                println("Please type in another complexID:");
                                                stringEntry1 = scan.nextLine();
                                            } else {
                                                temploop = false;
                                            }
                                        }


                                        println("Secondly, type in the name of the Complex: ");
                                        stringEntry2 = scan.nextLine();
                                        while (stringEntry2.length() > 25 || stringEntry2.length() == 1) {
                                            println("The name cannot exceed 25 characters, but must at least be 1 character");
                                            println("Please type in the name again: ");
                                            stringEntry2 = scan.nextLine();
                                        }
                                        println("Thirdly, type in the complex services: ");
                                        stringEntry3 = scan.nextLine();
                                        while (stringEntry3.length() > 215 || stringEntry3.length() == 1) {
                                            println("The last name cannot exceed 215 characters, but must at least be 1 character");
                                            println("Please type in the services: ");
                                            stringEntry3 = scan.nextLine();
                                        }
                                        println("Fourthly, type in the address: ");
                                        stringEntry4 = scan.nextLine();
                                        while (stringEntry4.length() > 25 || stringEntry4.length() == 1) {
                                            println("The last name cannot exceed 25 characters, but must at least be 1 character");
                                            println("Please type in the address: ");
                                            stringEntry4 = scan.nextLine();
                                        }
                                        println("Fifthly, type in the City: ");
                                        stringEntry5 = scan.nextLine();
                                        while (stringEntry5.length() > 20 || stringEntry5.length() == 1) {
                                            println("The last City cannot exceed 20 characters, but must at least be 1 character");
                                            println("Please type in the city: ");
                                            stringEntry5 = scan.nextLine();
                                        }
                                        println("Finally, type in the ownerID of the owner."
                                                +" Make sure there exists an owner with the ID you're about to type in.\n"
                                                +"I will check if it exists just in case!");
                                        stringEntry6 = scan.nextLine();
                                        while (!fetchOwnerID(stringEntry6)) {
                                            println("The ownerID you inserted does not appear to exist.");

                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectOwner();

                                            println("Try another one.");
                                            println("Please type in the ownerID: ");
                                            stringEntry6 = scan.nextLine();
                                        }

                                        println("Do you want to insert this complex with entries: ");
                                        println("complexID = " + stringEntry1);
                                        println("Complex name = " + stringEntry2);
                                        println("Complex services = " + stringEntry3);
                                        println("Address = " + stringEntry4);
                                        println("City = " + stringEntry5);
                                        println("ownerID = " + stringEntry6);
                                        println("into the complex table? Type 1 to insert or 0 to abort");
                                        reply = scan.nextLine();
                                        if(reply.equalsIgnoreCase("1")) {
                                            insertComplex(stringEntry1, stringEntry2, stringEntry3, stringEntry4, stringEntry5, stringEntry6);
                                            loop = false;
                                            println("Great! You inserted a complex into the table! What do you want to do next?");
                                        }
                                        else {
                                            println("The insertion has been aborted. Going back to table menu.\n");
                                        }
                                    } else {
                                        println("\nAlright, we'll return to table selection.\n");
                                        //skip = true;
                                    }
                                    break;


                                }
                                case "4": {
                                    println("You chose the apartment table");
                                    print("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")){
                                        println("\nPlease type in the entries exactly as prompted to insert into database:");
                                        println("First, type in the apartmentID.");
                                        stringEntry1 = scan.nextLine();
                                        temploop = true;
                                        while(temploop) {
                                            while (stringEntry1.length() != 6) {
                                                println("The apartmentID must be 6 characters.");
                                                println("Please type in the ID: ");
                                                stringEntry1 = scan.nextLine();
                                            }

                                            if(apartmentIDchecker(stringEntry1)){
                                                println("An aparment with this apartmentID already exists in the database.");
                                                println("Please type in another apartmentID:");
                                                stringEntry1 = scan.nextLine();
                                            } else {
                                                temploop = false;
                                            }
                                        }


                                        println("Secondly, type in the apartmentNo: ");
                                        intEntry1 = scan.nextLine();
                                        while (intEntry1.length() > 2||intEntry1.length() < 1) {
                                            println("The number must be between 1 and 99");
                                            println("Please type in the number again: ");
                                            intEntry1 = scan.nextLine();
                                        }
                                        println("Thirdly, type in the floor: ");
                                        intEntry2 =scan.nextLine();
                                        while (intEntry2.length() > 2 || intEntry2.length() < 1) {
                                            println("The floor must be between -5 and 25");
                                            println("Please type in the number again: ");
                                            intEntry2 = scan.nextLine();
                                        }
                                        println("Fourthly, type in the section: ");
                                        stringEntry4 = scan.nextLine();
                                        while (stringEntry4.length() > 5 || stringEntry4.length() < 1) {
                                            println("The section must be between 1 and 5 characters");
                                            println("Please type in the address: ");
                                            stringEntry4 = scan.nextLine();
                                        }
                                        println("Fifthly, type in the furnished state, type 1 for yes or 0 for no(defaults to no):");
                                        intEntry3 = scan.nextLine();
                                        if(intEntry3.equalsIgnoreCase("1")) {
                                            stringEntry6 = "Yes";
                                        }else {
                                            stringEntry6 = "No";
                                        }
                                        println("Sixthly, type in the complexID of the complex."
                                                +" Make sure there exists a complex with the ID you're about to type in.\n"
                                                +"I will check if it exists just in case!");
                                        stringEntry5 = scan.nextLine();
                                        while (!fetchComplexID(stringEntry5)) {
                                            println("The complexID you inserted does not appear to exist.");
                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectComplex();
                                            println("Please type in the complexID: ");
                                            stringEntry5 = scan.nextLine();
                                        }
                                        println("Finally, type in the managerID of the manager."
                                                +" Make sure there exists a manager with the ID you're about to type in.\n"
                                                +"I will check if it exists just in case!");
                                        stringEntry3 = scan.nextLine();
                                        while (!fetchManagerID(stringEntry3)) {
                                            println("The managerID you inserted does not appear to exist, try another one.");

                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectManager();

                                            println("Please type in the managerID: ");
                                            stringEntry3 = scan.nextLine();
                                        }

                                        println("Do you want to insert this complex with entries: ");
                                        println("apartmentID = " + stringEntry1);
                                        println("Apartment number = " + intEntry1);
                                        println("Floor = " + intEntry2);
                                        println("Section = " + stringEntry4);
                                        println("Furnished state = " + stringEntry6);
                                        println("ComplexID = " + stringEntry5);
                                        println("managerID = " + stringEntry3);
                                        println("into the apartment table? Type 1 to insert or 0 to abort");
                                        reply = scan.nextLine();

                                        if(reply.equalsIgnoreCase("1")) {
                                            insertApartment(stringEntry1,intEntry1, intEntry2, stringEntry4, stringEntry6,stringEntry5, stringEntry3);
                                            loop = false;
                                            println("Great! You inserted an apartment into the table! What do you want to do next?");
                                        }
                                        else {
                                            println("The insertion has been aborted. Going back to table menu.\n");
                                        }
                                    } else {
                                        println("\nAlright, we'll return to table selection.\n");
                                        //skip = true;
                                    }
                                    break;



                                }
                                case "5": {
                                    println("You chose the lease table");
                                    print("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        println("\nPlease type in the entries exactly as prompted to insert into database:");
                                        println("First, type in the leaseNo.");
                                        stringEntry1 = scan.nextLine();
                                        temploop = true;
                                        while(temploop) {
                                            while (stringEntry1.length() != 6) {
                                                println("The leaseNo must be 6 characters.");
                                                println("Please type in a number: ");
                                                stringEntry1 = scan.nextLine();
                                            }
                                            if(leaseIDchecker(stringEntry1)){
                                                println("A lease with this No already exists in the database.");
                                                println("Please type in another leaseNo:");
                                                stringEntry1 = scan.nextLine();
                                            } else {
                                                temploop = false;
                                            }
                                        }

                                        println("Secondly, type in the contractDetails: ");
                                        stringEntry2 = scan.nextLine();
                                        while (stringEntry2.length() > 255 || stringEntry2.length()< 1) {
                                            println("The details must be between 1 and 255");
                                            println("Please type in the details again: ");
                                            stringEntry2 = scan.nextLine();
                                        }
                                        println("Thirdly, type in the start date It must be in the format: \"YYYY-MM-DD\": ");
                                        stringEntry3 = scan.nextLine();
                                        while (stringEntry3.length() != 10) {
                                            println("The date must be typed in like so:  \"YYYY-MM-DD\"");
                                            println("Please type in the date again: ");
                                            stringEntry3 = scan.nextLine();
                                        }
                                        println("Fourthly, type in the end date It must be in the format: \"YYYY-MM-DD\": ");
                                        stringEntry4 = scan.nextLine();
                                        while (stringEntry4.length() != 10) {
                                            println("The date must be typed in like so:  \"YYYY-MM-DD\"");
                                            println("Please type in the date again: ");
                                            stringEntry4 = scan.nextLine();
                                        }
                                        println("Fifthly, type in the monthly rate:");
                                        intEntry3 = scan.nextLine();
                                        while(intEntry3.length() >5 ){
                                            println("Woah, that's a lot of money, are you sure?");
                                            println("Try a little less:");
                                            intEntry3 = scan.nextLine();
                                        }
                                        println("Finally, type in the apartmentID of the apartment being rented."
                                                +" Make sure there exists an apartment with the ID you're about to type in.\n"
                                                +"I will check if it exists just in case!");
                                        stringEntry5 = scan.nextLine();
                                        while (!fetchApartmentID(stringEntry5)) {
                                            println("The apartmentID you inserted does not appear to exist, try another one.");

                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectApartment();

                                            println("Please type in the apartmentID: ");
                                            stringEntry5 = scan.nextLine();
                                        }

                                        println("Do you want to insert this complex with entries: ");
                                        println("leaseNo = " + stringEntry1);
                                        println("Contract details = " + stringEntry2);
                                        println("Start date = " + stringEntry3);
                                        println("End date = " + stringEntry4);
                                        println("Monthly rent = " +intEntry3);
                                        println("apartmentID = " + stringEntry5);
                                        println("into the lease table? Type 1 to insert or 0 to abort");
                                        reply = scan.nextLine();

                                        if(reply.equalsIgnoreCase("1")) {
                                            insertLease(stringEntry1, stringEntry2 , stringEntry3,  stringEntry4, intEntry3, stringEntry5);
                                            loop = false;
                                            println("Great! You inserted a lease into the table! What do you want to do next?");
                                        }
                                        else {
                                            println("The insertion has been aborted. Going back to table menu.\n");
                                        }
                                    } else {
                                        println("\nAlright, we'll return to table selection.\n");
                                        //skip = true;
                                    }
                                    break;




                                }
                                case "6": {
                                    println("You chose the tenant table");
                                    print("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        println("\nPlease type in the entries exactly as prompted to insert into database:");
                                        println("First, type in the tenantID.");
                                        stringEntry1 = scan.nextLine();
                                        temploop = true;
                                        while(temploop) {
                                            while (stringEntry1.length() != 4) {
                                                println("The tenantID must be 4 characters.");
                                                println("Please type in an ID: ");
                                                stringEntry1 = scan.nextLine();
                                            }

                                            if(tenantIDchecker(stringEntry1)){
                                                println("A tenant with this ID already exists in the database.");
                                                println("Please type in another tenantID:");
                                                stringEntry1 = scan.nextLine();
                                            } else {
                                                temploop = false;
                                            }
                                        }

                                        println("Secondly, type in the first name of the tenant: ");
                                        stringEntry2 = scan.nextLine();
                                        while (stringEntry2.length() > 20 || stringEntry2.length() == 1) {
                                            println("The first name cannot exceed 20 characters, but must at least be 1 character");
                                            println("Please type in the first name again: ");
                                            stringEntry2 = scan.nextLine();
                                        }
                                        println("Thirdly, type in the last name of the tenant: ");
                                        stringEntry3 = scan.nextLine();
                                        while (stringEntry3.length() > 50 || stringEntry3.length() == 1) {
                                            println("The last name cannot exceed 50 characters, but must at least be 1 character");
                                            println("Please type in the last name again: ");
                                            stringEntry3 = scan.nextLine();
                                        }
                                        println("Finally, type in the leaseNo of the lease."
                                                +" Make sure there exists a lease with the number you're about to type in.\n"
                                                +"I will check if it exists just in case!");
                                        stringEntry4 = scan.nextLine();
                                        while (!fetchLeaseNo(stringEntry4)) {
                                            println("The leaseNo you inserted does not appear to exist, try another one.");

                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectLease();

                                            println("Please type in the leaseNo: ");
                                            stringEntry4 = scan.nextLine();
                                        }
                                        println("Do you want to insert this owner with entries: ");
                                        println("TenantID = " + stringEntry1);
                                        println("First name = " + stringEntry2);
                                        println("Last name = " + stringEntry3);
                                        println("LeaseNo = " + stringEntry4);
                                        println("into the tenant table? Type 1 to insert or 0 to abort");
                                        reply = scan.nextLine();
                                        if(reply.equalsIgnoreCase("1")) {
                                            insertTenant(stringEntry1, stringEntry2, stringEntry3, stringEntry4);
                                            loop = false;
                                            println("Great! You inserted a tenant into the table! What do you want to do next?");
                                        }
                                        else {
                                            println("The insertion has been aborted. Going back to table menu.\n");
                                        }
                                    } else {
                                        println("\nAlright, we'll return to table selection.\n");
                                        //skip = true;
                                    }
                                    break;
                                }
                                default: {
                                    println("I'm sorry, I didn't understand which option you chose. Please try again.\n");
                                    break;
                                }
                            }

                        }
                        break;
                    }
                    case "2": {
                        println("Alright, let's delete a record from a table!");
                        loop = true;
                        while (loop) {
                            println("From which table do you want to delete a record?");
                            println("1. Owner" +
                                    "\n2. Manager" +
                                    "\n3. Complex" +
                                    "\n4. Apartment" +
                                    "\n5. Lease" +
                                    "\n6. Tenant");
                            println("If you want to change interaction option and do something else, please type 0");
                            println("Please type the number corresponding to the option you want to choose: ");
                            reply2 = scan.nextLine();
                            println("\nYou chose option " + reply2);
                            println();
                            switch (reply2) {
                                case "0": {
                                    loop = false;
                                    println("Sounds good, we will return to interaction options menu!\n\n");
                                    break;
                                }
                                case "1":{
                                    println("You chose the owner table");
                                    println("Please note that a complex is owned by an owner." +
                                            " This means that a complex record referencing the owner you want to delete" +
                                            " must be updated first.");
                                    println("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        table = "owner";
                                        stringEntry2 = "ownerID";
                                        /* String table, String IDtype, String ID */
                                        miniloop = true;
                                        while (miniloop) {
                                            println("\nPlease specify what the ownerID is, if you are not sure, you can view the table:");
                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectOwner();
                                            smallerloop = true;
                                            while(smallerloop) {
                                                println("Please select the ownerID:");
                                                stringEntry1 = scan.nextLine();

                                                if(stringEntry1.equalsIgnoreCase(dummyIDOwner)){
                                                    println("I'm sorry, but you are not permitted to delete a dummy value.");
                                                    println("Please choose another record.");
                                                } else {
                                                    smallerloop = false;
                                                }
                                            }
                                            bool = ownerIDchecker(stringEntry1);
                                            if(bool){
                                                println("The ownerID: " + stringEntry1 + ", exists.");
                                                println("Make sure this is the owner record you want to delete." +
                                                        "\nIf you want to change the ownerID, type '2'");
                                                println("If you're sure you want to proceed, type '1'." +
                                                        "\nIf you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                            } else {
                                                println("The ownerID: " + stringEntry1 + ", does NOT exist.");
                                                println("Make sure to type in a valid ownerID, if you want to type in another ownerID, type '2'");
                                                println("If you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                                switch(intEntry1){
                                                    case "2": {
                                                        break;
                                                    }
                                                    default:{
                                                        intEntry1 = "0";
                                                        break;
                                                    }
                                                }
                                            }
                                            /*
                                            println("The ownerID you typed in was: " + stringEntry1 + ". If this is correct, type '1'.");
                                            println("Make sure this is a valid ownerID, if you want to retype the ownerID, type '2'");
                                            println("Or if you want to abort type '0'");
                                            intEntry1 = scan.nextInt();
                                            scan.nextLine();
                                             */
                                            switch (intEntry1) {
                                                case "0": {
                                                    println("Alright, you'll be taken back to the table selection menu");
                                                    miniloop = false;
                                                    break;
                                                }
                                                case "1": {
                                                    println("Great, we will soon proceed to delete that record.");
                                                    println("First we will check if there are any tables that need an update before deletion:");
                                                    println("\nThe following text is just the methods doing their worK:");
                                                    println("----------------------------------------------");
                                                    box chest = selectForeignkeyOwner(stringEntry1);
                                                    counterExtra = 0;
                                                    while(counterExtra < chest.amount){
                                                        System.out.println(chest.arr[counterExtra]);
                                                        update("Complex", "complexID", chest.arr[counterExtra], "ownerID", "OWNE");
                                                        counterExtra++;
                                                    }
                                                    //update("Complex", "complexID", "NY01", "complexID", "OS01");

                                                    println("----------------------------------------------");
                                                    println("\nAll is ready now, either no record had " + stringEntry1 + " as the foreign key," +
                                                            "\nor those records that did have been updated with the dummy value.\n");
                                                    println("Time to delete the record with ownerID = " + stringEntry1 + " from the owner table\n\n");
                                                    miniloop = false;
                                                    delete(table, stringEntry2, stringEntry1);
                                                    println("What do you want to do next?\n");
                                                    loop = false;
                                                    break;
                                                }
                                                default: {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                case "2":{
                                    println("You chose the manager table");
                                    println("Please note that an apartment is managed by a manager." +
                                            " This means that an apartment record referencing the manager you want to delete" +
                                            " must be updated first.");
                                    println("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        table = "manager";
                                        stringEntry2 = "managerID";
                                        /* String table, String IDtype, String ID */
                                        miniloop = true;
                                        while (miniloop) {
                                            println("\nPlease specify what the managerID is, if you are not sure, you can view the table:");
                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectManager();
                                            smallerloop = true;
                                            while(smallerloop) {
                                                println("Please select the managerID:");
                                                stringEntry1 = scan.nextLine();

                                                if(stringEntry1.equalsIgnoreCase(dummyIDManager)){
                                                    println("I'm sorry, but you are not permitted to delete a dummy value.");
                                                    println("Please choose another record.");
                                                } else {
                                                    smallerloop = false;
                                                }
                                            }

                                            bool = managerIDchecker(stringEntry1);
                                            if(bool){
                                                println("The managerID: " + stringEntry1 + ", exists.");
                                                println("Make sure this is the manager record you want to delete." +
                                                        "\nIf you want to change the managerID, type '2'");
                                                println("If you're sure you want to proceed, type '1'." +
                                                        "\nIf you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                            } else {
                                                println("The managerID: " + stringEntry1 + ", does NOT exist.");
                                                println("Make sure to type in a valid managerID, if you want to type in another managerID, type '2'");
                                                println("If you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                                switch(intEntry1){
                                                    case "2": {
                                                        break;
                                                    }
                                                    default:{
                                                        intEntry1 = "0";
                                                        break;
                                                    }
                                                }
                                            }
                                            /*
                                            println("The managerID you typed in was: " + stringEntry1 + ". If this is correct, type '1'.");
                                            println("Make sure this is a valid managerID, if you want to retype the managerID, type '2'");
                                            println("Or if you want to abort type '0'");
                                            intEntry1 = scan.nextInt();
                                            scan.nextLine();
                                             */
                                            switch (intEntry1) {
                                                case "0": {
                                                    println("Alright, you'll be taken back to the table selection menu");
                                                    miniloop = false;
                                                    break;
                                                }
                                                case "1": {
                                                    println("Great, we will soon proceed to delete that record.");
                                                    println("First we will check if there are any tables that need an update before deletion:");
                                                    println("\nThe following text is just the methods doing their worK:");
                                                    println("----------------------------------------------");
                                                    box chest = selectForeignkeyManager(stringEntry1);
                                                    counterExtra = 0;
                                                    while(counterExtra < chest.amount){
                                                        System.out.println(chest.arr[counterExtra]);
                                                        update("apartment", "apartmentID", chest.arr[counterExtra], "managerID", dummyIDManager);
                                                        counterExtra++;
                                                    }
                                                    //update("Complex", "complexID", "NY01", "complexID", "OS01");
                                                    println("----------------------------------------------");
                                                    println("\nAll is ready now, either no record had " + stringEntry1 + " as the foreign key," +
                                                            "\nor those records that did have been updated with the dummy value.\n");
                                                    println("Time to delete the record with managerID = " + stringEntry1 + " from the manager table\n\n");
                                                    miniloop = false;
                                                    delete(table, stringEntry2, stringEntry1);
                                                    println("What do you want to do next?\n");
                                                    loop = false;
                                                    break;
                                                }
                                                case "2": {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                case "3":{
                                    println("You chose the complex table");
                                    println("Please note that an apartment is located in a complex." +
                                            " This means that an apartment record referencing the complex you want to delete" +
                                            " must be updated first.");
                                    println("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        table = "complex";
                                        stringEntry2 = "complexID";
                                        /* String table, String IDtype, String ID */
                                        miniloop = true;
                                        while (miniloop) {
                                            println("\nPlease specify what the complexID is, if you are not sure, you can view the table:");
                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectComplex();
                                            smallerloop = true;
                                            while(smallerloop) {
                                                println("Please select the complexID:");
                                                stringEntry1 = scan.nextLine();

                                                if(stringEntry1.equalsIgnoreCase(dummyIDComplex)){
                                                    println("I'm sorry, but you are not permitted to delete a dummy value.");
                                                    println("Please choose another record.");
                                                } else {
                                                    smallerloop = false;
                                                }
                                            }


                                            bool = complexIDchecker(stringEntry1);
                                            if(bool){
                                                println("The complexID: " + stringEntry1 + ", exists.");
                                                println("Make sure this is the complex record you want to delete." +
                                                        "\nIf you want to change the complexID, type '2'");
                                                println("If you're sure you want to proceed, type '1'." +
                                                        "\nIf you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                            } else {
                                                println("The complexID: " + stringEntry1 + ", does NOT exist.");
                                                println("Make sure to type in a valid complexID, if you want to type in another complexID, type '2'");
                                                println("If you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                                switch(intEntry1){
                                                    case "2": {
                                                        break;
                                                    }
                                                    default:{
                                                        intEntry1 = "0";
                                                        break;
                                                    }
                                                }
                                            }

                                            /*
                                            println("The complexID you typed in was: " + stringEntry1 + ". If this is correct, type '1'.");
                                            println("Make sure this is a valid complexID, if you want to retype the complexID, type '2'");
                                            println("Or if you want to abort type '0'");
                                            intEntry1 = scan.nextInt();
                                            scan.nextLine();*/
                                            switch (intEntry1) {
                                                case "0": {
                                                    println("Alright, you'll be taken back to the table selection menu");
                                                    miniloop = false;
                                                    break;
                                                }
                                                case "1": {
                                                    println("Great, we will soon proceed to delete that record.");
                                                    println("First we will check if there are any tables that need an update before deletion:");
                                                    println("\nThe following text is just the methods doing their worK:");
                                                    println("----------------------------------------------");
                                                    box chest = selectForeignkeyComplex(stringEntry1);
                                                    counterExtra = 0;
                                                    while(counterExtra < chest.amount){
                                                        System.out.println(chest.arr[counterExtra]);
                                                        update("apartment", "apartmentID", chest.arr[counterExtra], "complexID", dummyIDComplex);
                                                        counterExtra++;
                                                    }
                                                    //update("Complex", "complexID", "NY01", "complexID", "OS01");
                                                    println("----------------------------------------------");
                                                    println("\nAll is ready now, either no record had " + stringEntry1 + " as the foreign key," +
                                                            "\nor those records that did have been updated with the dummy value.\n");
                                                    println("Time to delete the record with complexID = " + stringEntry1 + " from the complex table\n\n");
                                                    miniloop = false;
                                                    delete(table, stringEntry2, stringEntry1);
                                                    println("What do you want to do next?\n");
                                                    loop = false;
                                                    break;
                                                }
                                                default: {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                case "4":{
                                    println("You chose the apartment table");
                                    println("Please note that a lease is connected to an apartment." +
                                            " This means that a lease record referencing the apartment you want to delete" +
                                            " must be updated first.");
                                    println("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        table = "apartment";
                                        stringEntry2 = "apartmentID";
                                        /* String table, String IDtype, String ID */
                                        miniloop = true;
                                        while (miniloop) {
                                            println("\nPlease specify what the apartmentID is, if you are not sure, you can view the table:");
                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectApartment();
                                            smallerloop = true;
                                            while(smallerloop) {
                                                println("Please select the apartmentID:");
                                                stringEntry1 = scan.nextLine();

                                                if(stringEntry1.equalsIgnoreCase(dummyIDApartment)){
                                                    println("I'm sorry, but you are not permitted to delete a dummy value.");
                                                    println("Please choose another record.");
                                                } else {
                                                    smallerloop = false;
                                                }
                                            }

                                            bool = apartmentIDchecker(stringEntry1);
                                            if(bool){
                                                println("The apartmentID: " + stringEntry1 + ", exists.");
                                                println("Make sure this is the apartment record you want to delete." +
                                                        "\nIf you want to change the apartmentID, type '2'");
                                                println("If you're sure you want to proceed, type '1'." +
                                                        "\nIf you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                            } else {
                                                println("The apartmentID: " + stringEntry1 + ", does NOT exist.");
                                                println("Make sure to type in a valid apartmentID, if you want to type in another apartmentID, type '2'");
                                                println("If you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                                switch(intEntry1){
                                                    case "2": {
                                                        break;
                                                    }
                                                    default:{
                                                        intEntry1 = "0";
                                                        break;
                                                    }
                                                }
                                            }

                                            /*
                                            println("The apartmentID you typed in was: " + stringEntry1 + ". If this is correct, type '1'.");
                                            println("Make sure this is a valid apartmentID, if you want to retype the apartmentID, type '2'");
                                            println("Or if you want to abort type '0'");
                                            intEntry1 = scan.nextInt();
                                             */
                                            switch (intEntry1) {
                                                case "0": {
                                                    println("Alright, you'll be taken back to the table selection menu");
                                                    miniloop = false;
                                                    break;
                                                }
                                                case "1": {
                                                    println("Great, we will soon proceed to delete that record.");
                                                    println("First we will check if there are any tables that need an update before deletion:");
                                                    println("\nThe following text is just the methods doing their worK:");
                                                    println("----------------------------------------------");
                                                    box chest = selectForeignkeyApartment(stringEntry1);
                                                    counterExtra = 0;
                                                    while(counterExtra < chest.amount){
                                                        System.out.println(chest.arr[counterExtra]);
                                                        update("lease", "leaseNo", chest.arr[counterExtra], "apartmentID", dummyIDApartment);
                                                        counterExtra++;
                                                    }
                                                    //update("Complex", "complexID", "NY01", "complexID", "OS01");
                                                    println("----------------------------------------------");
                                                    println("\nAll is ready now, either no record had " + stringEntry1 + " as the foreign key," +
                                                            "\nor those records that did have been updated with the dummy value.\n");
                                                    println("Time to delete the record with apartmentID = " + stringEntry1 + " from the apartment table\n\n");
                                                    miniloop = false;
                                                    delete(table, stringEntry2, stringEntry1);
                                                    println("What do you want to do next?\n");
                                                    loop = false;
                                                    break;
                                                }
                                                default: {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                case "5":{
                                    println("You chose the lease table");
                                    println("Please note that a tenant is has signed a lease." +
                                            " This means that a tenant record referencing the lease you want to delete" +
                                            " must be updated first.");
                                    println("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        table = "lease";
                                        stringEntry2 = "leaseNo";
                                        /* String table, String IDtype, String ID */
                                        miniloop = true;
                                        while (miniloop) {
                                            println("\nPlease specify what the leaseNo is, if you are not sure, you can view the table:");
                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectLease();
                                            smallerloop = true;
                                            while(smallerloop) {
                                                println("Please select the leaseNo:");
                                                stringEntry1 = scan.nextLine();

                                                if(stringEntry1.equalsIgnoreCase(dummyIDLease)){
                                                    println("I'm sorry, but you are not permitted to delete a dummy value.");
                                                    println("Please choose another record.");
                                                } else {
                                                    smallerloop = false;
                                                }
                                            }


                                            bool = leaseIDchecker(stringEntry1);
                                            if(bool){
                                                println("The leaseNo: " + stringEntry1 + ", exists.");
                                                println("Make sure this is the lease record you want to delete." +
                                                        "\nIf you want to change the leaseNo, type '2'");
                                                println("If you're sure you want to proceed, type '1'." +
                                                        "\nIf you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                            } else {
                                                println("The leaseNo: " + stringEntry1 + ", does NOT exist.");
                                                println("Make sure to type in a valid leaseNo, if you want to type in another leaseNo, type '2'");
                                                println("If you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                                switch(intEntry1){
                                                    case "2": {
                                                        break;
                                                    }
                                                    default:{
                                                        intEntry1 = "0";
                                                        break;
                                                    }
                                                }
                                            }

                                            /*
                                            println("The leaseNo you typed in was: " + stringEntry1 + ". If this is correct, type '1'.");
                                            println("Make sure this is a valid leaseNo, if you want to retype the leaseNo, type '2'");
                                            println("Or if you want to abort type '0'");
                                            intEntry1 = scan.nextInt();
                                            scan.nextLine();
                                             */
                                            switch (intEntry1) {
                                                case "0": {
                                                    println("Alright, you'll be taken back to the table selection menu");
                                                    miniloop = false;
                                                    break;
                                                }
                                                case "1": {
                                                    println("Great, we will soon proceed to delete that record.");
                                                    println("First we will check if there are any tables that need an update before deletion:");
                                                    println("\nThe following text is just the methods doing their worK:");
                                                    println("----------------------------------------------");
                                                    box chest = selectForeignkeyLease(stringEntry1);
                                                    counterExtra = 0;
                                                    while(counterExtra < chest.amount){
                                                        System.out.println(chest.arr[counterExtra]);
                                                        update("tenant", "tenantID", chest.arr[counterExtra], "leaseNo", dummyIDLease);
                                                        counterExtra++;
                                                    }
                                                    //update("Complex", "complexID", "NY01", "complexID", "OS01");
                                                    println("----------------------------------------------");
                                                    println("\nAll is ready now, either no record had " + stringEntry1 + " as the foreign key," +
                                                            "\nor those records that did have been updated with the dummy value.\n");
                                                    println("Time to delete the record with leaseNo = " + stringEntry1 + " from the lease table\n\n");
                                                    miniloop = false;
                                                    delete(table, stringEntry2, stringEntry1);
                                                    println("What do you want to do next?\n");
                                                    loop = false;
                                                    break;
                                                }
                                                default: {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                case "6":{
                                    println("You chose the tenant table");
                                    println("Do you wish to continue? Type '1' for continue, type '0' to abort and return to table selection: ");
                                    reply = scan.nextLine();
                                    if (reply.equalsIgnoreCase("1")) {
                                        table = "tenant";
                                        stringEntry2 = "tenantID";
                                        /* String table, String IDtype, String ID */
                                        miniloop = true;
                                        while (miniloop) {
                                            println("\nPlease specify what the tenant is, if you are not sure, you can view the table:");
                                            println("Do you want to view the table? Type 'yes' or 'no' please:");
                                            stringEntry1 = scan.nextLine();
                                            bool = yesOrNo(stringEntry1);
                                            if (bool)
                                                selectTenant();
                                            println("Please select the tenantID:");
                                            stringEntry1 = scan.nextLine();


                                            bool = tenantIDchecker(stringEntry1);
                                            if(bool){
                                                println("The tenantID: " + stringEntry1 + ", exists.");
                                                println("Make sure this is the tenant record you want to delete." +
                                                        "\nIf you want to change the tenantID, type '2'");
                                                println("If you're sure you want to proceed, type '1'." +
                                                        "\nIf you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                            } else {
                                                println("The tenantID: " + stringEntry1 + ", does NOT exist.");
                                                println("Make sure to type in a valid tenantID, if you want to type in another tenantID, type '2'");
                                                println("If you want to abort type '0'");
                                                intEntry1 = scan.nextLine();
                                                switch(intEntry1){
                                                    case "2": {
                                                        break;
                                                    }
                                                    default:{
                                                        intEntry1 = "0";
                                                        break;
                                                    }
                                                }
                                            }
                                            /*
                                            println("The tenantID you typed in was: " + stringEntry1 + ". If this is correct, type '1'.");
                                            println("Make sure this is a valid tenantID, if you want to retype the tenantID, type '2'");
                                            println("Or if you want to abort type '0'");
                                            intEntry1 = scan.nextInt();
                                            scan.nextLine();
                                            */
                                            switch (intEntry1) {
                                                case "0": {
                                                    println("Alright, you'll be taken back to the table selection menu");
                                                    miniloop = false;
                                                    break;
                                                }
                                                case "1": {
                                                    println("Time to delete the record with tenantID = " + stringEntry1 + " from the tenant table\n\n");
                                                    miniloop = false;
                                                    delete(table, stringEntry2, stringEntry1);
                                                    println("What do you want to do next?\n");
                                                    loop = false;
                                                    break;
                                                }
                                                default: {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                default:{
                                    println("I'm sorry, I didn't understand which option you chose. Please try again.\n");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case "3": {
                        println("Alright, let's update a record in a table!\"");
                        loop = true;
                        while (loop) {
                            println("In which table do you want to update a record?");
                            println("1. Owner" +
                                    "\n2. Manager" +
                                    "\n3. Complex" +
                                    "\n4. Apartment" +
                                    "\n5. Lease" +
                                    "\n6. Tenant");
                            println("If you want to change interaction option and do something else, please type 0");
                            println("Please type the number corresponding to the option you want to choose: ");
                            reply2 = scan.nextLine();
                            println("\nYou chose option " + reply2);
                            println();
                            switch (reply2) {
                                case "0": {
                                    loop = false;
                                    println("Sounds good, we will return to interaction options menu!");
                                    break;
                                }
                                case "1":{

                                    println("You chose the owner table");
                                    table = "owner";
                                    //stringEntry2 = "apartmentID";
                                    /* String table, String IDtype, String ID */
                                    miniloop = true;
                                    while (miniloop) {
                                        println("\nPlease let me know which record you want to update.");
                                        println("You will have to type in the ownerID of that record.");
                                        println("Do you want to view the table?");
                                        answer = scan.nextLine();
                                        bool = yesOrNo(answer);
                                        if (bool)
                                            selectOwner();
                                        println("");
                                        smallerloop = true;
                                        println("Now, please type in the ownerID for the record you want to update:");
                                        stringEntry6 = scan.nextLine();
                                        while(smallerloop) {
                                            while(stringEntry6.equalsIgnoreCase(dummyIDOwner)){
                                                println("You can't update the dummy record, please choose another "+ table+ ":");
                                                stringEntry6 = scan.nextLine();
                                            }
                                            bool = ownerIDchecker(stringEntry6);
                                            if (bool) {
                                                println("The ownerID: " + stringEntry6 + ", exists.");
                                                println("Let's continue!");
                                                smallerloop = false;
                                            } else {
                                                println("The ownerID: " + stringEntry6 + ", does NOT exist.");
                                                println("Make sure to type in a valid ownerID:");
                                                println("Do you want to view the table perhaps?");
                                                answer = scan.nextLine();
                                                bool = yesOrNo(answer);
                                                if (bool)
                                                    selectOwner();
                                                println("Please type in the ownerID of the record you want to update:");
                                                stringEntry6 = scan.nextLine();

                                            }
                                        }
                                        //println(apartmentFields+ "\n");
                                        //apartmentID, apartmentNo, floor, section, furnished, complexID and managerID
                                        smallerloop = true;
                                        while(smallerloop) {
                                            println("Please select the field you want to update, or type 0 to return to table selection:");
                                            println("1. ownerID" +
                                                    "\n2. first_nameowner" +
                                                    "\n3. last_nameowner");
                                            println("Please type the number corresponding to the option you want to choose: ");
                                            answer = scan.nextLine();
                                            boolean atm;
                                            switch (answer) {
                                                case "1": {
                                                    println("You chose to update the ownerID");
                                                    atm = true;
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        bool = true;
                                                        while (bool) {
                                                            if (stringEntry2.length() != 4) {
                                                                println("The entry must be a string with 4 characters.");
                                                                println("Please enter the new ownerID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else if (ownerIDchecker(stringEntry2)) {
                                                                println("There already exists an owner with this ID.");
                                                                println("Please enter a new ownerID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else {
                                                                bool = false;
                                                            }
                                                        }
                                                        bool = true;

                                                        println("Are you sure you want to update the ownerID to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change ownerID " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                box previous = checkOwner(stringEntry6);
                                                                insertOwner(stringEntry2, previous.arr[1], previous.arr[2]);
                                                                /* APARTMENTBOX.arr[0] = (rs.getString("apartmentID"));
                                                        APARTMENTBOX.inter1 = (rs.getInt("apartmentNo"));
                                                        APARTMENTBOX.inter2 = (rs.getInt("floor"));
                                                        APARTMENTBOX.arr[1] = (rs.getString("section"));
                                                        APARTMENTBOX.arr[2] = (rs.getString("furnished"));
                                                        APARTMENTBOX.arr[3] = (rs.getString("complexID"));
                                                        APARTMENTBOX.arr[4] = (rs.getString("managerID"));
                                                        */
                                                                box updates = selectForeignkeyOwner(stringEntry6);
                                                                counter = 0;
                                                                while (counter < updates.amount) {
                                                                    System.out.println(updates.arr[counter]);
                                                                    update("complex", "complexID", updates.arr[counter], "ownerID", stringEntry2);
                                                                    counter++;
                                                                }
                                                                silentDelete("owner", "ownerID", stringEntry6);
                                                                atm = false;
                                                                println(" Going back to field selection.\n");
                                                                stringEntry6 = stringEntry2;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, lets type in a different ownerID");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("Sorry, I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    /*
                                                smallerloop = true;
                                                while(smallerloop) {
                                                    stringEntry1 = "the main identifier to the " + table +" table";
                                                    println("You chose to update the apartmentID");
                                                    println("\nAnd now, what do you want to update it to?");
                                                    stringEntry3 = scan.nextLine();
                                                    println("You want to update the apartmentID to " + stringEntry3 + "?");
                                                    println("Type '1' to confirm the update.");
                                                    println("Type '2' to change the update inputs.");
                                                    println("Or type 0 to abort and return to field selection.");
                                                    reply = scan.nextInt();
                                                    scan.nextLine();
                                                    switch(reply){
                                                        case 1:{
                                                            box thing = checkApartment(stringEntry6);
                                                            insertApartment(stringEntry3,thing.inter1,thing.inter1,thing.arr[1],thing.arr[2],thing.arr[3],thing.arr[4]);
                                                            box chest = selectForeignkeyOwner(stringEntry6);
                                                            intEntry3 = 0;
                                                            while(intEntry3 < chest.amount){
                                                                update("lease", "leaseNo", chest.arr[intEntry3], "apartmentID", stringEntry3);
                                                                intEntry3++;
                                                            }
                                                            silentDelete("apartment", "apartmentID", thing.arr[0]);
                                                            break;
                                                        }
                                                        case 2:{
                                                            break;
                                                        }
                                                        case 0:{
                                                            smallerloop = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                                 */
                                                } //ownerID                 done
                                                case "2": {
                                                    bool = true;
                                                    println("You chose to update the first name.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 20 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 20 and 1 characters");
                                                            println("Please enter the new first name:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the first name to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the first name " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "ownerID", stringEntry6, "first_nameowner", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another first name");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //first_nameowner         done
                                                case "3": {
                                                    bool = true;
                                                    println("You chose to update the last name.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 50 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 50 and 1 characters");
                                                            println("Please enter the new last name:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the last name to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the last name " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "ownerID", stringEntry6, "last_nameowner", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another last name");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //last_nameowner          done
                                                case "0": {
                                                    println("Alright, let's return to table selection");
                                                    smallerloop = false;
                                                    miniloop = false;
                                                    break;
                                                }
                                                default: {
                                                    println("I didn't catch that. Let's try again!\n");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } // owner table                done
                                case "2":{

                                    println("You chose the manager table");
                                    table = "manager";
                                    //stringEntry2 = "apartmentID";
                                    /* String table, String IDtype, String ID */
                                    miniloop = true;
                                    while (miniloop) {
                                        println("\nPlease let me know which record you want to update.");
                                        println("You will have to type in the managerID of that record.");
                                        println("Do you want to view the table?");
                                        answer = scan.nextLine();
                                        bool = yesOrNo(answer);
                                        if (bool)
                                            selectManager();
                                        println("");
                                        smallerloop = true;
                                        println("Now, please type in the managerID for the record you want to update:");
                                        stringEntry6 = scan.nextLine();
                                        while(smallerloop) {
                                            while(stringEntry6.equalsIgnoreCase(dummyIDManager)){
                                                println("You can't update the dummy record, please choose another "+ table+ ":");
                                                stringEntry6 = scan.nextLine();
                                            }
                                            bool = managerIDchecker(stringEntry6);
                                            if (bool) {
                                                println("The managerID: " + stringEntry6 + ", exists.");
                                                println("Let's continue!");
                                                smallerloop = false;
                                            } else {
                                                println("The managerID: " + stringEntry6 + ", does NOT exist.");
                                                println("Make sure to type in a valid managerID:");
                                                println("Do you want to view the table perhaps?");
                                                answer = scan.nextLine();
                                                bool = yesOrNo(answer);
                                                if (bool)
                                                    selectManager();
                                                println("Please type in the managerID of the record you want to update:");
                                                stringEntry6 = scan.nextLine();

                                            }
                                        }
                                        //println(apartmentFields+ "\n");
                                        //apartmentID, apartmentNo, floor, section, furnished, complexID and managerID
                                        smallerloop = true;
                                        while(smallerloop) {
                                            println("Please select the field you want to update, or type 0 to return to table selection:");
                                            println("1. "+table+"ID" +
                                                    "\n2. first_name"+table +
                                                    "\n3. last_name" +table);
                                            println("Please type the number corresponding to the option you want to choose: ");
                                            answer = scan.nextLine();
                                            boolean atm;
                                            switch (answer) {
                                                case "1": {
                                                    println("You chose to update the " + table +"ID");
                                                    atm = true;
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        bool = true;
                                                        while (bool) {
                                                            if (stringEntry2.length() != 6) {
                                                                println("The entry must be a string with 6 characters.");
                                                                println("Please enter the new managerID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else if (managerIDchecker(stringEntry2)) {
                                                                println("There already exists an manager with this ID.");
                                                                println("Please enter a new managerID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else {
                                                                bool = false;
                                                            }
                                                        }
                                                        bool = true;

                                                        println("Are you sure you want to update the managerID to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change managerID " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                box previous = checkManager(stringEntry6);
                                                                insertManager(stringEntry2, previous.arr[1], previous.arr[2]);
                                                                /* APARTMENTBOX.arr[0] = (rs.getString("apartmentID"));
                                                        APARTMENTBOX.inter1 = (rs.getInt("apartmentNo"));
                                                        APARTMENTBOX.inter2 = (rs.getInt("floor"));
                                                        APARTMENTBOX.arr[1] = (rs.getString("section"));
                                                        APARTMENTBOX.arr[2] = (rs.getString("furnished"));
                                                        APARTMENTBOX.arr[3] = (rs.getString("complexID"));
                                                        APARTMENTBOX.arr[4] = (rs.getString("managerID"));
                                                        */
                                                                box updates = selectForeignkeyManager(stringEntry6);
                                                                counter = 0;
                                                                while (counter < updates.amount) {
                                                                    System.out.println(updates.arr[counter]);
                                                                    update("apartment", "apartmentID", updates.arr[counter], "managerID", stringEntry2);
                                                                    counter++;
                                                                }
                                                                silentDelete("manager", "managerID", stringEntry6);
                                                                atm = false;
                                                                println(" Going back to field selection.\n");
                                                                stringEntry6 = stringEntry2;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, lets type in a different managerID");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("Sorry, I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    /*
                                                smallerloop = true;
                                                while(smallerloop) {
                                                    stringEntry1 = "the main identifier to the " + table +" table";
                                                    println("You chose to update the apartmentID");
                                                    println("\nAnd now, what do you want to update it to?");
                                                    stringEntry3 = scan.nextLine();
                                                    println("You want to update the apartmentID to " + stringEntry3 + "?");
                                                    println("Type '1' to confirm the update.");
                                                    println("Type '2' to change the update inputs.");
                                                    println("Or type 0 to abort and return to field selection.");
                                                    reply = scan.nextInt();
                                                    scan.nextLine();
                                                    switch(reply){
                                                        case 1:{
                                                            box thing = checkApartment(stringEntry6);
                                                            insertApartment(stringEntry3,thing.inter1,thing.inter1,thing.arr[1],thing.arr[2],thing.arr[3],thing.arr[4]);
                                                            box chest = selectForeignkeyOwner(stringEntry6);
                                                            intEntry3 = 0;
                                                            while(intEntry3 < chest.amount){
                                                                update("lease", "leaseNo", chest.arr[intEntry3], "apartmentID", stringEntry3);
                                                                intEntry3++;
                                                            }
                                                            silentDelete("apartment", "apartmentID", thing.arr[0]);
                                                            break;
                                                        }
                                                        case 2:{
                                                            break;
                                                        }
                                                        case 0:{
                                                            smallerloop = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                                 */
                                                } //managerID                 done
                                                case "2": {
                                                    bool = true;
                                                    println("You chose to update the first name.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 20 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 20 and 1 characters");
                                                            println("Please enter the new first name:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the first name to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the first name " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "managerID", stringEntry6, "first_namemanager", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another first name");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //first_namemanager         done
                                                case "3": {
                                                    bool = true;
                                                    println("You chose to update the last name.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 50 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 50 and 1 characters");
                                                            println("Please enter the new last name:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the last name to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the last name " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "managerID", stringEntry6, "last_namemanager", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another last name");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //last_namemanager          done
                                                case "0": {
                                                    println("Alright, let's return to table selection");
                                                    smallerloop = false;
                                                    miniloop = false;
                                                    break;
                                                }
                                                default: {
                                                    println("I didn't catch that. Let's try again!\n");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } // manager table              done
                                case "3":{
                                    println("You chose the complex table");
                                    table = "complex";
                                    //stringEntry2 = "apartmentID";
                                    /* String table, String IDtype, String ID */
                                    miniloop = true;
                                    while (miniloop) {
                                        println("\nPlease let me know which record you want to update.");
                                        println("You will have to type in the complexID of that record.");
                                        println("Do you want to view the table?");
                                        answer = scan.nextLine();
                                        bool = yesOrNo(answer);
                                        if (bool)
                                            selectComplex();
                                        println("");
                                        smallerloop = true;
                                        println("Now, please type in the complexID for the record you want to update:");
                                        stringEntry6 = scan.nextLine();
                                        while(smallerloop) {
                                            while(stringEntry6.equalsIgnoreCase(dummyIDComplex)){
                                                println("You can't update the dummy record, please choose another "+ table+ ":");
                                                stringEntry6 = scan.nextLine();
                                            }
                                            bool = complexIDchecker(stringEntry6);
                                            if (bool) {
                                                println("The complexID: " + stringEntry6 + ", exists.");
                                                println("Let's continue!");
                                                smallerloop = false;
                                            } else {
                                                println("The complexID: " + stringEntry6 + ", does NOT exist.");
                                                println("Make sure to type in a valid complexID:");
                                                println("Do you want to view the table perhaps?");
                                                answer = scan.nextLine();
                                                bool = yesOrNo(answer);
                                                if (bool)
                                                    selectComplex();
                                                println("Please type in the complexID of the record you want to update:");
                                                stringEntry6 = scan.nextLine();

                                            }
                                        }
                                        //println(apartmentFields+ "\n");
                                        //apartmentID, apartmentNo, floor, section, furnished, complexID and managerID
                                        smallerloop = true;
                                        while(smallerloop) {
                                            println("Please select the field you want to update, or type 0 to return to table selection:");
                                            println("1. complexID" +
                                                    "\n2. complexName" +
                                                    "\n3. complexServices" +
                                                    "\n4. address" +
                                                    "\n5. city" +
                                                    "\n6. ownerID");
                                            println("Please type the number corresponding to the option you want to choose: ");
                                            answer = scan.nextLine();
                                            boolean atm;

                                            switch (answer) {
                                                case "1": {
                                                    println("You chose to update the complexID");
                                                    atm = true;
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        bool = true;
                                                        while (bool) {
                                                            if (stringEntry2.length() != 4) {
                                                                println("The entry must be a string with 4 characters.");
                                                                println("Please enter the new complexID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else if (complexIDchecker(stringEntry2)) {
                                                                println("There already exists an complex with this ID.");
                                                                println("Please enter a new complexID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else {
                                                                bool = false;
                                                            }
                                                        }
                                                        bool = true;

                                                        println("Are you sure you want to update the complexID to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change complexID " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                box previous = checkComplex(stringEntry6);
                                                                insertComplex(stringEntry2, previous.arr[1], previous.arr[2], previous.arr[3], previous.arr[4],  previous.arr[5]);
                                                                /* APARTMENTBOX.arr[0] = (rs.getString("apartmentID"));
                                                        APARTMENTBOX.inter1 = (rs.getInt("apartmentNo"));
                                                        APARTMENTBOX.inter2 = (rs.getInt("floor"));
                                                        APARTMENTBOX.arr[1] = (rs.getString("section"));
                                                        APARTMENTBOX.arr[2] = (rs.getString("furnished"));
                                                        APARTMENTBOX.arr[3] = (rs.getString("complexID"));
                                                        APARTMENTBOX.arr[4] = (rs.getString("managerID"));
                                                        */
                                                                box updates = selectForeignkeyComplex(stringEntry6);
                                                                counter = 0;
                                                                while (counter < updates.amount) {
                                                                    System.out.println(updates.arr[counter]);
                                                                    update("apartment", "apartmentID", updates.arr[counter], "complexID", stringEntry2);
                                                                    counter++;
                                                                }
                                                                silentDelete("complex", "complexID", stringEntry6);
                                                                atm = false;
                                                                println(" Going back to field selection.\n");
                                                                stringEntry6 = stringEntry2;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, lets type in a different complexID");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("Sorry, I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    /*
                                                smallerloop = true;
                                                while(smallerloop) {
                                                    stringEntry1 = "the main identifier to the " + table +" table";
                                                    println("You chose to update the apartmentID");
                                                    println("\nAnd now, what do you want to update it to?");
                                                    stringEntry3 = scan.nextLine();
                                                    println("You want to update the apartmentID to " + stringEntry3 + "?");
                                                    println("Type '1' to confirm the update.");
                                                    println("Type '2' to change the update inputs.");
                                                    println("Or type 0 to abort and return to field selection.");
                                                    reply = scan.nextInt();
                                                    scan.nextLine();
                                                    switch(reply){
                                                        case 1:{
                                                            box thing = checkApartment(stringEntry6);
                                                            insertApartment(stringEntry3,thing.inter1,thing.inter1,thing.arr[1],thing.arr[2],thing.arr[3],thing.arr[4]);
                                                            box chest = selectForeignkeyOwner(stringEntry6);
                                                            intEntry3 = 0;
                                                            while(intEntry3 < chest.amount){
                                                                update("lease", "leaseNo", chest.arr[intEntry3], "apartmentID", stringEntry3);
                                                                intEntry3++;
                                                            }
                                                            silentDelete("apartment", "apartmentID", thing.arr[0]);
                                                            break;
                                                        }
                                                        case 2:{
                                                            break;
                                                        }
                                                        case 0:{
                                                            smallerloop = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                                 */
                                                } //complexID           done
                                                case "2": {
                                                    bool = true;
                                                    println("You chose to update the complexName.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 25 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 25 and 1 characters");
                                                            println("Please enter the new complexName:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the complexName to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the complexName " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "complexID", stringEntry6, "complexName", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another complexName");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //complexName         done
                                                case "3": {
                                                    bool = true;
                                                    println("You chose to update the complexServices.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 215 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 215 and 1 characters");
                                                            println("Please enter the new complexServices:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the complexServices to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the complexServices " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "complexID", stringEntry6, "complexServices", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another complexServices");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //complexServices     done
                                                case "4": {
                                                    bool = true;
                                                    println("You chose to update the address.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 25 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 25 and 1 characters");
                                                            println("Please enter the new address:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the address to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the address " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "complexID", stringEntry6, "address", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another address");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //address             done
                                                case "5": {
                                                    bool = true;
                                                    println("You chose to update the city.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 20 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 20 and 1 characters");
                                                            println("Please enter the new city:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the city to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the city " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "complexID", stringEntry6, "city", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another city");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //city                done
                                                case "6": {
                                                    temploop = true;
                                                    stringEntry2 = "";
                                                    println("You chose to update the ownerID.");
                                                    while(temploop) {
                                                        atm = true;
                                                        while (atm) {
                                                            println("Please not that you have to enter a valid ownerID, do you want to view the table?");
                                                            answer = scan.nextLine();
                                                            bool = yesOrNo(answer);
                                                            if (bool)
                                                                selectOwner();
                                                            println("What do you want to update it to?");
                                                            stringEntry2 = scan.nextLine();
                                                            while (stringEntry2.length() != 4) {
                                                                println("The entry must be 4 character");
                                                                println("Please enter the new ownerID:");
                                                                stringEntry2 = scan.nextLine();
                                                            }
                                                            bool = ownerIDchecker(stringEntry2);
                                                            if (!bool) {
                                                                println("The ownerID you entered does not exist.");
                                                                println("Please enter one that exists");
                                                            } else {
                                                                println("The ownerID exists.");
                                                                atm = false;
                                                            }
                                                        }

                                                        println("Are you sure you want to update the ownerID to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change ownerID " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "complexID", stringEntry6, "ownerID", stringEntry2);
                                                                temploop = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, let's type in a different managerID");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                temploop = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //ownerID             done
                                                case "0": {
                                                    println("Alright, let's return to table selection");
                                                    smallerloop = false;
                                                    miniloop = false;
                                                    break;
                                                }
                                                default: {
                                                    println("I didn't catch that. Let's try again!\n");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } // complex table              done
                                case "4":{
                                    println("You chose the apartment table");
                                    table = "apartment";
                                    //stringEntry2 = "apartmentID";
                                    /* String table, String IDtype, String ID */
                                    miniloop = true;
                                    while (miniloop) {
                                        println("\nPlease let me know which record you want to update.");
                                        println("You will have to type in the apartmentID of that record.");
                                        println("Do you want to view the table?");
                                        answer = scan.nextLine();
                                        bool = yesOrNo(answer);
                                        if (bool)
                                            selectApartment();
                                        println("");


                                        smallerloop = true;
                                        println("Now, please type in the apartmentID for the record you want to update:");
                                        stringEntry6 = scan.nextLine();
                                        while(smallerloop) {
                                            while(stringEntry6.equalsIgnoreCase(dummyIDApartment)){
                                                println("You can't update the dummy record, please choose another "+ table+ ":");
                                                stringEntry6 = scan.nextLine();
                                            }
                                            bool = apartmentIDchecker(stringEntry6);
                                            if (bool) {
                                                println("The apartmentID: " + stringEntry6 + ", exists.");
                                                println("Let's continue!");
                                                smallerloop = false;
                                            } else {
                                                println("The apartmentID: " + stringEntry6 + ", does NOT exist.");
                                                println("Make sure to type in a valid apartmentID:");
                                                println("Do you want to view the table perhaps?");
                                                answer = scan.nextLine();
                                                bool = yesOrNo(answer);
                                                if (bool)
                                                    selectApartment();
                                                println("Please type in the apartmentID of the record you want to update:");
                                                stringEntry6 = scan.nextLine();

                                            }
                                        }
                                        //println(apartmentFields+ "\n");
                                        //apartmentID, apartmentNo, floor, section, furnished, complexID and managerID
                                        smallerloop = true;
                                        while(smallerloop) {
                                            println("Please select the field you want to update, or type 0 to return to table selection:");
                                            println("1. apartmentID" +
                                                    "\n2. apartmentNo" +
                                                    "\n3. floor" +
                                                    "\n4. section" +
                                                    "\n5. furnished" +
                                                    "\n6. complexID" +
                                                    "\n7. managerID");
                                            println("Please type the number corresponding to the option you want to choose: ");
                                            reply = scan.nextLine();
                                            boolean atm;

                                            switch (reply) {
                                                case "1": {
                                                    println("You chose to update the apartmentID");
                                                    atm = true;
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        bool = true;
                                                        while (bool) {
                                                            if (stringEntry2.length() != 6) {
                                                                println("The entry must be a string with 6 characters.");
                                                                println("Please enter the new apartmentID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else if (apartmentIDchecker(stringEntry2)) {
                                                                println("There already exists an apartment with this ID.");
                                                                println("Please enter a new apartmentID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else {
                                                                bool = false;
                                                            }
                                                        }
                                                        bool = true;

                                                        println("Are you sure you want to update the apartmentID to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change apartmentID " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                box previous = checkApartment(stringEntry6);
                                                                insertApartment(stringEntry2, previous.inter1, previous.inter2, previous.arr[1], previous.arr[2], previous.arr[3], previous.arr[4]);
                                                                /* APARTMENTBOX.arr[0] = (rs.getString("apartmentID"));
                                                        APARTMENTBOX.inter1 = (rs.getInt("apartmentNo"));
                                                        APARTMENTBOX.inter2 = (rs.getInt("floor"));
                                                        APARTMENTBOX.arr[1] = (rs.getString("section"));
                                                        APARTMENTBOX.arr[2] = (rs.getString("furnished"));
                                                        APARTMENTBOX.arr[3] = (rs.getString("complexID"));
                                                        APARTMENTBOX.arr[4] = (rs.getString("managerID"));
                                                        */
                                                                box updates = selectForeignkeyApartment(stringEntry6);
                                                                counter = 0;
                                                                while (counter < updates.amount) {
                                                                    System.out.println(updates.arr[counter]);
                                                                    update("lease", "leaseNo", updates.arr[counter], "apartmentID", stringEntry2);
                                                                    counter++;
                                                                }
                                                                silentDelete("apartment", "apartmentID", stringEntry6);

                                                                //update(table,"apartmentID",stringEntry6,"apartmentNo",String.valueOf(intEntry2));
                                                                atm = false;
                                                                //smallerloop = false;
                                                                //miniloop = false;
                                                                //loop = false;
                                                                println(" Going back to field selection.\n");
                                                                stringEntry6 = stringEntry2;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, lets type in a different apartmentID");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("Sorry, I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    /*
                                                smallerloop = true;
                                                while(smallerloop) {
                                                    stringEntry1 = "the main identifier to the " + table +" table";
                                                    println("You chose to update the apartmentID");
                                                    println("\nAnd now, what do you want to update it to?");
                                                    stringEntry3 = scan.nextLine();
                                                    println("You want to update the apartmentID to " + stringEntry3 + "?");
                                                    println("Type '1' to confirm the update.");
                                                    println("Type '2' to change the update inputs.");
                                                    println("Or type 0 to abort and return to field selection.");
                                                    reply = scan.nextInt();
                                                    scan.nextLine();
                                                    switch(reply){
                                                        case 1:{
                                                            box thing = checkApartment(stringEntry6);
                                                            insertApartment(stringEntry3,thing.inter1,thing.inter1,thing.arr[1],thing.arr[2],thing.arr[3],thing.arr[4]);
                                                            box chest = selectForeignkeyOwner(stringEntry6);
                                                            intEntry3 = 0;
                                                            while(intEntry3 < chest.amount){
                                                                update("lease", "leaseNo", chest.arr[intEntry3], "apartmentID", stringEntry3);
                                                                intEntry3++;
                                                            }
                                                            silentDelete("apartment", "apartmentID", thing.arr[0]);
                                                            break;
                                                        }
                                                        case 2:{
                                                            break;
                                                        }
                                                        case 0:{
                                                            smallerloop = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                                 */
                                                } //apartmentID done
                                                case "2": {
                                                    bool = true;
                                                    println("You chose to update the apartmentNo.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        intEntry2 = scan.nextLine();
                                                        while (intEntry2.length() > 2 || intEntry2.length() < 1) {
                                                            println("The entry must be an integer between 0 and 40");
                                                            println("Please enter the new apartmentNo:");
                                                            intEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the apartmentNo to " + intEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the apartmentNo " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "apartmentID", stringEntry6, "apartmentNo", String.valueOf(intEntry2));
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in antoher apartmentNo");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //apartmentNo done
                                                case "3": {
                                                    atm = true;
                                                    println("You chose to update the floor");
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        intEntry2 = scan.nextLine();
                                                        while (intEntry2.length() > 2 || intEntry2.length() < 1) {
                                                            println("The entry must be an integer between -5 and 25");
                                                            println("Please enter the new floor:");
                                                            intEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the floor to " + intEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the floor " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "apartmentID", stringEntry6, "floor", String.valueOf(intEntry2));
                                                                atm = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in a different floor.");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;

                                                } //floor done
                                                case "4": {
                                                    atm = true;
                                                    println("You chose to update the section");
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 5 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 1 and 5");
                                                            println("Please enter the new section:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the section to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the section " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "apartmentID", stringEntry6, "section", stringEntry2);
                                                                atm = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in a different section.");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;

                                                } //section done
                                                case "5": {
                                                    atm = true;
                                                    println("You chose to update the furnished state");
                                                    while(atm) {
                                                        bool = true;
                                                        stringEntry2 = "";
                                                        while(bool) {
                                                            println("What do you want to update it to?");
                                                            println("Type 1 for \"Yes\"");
                                                            println("Type 2 for \"No\"");
                                                            intEntry2 = scan.nextLine();
                                                            if(intEntry2.equalsIgnoreCase("1")){
                                                                stringEntry2 = "Yes";
                                                                bool = false;
                                                            } else if(intEntry2.equalsIgnoreCase("2")){
                                                                stringEntry2 = "No";
                                                                bool = false;
                                                            } else {
                                                                println("I didn't get that, please try again.\n");
                                                            }
                                                        }
                                                        println("Are you sure you want to update the section to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the furnished state" +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "apartmentID", stringEntry6, "furnished", stringEntry2);
                                                                atm = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another furnished state");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;

                                                } //furnished done
                                                case "6": {
                                                    temploop = true;
                                                    stringEntry2 = "";
                                                    println("You chose to update the complexID.");
                                                    while(temploop) {
                                                        atm = true;
                                                        while (atm) {
                                                            println("Please not that you have to enter a valid complexID, do you want to view the table?");
                                                            answer = scan.nextLine();
                                                            bool = yesOrNo(answer);
                                                            if (bool)
                                                                selectComplex();
                                                            println("What do you want to update it to?");
                                                            stringEntry2 = scan.nextLine();
                                                            while (stringEntry2.length() != 4) {
                                                                println("The entry must be 4 character");
                                                                println("Please enter the new complexID:");
                                                                stringEntry2 = scan.nextLine();
                                                            }
                                                            bool = complexIDchecker(stringEntry2);
                                                            if (!bool) {
                                                                println("The complexID you entered does not exist.");
                                                                println("Please enter one that exists");
                                                            } else {
                                                                println("The complexID exists.");
                                                                atm = false;
                                                            }
                                                        }

                                                        println("Are you sure you want to update the complexID to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change complexID " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "apartmentID", stringEntry6, "complexID", stringEntry2);
                                                                temploop = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, let's type in a different complexID");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                temploop = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //complexID done
                                                case "7": {
                                                    temploop = true;
                                                    stringEntry2 = "";
                                                    println("You chose to update the managerID.");
                                                    while(temploop) {
                                                        atm = true;
                                                        while (atm) {
                                                            println("Please not that you have to enter a valid managerID, do you want to view the table?");
                                                            answer = scan.nextLine();
                                                            bool = yesOrNo(answer);
                                                            if (bool)
                                                                selectManager();
                                                            println("What do you want to update it to?");
                                                            stringEntry2 = scan.nextLine();
                                                            while (stringEntry2.length() != 6) {
                                                                println("The entry must be 6 character");
                                                                println("Please enter the new managerID:");
                                                                stringEntry2 = scan.nextLine();
                                                            }
                                                            bool = managerIDchecker(stringEntry2);
                                                            if (!bool) {
                                                                println("The managerID you entered does not exist.");
                                                                println("Please enter one that exists");
                                                            } else {
                                                                println("The managerID exists.");
                                                                atm = false;
                                                            }
                                                        }

                                                        println("Are you sure you want to update the managerID to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change managerID " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "apartmentID", stringEntry6, "managerID", stringEntry2);
                                                                temploop = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, let's type in a different managerID");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                temploop = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //managerID done
                                                case "0": {
                                                    println("Alright, let's return to table selection");
                                                    smallerloop = false;
                                                    miniloop = false;
                                                    break;
                                                }
                                                default: {
                                                    println("I didn't catch that. Let's try again!\n");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } // apartment table            done
                                case "5":{
                                    println("You chose the lease table");
                                    table = "lease";
                                    /* String table, String IDtype, String ID */
                                    miniloop = true;
                                    while (miniloop) {
                                        println("\nPlease let me know which record you want to update.");
                                        println("You will have to type in the leaseNo of that record.");
                                        println("Do you want to view the table?");
                                        answer = scan.nextLine();
                                        bool = yesOrNo(answer);
                                        if (bool)
                                            selectLease();
                                        println("");
                                        smallerloop = true;
                                        println("Now, please type in the leaseNo for the record you want to update:");
                                        stringEntry6 = scan.nextLine();
                                        while(smallerloop) {
                                            while(stringEntry6.equalsIgnoreCase(dummyIDLease)){
                                                println("You can't update the dummy record, please choose another "+ table+ " record:");
                                                stringEntry6 = scan.nextLine();
                                            }
                                            bool = leaseIDchecker(stringEntry6);
                                            if (bool) {
                                                println("The leaseNo: " + stringEntry6 + ", exists.");
                                                println("Let's continue!");
                                                smallerloop = false;
                                            } else {
                                                println("The leaseNo: " + stringEntry6 + ", does NOT exist.");
                                                println("Make sure to type in a valid leaseNo:");
                                                println("Do you want to view the table perhaps?");
                                                answer = scan.nextLine();
                                                bool = yesOrNo(answer);
                                                if (bool)
                                                    selectLease();
                                                println("Please type in the leaseNo of the record you want to update:");
                                                stringEntry6 = scan.nextLine();

                                            }
                                        }
                                        //println(apartmentFields+ "\n");
                                        //apartmentID, apartmentNo, floor, section, furnished, complexID and managerID
                                        smallerloop = true;
                                        while(smallerloop) {
                                            println("Please select the field you want to update, or type 0 to return to table selection:");
                                            println("1. leaseNo" +
                                                    "\n2. contractDetails" +
                                                    "\n3. start_date" +
                                                    "\n4. end_date" +
                                                    "\n5. rentMonthly" +
                                                    "\n6. apartmentID");
                                            println("Please type the number corresponding to the option you want to choose: ");
                                            reply = scan.nextLine();
                                            boolean atm;

                                            switch (reply) {
                                                case "1": {
                                                    println("You chose to update the leaseNo");
                                                    atm = true;
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        bool = true;
                                                        while (bool) {
                                                            if (stringEntry2.length() != 6) {
                                                                println("The entry must be a string with 6 characters.");
                                                                println("Please enter the new leaseNo:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else if (leaseIDchecker(stringEntry2)) {
                                                                println("There already exists an lease with this No.");
                                                                println("Please enter a new leaseNo:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else {
                                                                bool = false;
                                                            }
                                                        }
                                                        println("Are you sure you want to update the leaseNo to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change leaseNo " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                box previous = checkLease(stringEntry6);
                                                                insertLease(stringEntry2,previous.arr[1],previous.arr[2],previous.arr[3],previous.inter1,previous.arr[4]);
                                                                /* APARTMENTBOX.arr[0] = (rs.getString("apartmentID"));
                                                        APARTMENTBOX.inter1 = (rs.getInt("apartmentNo"));
                                                        APARTMENTBOX.inter2 = (rs.getInt("floor"));
                                                        APARTMENTBOX.arr[1] = (rs.getString("section"));
                                                        APARTMENTBOX.arr[2] = (rs.getString("furnished"));
                                                        APARTMENTBOX.arr[3] = (rs.getString("complexID"));
                                                        APARTMENTBOX.arr[4] = (rs.getString("managerID"));
                                                        */
                                                                box updates = selectForeignkeyLease(stringEntry6);
                                                                counter = 0;
                                                                while (counter < updates.amount) {
                                                                    System.out.println(updates.arr[counter]);
                                                                    update("tenant", "tenantID", updates.arr[counter], "leaseNo", stringEntry2);
                                                                    counter++;
                                                                }
                                                                silentDelete("lease", "leaseNo", stringEntry6);
                                                                atm = false;
                                                                println(" Going back to field selection.\n");
                                                                stringEntry6 = stringEntry2;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, lets type in a different leaseNo");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("Sorry, I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    /*
                                                smallerloop = true;
                                                while(smallerloop) {
                                                    stringEntry1 = "the main identifier to the " + table +" table";
                                                    println("You chose to update the apartmentID");
                                                    println("\nAnd now, what do you want to update it to?");
                                                    stringEntry3 = scan.nextLine();
                                                    println("You want to update the apartmentID to " + stringEntry3 + "?");
                                                    println("Type '1' to confirm the update.");
                                                    println("Type '2' to change the update inputs.");
                                                    println("Or type 0 to abort and return to field selection.");
                                                    reply = scan.nextInt();
                                                    scan.nextLine();
                                                    switch(reply){
                                                        case 1:{
                                                            box thing = checkApartment(stringEntry6);
                                                            insertApartment(stringEntry3,thing.inter1,thing.inter1,thing.arr[1],thing.arr[2],thing.arr[3],thing.arr[4]);
                                                            box chest = selectForeignkeyOwner(stringEntry6);
                                                            intEntry3 = 0;
                                                            while(intEntry3 < chest.amount){
                                                                update("lease", "leaseNo", chest.arr[intEntry3], "apartmentID", stringEntry3);
                                                                intEntry3++;
                                                            }
                                                            silentDelete("apartment", "apartmentID", thing.arr[0]);
                                                            break;
                                                        }
                                                        case 2:{
                                                            break;
                                                        }
                                                        case 0:{
                                                            smallerloop = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                                 */
                                                } //leaseNo done
                                                case "2": {
                                                    atm = true;
                                                    println("You chose to update the contract details");
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 250 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 1 and 250 characters");
                                                            println("Please enter the new contractDetails:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the section to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change details " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "leaseNo", stringEntry6, "contractDetails", stringEntry2);
                                                                atm = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in some different details.");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //contractDetails done
                                                case "3": {
                                                    atm = true;
                                                    println("You chose to update the start_date");
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() != 10) {
                                                            println("The format must be: \"YYYY-MM-DD\"");
                                                            println("Please enter the new start_date:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the section to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change start_date " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "leaseNo", stringEntry6, "start_date", stringEntry2);
                                                                atm = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in a different start_date.");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;

                                                } //start_date done
                                                case "4": {
                                                    atm = true;
                                                    println("You chose to update the end_date");
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() != 10) {
                                                            println("The format must be: \"YYYY-MM-DD\"");
                                                            println("Please enter the new end_date:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the section to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change end_date " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "leaseNo", stringEntry6, "end_date", stringEntry2);
                                                                atm = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in a different end_date.");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;

                                                } //end_date done
                                                case "5": {
                                                    bool = true;
                                                    println("You chose to update the rentMonthly.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        intEntry2 = scan.nextLine();
                                                        while (intEntry2.length() > 5 || intEntry2.length() < 1) {
                                                            println("Sorry, try something between 99999 and 0");
                                                            println("Please enter the new monthly rent:");
                                                            intEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the monthly rent to " + intEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the monthly rent " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "leaseNo", stringEntry6, "rentMonthly", String.valueOf(intEntry2));
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another monthly rent");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //rentMonthly done
                                                case "6": {
                                                    temploop = true;
                                                    stringEntry2 = "";
                                                    println("You chose to update the apartmentID.");
                                                    while(temploop) {
                                                        atm = true;
                                                        while (atm) {
                                                            println("Please not that you have to enter a valid apartmentID, do you want to view the table?");
                                                            answer = scan.nextLine();
                                                            bool = yesOrNo(answer);
                                                            if (bool)
                                                                selectApartment();
                                                            println("What do you want to update it to?");
                                                            stringEntry2 = scan.nextLine();
                                                            while (stringEntry2.length() != 6) {
                                                                println("The entry must be 6 character");
                                                                println("Please enter the new apartmentID:");
                                                                stringEntry2 = scan.nextLine();
                                                            }
                                                            bool = apartmentIDchecker(stringEntry2);
                                                            if (!bool) {
                                                                println("The apartmentID you entered does not exist.");
                                                                println("Please enter one that exists");
                                                            } else {
                                                                println("The apartmentID exists.");
                                                                atm = false;
                                                            }
                                                        }

                                                        println("Are you sure you want to update the apartmentID to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change apartmentID " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "leaseNo", stringEntry6, "apartmentID", stringEntry2);
                                                                temploop = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, let's type in a different apartmentID");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                temploop = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //apartmentID done
                                                case "0": {
                                                    println("Alright, let's return to table selection");
                                                    smallerloop = false;
                                                    miniloop = false;
                                                    break;
                                                }
                                                default: {
                                                    println("I didn't catch that. Let's try again!\n");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } // lease table                done
                                case "6":{

                                    println("You chose the tenant table");
                                    table = "tenant";
                                    //stringEntry2 = "apartmentID";
                                    /* String table, String IDtype, String ID */
                                    miniloop = true;
                                    while (miniloop) {
                                        println("\nPlease let me know which record you want to update.");
                                        println("You will have to type in the tenantID of that record.");
                                        println("Do you want to view the table?");
                                        answer = scan.nextLine();
                                        bool = yesOrNo(answer);
                                        if (bool)
                                            selectTenant();
                                        println("");
                                        smallerloop = true;
                                        println("Now, please type in the tenantID for the record you want to update:");
                                        stringEntry6 = scan.nextLine();
                                        while(smallerloop) {
                                            bool = tenantIDchecker(stringEntry6);
                                            if (bool) {
                                                println("The tenantID: " + stringEntry6 + ", exists.");
                                                println("Let's continue!");
                                                smallerloop = false;
                                            } else {
                                                println("The tenantID: " + stringEntry6 + ", does NOT exist.");
                                                println("Make sure to type in a valid tenantID:");
                                                println("Do you want to view the table perhaps?");
                                                answer = scan.nextLine();
                                                bool = yesOrNo(answer);
                                                if (bool)
                                                    selectTenant();
                                                println("Please type in the tenantID of the record you want to update:");
                                                stringEntry6 = scan.nextLine();

                                            }
                                        }
                                        //println(apartmentFields+ "\n");
                                        //apartmentID, apartmentNo, floor, section, furnished, complexID and managerID
                                        smallerloop = true;
                                        while(smallerloop) {
                                            println("Please select the field you want to update, or type 0 to return to table selection:");
                                            println("1. "+table+"ID" +
                                                    "\n2. first_name"+table +
                                                    "\n3. last_name" +table +
                                                    "\n4. leaseNo");
                                            println("Please type the number corresponding to the option you want to choose: ");
                                            answer = scan.nextLine();
                                            boolean atm;
                                            switch (answer) {
                                                case "1": {
                                                    println("You chose to update the " + table +"ID");
                                                    atm = true;
                                                    while(atm) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        bool = true;
                                                        while (bool) {
                                                            if (stringEntry2.length() != 4) {
                                                                println("The entry must be a string with 4 characters.");
                                                                println("Please enter the new tenantID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else if (tenantIDchecker(stringEntry2)) {
                                                                println("There already exists an tenant with this ID.");
                                                                println("Please enter a new tenantID:");
                                                                stringEntry2 = scan.nextLine();
                                                            } else {
                                                                bool = false;
                                                            }
                                                        }
                                                        bool = true;

                                                        println("Are you sure you want to update the tenantID to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change tenantID " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!\n");
                                                                update("tenant", "tenantID", stringEntry6, "tenantID", stringEntry2);
                                                                atm = false;
                                                                println("\nGoing back to field selection.\n");
                                                                stringEntry6 = stringEntry2;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, lets type in a different tenantID");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                atm = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("Sorry, I didn't quite get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    /*
                                                smallerloop = true;
                                                while(smallerloop) {
                                                    stringEntry1 = "the main identifier to the " + table +" table";
                                                    println("You chose to update the apartmentID");
                                                    println("\nAnd now, what do you want to update it to?");
                                                    stringEntry3 = scan.nextLine();
                                                    println("You want to update the apartmentID to " + stringEntry3 + "?");
                                                    println("Type '1' to confirm the update.");
                                                    println("Type '2' to change the update inputs.");
                                                    println("Or type 0 to abort and return to field selection.");
                                                    reply = scan.nextInt();
                                                    scan.nextLine();
                                                    switch(reply){
                                                        case 1:{
                                                            box thing = checkApartment(stringEntry6);
                                                            insertApartment(stringEntry3,thing.inter1,thing.inter1,thing.arr[1],thing.arr[2],thing.arr[3],thing.arr[4]);
                                                            box chest = selectForeignkeyOwner(stringEntry6);
                                                            intEntry3 = 0;
                                                            while(intEntry3 < chest.amount){
                                                                update("lease", "leaseNo", chest.arr[intEntry3], "apartmentID", stringEntry3);
                                                                intEntry3++;
                                                            }
                                                            silentDelete("apartment", "apartmentID", thing.arr[0]);
                                                            break;
                                                        }
                                                        case 2:{
                                                            break;
                                                        }
                                                        case 0:{
                                                            smallerloop = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                                 */
                                                } //tenantID                 done
                                                case "2": {
                                                    bool = true;
                                                    println("You chose to update the first name.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 20 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 20 and 1 characters");
                                                            println("Please enter the new first name:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the first name to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the first name " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "tenantID", stringEntry6, "first_nametenant", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another first name");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //first_nametenant
                                                case "3": {
                                                    bool = true;
                                                    println("You chose to update the last name.");
                                                    while(bool) {
                                                        println("What do you want to update it to?");
                                                        stringEntry2 = scan.nextLine();
                                                        while (stringEntry2.length() > 50 || stringEntry2.length() < 1) {
                                                            println("The entry must be between 50 and 1 characters");
                                                            println("Please enter the new last name:");
                                                            stringEntry2 = scan.nextLine();
                                                        }
                                                        println("Are you sure you want to update the last name to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change the last name " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "tenantID", stringEntry6, "last_nametenant", stringEntry2);
                                                                bool = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Uki, let's type in another last name");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                bool = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try it again:");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //last_nametenant
                                                case "4": {
                                                    temploop = true;
                                                    stringEntry2 = "";
                                                    println("You chose to update the leaseNo.");
                                                    while(temploop) {
                                                        atm = true;
                                                        while (atm) {
                                                            println("Please not that you have to enter a valid leaseNo, do you want to view the table?");
                                                            answer = scan.nextLine();
                                                            bool = yesOrNo(answer);
                                                            if (bool)
                                                                selectLease();
                                                            println("What do you want to update it to?");
                                                            stringEntry2 = scan.nextLine();
                                                            while (stringEntry2.length() != 6) {
                                                                println("The entry must be 6 character");
                                                                println("Please enter the new leaseNo:");
                                                                stringEntry2 = scan.nextLine();
                                                            }
                                                            bool = leaseIDchecker(stringEntry2);
                                                            if (!bool) {
                                                                println("The leaseNo you entered does not exist.");
                                                                println("Please enter one that exists");
                                                            } else {
                                                                println("The leaseNo exists.");
                                                                atm = false;
                                                            }
                                                        }

                                                        println("Are you sure you want to update the leaseNo to " + stringEntry2 + "?");
                                                        println("Please type '1' to confirm, '2' to change leaseNo " +
                                                                "or '0' to abort and return to field selection");
                                                        reply = scan.nextLine();
                                                        switch (reply) {
                                                            case "1": {
                                                                println("Alright, let's proceed to update the table!");
                                                                update(table, "tenantID", stringEntry6, "leaseNo", stringEntry2);
                                                                temploop = false;
                                                                break;
                                                            }
                                                            case "2": {
                                                                println("Alright, let's type in a different leaseNo");
                                                                break;
                                                            }
                                                            case "0": {
                                                                println("Sounds good, we will return to the field selection menu");
                                                                temploop = false;
                                                                break;
                                                            }
                                                            default: {
                                                                println("I didn't get that, let's try again.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } //leaseNo
                                                case "0": {
                                                    println("Alright, let's return to table selection");
                                                    smallerloop = false;
                                                    miniloop = false;
                                                    break;
                                                }
                                                default: {
                                                    println("I didn't catch that. Let's try again!\n");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } // tenant table
                                default:{
                                    println("I'm sorry, I didn't understand which option you chose. Please try again.\n");
                                    //println("Please type in the number corresponding to the table in which you want to perform and update.");
                                    break;
                                }
                            }
                            if(!loop)
                                println("\nWhat do you want to do next?");
                        }//while(loop)
                        break;
                    }
                    case "4": {
                        println("Alright, let's run a query!");
                        loop = true;
                        while (loop) {
                            println("Which query do you want to run?");
                            println("1. getApartment()\n" +
                                    "2. whoLivesIn()\n" +
                                    "3. countApartments()\n" +
                                    "4. earnings()\n" +
                                    "5. cheapest()\n" +
                                    "6. mostExpensive()\n" +
                                    "7. Info on what the queries do.");
                            println("If you want to change interaction option and do something else, please type 0");
                            println("Please type the number corresponding to the option you want to choose: ");
                            reply2 = scan.nextLine();
                            println("\nYou chose option " + reply2);
                            println();
                            switch (reply2) {
                                case "0": {
                                    loop = false;
                                    println("Sounds good, we will return to interaction options menu!\n\n");
                                    break;
                                }
                                case "1": {
                                    println("You chose the getApartment(name) query.");
                                    println("\nPlease type in the first name of the tenant.");
                                        stringEntry1 = scan.nextLine();
                                        while (stringEntry1.length() > 20) {
                                            println("The name cannot exceed 20 characters.");
                                            println("Please type in a name: ");
                                            stringEntry1 = scan.nextLine();
                                        }
                                        if(!getApartment(stringEntry1))
                                            println("The query didn't output anything, no tenant with the name " +
                                                    stringEntry1 + " exists");
                                        println("\n");
                                    break;
                                }       //getApartment()            done
                                case "2": {
                                    println("You chose the whoLivesIn(city) query.");
                                        println("\nPlease type in the name of the city.");
                                        stringEntry1 = scan.nextLine();
                                        while (stringEntry1.length() > 20) {
                                            println("The name cannot exceed 20 characters.");
                                            println("Please type in a city: ");
                                            stringEntry1 = scan.nextLine();
                                        }
                                        if(!whoLivesIn(stringEntry1))
                                            println("The query didn't output anything, no city with the name " +
                                                    stringEntry1 + " exists");
                                        println("\n");
                                    break;
                                }       //whoLivesIn                done
                                case "3": {
                                    println("You chose the countApartments() query.");
                                    println("\nPlease type in the name of the city.");
                                        stringEntry1 = scan.nextLine();
                                        while (stringEntry1.length() > 20) {
                                            println("The name cannot exceed 20 characters.");
                                            println("Please type in a city: ");
                                            stringEntry1 = scan.nextLine();
                                        }
                                        if(!countApartments(stringEntry1))
                                            println("\nThe query didn't output anything, no city with the name " +
                                                    stringEntry1 + " exists");
                                        println("\n");
                                    break;
                                }       //countApartments()         done
                                case "4": {
                                    println("You chose the earnings() query.");
                                        earnings();
                                        println("\n");
                                    break;
                                }       //earnings()                done
                                case "5": {
                                    println("You chose the cheapest() query.");
                                        System.out.println("The cheapest apartment is:\n");
                                        cheapest();
                                        println("\n");
                                    break;
                                }       //cheapest()                done
                                case "6": {
                                    println("You chose the mostExpensive() query.");
                                        System.out.println("The most expensive apartment is:\n");
                                        mostExpensive();
                                        println("\n");
                                    break;
                                }       //mostExpensive()           done
                                case "7": {
                                    println("The getApartment() query");
                                    println("This query needs an input, first_nametenant, and it returns the apartmentID," +
                                            " apartmentNo and floor of the apartment that tenant lives in.\n");
                                    println("The whoLivesIn() query.");
                                    println("This query needs an input, city, and it returns " +
                                            "all the names of the people who lives there\n");
                                    println("The countApartments() query.");
                                    println("This query counts the apartments in every city, and it returns" +
                                            "all the cities and number of apartments there\n");
                                    println("The earnings() query.");
                                    println("This query counts all the monthly earnings of every owner, and prints the owner," +
                                            " and their monthly earnings." +
                                            "\n(Naturally, the owners pay the managing firm, so these are not net earnings.)\n");
                                    println("The cheapest() query.");
                                    println("This query prints the apartment info for the cheapest apartment.\n");
                                    println("The mostExpensive() query.");
                                    println("This query prints the apartment info for the most expensive apartment\n");
                                    break;
                                }
                                default: {
                                    println("I'm sorry, I didn't understand which option you chose. Please try again.\n");
                                    break;
                                }
                            }

                        }
                        break;
                    }
                    case "5": {
                        println("Alright, let's view some tables!");
                        loop = true;
                        while (loop) {
                            println("Which table do you want to run?");
                            println("1. Owner\n" +
                                    "2. Manager\n" +
                                    "3. Complex\n" +
                                    "4. Apartment\n" +
                                    "5. Lease\n" +
                                    "6. Tenant");
                            println("If you want to change interaction option and do something else, please type 0");
                            println("Please type the number corresponding to the option you want to choose: ");
                            reply2 = scan.nextLine();
                            println("\nYou chose option " + reply2);
                            println();
                            switch (reply2) {
                                case "0": {
                                    loop = false;
                                    println("Sounds good, we will return to interaction options menu!\n\n");
                                    break;
                                }
                                case "1": {
                                    println("You chose the Owner table.\n");
                                    selectOwner();
                                    print("");
                                    break;
                                }       //Owner         done
                                case "2": {
                                    println("You chose the Manager table.\n");
                                    selectManager();
                                    print("");
                                    break;
                                    }       //Manager       done
                                case "3": {
                                    println("You chose the Complex table.\n");
                                    fullSelectComplex();
                                    print("");
                                    break;
                                }       //Complex       done
                                case "4": {
                                    println("You chose the Apartment table.\n");
                                    selectApartment();
                                    print("");
                                    break;

                                }       //Apartment     done
                                case "5": {
                                    println("You chose the Lease table.\n");
                                    fullSelectLease();
                                    print("");
                                    break;
                                }       //Lease         done
                                case "6": {
                                    println("You chose the Tenant table.\n");
                                    selectTenant();
                                    print("");
                                    break;
                                }       //Tenant        done
                                default: {
                                    println("I'm sorry, I didn't understand which option you chose. Please try again.\n");
                                    break;
                                }
                            }

                        }
                        break;
                    }
                    case "6": {
                        println("Alright, I knew you'd want to check out the full demonstration!");
                        println("Please note: the database will be reset to it's original state, " +
                                "are you sure you want to run the full demonstration?");
                        println("Please type 'yes' or 'no'");
                        reply = scan.nextLine();
                        bool = yesOrNo(reply);
                        if(bool){
                            println("\nAlright, full demonstration coming up!\n");
                            tester();
                            println("\n\n\n\n");
                        } else {
                            println("Sounds good, let's return to the interaction table");
                        }
                        break;
                    }
                    case "7": {
                        println("Are you sure you want to reset the database?");
                        println("Please note: All the changes you have made will be lost " +
                                "and the database will be reset to its original state, are you sure?");
                        println("Please type 'yes' or 'no'");
                        reply = scan.nextLine();
                        bool = yesOrNo(reply);
                        if(bool){
                            println("\nAlright, say bye bye data!\n");
                            resetDatabase();
                            println("");
                        } else {
                            println("Sounds good, let's return to the interaction table");
                        }

                        break;
                    }
                    case "8": {
                        println("This is the narrative for the database:\n");
                        printNarrative();
                        println("");
                        break;
                    }
                    case "END": {
                        println("I'm glad I got to meet you! See you later alligator!\n");
                        CONTINUE = false;
                        break;
                    }
                    default: {
                        int result = random.nextInt(4);
                        switch (result) {
                            case 0:
                                println("Oh, could you please repeat that, I didn't understand.");
                                break;
                            case 1:
                                println("Pardon me, could you please repeat that?");
                                break;
                            case 2:
                                println("Oopsies, could you say that again please?");
                                break;
                            case 3:
                                println("My bad, it appears what you said didn't register, please come again.");
                                break;

                        }
                    }
                }

            }

            println("Thank you for trying out this application!");
            println("Credits to my creator: Emil Bjørlykke Berglund");
        }

    public static void main(String[] args) {
        DMP1A thing = new DMP1A();
        //thing.tester();
        thing.mainProgram();
        //System.out.println(thing.getApartment("Ross")+"\n\n");                    //funker
        //System.out.println(thing.whoLivesIn("Louisville")+"\n\n");                //funker
        //System.out.println(thing.countApartments("Louisville")+"\n\n");           //funker           ALLTID

        //System.out.println(thing.earnings()+"\n\n");                              //funker           ALLTID
        //System.out.println(thing.cheapest()+"\n\n");                              //funker           ALLTID
        //System.out.println(thing.mostExpensive()+"\n\n");                         //funker           ALLTID


        //thing.getApartment("ola");
        //String[]arr = thing.selectForeignkeyOwner("EA70");
        //System.out.println(arr[0]);

        /*
        box hey = thing.checkApartment("RTY182");
        int count = 0;
        while(count < hey.amount) {
            if(count == 1){
                System.out.println(hey.inter1);
                System.out.println(hey.inter2);
            }
            System.out.println(hey.arr[count]);
            count++;
        }

         */


        /*

        System.out.println(thing.fetchOwnerID("EA70"));
        System.out.println(thing.fetchOwnerID("EAA70"));
        System.out.println(thing.fetchOwnerID("CE85"));
        System.out.println(thing.fetchOwnerID("EA71"));
        System.out.println(thing.fetchComplexID("LO01"));
        System.out.println(thing.fetchManagerID("HO8252"));
        System.out.println(thing.fetchApartmentID("CCE111"));
        System.out.println(thing.fetchLeaseNo("LOPA14"));
 */

        //thing.insertComplex("1111","1111","1111","1111","1111", "1111");
/*
        thing.println("Here are the tables as they were initiated: \n");
        thing.selectAll();
        //Run 1
        //
        //Insertions for every table
        //----------------------------------------------------------------------------------------------------
        thing.println("Now we will perform an insertion for every table:\n");
        thing.insertOwner("BB19","Bob","Bobby");
        thing.insertComplex("NY01","New World complex","Services","Main street 3", "New York","TL93");
        thing.insertManager("JJ1884","Jimmy","Johns");
        thing.insertApartment("AKA112",11,2,"A","Yes","LO01","PB0911");
        thing.insertTenant("DJ77","Davy","Jones","Shin77");
        thing.insertLease("LEASE1","Details","2018-02-01","2020-02-01",1500,"AEJ020");
        thing.println("All the tables should now have an extra row");
        //----------------------------------------------------------------------------------------------------
        thing.println("Here are the tables printed after the insertions");
        thing.selectAll();
        //
        //End Run 1

        //Run 2
        //
        //Deletions for every table
        //----------------------------------------------------------------------------------------------------
        thing.println("As you can see, all tables have an extra row, the one that was just inserted. "
        + "Now we will delete all the insertions we did previously.\n");
        thing.delete("owner","ownerID","BB19");
        thing.delete("complex", "complexID", "NY01");
        thing.deleteManager("JJ1884");
        thing.delete("apartment", "apartmentID", "AKA112");
        thing.delete("tenant", "tenantID", "DJ77");
        thing.delete("lease", "leaseNo", "LEASE1");
        thing.println("All tables should now have been reverted back to how they were originally.");
        //----------------------------------------------------------------------------------------------------
        thing.println("The tables should now be the same as they were before the insertions.");
        thing.selectAll();
        //
        //End run 2

        //Run 3
        //
        //Updates for every table
        //----------------------------------------------------------------------------------------------------
        thing.println("Now we will perform some updates, first the owner table will be updated:\n");
        thing.updateOwner("TL93","Henriette");
        thing.updateOwner("CE85","Eric", "LostMyLastName");
        thing.selectOwner();
        thing.println("As you can see, the owner table was updated, from Theodora to Henriette,"
         + "and Eric lost his last name\n");
        thing.println("This doesn't quite add up so we will revert the changes");
        thing.update("Owner", "ownerID", "TL93", "first_nameowner", "Theodora");
        thing.update("Owner", "ownerID", "CE85", "last_nameowner", "Ericson");
        thing.selectOwner();
        thing.println("Now the changes have been reverted.\n\n");

        thing.println("We will now re-insert the complex from earlier and update the entire row."
        + "\nThe complex will be changed into my house\n");
        //Updating an entire complex table
        thing.insertComplex("NY01","New World complex","Services","Main street 3", "New York","TL93");
        thing.update("Complex", "complexID", "NY01", "complexID", "OS01");
        thing.update("Complex", "complexID", "OS01", "city", "Oslo");
        thing.update("Complex", "complexID", "OS01", "complexName", "House of the Berglunds");
        thing.update("Complex", "complexID", "OS01", "complexServices", "Whatever the house has to offer");
        thing.update("Complex", "complexID", "OS01", "address", "Hubroveien 9");
        thing.update("Complex", "complexID", "OS01", "ownerID", "EA70");
        thing.selectComplex();
        thing.println("As you can see, the updates were successful."
        + "\nBefore we continue we will delete this row so that everything is back to normal.\n\n");

        //----------------------------------------------------------------------------------------------------
        //
        //End run 3

        //Run 4
        //
        thing.println("Finally we will execute 6 queries, these queries are prepacked as procedures in the DML."
        + "\nTherefore they will be called and not sent as a full query, as requested in the project text." );
        //Queries to be executed, 6 in total
            //Number 1
        thing.println("\n\n------------------------------------------------------------");
        thing.println("This first query will get the apartment info of the tenant with first name: Maria");
        thing.println("------------------------------------------------------------");
        thing.getApartment("Maria");
        thing.println("------------------------------------------------------------");
            //Number 2
        thing.println("\n------------------------------------------------------------");
        thing.println("This query will list all the people who live in Louisville");
        thing.println("------------------------------------------------------------");
        thing.whoLivesIn("Louisville");
        thing.println("------------------------------------------------------------");

            //Number 3
        thing.println("\n------------------------------------------------------------");
        thing.println("This query prints all the owners and their monthly earnings");
        thing.println("------------------------------------------------------------");
        thing.earnings();
        thing.println("------------------------------------------------------------");
            //Number 4
        thing.println("\n------------------------------------------------------------");
        thing.println("This query counts the apartments in Louisville");
        thing.println("------------------------------------------------------------");
        thing.countApartments("Louisville");
        thing.println("------------------------------------------------------------");
            //Number 5
        thing.println("\n------------------------------------------------------------");
        thing.println("This query returns the apartment info on the cheapest apartment");
        thing.println("------------------------------------------------------------");
        thing.cheapest();
        thing.println("------------------------------------------------------------");
            //Number 6
        thing.println("\n------------------------------------------------------------");
        thing.println("And finally, this last query returns the apartment info on the most expensive apartment");
        thing.println("------------------------------------------------------------");
        thing.mostExpensive();
        thing.println("------------------------------------------------------------");
        //
        //End run 4

        //thing.selectAll();
        //thing.selectOwner();
        //thing.selectComplex();
        //thing.selectManager();
        //thing.selectApartment();
        //thing.selectTenant();
        //thing.selectLease();
        System.out.println("\n----END----");
        //reset the database:
        thing.silentDelete("complex","complexID","OS01");
*/
    }



    //Test kode for å hente data fra databasen
    /*
        String sql = "SELECT first_name, last_name, email " +
                     "FROM candidates";
        try (Connection conn = MySQLJDBCUtil.getConnection();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {

                System.out.println(rs.getString("first_name") + "\t\t" +
                        rs.getString("last_name")  + "\t\t" +
                        rs.getString("email"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        */

    //Test kode for å sjekke om MySQLJDBC.getConnection() funker
    /*
        public static void main(String[] args) {
            // create a new connection from MySQLJDBCUtil
            try (Connection conn = MySQLJDBCUtil.getConnection()) {

                // print out a message
                System.out.println(String.format("Connected to database %s "
                        + "successfully.", conn.getCatalog()));
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        */

    public void print(String x){
        System.out.print(x);
    }
    public void print(){
        System.out.print("");
    }
    public void println(String x){
        System.out.println(x);
    }
    public void println(){
        System.out.println("");
    }


}

//Tilkoplingskode som funker
//Connection code that works
/*
    public static void main(String[]args){

        Connection conn = null;

        try(FileInputStream f = new FileInputStream("C:\\Users\\Bruker\\IdeaProjects\\DataMan project\\src\\db.properties")) {
            // load the properties file
            Properties pros = new Properties();
            pros.load(f);

            // assign db parameters
            String url       = pros.getProperty("url");
            String user      = pros.getProperty("user");
            String password  = pros.getProperty("password");
            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
        } catch(IOException|SQLException ex){
            System.out.println(ex.getMessage());
        } finally {
            try{
                if(conn != null)
                    conn.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }

        }
    }

    */