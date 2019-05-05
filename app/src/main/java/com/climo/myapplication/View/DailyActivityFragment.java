package com.climo.myapplication.View;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.climo.myapplication.Adapters.MainRecycleAdapter;
import com.climo.myapplication.Model.DailyActivityModel;
import com.climo.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class DailyActivityFragment extends Fragment  {

    /**
     * A simple {@link Fragment} subclass.
     * Activities that contain this fragment must implement the
     * {@link DailyActivityFragment.OnFragmentInteractionListener} interface
     * to handle interaction events.
     * Use the {@link DailyActivityFragment#newInstance} factory method to
     * create an instance of this fragment.
     */
        View v;
        private RecyclerView myRecyclerView;
        private List<DailyActivityModel> dailyList;
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private static final String ARG_PARAM1 = "param1";
        private static final String ARG_PARAM2 = "param2";

        // TODO: Rename and change types of parameters
        private String mParam1;
        private String mParam2;

        private OnFragmentInteractionListener mListener;

        public DailyActivityFragment() {
            // Required empty public constructor
        }

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DailyActivityFragment.
         */
        // TODO: Rename and change types and number of parameters
        public static DailyActivityFragment newInstance(String param1, String param2) {
            DailyActivityFragment fragment = new DailyActivityFragment();
            Bundle args = new Bundle();
            args.putString(ARG_PARAM1, param1);
            args.putString(ARG_PARAM2, param2);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            dailyList = new ArrayList<>();
            dailyList.add(new DailyActivityModel("Tidur", R.drawable.ic_photo_black_24dp));
            dailyList.add(new DailyActivityModel("makan", R.drawable.ic_directions_walk_black_24dp));
            dailyList.add(new DailyActivityModel("Tidur", R.drawable.ic_slideshow_black_24dp));
            dailyList.add(new DailyActivityModel("sekolah", R.drawable.ic_menu_camera));
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            v = inflater.inflate(R.layout.fragment_daily, container, false);
            myRecyclerView = (RecyclerView) v.findViewById(R.id.daily_recyclerView);
            MainRecycleAdapter recyclerViewAdapter = new MainRecycleAdapter(getContext(), dailyList);
            myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            myRecyclerView.setAdapter(recyclerViewAdapter);
            return v;

        }

        // TODO: Rename method, update argument and hook method into UI event
        public void onButtonPressed(Uri uri) {
            if (mListener != null) {
                mListener.onFragmentInteraction(uri);
            }
        }

        @Override
        public void onAttach(Context context) {
            super.onAttach(context);

        }

        @Override
        public void onDetach() {
            super.onDetach();
            mListener = null;
        }

        /**
         * This interface must be implemented by activities that contain this
         * fragment to allow an interaction in this fragment to be communicated
         * to the activity and potentially other fragments contained in that
         * activity.
         * <p>
         * See the Android Training lesson <a href=
         * "http://developer.android.com/training/basics/fragments/communicating.html"
         * >Communicating with Other Fragments</a> for more information.
         */
        public interface OnFragmentInteractionListener {
            // TODO: Update argument type and name
            void onFragmentInteraction(Uri uri);
        }
}
