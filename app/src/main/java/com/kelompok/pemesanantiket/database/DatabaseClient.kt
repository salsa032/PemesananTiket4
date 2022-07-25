package com.kelompok.pemesanantiket.database

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.kelompok.pemesanantiket.database.dao.DatabaseDao
import com.kelompok.pemesanantiket.model.ModelDatabase


class DatabaseClient private constructor(context: Context) : DatabaseDao {
    var appDatabase: AppDatabase

    companion object {
        private lateinit var mInstance: DatabaseClient

        @Synchronized
        fun getInstance(context: Context): DatabaseDao? {
            if (mInstance == null) {
                mInstance = DatabaseClient(context)
            }
            return mInstance
        }
    }

    init {
        appDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "travel_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    override fun getAllData(): LiveData<List<ModelDatabase>> {
        TODO("Not yet implemented")
    }

    override fun insertData(vararg modelDatabases: ModelDatabase) {
        TODO("Not yet implemented")
    }

    override fun deleteDataById(uid: Int) {
        TODO("Not yet implemented")
    }
}