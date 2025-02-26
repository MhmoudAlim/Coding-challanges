package concepts_playground

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@JvmInline
@Serializable
value class UserName(val value: String)

fun login(userName: UserName) = println(userName)


fun main(){


    val obj = Json.decodeFromString<UserName>("""{"value":"Mahmoud"}""")

    login(UserName("Mahmoud"))
}