package com.ryckluk.androidstudio_laba17_18.data

data class WeatherData(
    val temperature: Int = 0,
    val humidity: Int = 0,
    val windSpeed: Int = 0,
    val weatherIndex: Int? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
    val loadingProgress: String = ""
) {


}