package edu.msudenver.cs3013.minfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlueFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            BlueFragment().apply {
                arguments = Bundle().apply {
                    putString("param1", param1)
                }
            }
    }
}
