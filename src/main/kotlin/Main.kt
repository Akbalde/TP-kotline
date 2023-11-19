import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
fun main() {
    //instance http
    val retro =Retrofit.Builder()
        .baseUrl("https://6554e17063cafc694fe7254d.mockapi.io/")
        .addConverterFactory(JacksonConverterFactory.create())
        .build()
    //point d'entré
    val insApi = retro.create(InterApi::class.java)
    //liste user
    val  response = insApi.getUsers().execute()
    if (response.isSuccessful){
        response.body().forEachIndexed{
            index, users ->
            println("User: ${index + 1} | name : ${users.name} | email : ${users.email} | password : ${users.password}")
        }
        println("liste affichée avec succès")
    }
    else{ println("Erreur de recuperation : ${response.code()}")}
}