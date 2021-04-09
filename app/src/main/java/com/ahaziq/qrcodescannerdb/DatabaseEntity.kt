package com.ahaziq.qrcodescannerdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class DatabaseEntity {

    @PrimaryKey(autoGenerate = true)
    var bookId: Int =0

    @ColumnInfo(name ="Student ID")
    var bookName:  String =""

    @ColumnInfo(name = "Temperature")
    var bodyTemp:   String=""

}