package com.example.baguioguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class DetailFragment : Fragment() {

    companion object {
        private const val ARG_ITEM = "item"

        fun newInstance(item: Item): DetailFragment {
            val fragment = DetailFragment()
            val args = Bundle()
            args.putParcelable(ARG_ITEM, item)
            fragment.arguments = args
            return fragment
        }
    }

    private val args: DetailFragmentArgs by navArgs()

    private lateinit var imageView: ImageView
    private lateinit var titleView: TextView
    private lateinit var descriptionView: TextView
    private lateinit var locationView: TextView
    private lateinit var hoursView: TextView
    private lateinit var feeView: TextView
    private lateinit var additionalInfoView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        imageView = view.findViewById(R.id.detailImage)
        titleView = view.findViewById(R.id.detailTitle)
        descriptionView = view.findViewById(R.id.detailDescription)
        locationView = view.findViewById(R.id.detailLocation)
        hoursView = view.findViewById(R.id.detailHours)
        feeView = view.findViewById(R.id.detailFee)
        additionalInfoView = view.findViewById(R.id.detailAdditionalInfo)

        val item = if (arguments?.containsKey(ARG_ITEM) == true) {
            arguments?.getParcelable(ARG_ITEM) as? Item
        } else {
            args.item
        }

        item?.let { populateUI(it) }

        return view
    }

    private fun populateUI(item: Item) {
            imageView.setImageResource(item.imageResId)
        titleView.text = item.name

        when (item) {
            is Attraction -> {
                descriptionView.text = item.description
                setTextOrHide(locationView, "Location: ${item.location}")
                setTextOrHide(hoursView, "Hours: ${item.hours}")
                setTextOrHide(feeView, "Fee: ${item.fee}")
                setTextOrHide(additionalInfoView, "Additional Info: ${item.additionalInfo}")
            }
            is Activity -> {
                descriptionView.text = item.description
                setTextOrHide(locationView, "Location: ${item.location}")
                setTextOrHide(feeView, "Entrance Fee: ${item.entranceFee}")
                setTextOrHide(additionalInfoView, "Activities: ${item.activities}")
                hoursView.visibility = View.GONE
            }
            is Dining -> {
                descriptionView.text = item.specialty
                setTextOrHide(locationView, "Location: ${item.location}")
                setTextOrHide(feeView, "Price Range: ${item.priceRange}")
                hoursView.visibility = View.GONE
                additionalInfoView.visibility = View.GONE
            }
            is Shopping -> {
                descriptionView.text = item.description
                setTextOrHide(locationView, "Location: ${item.location}")
                setTextOrHide(additionalInfoView, "Additional Info: ${item.additionalInfo}")
                hoursView.visibility = View.GONE
                feeView.visibility = View.GONE
            }
        }
    }

    private fun setTextOrHide(textView: TextView, content: String) {
        if (content.substringAfter(": ").isNotBlank()) {
            textView.text = content
            textView.visibility = View.VISIBLE
        } else {
            textView.visibility = View.GONE
        }
    }
}
