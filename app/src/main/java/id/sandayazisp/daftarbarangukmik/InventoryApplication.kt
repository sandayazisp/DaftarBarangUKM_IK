package id.sandayazisp.daftarbarangukmik

import android.app.Application
import id.sandayazisp.daftarbarangukmik.data.ItemRoomDatabase


class InventoryApplication : Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}
