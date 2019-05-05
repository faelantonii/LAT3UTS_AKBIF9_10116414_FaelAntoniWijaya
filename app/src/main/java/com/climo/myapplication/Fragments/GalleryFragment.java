package com.climo.myapplication.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.climo.myapplication.Adapters.RecylerViewAdapterGallery;
import com.climo.myapplication.Model.GalleryActivityModel;
import com.climo.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class GalleryFragment extends Fragment {
    View v;
    private RecyclerView myRecyclerView;
    private List<GalleryActivityModel> listGallery;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listGallery = new ArrayList<>();
        listGallery.add(new GalleryActivityModel("Story 1", R.drawable.smile_satu));
        listGallery.add(new GalleryActivityModel("Story 2", R.drawable.satu));
        listGallery.add(new GalleryActivityModel("Story 3", R.drawable.smile_empat));
        listGallery.add(new GalleryActivityModel("Story 5", R.drawable.smile_satu));
        listGallery.add(new GalleryActivityModel("Story 4", R.drawable.satu));
        listGallery.add(new GalleryActivityModel("Story 8", R.drawable.smile_empat));
        listGallery.add(new GalleryActivityModel("Story 4", R.drawable.satu));
        listGallery.add(new GalleryActivityModel("Story 11", R.drawable.smile_satu));
        listGallery.add(new GalleryActivityModel("Story 12", R.drawable.smile_empat));



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_gallery, container, false);
        myRecyclerView = (RecyclerView) v.findViewById(R.id.gallery_recyclerView);
        RecylerViewAdapterGallery recylerViewAdapterG = new RecylerViewAdapterGallery(getContext(),listGallery);
        myRecyclerView.setLayoutManager(new GridLayoutManager( getActivity(), 2));
        myRecyclerView.setAdapter(recylerViewAdapterG);
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