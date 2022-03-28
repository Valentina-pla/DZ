package less7;


import java.sql.*;
import java.util.ArrayList;

interface DatabaseRepository{

}

public class WeatherRepo implements DatabaseRepository {
    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

    }


    String fileName = "lesson8db.db";

    String createTableQuery = "CREATE TABLE IF NOT EXISTS weather(\n" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            " city TEXT NOT NULL,\n" +
            "localDate TEXT NOT NULL,\n" +
            "weatherText TEXT NOT NULL,\n" +
            "temperature REAL NOT NULL\n" +
            ");";



    private Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + fileName);
        checkDB(connection);
        return connection;
    }

    private void checkDB(Connection connection) throws SQLException {
        Statement statement=connection.createStatement();
        statement.execute(createTableQuery);


    }


    public ArrayList<WeatherRecord> readWeather() throws SQLException {

        ArrayList<WeatherRecord> result=new ArrayList<>();
        Connection connection=getConnection();
        Statement statement = connection.createStatement();


        ResultSet resultSet = statement.executeQuery("SELECT*FROM weather");

        while (resultSet.next()) {
            WeatherRecord record=new WeatherRecord();
            record.id=resultSet.getInt("id");
            record.city=resultSet.getString("city");
            record.localDate=resultSet.getString("localDate");
            record.weatherText=resultSet.getString("weatherText");
            record.temperature=resultSet.getDouble("temperature");

         result.add(record);


        }
        connection.close();
        return result;

    }

    public void addWeather (WeatherRecord weatherRecord) throws SQLException {
        Connection connection=getConnection();
        Statement statement = connection.createStatement();

        String values = String.format("'{0}', '{1}', '{2}', '{3}'", weatherRecord.city, weatherRecord.localDate, weatherRecord.weatherText,weatherRecord.temperature);


        String sql="INSERT INTO weather (city,localDate,weatherText,temperature) VALUES("+values+")";

            statement.execute(sql);


        connection.close();

    }
}