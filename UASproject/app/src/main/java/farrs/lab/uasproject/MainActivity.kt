package farrs.lab.uasproject


import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.ImageView

class MainActivity() : AppCompatActivity(), View.OnClickListener, Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val food: ImageView = findViewById(R.id.food)
        food.setOnClickListener(this)

        val home: ImageView = findViewById(R.id.home)
        home.setOnClickListener(this)

        val kids: ImageView = findViewById(R.id.kids)
        kids.setOnClickListener(this)

        val obat: ImageView = findViewById(R.id.obat)
        obat.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.food -> {
                val foodActivity = Intent(this, FoodActivity::class.java)
                startActivity(foodActivity)
            }

            R.id.home -> {
                val HomeActivity = Intent(this, HomeActivity::class.java)
                startActivity(HomeActivity)
            }

            R.id.kids -> {
                val KidsActivity = Intent(this, KidsActivity::class.java)
                startActivity(KidsActivity)
            }

            R.id.obat -> {
                val ObatActivity = Intent(this, ObatActivity::class.java)
                startActivity(ObatActivity)
            }

        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}
