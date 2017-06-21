package ancic.karim.stateerrorreproduction

import android.databinding.ObservableField
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.evernote.android.state.State
import com.evernote.android.state.StateSaver

class MainActivity : AppCompatActivity() {

    @State var observableField: ObservableField<String> = ObservableField()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        if (outState != null) {
            StateSaver.saveInstanceState(this, outState)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        StateSaver.restoreInstanceState(this, savedInstanceState)
    }
}
