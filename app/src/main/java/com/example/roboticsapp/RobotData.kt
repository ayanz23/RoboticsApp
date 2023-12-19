package com.example.roboticsapp

import android.os.Parcel
import android.os.Parcelable

data class RobotData(
    val id:Int?,
    val title:String?,
    val location:String?,
    val rank:String?,
    val number:String?,
    val overview:String?

):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(location)
        parcel.writeString(rank)
        parcel.writeString(number)
        parcel.writeString(overview)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RobotData> {
        override fun createFromParcel(parcel: Parcel): RobotData {
            return RobotData(parcel)
        }

        override fun newArray(size: Int): Array<RobotData?> {
            return arrayOfNulls(size)
        }
    }
}
