package com.example.crudfirebase

import android.arch.lifecycle.MutableLiveData
import android.databinding.Bindable
//import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.IgnoreExtraProperties

//@IgnoreExtraProperties
data class User (

    var nome:String = "",
    var inputname:String = "",
    var inputemail:String = ""

)