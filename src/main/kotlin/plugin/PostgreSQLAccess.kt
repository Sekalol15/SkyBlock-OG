package plugin
import java.sql.DriverManager

class PostgreSQLAccess {
    val postgresUser = Config.getPostgresUser()
    val postgresUserPassword = Config.getPostgresUserPassword()
    val postgresdbUrl = Config.getPostgresdbUrl()
    data class skyblock_islands_players(val gen_id: Int, val UUID: String, val x: Int, val z: Int, val biome: String)
    val jdbcUrl =  postgresdbUrl
    val connection = DriverManager.getConnection(jdbcUrl, postgresUser, postgresUserPassword)
    val query = connection.prepareStatement("SELECT * FROM skyblock_player_islands")

    fun addPlayerInfo() {


    }




}