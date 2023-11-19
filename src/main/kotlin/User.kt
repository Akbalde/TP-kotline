import com.fasterxml.jackson.annotation.JsonProperty
class User (
    @JsonProperty("_id")
    val id: String,

    @JsonProperty("name")
    val name: String,

    @JsonProperty("email")
    val email: String,

    @JsonProperty("password")
    val password: String)



