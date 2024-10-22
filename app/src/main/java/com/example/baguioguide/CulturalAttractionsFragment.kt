package com.example.baguioguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.res.Configuration

class CulturalAttractionsFragment : Fragment() {

    private lateinit var attractionAdapter: AttractionAdapter
    private val viewModel: CulturalAttractionsViewModel by viewModels()
    private var isTwoPane: Boolean = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_category_list, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.itemRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Check if we're in two-pane mode (tablet landscape)
        isTwoPane = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE &&
                    resources.configuration.screenWidthDp >= 600

        attractionAdapter = AttractionAdapter(emptyList()) { attraction ->
            if (isTwoPane) {
                showDetailFragment(attraction)
            } else {
                val action = CulturalAttractionsFragmentDirections.actionCulturalAttractionsToDetail(attraction)
                findNavController().navigate(action)
            }
        }

        recyclerView.adapter = attractionAdapter

        viewModel.attractions.observe(viewLifecycleOwner) { attractions ->
            attractionAdapter.updateAttractions(attractions)
            if (isTwoPane && attractions.isNotEmpty()) {
                showDetailFragment(attractions[0])
            }
        }

        return view
    }

    private fun showDetailFragment(attraction: Attraction) {
        val detailFragment = DetailFragment.newInstance(attraction)
        childFragmentManager.beginTransaction()
            .replace(R.id.detail_container, detailFragment)
            .commit()
    }
}
