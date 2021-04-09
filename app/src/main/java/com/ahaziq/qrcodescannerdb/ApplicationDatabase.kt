package com.ahaziq.qrcodescannerdb

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [(DatabaseEntity::class)],version = 1)
abstract class ApplicationDatabase : RoomDatabase() {

    abstract fun databaseDao(): DatabaseDao
}