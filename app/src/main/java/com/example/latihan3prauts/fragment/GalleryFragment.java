package com.example.latihan3prauts.fragment;


import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.latihan3prauts.R;
import com.example.latihan3prauts.adapter.GalleryAdapter;
import com.example.latihan3prauts.model.GalleryModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    RecyclerView recycle;
    GalleryModel[] images;
    NestedScrollView scroll;

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);


        recycle = (RecyclerView) root.findViewById(R.id.recyclerview);
        scroll = (NestedScrollView) root.findViewById(R.id.gallery_scrollbar);
        GridLayoutManager layout = new GridLayoutManager(getActivity(), 2) {
            @Override
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };

        recycle.setNestedScrollingEnabled(false);
        recycle.setLayoutManager(layout);

        GalleryModel gal1 = new GalleryModel(
                R.drawable.husnie1,
                "Husnie Fathu Rozaq 085222001503",
                "Majalengka");
        GalleryModel gal2 = new GalleryModel(
                R.drawable.febi1,
                "Febby Permana 082317445966",
                "Banjaran ");
        GalleryModel gal3 = new GalleryModel(
                R.drawable.cecep1,
                "Cecep Arief H 085720675067",
                "Ciparay");
        GalleryModel gal4 = new GalleryModel(
                R.drawable.reza,
                "Muhammad Reza F 081770239180",
                "Ledeng");
        GalleryModel gal5 = new GalleryModel(
                R.drawable.sabadi,
                "Sabadi Dwi Putra 08986055178",
                "Rancaekek");
        GalleryModel gal6 = new GalleryModel(
                R.drawable.yodi,
                "Yodi Azhari 089656237315",
                "Soreang");
        GalleryModel gal7 = new GalleryModel(
                R.drawable.hadi,
                "Hadi Sulaksono 088712372503",
                "Cimahi");
        GalleryModel gal8 = new GalleryModel(
                R.drawable.rauldy,
                "Rauldy Alham 081263283727",
                "Lombok");

        images = new GalleryModel[]{gal1, gal2, gal3, gal4, gal5, gal6, gal7, gal8};
        GalleryAdapter myAdapter = new GalleryAdapter(getActivity(), images);
        recycle.setAdapter(myAdapter);

        return root;
    }

}
