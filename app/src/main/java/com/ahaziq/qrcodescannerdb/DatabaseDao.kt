package com.ahaziq.qrcodescannerdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDao
{
    @Insert
    fun saveBooks(attendance: DatabaseEntity)

    @Query(value = "Select * from DatabaseEntity")
    fun getAllBooks() : List<DatabaseEntity>

    @Query("DELETE FROM DatabaseEntity")
    fun deleteAll()
}