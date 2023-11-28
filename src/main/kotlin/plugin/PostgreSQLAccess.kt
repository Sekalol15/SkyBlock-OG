package plugin
import java.sql.DriverManager

class PostgreSQLAccess {
    val postgresUser = Config.getPostgresUser()
    val postgresUserPassword = Config.getPostgresUserPassword()
    val postgresdbUrl = Config.getPostgresdbUrl()
    data class User(val id: Int, val name: String)
    val jdbcUrl =  postgresdbUrl
    val connection = DriverManager.getConnection(jdbcUrl, postgresUser, postgresUserPassword)
    val query = connection.prepareStatement("SELECT * FROM users")



}