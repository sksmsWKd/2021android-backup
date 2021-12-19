package com.cookandroid.guitarwithbeatnoerror;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    Button buttonC5;
    Button buttonG7,buttonAs5,
            buttonA,   buttonE,
            buttonC2,
            buttonD2,
            buttonA2,
            buttonG2,
            buttonB,
            buttonD3,
            buttonA3,
            buttonE2,
            buttonB2,
            buttonFs,
            buttonC3,
            buttonG3,
            buttonAs2,
            buttonF2,
            buttonC4,
            buttonDs2,
            buttonD4,
            buttonF3,
            buttonG4,
            buttonD7,
            buttonAs4,
            buttonA4,
            buttonE3,
            buttonB3,
            buttonD6,
            buttonA5,
            buttonE4,
            buttonG5,
            buttonF,
            buttonC,
            buttonGs,
            buttonDs,
            buttonAs,
            buttonF6,
            buttonD,
            buttonG,
            buttonF5;



    MediaPlayer mp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        Toast.makeText(this.getContext(), "기타 연주 메뉴입니다.", Toast.LENGTH_SHORT).show();
        Toast.makeText(this.getContext(), "기타 줄을 눌러보세요.", Toast.LENGTH_LONG).show();


        View v  = inflater.inflate(R.layout.fragment1, container, false);

        buttonF= (Button) v.findViewById(R.id.buttonF);
        buttonC= (Button) v.findViewById(R.id.buttonC);
        buttonGs= (Button) v.findViewById(R.id.buttonGs);
        buttonDs= (Button) v.findViewById(R.id.buttonDs);
        buttonAs= (Button) v.findViewById(R.id.buttonAs);
        buttonF6= (Button) v.findViewById(R.id.buttonF6);
        buttonD= (Button) v.findViewById(R.id.buttonD);
        buttonG= (Button) v.findViewById(R.id.buttonG);
        buttonF5= (Button) v.findViewById(R.id.buttonF5);
        buttonC5= (Button) v.findViewById(R.id.buttonC5);
        buttonG7= (Button) v.findViewById(R.id.buttonG7);
        buttonAs5= (Button) v.findViewById(R.id.buttonAs5);
        buttonA= (Button)v.findViewById(R.id.buttonA);
        buttonE= (Button) v.findViewById(R.id.buttonE);
        buttonC2= (Button) v.findViewById(R.id.buttonC2);
        buttonD2= (Button) v.findViewById(R.id.buttonD2);
        buttonA2= (Button) v.findViewById(R.id.buttonA2);
        buttonG2= (Button) v.findViewById(R.id.buttonG2);
        buttonB= (Button) v.findViewById(R.id.buttonB);
        buttonD3= (Button)v.findViewById(R.id.buttonD3);
        buttonA3= (Button) v.findViewById(R.id.buttonA3);
        buttonE2= (Button)v. findViewById(R.id.buttonE2);
        buttonB2= (Button)v. findViewById(R.id.buttonB2);
        buttonFs= (Button)v.findViewById(R.id.buttonFs);
        buttonC3= (Button)v.findViewById(R.id.buttonC3);
        buttonG3= (Button)v. findViewById(R.id.buttonG3);
        buttonAs2= (Button)v. findViewById(R.id.buttonAs2);
        buttonF2= (Button)v. findViewById(R.id.buttonF2);
        buttonC4= (Button) v.findViewById(R.id.buttonC4);
        buttonDs2= (Button) v.findViewById(R.id.buttonDs2);
        buttonD4= (Button)v.findViewById(R.id.buttonD4);
        buttonF3= (Button)v.findViewById(R.id.buttonF3);
        buttonG4= (Button)v.findViewById(R.id.buttonG4);
        buttonD7= (Button)v.findViewById(R.id.buttonD7);
        buttonAs4= (Button)v.findViewById(R.id.buttonAs4);
        buttonA4= (Button) v.findViewById(R.id.buttonA4);

        buttonE3= (Button) v.findViewById(R.id.buttonE3);
        buttonB3= (Button)v.findViewById(R.id.buttonB3);
        buttonD6= (Button)v.findViewById(R.id.buttonD6);
        buttonA5= (Button) v.findViewById(R.id.buttonA5);
        buttonE4= (Button) v.findViewById(R.id.buttonE4);
        buttonG5= (Button) v.findViewById(R.id.buttonG5);



        buttonF.setVisibility(getView().VISIBLE);
                buttonC.setVisibility(getView().VISIBLE);
        buttonGs.setVisibility(getView().VISIBLE);
                buttonDs.setVisibility(getView().VISIBLE);
        buttonAs.setVisibility(getView().VISIBLE);
                buttonF6.setVisibility(getView().VISIBLE);
        buttonD.setVisibility(getView().VISIBLE);
                buttonG.setVisibility(getView().VISIBLE);
        buttonF5.setVisibility(getView().VISIBLE);
                buttonC5.setVisibility(getView().VISIBLE);
        buttonG7.setVisibility(getView().VISIBLE);
                buttonAs5.setVisibility(getView().VISIBLE);
        buttonA.setVisibility(getView().VISIBLE);
                buttonE.setVisibility(getView().VISIBLE);
        buttonC2.setVisibility(getView().VISIBLE);
                buttonD2.setVisibility(getView().VISIBLE);
        buttonA2.setVisibility(getView().VISIBLE);
                buttonG2.setVisibility(getView().VISIBLE);
        buttonB.setVisibility(getView().VISIBLE);
                buttonD3.setVisibility(getView().VISIBLE);
        buttonA3.setVisibility(getView().VISIBLE);
                buttonE2.setVisibility(getView().VISIBLE);
        buttonB2.setVisibility(getView().VISIBLE);
                buttonFs.setVisibility(getView().VISIBLE);
        buttonC3.setVisibility(getView().VISIBLE);
                buttonG3.setVisibility(getView().VISIBLE);
        buttonAs2.setVisibility(getView().VISIBLE);
                buttonF2.setVisibility(getView().VISIBLE);
        buttonC4.setVisibility(getView().VISIBLE);
                buttonDs2.setVisibility(getView().VISIBLE);
        buttonD4.setVisibility(getView().VISIBLE);
                buttonF3.setVisibility(getView().VISIBLE);
        buttonG4.setVisibility(getView().VISIBLE);
                buttonD7.setVisibility(getView().VISIBLE);
        buttonAs4.setVisibility(getView().VISIBLE);
                buttonA4.setVisibility(getView().VISIBLE);

        buttonE3.setVisibility(getView().VISIBLE);
                buttonB3.setVisibility(getView().VISIBLE);
        buttonD6.setVisibility(getView().VISIBLE);
                buttonA5.setVisibility(getView().VISIBLE);
        buttonE4.setVisibility(getView().VISIBLE);
                buttonG5.setVisibility(getView().VISIBLE);





        buttonF.setBackgroundColor(Color.TRANSPARENT);
                buttonC.setBackgroundColor(Color.TRANSPARENT);
        buttonGs.setBackgroundColor(Color.TRANSPARENT);
                buttonDs.setBackgroundColor(Color.TRANSPARENT);
        buttonAs.setBackgroundColor(Color.TRANSPARENT);
                buttonF6.setBackgroundColor(Color.TRANSPARENT);
        buttonD.setBackgroundColor(Color.TRANSPARENT);
                buttonG.setBackgroundColor(Color.TRANSPARENT);
        buttonF5.setBackgroundColor(Color.TRANSPARENT);
                buttonC5.setBackgroundColor(Color.TRANSPARENT);
        buttonG7.setBackgroundColor(Color.TRANSPARENT);
                buttonAs5.setBackgroundColor(Color.TRANSPARENT);
        buttonA.setBackgroundColor(Color.TRANSPARENT);
                buttonE.setBackgroundColor(Color.TRANSPARENT);
        buttonC2.setBackgroundColor(Color.TRANSPARENT);
                buttonD2.setBackgroundColor(Color.TRANSPARENT);
        buttonA2.setBackgroundColor(Color.TRANSPARENT);
                buttonG2.setBackgroundColor(Color.TRANSPARENT);
        buttonB.setBackgroundColor(Color.TRANSPARENT);
                buttonD3.setBackgroundColor(Color.TRANSPARENT);
        buttonA3.setBackgroundColor(Color.TRANSPARENT);
                buttonE2.setBackgroundColor(Color.TRANSPARENT);
        buttonB2.setBackgroundColor(Color.TRANSPARENT);
                buttonFs.setBackgroundColor(Color.TRANSPARENT);
        buttonC3.setBackgroundColor(Color.TRANSPARENT);
                buttonG3.setBackgroundColor(Color.TRANSPARENT);
        buttonAs2.setBackgroundColor(Color.TRANSPARENT);
                buttonF2.setBackgroundColor(Color.TRANSPARENT);
        buttonC4.setBackgroundColor(Color.TRANSPARENT);
                buttonDs2.setBackgroundColor(Color.TRANSPARENT);
        buttonD4.setBackgroundColor(Color.TRANSPARENT);
                buttonF3.setBackgroundColor(Color.TRANSPARENT);
        buttonG4.setBackgroundColor(Color.TRANSPARENT);
                buttonD7.setBackgroundColor(Color.TRANSPARENT);
        buttonAs4.setBackgroundColor(Color.TRANSPARENT);
                buttonA4.setBackgroundColor(Color.TRANSPARENT);
        buttonE3.setBackgroundColor(Color.TRANSPARENT);
                buttonB3.setBackgroundColor(Color.TRANSPARENT);
        buttonD6.setBackgroundColor(Color.TRANSPARENT);
                buttonA5.setBackgroundColor(Color.TRANSPARENT);
        buttonE4.setBackgroundColor(Color.TRANSPARENT);
                buttonG5.setBackgroundColor(Color.TRANSPARENT);









        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.f1);
                mp.start();
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.c1);
                mp.start();
            }
        });
        buttonGs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.g2);
                mp.start();
            }
        });
        buttonDs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.d1);
                mp.start();
            }
        });
        buttonAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.a1);
                mp.start();
            }
        });
        buttonF6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.f2);
                mp.start();
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.d1);
                mp.start();
            }
        });
        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.g2);
                mp.start();
            }
        });
        buttonF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.f3);
                mp.start();
            }
        });
        buttonC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.c1);
                mp.start();
            }
        });
        buttonG7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.g3);
                mp.start();
            }
        });
        buttonAs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.a3);
                mp.start();
            }
        });
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.a4);
                mp.start();
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.e1);
                mp.start();
            }
        });
        buttonC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.c2);
                mp.start();
            }
        });
        buttonD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.d3);
                mp.start();
            }
        });
        buttonA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.a2);
                mp.start();
            }
        });
        buttonG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.g4);
                mp.start();
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.b1);
                mp.start();
            }
        });
        buttonD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.d4);
                mp.start();
            }
        });
        buttonA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.a4);
                mp.start();
            }
        });
        buttonE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.e2);
                mp.start();
            }
        });
        buttonB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.b2);
                mp.start();
            }
        });
        buttonFs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.f4);
                mp.start();
            }
        });
        buttonC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.c3);
                mp.start();
            }
        });
        buttonG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.g5);
                mp.start();
            }
        });
        buttonAs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.a4);
                mp.start();
            }
        });
        buttonF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.f3);
                mp.start();
            }
        });
        buttonC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.c4);
                mp.start();
            }
        });
        buttonDs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.d3);
                mp.start();
            }
        });
        buttonD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.d4);
                mp.start();
            }
        });
        buttonF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.f4);
                mp.start();
            }
        });
        buttonG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.g4);
                mp.start();
            }
        });
        buttonD7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.d5);
                mp.start();
            }
        });
        buttonAs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.a4);
                mp.start();
            }
        });
        buttonA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.a5);
                mp.start();
            }
        });

        buttonE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.e5);
                mp.start();
            }
        });
        buttonB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.b4);
                mp.start();
            }
        });
        buttonD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.d5);
                mp.start();
            }
        });
        buttonA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.a6);
                mp.start();
            }
        });
        buttonE4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.e5);
                mp.start();
            }
        });
        buttonG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create( getActivity().getApplicationContext(),R.raw.g5);
                mp.start();
            }
        });

        return v;
    }
}