package com.example.tinkerershackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        directtologin.setOnClickListener(View.OnClickListener{startActivity(Intent(this, SignInActivity::class.java))})
    }
}


/*package com.example.tinkerershackathon
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import com.example.tinkerershackathon.databinding.Activity2Binding.inflate
import com.example.tinkerershackathon.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main)
        button.setOnClickListener(View.OnClickListener
        {

            if (editTextTextEmailAddress.text.isNullOrBlank() &&editTextTextPassword.text.isNullOrBlank()){
                Toast.makeText(this,"Please fill the required fields", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(this,"${editTextTextEmailAddress.text} is logged in!!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, Activity2::class.java))
            }

        })

         */

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth=FirebaseAuth.getInstance()
        binding.textView.setOnClickListener{
             val intent = Intent(this,SignUpActivity::class.java )
             startActivity(intent)
        }


        binding.button.setOnClickListener{
            val email = binding.emailEt.text.toString()
            val pass = binding.passET.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty()) {


                    firebaseAuth.signInWithEmailAndPassword(email, pass)
                        .addOnCompleteListener {
                            if (it.isSuccessful) {
                                val intent = Intent(this, Activity2::class.java)
                                startActivity(intent)
                            } else {
                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT)
                                    .show()
                            }
                        }

            }else{
                             Toast.makeText(this,"Empty Fields Are not Allowed !!",Toast.LENGTH_SHORT).show()
                     }


                 }
            }


        }
*/


