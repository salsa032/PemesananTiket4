package com.kelompok.pemesanantiket.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kelompok.pemesanantiket.model.ModelDatabase

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
}