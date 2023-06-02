package com.example.task51c;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private View view;
    private RecyclerView topNewsRecyclerView;
    private RecyclerView allNewsRecyclerView;
    private HorizontalAdapter hAdapter;
    private VerticalAdapter vAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);

        topNewsRecyclerView = view.findViewById(R.id.topNews);
        allNewsRecyclerView = view.findViewById(R.id.allNews);

        // Set up the layout managers for the RecyclerViews
        topNewsRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        allNewsRecyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));

        // Create instances of the adapters
        hAdapter = new HorizontalAdapter(new HorizontalAdapter.OnClickListener() {
            @Override
            public void onItemClick(int id) {
                navigate(id);
            }
        });
        vAdapter = new VerticalAdapter(new VerticalAdapter.OnClickListener() {
            @Override
            public void onItemClick(int id) {
                navigate(id);
            }
        });

        // Set the adapters for the RecyclerViews
        topNewsRecyclerView.setAdapter(hAdapter);
        allNewsRecyclerView.setAdapter(vAdapter);

        // Get the list of news items
        DataList dataList = new DataList();
        ArrayList<NewsModel> list = dataList.getList();

        // Submit the list to the adapters
        hAdapter.submitList(list);
        vAdapter.submitList(list);

        return view;
    }

    private void navigate(int id) {
        // Create a new instance of DetailFragment
        DetailFragment fragment = new DetailFragment();

        // Pass the item id as an argument to the fragment
        Bundle bundle = new Bundle();
        bundle.putInt("id", id);
        fragment.setArguments(bundle);

        // Replace the current fragment with DetailFragment
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
    }
}
