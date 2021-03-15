package com.ssadakk.sampledatabinding

public class UserProfile {
    var name:String
    var age:Int
    var imgUrl: String

    constructor(name: String, age: Int, imgUrl: String) {
        this.name = name
        this.age = age
        this.imgUrl = imgUrl
    }


}