package id.ac.polbeng.robiyatuladawiyahhasibuan.githubprofile.services

import id.ac.polbeng.robiyatuladawiyahhasibuan.githubprofile.models.GithubUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
interface GithubUserService {
    @GET("users/{login}")
    fun loginUser(
        @Header("Authorization") token: String,
        @Path("login") userLogin: String
    ): Call<GithubUser>
}
