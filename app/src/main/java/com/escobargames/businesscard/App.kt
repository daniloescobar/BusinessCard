package com.escobargames.businesscard

import android.app.Application
import com.escobargames.businesscard.data.AppDatabase
import com.escobargames.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}