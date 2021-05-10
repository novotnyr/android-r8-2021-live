package sk.upjs.ics.vma.r8

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

class User(val id: Int, val name: String, val username: String)

interface RestApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}

var retrofit = Retrofit.Builder()
    .baseUrl("https://jsonplaceholder.typicode.com/")
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

var restApi = retrofit.create(RestApiService::class.java)