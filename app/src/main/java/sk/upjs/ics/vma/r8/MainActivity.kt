package sk.upjs.ics.vma.r8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.lifecycleScope


private const val TAG = "R8-Main"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launchWhenResumed {
            val users = restApi.getUsers()
            Log.d(TAG, users.toString())
        }
    }


    fun onMegaButtonClick(view: View) {
        Log.d(TAG, "Megabutton clicked!")
    }
}