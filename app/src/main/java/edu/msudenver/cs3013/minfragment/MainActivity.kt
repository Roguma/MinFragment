// Rory Oguma CS-3013-001 MinFragment Exercise

package edu.msudenver.cs3013.minfragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startFragment(view: View) {
        val framelayout = findViewById<FragmentContainerView>(R.id.fragment_container)
        val blueFragment = BlueFragment.newInstance("FIRST")

        supportFragmentManager.beginTransaction()
            .add(framelayout.id, blueFragment)
            .addToBackStack(null)
            .commit()
    }
}
