package com.manish.chatverse.model

data class PhoneAuthUser(
    val userId: String = "",
    val phoneNumber: String = "",
    val name: String = "",
    val status: String = "",
    val profilePicture: String? = null
)
