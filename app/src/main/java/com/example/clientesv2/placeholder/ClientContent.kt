package com.example.clientesv2.placeholder

import androidx.fragment.app.activityViewModels
import com.example.clientesv2.data.model.Client
import com.example.clientesv2.view.ListClientViewModel
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object ClientContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<Client> = ArrayList()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, Client> = HashMap()

//    private val COUNT = 25
//
//    init {
//        // Add some sample items.
//        for (i in 1..COUNT) {
//            addItem(createPlaceholderItem(i))
//        }
//    }
//
//    private fun addItem(item: Client) {
//        ITEMS.add(item)
//        ITEM_MAP.put(item.DUI, item)
//    }
//
//    private fun createPlaceholderItem(position: Int): Client {
//        return Client(position.toString(), "Nombre " + position)
//    }

//    private fun makeDetails(position: Int): String {
//        val builder = StringBuilder()
//        builder.append("Details about Item: ").append(position)
//        for (i in 0..position - 1) {
//            builder.append("\nMore details information here.")
//        }
//        return builder.toString()
//    }
}