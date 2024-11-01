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

class ShoppingExperiencesFragment : Fragment() {

    private lateinit var shoppingAdapter: ShoppingAdapter
    private val viewModel: ShoppingExperiencesViewModel by viewModels()
    private var isTwoPane: Boolean = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE &&
                      resources.configuration.screenWidthDp >= 600) {
            inflater.inflate(R.layout.fragment_category_list_twopane, container, false)
        } else {
            inflater.inflate(R.layout.fragment_category_list, container, false)
        }

        val recyclerView: RecyclerView = view.findViewById(R.id.itemRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        isTwoPane = view.findViewById<View?>(R.id.detail_container) != null

        shoppingAdapter = ShoppingAdapter(emptyList()) { shopping ->
            if (isTwoPane) {
                showDetailFragment(shopping)
            } else {
                val action = ShoppingExperiencesFragmentDirections.actionShoppingExperiencesToDetail(shopping)
                findNavController().navigate(action)
            }
        }

        recyclerView.adapter = shoppingAdapter

        viewModel.shoppingExperiences.observe(viewLifecycleOwner) { shoppingExperiences ->
            shoppingAdapter.updateShoppingExperiences(shoppingExperiences)
            if (isTwoPane && shoppingExperiences.isNotEmpty()) {
                showDetailFragment(shoppingExperiences[0])
            }
        }

        return view
    }

    private fun showDetailFragment(shopping: Shopping) {
        view?.findViewById<View>(R.id.detail_container)?.let {
            val detailFragment = DetailFragment.newInstance(shopping)
            childFragmentManager.beginTransaction()
                .replace(R.id.detail_container, detailFragment)
                .commit()
        }
    }
}
