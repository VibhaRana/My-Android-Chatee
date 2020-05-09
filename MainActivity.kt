package com.vibha.chatee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener {
            startActivity(AuthActivity.newIntent(AuthMode.Login, this))
        }

        register_button.setOnClickListener {
            startActivity(AuthActivity.newIntent(AuthMode.Register, this))
        }

        // Write a message to the database
        //FirebaseDatabase.getInstance().getReference("message").setValue("Hello, World!")
    }
}

sealed class AuthMode() : Parcelable {
    @Parcelize
    object Login : AuthMode()

    @Parcelize
    object Register : AuthMode()
}
