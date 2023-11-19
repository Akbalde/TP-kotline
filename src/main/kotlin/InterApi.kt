import retrofit2.Call
import retrofit2.http.GET
interface InterApi
{
    @GET("users")
    fun getUsers(): Call<List<User>>
}