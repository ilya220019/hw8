package com.example.hw8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw8.databinding.FragmentDetailsBinding
import com.example.hw8.databinding.FragmentListBinding

class Fragmentlist : Fragment() {
    lateinit var binding: FragmentListBinding
    private val a= arrayListOf<ChatModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        a.add(
            ChatModel(
                "PUBG", " PlayerUnknown's Battlegrounds Mobile (сокращённо PUBG Mobile) — условно-бесплатная мобильная многопользовательская онлайн-игра в жанре королевской битвы. Разработчик — LightSpeed & Quantum Studio, являющийся подразделением Tencent Games.")
        )
        a.add(
            ChatModel(
                "CSGO","многопользовательская компьютерная игра, разработанная компаниями Valve и Hidden Path Entertainment. Выпуск игры для персональных компьютеров на операционных системах Windows и macOS, также игровых приставках Xbox 360 и PlayStation 3 состоялся 21 августа 2012 года."
        )

        )
        a.add(
            ChatModel(
                "Far Cry","Far Cry — компьютерная игра в жанре шутера от первого лица. События игры происходят на острове в южной части Тихого океана и повествуют историю Джека Карвера, бывшего спецназовца. Игра была разработана компанией Crytek и издана Ubisoft в 2004 году."
        )
        )
        val adapter= ChatAdapter(a){
                findNavController().navigate(R.id.action_Fragmentlist_to_FragmentDetails, Bundle().apply {
                    putSerializable("key",a[it])
                })
        }
        binding.chatsRv.adapter=adapter



    }
}