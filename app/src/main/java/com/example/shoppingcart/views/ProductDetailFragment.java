package com.example.shoppingcart.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoppingcart.R;
import com.example.shoppingcart.databinding.FragmentProductDetailBinding;
import com.example.shoppingcart.viewmodels.ShopViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProductDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProductDetailFragment extends Fragment {
    FragmentProductDetailBinding fragmentProductDetailBinding;
    ShopViewModel shopViewModel;

    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentProductDetailBinding=FragmentProductDetailBinding.inflate(inflater,container,false);
        return fragmentProductDetailBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        shopViewModel=new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        fragmentProductDetailBinding.setShopViewModel(shopViewModel);
    }
}