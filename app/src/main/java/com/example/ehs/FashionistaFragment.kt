package com.example.ehs

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_fashionista.*

class FashionistaFragment : Fragment() {



    val contactsList : List<Fashionista> = listOf(
        Fashionista("john","010-0000-11111"),
        Fashionista("mir","010-1111-2222"),
        Fashionista("delp", "010-3333-4444"),
        Fashionista("jacob", "010-3333-5555"),
        Fashionista("sheu", "010-3333-6666"),
        Fashionista("ma", "010-3333-7777"),
        Fashionista("ham", "010-3333-8889")
    )



    companion object {
        const val TAG : String = "패셔니스타 프래그먼트"
        fun newInstance() : FashionistaFragment { // newInstance()라는 함수를 호출하면 HomeFragment를 반환함

            return FashionistaFragment()
        }
    }

    // 프레그먼트가 메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "FashionistaFragment - onCreate() called")
    }
    // 프레그먼트를 안고 있는 액티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "FashionistaFragment - onAttach() called")
    }
    // 뷰가 생성되었을 때 화면과 연결
    // 프레그먼트와 레이아웃을 연결시켜주는 부분이다.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "FashionistaFragment - onCreateView() called")
        val view = inflater.inflate(R.layout.fragment_fashionista, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = FashionistaListAdapter(contactsList)
        mRecyclerView.adapter = adapter

    }


}