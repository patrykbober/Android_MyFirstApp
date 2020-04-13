package pl.patrykbober.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListData = arrayOf(
            MyListData("Email", android.R.drawable.ic_dialog_email),
            MyListData("Info", android.R.drawable.ic_dialog_info),
            MyListData("Delete", android.R.drawable.ic_delete),
            MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
            MyListData("Alert", android.R.drawable.ic_dialog_alert),
            MyListData("Map", android.R.drawable.ic_dialog_map),
            MyListData("Email", android.R.drawable.sym_action_email),
            MyListData("Info", android.R.drawable.ic_menu_info_details),
            MyListData("Delete", android.R.drawable.ic_menu_delete),
            MyListData("Dialer", android.R.drawable.sym_action_call),
            MyListData("Alert", android.R.drawable.sym_action_chat),
            MyListData("Map", android.R.drawable.ic_menu_mylocation)
        )

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyListAdapter(myListData)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }


    }
}
